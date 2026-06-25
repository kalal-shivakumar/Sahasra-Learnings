# Azure Web App Deployment - Manual Steps Guide

A step-by-step guide to deploy a web application to Azure App Service using GitHub Actions with federated credentials (OIDC).

---

## Step 1: Create a Resource Group

**What it is:** A folder in Azure where you keep all your project resources organized in one place.
**How it helps:** Makes it easy to manage everything together and delete all resources at once when you're done.

1. Go to **https://portal.azure.com**
2. In the top search bar, type **Resource groups**
3. Click **Resource groups** from the results
4. Click **+ Create**
5. Fill in:
   - **Subscription:** Select your subscription (e.g., `Azure subscription 1`)
   - **Resource group name:** `rg-kalal`
   - **Region:** `Central US`
6. Click **Review + create**
7. Click **Create**

---

## Step 2: Create an App Service Plan

**What it is:** The server power level you choose for your website (like small, medium, or large).
**How it helps:** Free F1 is the cheapest option and works perfectly for learning and testing your app.

1. In the top search bar, type **App Service plans**
2. Click **App Service plans** from the results
3. Click **+ Create**
4. Fill in the **Basics** tab:
   - **Subscription:** Select your subscription
   - **Resource Group:** Select `rg-kalal`
   - **Name:** `plan-kalal`
   - **Operating System:** Select `Linux`
   - **Region:** `Central US`
   - **Pricing plan:** Click **Explore pricing plans** → Select **Free F1** → Click **Select**
5. Click **Review + create**
6. Click **Create**

---

## Step 3: Create an App Service (Web App)

**What it is:** The actual website that runs on Azure and people can visit online.
**How it helps:** It gives your app a web address (like `kalal-java-app.azurewebsites.net`) so users can reach it.

1. In the top search bar, type **App Services**
2. Click **App Services** from the results
3. Click **+ Create** → Select **Web App**
4. Fill in the **Basics** tab:
   - **Subscription:** Select your subscription
   - **Resource Group:** Select `rg-kalal`
   - **Name:** `kalal-java-app`
   - **Publish:** Select `Code`
   - **Runtime stack:** Select `.NET Core 8`
   - **Operating System:** `Linux`
   - **Region:** `Central US`
   - **Linux Plan:** Select `plan-kalal (F1)`
5. Click **Review + create**
6. Click **Create**
7. Wait for deployment to complete
8. Click **Go to resource**

---

## Step 4: Create an App Registration

**What it is:** An identity card for your GitHub workflow so it can log into Azure.
**How it helps:** Lets GitHub access Azure safely without needing to store passwords anywhere.

1. In the top search bar, type **App registrations**
2. Click **App registrations** from the results
3. Click **+ New registration**
4. Fill in:
   - **Name:** `kalal-github-deploy`
   - **Supported account types:** Select `Accounts in this organizational directory only`
   - **Redirect URI:** Leave blank
5. Click **Register**
6. On the Overview page, copy these two values:
   - **Application (client) ID** — example: `1ba7f813-f04a-4df1-bc14-997d883f6654`
   - **Directory (tenant) ID** — example: `a87d418a-4991-4593-b472-b6ede0e96c60`

**Save these values — you will need them later for GitHub secrets.**

---

## Step 5: Create Federated Credentials

**What it is:** A trust link between GitHub and Azure that lets them work together safely.
**How it helps:** GitHub can automatically get permission to deploy your code without needing any passwords.

1. You should be on your App Registration page (`kalal-github-deploy`)
2. In the left sidebar, click **Certificates & secrets**
3. Click the **Federated credentials** tab
4. Click **+ Add credential**
5. For **Federated credential scenario**, select **GitHub Actions deploying Azure resources**
6. Fill in the GitHub details:
   - **Organization:** `kalal-shivakumar`
   - **Repository:** `kalal`
   - **Entity type:** Select `Branch`
   - **GitHub branch name:** `main`
   - **Name:** `github-deploy-main`
7. Verify the auto-generated values:
   - Issuer: `https://token.actions.githubusercontent.com`
   - Subject identifier: `repo:kalal-shivakumar/kalal:ref:refs/heads/main`
   - Audience: `api://AzureADTokenExchange`
8. Click **Add**

---

## Step 6: Assign Contributor Role to the App Registration

**What it is:** Permission that gives your GitHub workflow the right to make changes in Azure.
**How it helps:** Without this, GitHub can't actually deploy your code even if it can log in.

