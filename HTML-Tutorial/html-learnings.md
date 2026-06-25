# HTML Learnings (Beginner Progressive) - Corporate User Onboarding Single Page

Audience: Absolute beginner in HTML.
Method: Build one single page step by step.
Rule: In every lab, add only 2 or 3 extra lines.
Final Product: A corporate company user onboarding single-page form.

## Base File (Use This in Lab 1)
Save this as onboarding.html

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Corporate Onboarding</title>
</head>
<body>
</body>
</html>
```

## Lab 1: Add Main Heading
What you learn:
- Add visible content inside body.
- Use h1 heading.
- Understand page title vs visible heading.

Add these 2 lines:
```html
<h1>Acme Corp Employee Onboarding</h1>
<p>Welcome to your onboarding portal.</p>
```

## Lab 2: Add Intro Paragraphs
What you learn:
- Use paragraphs for clear instructions.
- Improve readability.
- Explain purpose to users.

Add these 2 lines:
```html
<p>Please complete this form to create your company profile.</p>
<p>All mandatory fields must be filled.</p>
```

## Lab 3: Add Navigation Marker
What you learn:
- Create a simple in-page anchor target.
- Prepare one-page navigation.
- Understand id usage.

Add these 2 lines:
```html
<a href="#onboarding-form">Jump to Form</a>
<hr>
```

## Lab 4: Add Form Container
What you learn:
- Start an HTML form.
- Set action and method.
- Give form an id for linking.

Add these 2 lines:
```html
<form id="onboarding-form" action="/submit" method="post">
</form>
```

## Lab 5: Add Section Heading Inside Form
What you learn:
- Organize form into sections.
- Add context for users.
- Keep structure beginner-friendly.

Add these 2 lines inside form:
```html
<h2>Section 1: Basic Information</h2>
<p>Enter your personal details.</p>
```

## Lab 6: Add Full Name Field
What you learn:
- Use label and input pairing.
- Capture user name.
- Build first input safely.

Add these 2 lines inside form:
```html
<label for="fullName">Full Name</label>
<input type="text" id="fullName" name="fullName">
```

## Lab 7: Add Work Email Field
What you learn:
- Use email input type.
- Capture official contact.
- Understand semantic input types.

Add these 2 lines inside form:
```html
<label for="workEmail">Work Email</label>
<input type="email" id="workEmail" name="workEmail">
```

## Lab 8: Add Employee ID Field
What you learn:
- Add text input for corporate ID.
- Keep consistent labels.
- Extend form progressively.

Add these 2 lines inside form:
```html
<label for="employeeId">Employee ID</label>
<input type="text" id="employeeId" name="employeeId">
```

## Lab 9: Add Department Dropdown
What you learn:
- Use select and option.
- Limit input to valid departments.
- Improve data consistency.

Add these 3 lines inside form:
```html
<label for="department">Department</label>
<select id="department" name="department"><option value="engineering">Engineering</option><option value="hr">HR</option><option value="finance">Finance</option></select>
<br>
```

## Lab 10: Add Job Title Field
What you learn:
- Capture role information.
- Expand professional profile.
- Use plain text input correctly.

Add these 2 lines inside form:
```html
<label for="jobTitle">Job Title</label>
<input type="text" id="jobTitle" name="jobTitle">
```

## Lab 11: Add Phone Number
What you learn:
- Use tel input type.
- Capture mobile contact.
- Prepare for HR communication.

Add these 2 lines inside form:
```html
<label for="phone">Phone Number</label>
<input type="tel" id="phone" name="phone">
```

## Lab 12: Add Date of Joining
What you learn:
- Use date input.
- Capture joining timeline.
- Keep date format structured.

Add these 2 lines inside form:
```html
<label for="joiningDate">Date of Joining</label>
<input type="date" id="joiningDate" name="joiningDate">
```

## Lab 13: Add Office Location
What you learn:
- Capture workplace location.
- Add another text field.
- Build realistic corporate data model.

Add these 2 lines inside form:
```html
<label for="officeLocation">Office Location</label>
<input type="text" id="officeLocation" name="officeLocation">
```

## Lab 14: Add Work Mode Radio Options
What you learn:
- Use radio buttons for one choice.
- Group choices with same name.
- Capture remote/hybrid/onsite preference.

Add these 3 lines inside form:
```html
<p>Work Mode</p>
<label><input type="radio" name="workMode" value="onsite"> Onsite</label>
<label><input type="radio" name="workMode" value="hybrid"> Hybrid</label>
```

## Lab 15: Add One More Work Mode Option
What you learn:
- Extend radio group correctly.
- Keep values structured.
- Improve form completeness.

Add this 1 line plus 1 helper line inside form:
```html
<label><input type="radio" name="workMode" value="remote"> Remote</label>
<br>
```

## Lab 16: Add Skills Checkboxes
What you learn:
- Use checkboxes for multiple choices.
- Capture training preferences.
- Model onboarding skills profile.

Add these 3 lines inside form:
```html
<p>Primary Skills</p>
<label><input type="checkbox" name="skills" value="communication"> Communication</label>
<label><input type="checkbox" name="skills" value="technical"> Technical</label>
```

## Lab 17: Add Another Skill Option
What you learn:
- Extend checkbox groups.
- Keep naming consistent.
- Improve user personalization.

Add these 2 lines inside form:
```html
<label><input type="checkbox" name="skills" value="leadership"> Leadership</label>
<br>
```

## Lab 18: Add Manager Name Field
What you learn:
- Capture reporting information.
- Add another text input.
- Prepare internal org mapping.

Add these 2 lines inside form:
```html
<label for="managerName">Reporting Manager</label>
<input type="text" id="managerName" name="managerName">
```

## Lab 19: Add Emergency Contact Name
What you learn:
- Capture emergency details.
- Create related contact sections.
- Improve practical onboarding scope.

Add these 2 lines inside form:
```html
<label for="emergencyName">Emergency Contact Name</label>
<input type="text" id="emergencyName" name="emergencyName">
```

## Lab 20: Add Emergency Contact Phone
What you learn:
- Add second emergency field.
- Keep details paired.
- Improve profile completeness.

Add these 2 lines inside form:
```html
<label for="emergencyPhone">Emergency Contact Phone</label>
<input type="tel" id="emergencyPhone" name="emergencyPhone">
```

## Lab 21: Add Address Textarea
What you learn:
- Use textarea for long text.
- Capture residential address.
- Handle multi-line input.

Add these 2 lines inside form:
```html
<label for="address">Residential Address</label>
<textarea id="address" name="address" rows="3" cols="40"></textarea>
```

## Lab 22: Add ID Proof Upload
What you learn:
- Use file input.
- Capture onboarding documents.
- Understand upload field basics.

Add these 2 lines inside form:
```html
<label for="idProof">Upload ID Proof</label>
<input type="file" id="idProof" name="idProof">
```

## Lab 23: Add Profile Photo Upload
What you learn:
- Add a second upload field.
- Accept image files.
- Prepare employee profile creation.

Add these 2 lines inside form:
```html
<label for="profilePhoto">Upload Profile Photo</label>
<input type="file" id="profilePhoto" name="profilePhoto" accept="image/*">
```

## Lab 24: Add Terms Acceptance
What you learn:
- Add legal consent checkbox.
- Mark a field required.
- Build compliant onboarding flow.

Add these 2 lines inside form:
```html
<label><input type="checkbox" name="terms" required> I agree to company policies.</label>
<br>
```

## Lab 25: Add Corporate Policy Links
What you learn:
- Add useful legal references.
- Improve user trust.
- Keep users informed before submit.

Add these 2 lines inside form:
```html
<a href="/terms">Terms of Use</a>
<a href="/privacy">Privacy Policy</a>
```

## Lab 26: Add Submit and Reset Buttons
What you learn:
- Submit data to server.
- Reset the form quickly.
- Complete basic interaction controls.

Add these 2 lines inside form:
```html
<button type="submit">Submit Onboarding</button>
<button type="reset">Reset Form</button>
```

## Lab 27: Add Help Section After Form
What you learn:
- Provide support information.
- Add static contact content.
- Improve onboarding confidence.

Add these 3 lines after form:
```html
<h2>Need Help?</h2>
<p>Email: hr@acmecorp.com</p>
<p>Phone: +1-555-0100</p>
```

## Lab 28: Add Confirmation Message Block
What you learn:
- Show expected post-submit message.
- Guide user next steps.
- Improve completion clarity.

Add these 3 lines after help section:
```html
<h2>After Submission</h2>
<p>You will receive a confirmation email within 24 hours.</p>
<p>Keep your Employee ID handy for verification.</p>
```

## Lab 29: Add Simple Checklist
What you learn:
- Summarize required onboarding items.
- Use unordered list for guidance.
- Reduce missing information errors.

Add these 3 lines before form submit buttons:
```html
<ul>
  <li>Fill all required fields</li><li>Upload ID proof</li><li>Accept company policies</li>
