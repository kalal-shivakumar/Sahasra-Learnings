# Azure Web App Deployment - Manual Steps Guide

A step-by-step guide to deploy a web application to Azure App Service using GitHub Actions with federated credentials (OIDC).

---

## Step 1: Create a Resource Group

A Resource Group is a container that holds all your Azure resources together.

1. Go to **https://portal.azure.com**
2. In the top search bar, type **Resource groups**
3. Click **Resource groups** from the results
4. Click **+ Create**
5. Fill in:
   - **Subscription:** Select your subscription (e.g., `Azure subscription 1`)
   - **Resource group name:** `rg-ram09`
   - **Region:** `Central US`
6. Click **Review + create**
7. Click **Create**

**Example values:**

- Name: `rg-ram09`
- Region: `Central US`
- Subscription: `Azure subscription 1`

---

## Step 2: Create an App Service Plan

An App Service Plan defines the compute resources (CPU, memory) for your web app.

1. In the top search bar, type **App Service plans**
2. Click **App Service plans** from the results
3. Click **+ Create**
4. Fill in the **Basics** tab:
   - **Subscription:** Select your subscription
   - **Resource Group:** Select `rg-ram09`
   - **Name:** `plan-ram09`
   - **Operating System:** Select `Linux`
   - **Region:** `Central US`
   - **Pricing plan:** Click **Explore pricing plans** → Select **Free F1** → Click **Select**
5. Click **Review + create**
6. Click **Create**

**Example values:**

- Name: `plan-ram09`
- Resource Group: `rg-ram09`
- OS: Linux
- SKU: Free F1 (shared infrastructure, 60 CPU minutes/day)
- Region: Central US

---

## Step 3: Create an App Service (Web App)

The App Service is where your website will actually run and be accessible on the internet.

1. In the top search bar, type **App Services**
2. Click **App Services** from the results
3. Click **+ Create** → Select **Web App**
4. Fill in the **Basics** tab:
   - **Subscription:** Select your subscription
   - **Resource Group:** Select `rg-ram09`
   - **Name:** `ram09-java-app` (this becomes your URL: `ram09-java-app.azurewebsites.net`)
   - **Publish:** Select `Code`
   - **Runtime stack:** Select `Java 17`
   - **Java web server stack:** Select `Java SE (Embedded Web Server)`
   - **Operating System:** `Linux`
   - **Region:** `Central US`
   - **Linux Plan:** Select `plan-ram09 (F1)`
5. Click **Review + create**
6. Click **Create**
7. Wait for deployment to complete
8. Click **Go to resource**

**Example values:**

- Name: `ram09-java-app`
- URL: `https://ram09-java-app.azurewebsites.net`
- Runtime: Java 17
- Plan: `plan-ram09` (Free F1)

---

## Step 4: Create an App Registration

An App Registration creates an identity that GitHub Actions will use to authenticate with Azure (instead of a username/password).

1. In the top search bar, type **App registrations**
2. Click **App registrations** from the results
3. Click **+ New registration**
4. Fill in:
   - **Name:** `ram09-github-deploy`
   - **Supported account types:** Select `Accounts in this organizational directory only`
   - **Redirect URI:** Leave blank
5. Click **Register**
6. On the Overview page, copy these two values:
   - **Application (client) ID** — example: `1ba7f813-f04a-4df1-bc14-997d883f6654`
   - **Directory (tenant) ID** — example: `a87d418a-4991-4593-b472-b6ede0e96c60`

**Save these values — you will need them later for GitHub secrets.**

---

## Step 5: Create Federated Credentials

Federated credentials allow GitHub Actions to log in to Azure without storing any passwords or secrets — it uses OIDC (OpenID Connect) token exchange.

1. You should be on your App Registration page (`ram09-github-deploy`)
2. In the left sidebar, click **Certificates & secrets**
3. Click the **Federated credentials** tab
4. Click **+ Add credential**
5. For **Federated credential scenario**, select **GitHub Actions deploying Azure resources**
6. Fill in the GitHub details:
   - **Organization:** `kalal-shivakumar`
   - **Repository:** `ram09`
   - **Entity type:** Select `Branch`
   - **GitHub branch name:** `main`
   - **Name:** `github-deploy-main`
7. Verify the auto-generated values at the bottom:
   - Issuer: `https://token.actions.githubusercontent.com`
   - Subject identifier: `repo:kalal-shivakumar/ram09:ref:refs/heads/main`
   - Audience: `api://AzureADTokenExchange`
8. Click **Add**

**Important notes:**

- The **Repository** field must be just `ram09` — NOT the full URL
- The **branch name** must match exactly what your workflow triggers on (`main`)
- Do NOT create a Client Secret — federated credentials replace the need for secrets

---

## Step 6: Assign Contributor Role to the App Registration

The App Registration needs permission to deploy to your resource group.

1. In the top search bar, type **Resource groups**
2. Click on `rg-ram09`
3. In the left sidebar, click **Access control (IAM)**
4. Click **+ Add** → **Add role assignment**
5. **Role tab:**
   - Search for `Contributor`
   - Select **Contributor**
   - Click **Next**
6. **Members tab:**
   - For "Assign access to", select **User, group, or service principal**
   - Click **+ Select members**
   - In the search box, type `ram09-github-deploy`
   - Click on it to select it
   - Click **Select**
   - Click **Next**
7. **Review + assign tab:**
   - Click **Review + assign**

