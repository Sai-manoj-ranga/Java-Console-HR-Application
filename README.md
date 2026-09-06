# Naukri HR Screening Console App (POC)

A simple Java console-based application that simulates an automated HR screening process. It interacts with a candidate through the terminal, collects their details, and evaluates their eligibility against a predefined job profile in real time.

## Overview

This is a Proof of Concept (POC) built to demonstrate how a basic rule-based screening bot could work for an HR/recruitment platform (like Naukri). The app walks the candidate through a series of questions and uses nested conditional logic to progressively filter them in or out based on their responses.

## Features

- Interactive console-based Q&A flow
- Multi-stage eligibility screening:
  - Qualification check
  - Skill set match (Java, React, SQL)
  - Experience range validation
  - Location-based filtering with relocation fallback
  - Current salary cap check
  - Salary expectation negotiation range
  - Notice period validation
- Dynamic, branching responses based on candidate input at each stage

## Tech Stack

- **Language:** Java
- **Package:** `com.consolebasedapplication`
- **Main Class:** `Java_Console_Hr_Application`
- **I/O:** `java.util.Scanner` for console input

## Prerequisites

- JDK 8 or above installed
- A terminal or IDE (Eclipse, IntelliJ, VS Code) to compile and run the program

## How to Run

1. Save the file as `Java_Console_Hr_Application.java` inside the folder structure matching the package name:
   ```
   com/consolebasedapplication/Java_Console_Hr_Application.java
   ```
2. Compile the program:
   ```bash
   javac com/consolebasedapplication/Java_Console_Hr_Application.java
   ```
3. Run the program:
   ```bash
   java com.consolebasedapplication.Java_Console_Hr_Application
   ```
4. Follow the on-screen prompts and enter your responses.

## Application Flow

```
Start
  │
  ▼
Enter Name
  │
  ▼
Enter Highest Qualification (Degree / B.TECH / M.TECH)
  │
  ├── No  → Rejected
  │
  ▼ Yes
Enter 6 Skills
  │
  ├── Missing Java/React/SQL → Skills don't match
  │
  ▼ Match found
Enter Years of Experience (0–4 required)
  │
  ├── > 4        → Not matching profile
  ├── Invalid    → Invalid experience
  │
  ▼ 0–4
Enter Current Location
  │
  ├── Bangalore/Hyderabad → Ask current & expected salary
  │
  └── Other location → Ask if willing to relocate
                          ├── Yes/Ok → Ask expected salary
                          └── No     → Rejected (relocation required)
  │
  ▼
Salary Expectation Check (₹3,00,000 – ₹10,00,000 accepted)
  │
  ▼
Notice Period Check (0–15 days accepted)
  │
  ▼
Offer Letter Confirmation / Rejection
```

## Eligibility Criteria (Business Rules)

| Parameter | Accepted Value |
|---|---|
| Qualification | Degree / B.TECH / M.TECH |
| Required Skills | Java, React, SQL (all three) |
| Experience | 0 to 4 years |
| Location | Bangalore, Hyderabad (else must agree to relocate) |
| Current Salary | Below ₹10,00,000/annum |
| Expected Salary | ₹3,00,000 – ₹10,00,000/annum |
| Notice Period | 0 to 15 days |

## Sample Interaction

```
Welcome to Naukri !!!
-----------------------------------
Please provide the details..

What is your name? Rahul
Happy to have you here Mr.Rahul
What is the Highest Qualification? B.TECH
Tell the Skills you are more familiar with?
Java React SQL Python AWS Docker
Your Qualification matches to the job profile
How many years of experience? 2
What is your current location? Hyderabad
What is your current salary?
600000
What is your salary Expectation? 
800000
we are ok with it
What is your notice period?
10
Congratulations we will mail the offer letter
The total pay and the information documents
```

## Known Limitations (POC Scope)

- No input validation for malformed input (e.g., entering text where a number is expected will throw an exception)
- Skill input requires exactly 6 space/newline-separated entries
- Salary and experience checks use hardcoded thresholds
- No persistence — each run is stateless with no data storage
- Deeply nested `if-else` logic; not modular or unit-testable in its current form

## Possible Future Enhancements

- Refactor nested conditionals into separate validator methods or a rules engine
- Add input validation and exception handling
- Externalize business rules (skills, salary range, locations) into a config file
- Add persistence (file/database) to log candidate applications
- Convert to a GUI or web-based front end

## Author 
- RANGA SAI MANOJ

Built as a personal proof-of-concept project.
