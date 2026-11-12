# Requirements Register – ShopEasy QA

## 1. Introduction

The Requirements Register documents the functional requirements of the ShopEasy Online Shopping Application.

The requirements are divided into three major modules:

1. Account and Login
2. Browse and Search
3. Cart and Checkout

Each requirement has a unique identifier to support traceability between requirements, user stories, and test cases.

---

## 2. Account and Login Requirements

| Requirement ID | Requirement Name  | Description                                                                                                                                                                                                                        | Priority |
| -------------- | ----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- |
| REQ-A1         | User Registration | The application shall allow new users to register using their full name, email address, and password. Email must be valid and unique. Password must contain at least 8 characters, including one number and one special character. | High     |
| REQ-A2         | User Login        | The application shall allow registered users to log in using valid credentials. Invalid credentials shall display an appropriate error message.                                                                                    | High     |
| REQ-A3         | Account Lock      | The application shall temporarily lock an account after 5 consecutive unsuccessful login attempts. The lock period shall be 15 minutes.                                                                                            | High     |
| REQ-A4         | Forgot Password   | The application shall allow users to request a password reset link through their registered email address. The reset link shall expire after 30 minutes and can be used only once.                                                 | Medium   |
| REQ-A5         | Logout            | The application shall allow authenticated users to log out securely. After logout, the session shall end and protected account pages shall not be accessible through browser navigation.                                           | High     |

---

## 3. Browse and Search Requirements

| Requirement ID | Requirement Name | Description                                                                                                                                                                                                 | Priority |
| -------------- | ---------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- |
| REQ-B1         | Product Listing  | The application shall display products in a list with 12 products per page. Each product card shall display an image, product name, and price.                                                              | High     |
| REQ-B2         | Product Search   | The application shall allow users to search products using keywords in product names. Search shall be case-insensitive. If no matching product is found, the application shall display "No products found". | High     |
| REQ-B3         | Product Filters  | The application shall allow users to filter products by category and minimum/maximum price. Category and price filters shall work together.                                                                 | Medium   |
| REQ-B4         | Product Sorting  | The application shall allow users to sort products by price (low to high), price (high to low), and name (A to Z).                                                                                          | Medium   |
| REQ-B5         | Product Details  | The application shall display product images, name, price, description, and stock availability. The Add to Cart option shall be disabled for out-of-stock products.                                         | High     |

---

## 4. Cart and Checkout Requirements

| Requirement ID | Requirement Name               | Description                                                                                                                                                                                                                     | Priority |
| -------------- | ------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- |
| REQ-C1         | Add to Cart                    | The application shall allow users to add available products to their shopping cart. The cart icon shall display the total number of items.                                                                                      | High     |
| REQ-C2         | Update Quantity                | The application shall allow users to update product quantities between 1 and 10. The line total shall update automatically when the quantity changes.                                                                           | High     |
| REQ-C3         | Remove Cart Item               | The application shall allow users to remove products from the cart. The cart total shall update immediately. An appropriate message shall appear when the cart is empty.                                                        | Medium   |
| REQ-C4         | Apply Coupon                   | The application shall allow users to apply the coupon code SAVE10 for a 10% discount on orders with a minimum cart value of Rs. 1,000. Only one coupon shall be allowed per order.                                              | Medium   |
| REQ-C5         | Checkout                       | The application shall allow logged-in users to proceed to checkout by providing shipping details, including name, 10-digit phone number, address, city, and 6-digit PIN code.                                                   | High     |
| REQ-C6         | Payment and Order Confirmation | The application shall support Card, UPI, and Cash on Delivery payment options. After successful order placement, the application shall display a confirmation page with a unique Order ID and send an order confirmation email. | High     |

---

## 5. Requirement Summary

| Module            | Requirement IDs      | Total Requirements |
| ----------------- | -------------------- | -----------------: |
| Account and Login | REQ-A1 to REQ-A5     |                  5 |
| Browse and Search | REQ-B1 to REQ-B5     |                  5 |
| Cart and Checkout | REQ-C1 to REQ-C6     |                  6 |
| **Total**         | **REQ-A1 to REQ-C6** |             **16** |

---

## 6. Requirement Traceability

Requirements are connected to Jira User Stories and corresponding test scenarios.

| Requirement Group | Jira Epic         | Jira Epic Key |
| ----------------- | ----------------- | ------------- |
| Account and Login | Account and Login | SEQ-1         |
| Browse and Search | Browse and Search | SEQ-7         |
| Cart and Checkout | Cart and Checkout | SEQ-13        |

Detailed user stories are documented in `User-Stories.md`.

Test scenarios are documented in the `04-Test-Cases` directory.

---

## 7. Acceptance Criteria

The following general acceptance criteria apply to the project:

- Each functional requirement must have clearly defined expected behavior.
- Mandatory fields must be validated.
- Invalid inputs must display appropriate error messages.
- Application behavior must match the documented requirements.
- Security-related requirements must be verified through appropriate test scenarios.
- Requirements must be traceable to relevant user stories and test cases.

---

## 8. Documentation Status

| Activity                               | Status    |
| -------------------------------------- | --------- |
| Account and Login Requirements         | Completed |
| Browse and Search Requirements         | Completed |
| Cart and Checkout Requirements         | Completed |
| Requirement Identification             | Completed |
| Requirement Traceability Documentation | Completed |

**Overall Documentation Status: Completed**

---

## 9. Conclusion

This Requirements Register provides a structured overview of the functional requirements of the ShopEasy Online Shopping Application.

It serves as the foundation for user story creation, sprint planning, test case design, and requirement traceability throughout the QA project.
