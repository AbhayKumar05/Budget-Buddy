# Budget-Buddy

## 1. Idea

The project entails the creation of the budgeting software **"Budget Buddy."** The purpose of Budget Buddy is to assist users effectively manage their personal money by keeping track of their spending, making a budget and tracking the bills too. 

## 2. Background Research

People are increasingly looking for tools and applications in the present financial landscape that may help them keep a clear perspective of their financial operations. Due to the widespread usage of mobile devices, people may now easily keep track of their spending thanks to mobile applications. According to research, there is an increasing need for user-friendly cost tracker applications with attributes like classification, budgeting, and data visualisation.

## 3. Objectives Description

The Budget Buddy mobile app project's main goals are to:

- Offer consumers a simple and straightforward platform for tracking their spending.
- Enable consumers to tag and categorise their spending for improved financial analysis.
- Assist users in creating and maintaining budgets for various spending categories.

## 4. Definition of the Target Audience

The following people are the target market for Budget Buddy:

- People who wish to take better control of their personal budget.
- Consumers on a tight budget need an easy method to keep tabs on their expenditures.
- Teenagers and working adults who wish to budget their money and save wisely.
- Anyone looking to make the process of tracking and assessing their costs simpler.

#Core

## Core Project Use Case

A key use case for our project involves a user registering in the app with their name, email, and a password. After successful registration the user would find the button 'Total expenses' and the user will encounter a '+' icon. Clicking on this icon will enable them to select from a range of categories the user wish to use for implementing their respective budgets.

## Alternate Use Cases

A different use case from our core functionality involves a user who wishes to capture and store or view receipts after making a purchase. To do this, the user needs to grant access to the camera and their gallery. Once granted, the user taps on the wallet icon. After accessing the wallet page, the user has two options. One option allows them to view receipts according to the month, and the other option enables them to take a photo of the receipt, which is immediately saved.
Another usage of the app as an expense tracker is that after user is registered, clicking on the 'Total Savings' button the user will find the challenge page. This page includes section which has space to put challenges. These challenge once put the timer in and the start button is clicked, the challenge strats.

# Project Plan

# FIRST PART OF THE APPLICATION (initial screen)

- Register user
- Log in
- Create the initial page with:
  - Logo
  - Name
  - Login
  - Register

# SECOND PART OF THE APPLICATION (main screen)

- Create the main page
- Create categories
- Create budgets within the categories
- Create communities
- Create user profile:

  - Name
  - Registration email, etc.

- Create the page for adding categories to your "wallet"

# THIRD PART OF THE APPLICATION (database)

- Establish the database connections and code integration for the application.

# Domain Model

+------------------+ +----------------+ +----------------+ +------------------+
| User | | Categories | | Expenses | | Bills & Receipts |
+------------------+ +----------------+ +----------------+ +------------------+
| UserID (PK) | | CategoryID (PK)| | ExpenseID (PK) | | BillID (PK) |
| Username | | Name | | Name | | Name |
| Password | | Budget Limit | | Amount | | Amount |
| Email | | Description | | Date | | Due Date |
| Profile Picture | | Color Code | | | | |
| Preferences | +----------------+ | Description | | Receipt Image |
| ... | | +----------------+ | ... |
+------------------+ | / +------------------+
| /
| /
| /
| /
| /
| /
| /
| /
| /
| /
| /
| /
| /
| /
| /
+----------------------+
| Reports/Analytics |
+----------------------+
| ReportID (PK) |
| Report Name |
| Data Period |
| ... |
+----------------------+

# Functional Requirements

Functional requirements describe what the software should do. They specify the features and capabilities that the application should have:

1. **User Registration**

2. **User Login**

3. **Initial Screen**

   - The initial screen includes:
     - Name
     - Login
     - Register

4. **Main Screen**

   - Create the main page.
   - Create categories for budgeting.
   - Create budgets within the categories.
   - Create communities.
   - User profile:
     - Name
     - Registration email, etc.
   - Create a page for adding categories to the user's "wallet."

5. **Database Integration**

   - Establish database connections and integrate code for storing user data and application data.

6. **Expense Tracking**

7. **Budget Creation**

8. **Receipt Management**

9. **Challenges**

# Non-Functional Requirements

Non-functional requirements focus on performance, security, and usability considerations:

1. **Security**

2. **Performance**

3. **Usability**

4. **Scalability**

5. **Reliability**

6. **Data Privacy**

7. **Data Backup and Recovery**
