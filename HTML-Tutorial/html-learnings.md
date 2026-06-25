# HTML Learnings - 30 Basic Single-Page Labs

Goal: Learn HTML by building a single-page onboarding website.
Rule: Every lab is independent and can be run as a standalone HTML file.
Constraint: Use only HTML. No CSS. No JavaScript.

## Lab 1: What Is a Single-Page Onboarding Screen
What this lab teaches:
- Understand what onboarding means on one page.
- Identify common sections: intro, form, confirmation.
- Build a simple semantic page flow.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 1 - Single Page Onboarding</title>
</head>
<body>
  <header>
    <h1>Welcome to QuickStart Onboarding</h1>
  </header>
  <main>
    <section>
      <h2>What You Will Do</h2>
      <p>Share your details and complete setup in one page.</p>
    </section>
  </main>
</body>
</html>
```

## Lab 2: Basic HTML Page Setup
What this lab teaches:
- Create a valid HTML document.
- Use head and body correctly.
- Keep a clean structure for future sections.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 2 - HTML Setup</title>
</head>
<body>
  <h1>Onboarding Page</h1>
  <p>This page has a valid HTML foundation.</p>
</body>
</html>
```

## Lab 3: Page Title and Meta Tags
What this lab teaches:
- Add a useful browser tab title.
- Set character encoding and viewport.
- Prepare metadata for readability and SEO basics.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Single-page user onboarding form.">
  <title>Lab 3 - Metadata</title>
</head>
<body>
  <h1>Metadata Ready Page</h1>
</body>
</html>
```

## Lab 4: Headings and Simple Text Content
What this lab teaches:
- Use headings in the right order.
- Group text into meaningful paragraphs.
- Improve page scanability.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 4 - Headings and Text</title>
</head>
<body>
  <h1>User Onboarding</h1>
  <h2>Step Overview</h2>
  <p>Complete your profile and preferences to get started.</p>
</body>
</html>
```

## Lab 5: Intro Section for New Users
What this lab teaches:
- Build a clear welcome section.
- Explain onboarding purpose quickly.
- Guide users to start action.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 5 - Intro Section</title>
</head>
<body>
  <section>
    <h1>Welcome, New User</h1>
    <p>We need a few details to set up your account.</p>
    <p>Start by filling the form below.</p>
  </section>
</body>
</html>
```

## Lab 6: Using Paragraphs for Instructions
What this lab teaches:
- Write readable form instructions.
- Break content into short paragraphs.
- Reduce confusion before user input.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 6 - Instruction Paragraphs</title>
</head>
<body>
  <h1>Instructions</h1>
  <p>Use your real email so we can send updates.</p>
  <p>Fields marked required must be filled.</p>
  <p>Review details before submitting.</p>
</body>
</html>
```

## Lab 7: Creating Step-by-Step Lists
What this lab teaches:
- Use ordered lists for onboarding steps.
- Make process flow clear.
- Add checklist-like clarity.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 7 - Step List</title>
</head>
<body>
  <h1>Onboarding Steps</h1>
  <ol>
    <li>Enter account details</li>
    <li>Select preferences</li>
    <li>Submit and confirm</li>
  </ol>
</body>
</html>
```

## Lab 8: Adding Simple Navigation Links
What this lab teaches:
- Add section links on one page.
- Use fragment IDs for quick jumps.
- Improve movement across long forms.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 8 - Navigation Links</title>
</head>
<body>
  <nav>
    <a href="#account">Account</a> |
    <a href="#preferences">Preferences</a> |
    <a href="#submit">Submit</a>
  </nav>

  <h2 id="account">Account</h2>
  <p>Account details section.</p>

  <h2 id="preferences">Preferences</h2>
  <p>Preferences section.</p>

  <h2 id="submit">Submit</h2>
  <p>Final submission section.</p>
</body>
</html>
```

## Lab 9: Adding Images with Alt Text
What this lab teaches:
- Insert images in onboarding pages.
- Write meaningful alt text.
- Keep decorative and informative images distinct.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 9 - Images and Alt Text</title>
</head>
<body>
  <h1>Profile Setup</h1>
  <img src="profile-placeholder.png" alt="Placeholder avatar for new user profile">
</body>
</html>
```

## Lab 10: Form Tag Basics
What this lab teaches:
- Create a basic form element.
- Set method and action attributes.
- Prepare form for user onboarding input.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 10 - Form Basics</title>
</head>
<body>
  <form action="/submit-onboarding" method="post">
    <p>Simple onboarding form container.</p>
  </form>
</body>
</html>
```

## Lab 11: Name Input Field
What this lab teaches:
- Add a text input for full name.
- Use label and id pairing.
- Capture identity basics.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 11 - Name Input</title>
</head>
<body>
  <form>
    <label for="fullName">Full Name</label>
    <input type="text" id="fullName" name="fullName">
  </form>