1. In the top search bar, type **Resource groups**
2. Click on `rg-kalal`
3. In the left sidebar, click **Access control (IAM)**
4. Click **+ Add** → **Add role assignment**
5. **Role tab:**
   - Search for `Contributor`
   - Select **Contributor**
   - Click **Next**
6. **Members tab:**
   - For "Assign access to", select **User, group, or service principal**
   - Click **+ Select members**
   - In the search box, type `kalal-github-deploy`
   - Click on it to select it
   - Click **Select**
   - Click **Next**
7. **Review + assign tab:**
   - Click **Review + assign**

---

## Step 7: Create a GitHub Repository

**What it is:** Your code storage on GitHub where you keep all your files.
**How it helps:** When you upload code here, it automatically starts the deployment to Azure.

1. Go to **https://github.com**
2. Sign in to your account
3. Click the **+** icon (top right) → **New repository**
4. Fill in:
   - **Repository name:** `kalal`
   - **Visibility:** Public (or Private)
   - Do NOT initialize with README (if you already have local code)
5. Click **Create repository**

---

## Step 8: Add Secrets to GitHub Repository

GitHub secrets store your Azure IDs securely so the workflow can use them.

1. Go to your repository: **https://github.com/kalal-shivakumar/kalal**
2. Click **Settings** (tab at the top)
3. In the left sidebar, expand **Secrets and variables**
4. Click **Actions**
5. Click **New repository secret**

Add these three secrets one at a time:

**Secret 1:**
- Name: `CLIENTID`
- Secret: paste your Application (client) ID from Step 4
- Click **Add secret**

**Secret 2:**
- Name: `TENANTID`
- Secret: paste your Directory (tenant) ID from Step 4
- Click **Add secret**

**Secret 3:**
- Name: `SUBSCRIPTIONID`
- Secret: paste your Subscription ID (from portal Home → Subscriptions)
- Click **Add secret**

---

## Step 9: Create the GitHub Actions Workflow File

**What it is:** A file that tells GitHub what to do automatically (build and upload your code).
**How it helps:** You don't have to do these steps manually anymore—GitHub does it all automatically.

1. In your project folder, create the directory: `.github/workflows/`
2. Create a file called `deploy.yml` inside it
3. Add this content:

### File: `index.html`

```html
<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <h1>Hello World! 🚀</h1>
    <p>Deployed on Azure App Service</p>
</body>
</html>
```

### File: `.github/workflows/deploy.yml`

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
      
      - uses: azure/login@v2
        with:
          client-id: ${{ secrets.CLIENTID }}
          tenant-id: ${{ secrets.TENANTID }}
          subscription-id: ${{ secrets.SUBSCRIPTIONID }}
      
      - uses: azure/webapps-deploy@v3
        with:
          app-name: kalal-java-app
          package: .
```

---

## Step 10: Push Code to GitHub

**What it is:** Upload your code to GitHub so it's safe in the cloud.
**How it helps:** As soon as you upload, GitHub starts building and deploying your website automatically.

1. Open terminal/PowerShell in your project folder
2. Run these commands:

```powershell
git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/kalal-shivakumar/kalal.git
git branch -M main
git push -u origin main
```

---

## Step 11: Verify the Deployment

**What it is:** Check if your website is live and working correctly on Azure.
**How it helps:** Look at GitHub to see if the deployment succeeded, then visit your website to make sure it works.

**Check GitHub Actions:**
1. Go to **https://github.com/kalal-shivakumar/kalal**
2. Click the **Actions** tab
3. You should see your workflow running (yellow dot) or completed (green checkmark)
4. Click on the run to see detailed logs

**Check your website:**
1. Open browser
2. Go to: **https://kalal-java-app.azurewebsites.net**
3. Your website should be live

---

## Summary

| Step | What you created | Where |
|------|-----------------|-------|
| 1 | Resource Group (`rg-kalal`) | Azure Portal |
| 2 | App Service Plan (`plan-kalal`) | Azure Portal |
| 3 | Web App (`kalal-java-app`) | Azure Portal |
| 4 | App Registration (`kalal-github-deploy`) | Azure Portal |
| 5 | Federated Credential (`github-deploy-main`) | Azure Portal |
| 6 | Contributor Role Assignment | Azure Portal |
| 7 | GitHub Repository (`kalal`) | GitHub |
| 8 | GitHub Secrets (3 secrets) | GitHub |
| 9 | Workflow file (`deploy.yml`) & index.html | Local + GitHub |
| 10 | Push code | Local terminal |
| 11 | Verify deployment | Browser |