</ul>
```

## Lab 30: Final Review and Corporate Single-Page Output
What you learn:
- Review complete single-page onboarding structure.
- Ensure fields are meaningful and beginner-friendly.
- Deliver final corporate onboarding HTML page.

Add these 2 lines near top of body:
```html
<h2>Corporate New Hire Registration</h2>
<p>Please complete the onboarding in one sitting.</p>
```

---

## Final Full Page (Reference Output)
Use this final version after completing all 30 labs.

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Corporate Onboarding</title>
</head>
<body>
  <h1>Acme Corp Employee Onboarding</h1>
  <h2>Corporate New Hire Registration</h2>
  <p>Welcome to your onboarding portal.</p>
  <p>Please complete this form to create your company profile.</p>
  <p>All mandatory fields must be filled.</p>
  <p>Please complete the onboarding in one sitting.</p>

  <a href="#onboarding-form">Jump to Form</a>
  <hr>

  <form id="onboarding-form" action="/submit" method="post">
    <h2>Section 1: Basic Information</h2>
    <p>Enter your personal details.</p>

    <label for="fullName">Full Name</label>
    <input type="text" id="fullName" name="fullName">

    <label for="workEmail">Work Email</label>
    <input type="email" id="workEmail" name="workEmail">

    <label for="employeeId">Employee ID</label>
    <input type="text" id="employeeId" name="employeeId">

    <label for="department">Department</label>
    <select id="department" name="department">
      <option value="engineering">Engineering</option>
      <option value="hr">HR</option>
      <option value="finance">Finance</option>
    </select>
    <br>

    <label for="jobTitle">Job Title</label>
    <input type="text" id="jobTitle" name="jobTitle">

    <label for="phone">Phone Number</label>
    <input type="tel" id="phone" name="phone">

    <label for="joiningDate">Date of Joining</label>
    <input type="date" id="joiningDate" name="joiningDate">

    <label for="officeLocation">Office Location</label>
    <input type="text" id="officeLocation" name="officeLocation">

    <p>Work Mode</p>
    <label><input type="radio" name="workMode" value="onsite"> Onsite</label>
    <label><input type="radio" name="workMode" value="hybrid"> Hybrid</label>
    <label><input type="radio" name="workMode" value="remote"> Remote</label>
    <br>

    <p>Primary Skills</p>
    <label><input type="checkbox" name="skills" value="communication"> Communication</label>
    <label><input type="checkbox" name="skills" value="technical"> Technical</label>
    <label><input type="checkbox" name="skills" value="leadership"> Leadership</label>
    <br>

    <label for="managerName">Reporting Manager</label>
    <input type="text" id="managerName" name="managerName">

    <label for="emergencyName">Emergency Contact Name</label>
    <input type="text" id="emergencyName" name="emergencyName">

    <label for="emergencyPhone">Emergency Contact Phone</label>
    <input type="tel" id="emergencyPhone" name="emergencyPhone">

    <label for="address">Residential Address</label>
    <textarea id="address" name="address" rows="3" cols="40"></textarea>

    <label for="idProof">Upload ID Proof</label>
    <input type="file" id="idProof" name="idProof">

    <label for="profilePhoto">Upload Profile Photo</label>
    <input type="file" id="profilePhoto" name="profilePhoto" accept="image/*">

    <label><input type="checkbox" name="terms" required> I agree to company policies.</label>
    <br>

    <a href="/terms">Terms of Use</a>
    <a href="/privacy">Privacy Policy</a>

    <ul>
      <li>Fill all required fields</li>
      <li>Upload ID proof</li>
      <li>Accept company policies</li>
    </ul>

    <button type="submit">Submit Onboarding</button>
    <button type="reset">Reset Form</button>
  </form>

  <h2>Need Help?</h2>
  <p>Email: hr@acmecorp.com</p>
  <p>Phone: +1-555-0100</p>

  <h2>After Submission</h2>
  <p>You will receive a confirmation email within 24 hours.</p>
  <p>Keep your Employee ID handy for verification.</p>
</body>
</html>
```