</body>
</html>
```

## Lab 12: Email Input Field
What this lab teaches:
- Use email input type.
- Enable native email validation behavior.
- Collect primary communication info.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 12 - Email Input</title>
</head>
<body>
  <form>
    <label for="email">Email Address</label>
    <input type="email" id="email" name="email">
  </form>
</body>
</html>
```

## Lab 13: Password Input Field
What this lab teaches:
- Add secure-looking password input.
- Set minimum length with attributes.
- Encourage stronger account setup.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 13 - Password Input</title>
</head>
<body>
  <form>
    <label for="password">Password</label>
    <input type="password" id="password" name="password" minlength="8" required>
  </form>
</body>
</html>
```

## Lab 14: Phone Number Input Field
What this lab teaches:
- Collect contact number using tel input.
- Add a pattern for expected format.
- Handle phone details in onboarding.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 14 - Phone Input</title>
</head>
<body>
  <form>
    <label for="phone">Phone Number</label>
    <input type="tel" id="phone" name="phone" pattern="[0-9]{10}">
  </form>
</body>
</html>
```

## Lab 15: Date of Birth Input Field
What this lab teaches:
- Use date input type correctly.
- Capture user DOB with structured format.
- Apply min and max bounds when needed.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 15 - Date Input</title>
</head>
<body>
  <form>
    <label for="dob">Date of Birth</label>
    <input type="date" id="dob" name="dob">
  </form>
</body>
</html>
```

## Lab 16: Dropdown for User Type
What this lab teaches:
- Build a select dropdown.
- Offer predefined onboarding roles.
- Capture role using option values.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 16 - Dropdown</title>
</head>
<body>
  <form>
    <label for="userType">User Type</label>
    <select id="userType" name="userType">
      <option value="student">Student</option>
      <option value="professional">Professional</option>
      <option value="other">Other</option>
    </select>
  </form>
</body>
</html>
```

## Lab 17: Radio Buttons for Single Choice
What this lab teaches:
- Create mutually exclusive choices.
- Group radio buttons by shared name.
- Capture one onboarding preference.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 17 - Radio Buttons</title>
</head>
<body>
  <form>
    <p>Preferred Contact Method</p>
    <label><input type="radio" name="contactMethod" value="email"> Email</label>
    <label><input type="radio" name="contactMethod" value="phone"> Phone</label>
  </form>
</body>
</html>
```

## Lab 18: Checkboxes for Multiple Interests
What this lab teaches:
- Collect multiple selections from users.
- Use checkbox groups effectively.
- Capture onboarding interests.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 18 - Checkboxes</title>
</head>
<body>
  <form>
    <p>Select Interests</p>
    <label><input type="checkbox" name="interests" value="web"> Web</label>
    <label><input type="checkbox" name="interests" value="ai"> AI</label>
    <label><input type="checkbox" name="interests" value="cloud"> Cloud</label>
  </form>
</body>
</html>
```

## Lab 19: Textarea for User Goals
What this lab teaches:
- Add multiline inputs for free text.
- Capture user goals and expectations.
- Set rows and cols for entry area.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 19 - Textarea</title>
</head>
<body>
  <form>
    <label for="goals">Your Onboarding Goal</label>
    <textarea id="goals" name="goals" rows="4" cols="40"></textarea>
  </form>
</body>
</html>
```

## Lab 20: File Upload for Profile Photo
What this lab teaches:
- Create file upload input.
- Limit file type with accept attribute.
- Prepare onboarding for profile image.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 20 - File Upload</title>
</head>
<body>
  <form enctype="multipart/form-data">
    <label for="photo">Upload Profile Photo</label>
    <input type="file" id="photo" name="photo" accept="image/*">
  </form>
</body>
</html>
```

## Lab 21: Grouping Fields with Fieldset
What this lab teaches:
- Group related form controls semantically.
- Use legend to describe grouped fields.
- Improve accessibility and clarity.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 21 - Fieldset</title>
</head>
<body>
  <form>
    <fieldset>
      <legend>Account Information</legend>
      <label for="name">Name</label>
      <input type="text" id="name" name="name">
      <label for="mail">Email</label>
      <input type="email" id="mail" name="mail">
    </fieldset>
  </form>
</body>
</html>
```

## Lab 22: Label and Input Pairing
What this lab teaches:
- Properly connect labels to controls.
- Increase click area and accessibility.
- Avoid orphan form fields.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 22 - Labels and Inputs</title>
</head>
<body>
  <form>
    <label for="city">City</label>
    <input type="text" id="city" name="city">
  </form>
</body>
</html>
```

## Lab 23: Required Field Validation
What this lab teaches:
- Mark mandatory fields with required.
- Use minlength/maxlength where needed.
- Improve form completeness at submit time.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 23 - Required Validation</title>
</head>
<body>
  <form>
    <label for="username">Username</label>
    <input type="text" id="username" name="username" required minlength="4" maxlength="20">
    <button type="submit">Submit</button>
  </form>