**What this does:** Gives the `ram09-github-deploy` identity full permission to manage resources inside `rg-ram09`.

---

## Step 7: Create a GitHub Repository

1. Go to **https://github.com**
2. Sign in to your account
3. Click the **+** icon (top right) → **New repository**
4. Fill in:
   - **Repository name:** `ram09`
   - **Visibility:** Public (or Private)
   - Do NOT initialize with README (if you already have local code)
5. Click **Create repository**

**Example:**

- Repository URL: `https://github.com/kalal-shivakumar/ram09`
- Default branch: `main`

---

## Step 8: Add Secrets to GitHub Repository

GitHub secrets store your Azure IDs securely so the workflow can use them.

1. Go to your repository: **https://github.com/kalal-shivakumar/ram09**
2. Click **Settings** (tab at the top)
3. In the left sidebar, expand **Secrets and variables**
4. Click **Actions**
5. Click **New repository secret**

**Add these three secrets one at a time:**

**Secret 1:**
- Name: `CLIENTID`
- Secret: paste your Application (client) ID from Step 4
- Example: `1ba7f813-f04a-4df1-bc14-997d883f6654`
- Click **Add secret**

**Secret 2:**
- Name: `TENANTID`
- Secret: paste your Directory (tenant) ID from Step 4
- Example: `a87d418a-4991-4593-b472-b6ede0e96c60`
- Click **Add secret**

**Secret 3:**
- Name: `SUBSCRIPTIONID`
- Secret: paste your Subscription ID (from portal Home → Subscriptions)
- Example: `eea9ffc5-6c64-4dab-b152-3d2f49a73ff1`
- Click **Add secret**

**Where to find Subscription ID:**
1. Go to portal.azure.com
2. Search for **Subscriptions**
3. Click on your subscription
4. Copy the **Subscription ID**

---

## Step 9: Create the GitHub Actions Workflow File

This file tells GitHub to automatically build and deploy your app when you push code.

1. In your project folder, create the directory: `.github/workflows/`
2. Create a file called `deploy.yml` inside it
3. Add this content:

```yaml
name: Deploy to Azure

on:
  push:
    branches: [ main ]
  workflow_dispatch:

permissions:
  id-token: write
  contents: read

jobs:
  deploy:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v4

      - name: Set up JDK 17
        uses: actions/setup-java@v4
        with:
          java-version: '17'
          distribution: 'temurin'
          cache: maven

      - name: Build JAR
        run: mvn -B package -DskipTests --file pom.xml

      - name: Login to Azure
        uses: azure/login@v2
        with:
          client-id: ${{ secrets.CLIENTID }}
          tenant-id: ${{ secrets.TENANTID }}
          subscription-id: ${{ secrets.SUBSCRIPTIONID }}

      - name: Deploy to Azure Web App
        uses: azure/webapps-deploy@v3
        with:
          app-name: ram09-java-app
          package: target/*.jar
```

**Key settings explained:**
- `permissions: id-token: write` — required for OIDC authentication
- `workflow_dispatch` — allows you to run the workflow manually from GitHub UI
- `secrets.CLIENTID` — references the secret you added in Step 8

---

## Step 10: Push Code to GitHub

1. Open terminal/PowerShell in your project folder
2. Run these commands:

```powershell
git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/kalal-shivakumar/ram09.git
git branch -M main
git push -u origin main
```

**What happens next:**
- The push to `main` automatically triggers the GitHub Actions workflow
- The workflow builds your Java app and deploys it to Azure

---

## Step 11: Verify the Deployment

**Check GitHub Actions:**
1. Go to **https://github.com/kalal-shivakumar/ram09**
2. Click the **Actions** tab
3. You should see your workflow running (yellow dot) or completed (green checkmark)
4. Click on the run to see detailed logs

**Check your website:**
1. Open browser
2. Go to: **https://ram09-java-app.azurewebsites.net**
3. Your Java website should be live

**If the workflow failed:**
- Click on the failed run
- Read the error message
- Common fixes:
  - Secret names don't match → check spelling in Settings → Secrets
  - Branch name mismatch → federated credential says `main` but you pushed to `master`
  - Missing role assignment → go back to Step 6
  - OIDC error → check federated credential in Step 5

---

## Summary

| Step | What you created | Where |
|------|-----------------|-------|
| 1 | Resource Group (`rg-ram09`) | Azure Portal |
| 2 | App Service Plan (`plan-ram09`) | Azure Portal |
| 3 | Web App (`ram09-java-app`) | Azure Portal |
| 4 | App Registration (`ram09-github-deploy`) | Azure Portal |
| 5 | Federated Credential (`github-deploy-main`) | Azure Portal |
| 6 | Contributor Role Assignment | Azure Portal |
| 7 | GitHub Repository (`ram09`) | GitHub |
| 8 | GitHub Secrets (3 secrets) | GitHub |
| 9 | Workflow file (`deploy.yml`) | Local + GitHub |
| 10 | Push code | Local terminal |
| 11 | Verify deployment | Browser |

---

## Cleanup (Delete Everything)

**Delete Azure resources:**
1. Search **Resource groups** → Click `rg-ram09` → Click **Delete resource group** → Type the name to confirm → Click **Delete**

**Delete App Registration:**
1. Search **App registrations** → Click `ram09-github-deploy` → Click **Delete** → Click **Delete** to confirm

**Delete GitHub repo (optional):**
1. Go to repo **Settings** → Scroll to bottom → **Delete this repository**