</body>
</html>
```

## Lab 24: Submit and Reset Buttons
What this lab teaches:
- Use submit button to send form data.
- Use reset button carefully.
- Set clear actions for users.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 24 - Buttons</title>
</head>
<body>
  <form>
    <label for="company">Company</label>
    <input type="text" id="company" name="company">
    <button type="submit">Create Account</button>
    <button type="reset">Clear Form</button>
  </form>
</body>
</html>
```

## Lab 25: Terms Acceptance Checkbox
What this lab teaches:
- Add legal acceptance input.
- Mark consent as required.
- Support compliant onboarding flow.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 25 - Terms Checkbox</title>
</head>
<body>
  <form>
    <label>
      <input type="checkbox" name="terms" required>
      I agree to the Terms and Privacy Policy.
    </label>
    <button type="submit">Continue</button>
  </form>
</body>
</html>
```

## Lab 26: Confirmation Message Section
What this lab teaches:
- Show static confirmation content.
- Guide users to the next step.
- Add clear completion messaging.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 26 - Confirmation Message</title>
</head>
<body>
  <section>
    <h1>Registration Submitted</h1>
    <p>Thank you. Your onboarding request is under review.</p>
    <p>Check your email for confirmation details.</p>
  </section>
</body>
</html>
```

## Lab 27: Help and Contact Section
What this lab teaches:
- Add support details in-page.
- Provide help links and contact info.
- Improve onboarding trust and clarity.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 27 - Help Section</title>
</head>
<body>
  <section>
    <h2>Need Help?</h2>
    <p>Email: support@example.com</p>
    <p>Phone: +1 555 123 4567</p>
  </section>
</body>
</html>
```

## Lab 28: Basic Accessibility in Forms
What this lab teaches:
- Use fieldset and legend for grouped controls.
- Add clear labels and instructions.
- Improve keyboard and screen reader usability.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 28 - Accessibility Basics</title>
</head>
<body>
  <form>
    <fieldset>
      <legend>Communication Preferences</legend>
      <label for="emailOpt">Email Updates</label>
      <input type="checkbox" id="emailOpt" name="emailOpt">
    </fieldset>
  </form>
</body>
</html>
```

## Lab 29: Reviewing and Testing the Page
What this lab teaches:
- Check semantic structure manually.
- Test form fields and required validations.
- Verify links and content completeness.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Lab 29 - Review Template</title>
</head>
<body>
  <h1>Onboarding QA Checklist</h1>
  <ul>
    <li>All fields have labels</li>
    <li>Required fields are marked</li>
    <li>Terms checkbox exists</li>
    <li>Submit button is present</li>
  </ul>
</body>
</html>
```

## Lab 30: Final Single-Page Onboarding Form Project
What this lab teaches:
- Combine all basic onboarding sections.
- Build one complete HTML-only onboarding page.
- Produce a practical beginner-ready final lab.

Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Lab 30 - Final Onboarding Page</title>
</head>
<body>
  <header>
    <h1>User Onboarding</h1>
    <p>Complete this form to create your account.</p>
  </header>

  <main>
    <form action="/onboard" method="post" enctype="multipart/form-data">
      <fieldset>
        <legend>Account Details</legend>

        <label for="name">Full Name</label>
        <input type="text" id="name" name="name" required>

        <label for="email">Email</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" minlength="8" required>

        <label for="phone">Phone</label>
        <input type="tel" id="phone" name="phone" pattern="[0-9]{10}">

        <label for="dob">Date of Birth</label>
        <input type="date" id="dob" name="dob">
      </fieldset>

      <fieldset>
        <legend>Profile</legend>

        <label for="role">User Type</label>
        <select id="role" name="role">
          <option value="student">Student</option>
          <option value="professional">Professional</option>
          <option value="other">Other</option>
        </select>

        <p>Preferred Contact Method</p>
        <label><input type="radio" name="contactMethod" value="email"> Email</label>
        <label><input type="radio" name="contactMethod" value="phone"> Phone</label>

        <p>Interests</p>
        <label><input type="checkbox" name="interests" value="web"> Web</label>
        <label><input type="checkbox" name="interests" value="ai"> AI</label>
        <label><input type="checkbox" name="interests" value="cloud"> Cloud</label>

        <label for="goals">Your Goal</label>
        <textarea id="goals" name="goals" rows="4" cols="40"></textarea>

        <label for="photo">Profile Photo</label>
        <input type="file" id="photo" name="photo" accept="image/*">
      </fieldset>

      <fieldset>
        <legend>Consent</legend>
        <label><input type="checkbox" name="terms" required> I agree to Terms and Privacy Policy</label>
      </fieldset>

      <button type="submit">Submit Onboarding</button>
      <button type="reset">Reset Form</button>
    </form>

    <section>
      <h2>Need Help?</h2>
      <p>Email: support@example.com</p>
    </section>
  </main>
</body>
</html>
```
