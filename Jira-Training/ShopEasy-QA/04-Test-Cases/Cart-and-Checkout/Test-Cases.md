# ShopEasy QA – Cart and Checkout Test Cases

## 1. Overview

This document describes the test scenarios for the Cart and Checkout module of the ShopEasy application.

The module covers:

- Add to Cart
- Quantity Management
- Remove Cart Item
- Coupon Application
- Checkout
- Payment and Order Confirmation

The test cases validate shopping cart operations, discount calculations, shipping information, payment methods, and order confirmation.

## 2. Test Environment

| Configuration        | Details                |
| -------------------- | ---------------------- |
| Application          | ShopEasy               |
| Build                | 1.0.3                  |
| Environment          | Staging                |
| Browser              | Google Chrome – Latest |
| Operating System     | Windows 11             |
| Test Management Tool | Xray                   |

## 3. Related Jira User Stories

| Jira Key | User Story               | Requirement |
| -------- | ------------------------ | ----------- |
| SEQ-14   | Add To Cart              | REQ-C1      |
| SEQ-15   | Quantity                 | REQ-C2      |
| SEQ-16   | Remove Item              | REQ-C3      |
| SEQ-17   | Coupon                   | REQ-C4      |
| SEQ-18   | Checkout                 | REQ-C5      |
| SEQ-19   | Payment and Confirmation | REQ-C6      |

## 4. Test Case Summary

The following test cases are planned for this module.

| Test Case ID | Scenario                                          | Category | Requirement |
| ------------ | ------------------------------------------------- | -------- | ----------- |
| TC-29        | Add available product to cart                     | Positive | REQ-C1      |
| TC-30        | Cart icon displays total item count               | Positive | REQ-C1      |
| TC-31        | Update product quantity                           | Positive | REQ-C2      |
| TC-32        | Validate quantity boundaries                      | Edge     | REQ-C2      |
| TC-33        | Remove product from cart                          | Positive | REQ-C3      |
| TC-34        | Display empty cart message                        | Edge     | REQ-C3      |
| TC-35        | Apply valid SAVE10 coupon                         | Positive | REQ-C4      |
| TC-36        | Reject coupon below minimum cart value            | Negative | REQ-C4      |
| TC-37        | Prevent checkout without login                    | Negative | REQ-C5      |
| TC-38        | Validate mandatory shipping information           | Negative | REQ-C5      |
| TC-39        | Complete checkout using supported payment methods | Positive | REQ-C6      |
| TC-40        | Verify order confirmation details                 | Positive | REQ-C6      |

**Planned test cases:** 12

**Jira Test keys:** To be added after the corresponding Xray issues are created.

---

## 5. Add to Cart – REQ-C1

### TC-29 – Add Available Product to Cart

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-29    |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-C1   |
| Related Story | SEQ-14   |

**Preconditions:**

- A product is available in the catalog.
- The product is in stock.
- User is viewing the product listing or details page.

**Test Steps:**

1. Open the ShopEasy application.
2. Select an available product.
3. Select Add to Cart.
4. Navigate to the shopping cart.
5. Verify the selected product.

**Expected Result:**

The selected product should be successfully added to the shopping cart.

### TC-30 – Cart Icon Displays Total Item Count

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-30    |
| Category      | Positive |
| Priority      | Medium   |
| Requirement   | REQ-C1   |
| Related Story | SEQ-14   |

**Preconditions:**

- At least one product is available in the catalog.

**Test Steps:**

1. Open the ShopEasy application.
2. Add one product to the cart.
3. Observe the cart icon.
4. Add another product.
5. Observe the cart icon again.

**Expected Result:**

The cart icon should display the total number of items in the cart and update when products are added.

---

## 6. Quantity Management – REQ-C2

### TC-31 – Update Product Quantity

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-31    |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-C2   |
| Related Story | SEQ-15   |

**Preconditions:**

- At least one product is present in the shopping cart.

**Test Data:**

| Product   | Initial Quantity | Updated Quantity |
| --------- | ---------------: | ---------------: |
| Product A |                1 |                3 |

**Test Steps:**

1. Open the shopping cart.
2. Locate the selected product.
3. Change its quantity from 1 to 3.
4. Observe the updated quantity.
5. Verify the item's line total.

**Expected Result:**

The application should update the quantity and recalculate the line total correctly.

### TC-32 – Validate Quantity Boundaries

| Field         | Details |
| ------------- | ------- |
| Test Case ID  | TC-32   |
| Category      | Edge    |
| Priority      | High    |
| Requirement   | REQ-C2  |
| Related Story | SEQ-15  |

**Preconditions:**

- A product is present in the shopping cart.

**Test Data:**

| Test Input | Expected Behavior                   |
| ---------: | ----------------------------------- |
|          0 | Reject or prevent quantity below 1  |
|          1 | Accept                              |
|         10 | Accept                              |
|         11 | Reject or prevent quantity above 10 |

**Test Steps:**

1. Open the shopping cart.
2. Attempt to change the quantity to 0.
3. Verify the application's response.
4. Change the quantity to 1.
5. Change the quantity to 10.
6. Attempt to change the quantity to 11.

**Expected Result:**

The application should allow quantities from 1 through 10 and prevent values outside the permitted range.

---

## 7. Remove Cart Item – REQ-C3

### TC-33 – Remove Product from Cart

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-33    |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-C3   |
| Related Story | SEQ-16   |

**Preconditions:**

- At least one product is present in the shopping cart.

**Test Steps:**

1. Open the shopping cart.
2. Select a product.
3. Click the Remove option.
4. Observe the cart contents.
5. Verify the updated cart total.

**Expected Result:**

The selected product should be removed, and the cart total should update immediately.

### TC-34 – Display Empty Cart Message

| Field         | Details |
| ------------- | ------- |
| Test Case ID  | TC-34   |
| Category      | Edge    |
| Priority      | Medium  |
| Requirement   | REQ-C3  |
| Related Story | SEQ-16  |

**Preconditions:**

- Exactly one product is present in the shopping cart.

**Test Steps:**

1. Open the shopping cart.
2. Remove the last remaining product.
3. Observe the shopping cart page.

**Expected Result:**

The application should display an appropriate empty-cart message.

---

## 8. Coupon Application – REQ-C4

### TC-35 – Apply Valid SAVE10 Coupon

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-35    |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-C4   |
| Related Story | SEQ-17   |

**Preconditions:**

- Products are available in the shopping cart.
- The cart value is at least Rs. 1,000.
- No other coupon has been applied.

**Test Data:**

| Field            |     Value |
| ---------------- | --------: |
| Cart Value       | Rs. 1,500 |
| Coupon Code      |    SAVE10 |
| Discount         |       10% |
| Discount Amount  |   Rs. 150 |
| Final Cart Value | Rs. 1,350 |

**Test Steps:**

1. Open the shopping cart.
2. Verify that the cart value is Rs. 1,500.
3. Enter the coupon code SAVE10.
4. Apply the coupon.
5. Observe the discount amount and final cart value.

**Expected Result:**

The application should apply a 10% discount and display Rs. 1,350 as the final cart value.

### TC-36 – Reject Coupon Below Minimum Cart Value

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-36    |
| Category      | Negative |
| Priority      | Medium   |
| Requirement   | REQ-C4   |
| Related Story | SEQ-17   |

**Preconditions:**

- Products are present in the shopping cart.
- The cart value is below Rs. 1,000.

**Test Data:**

| Field       |   Value |
| ----------- | ------: |
| Cart Value  | Rs. 800 |
| Coupon Code |  SAVE10 |

**Test Steps:**

1. Open the shopping cart.
2. Verify that the cart value is Rs. 800.
3. Enter SAVE10.
4. Apply the coupon.
5. Observe the application response.

**Expected Result:**

The application should reject the coupon because the minimum cart value requirement has not been satisfied.

---

## 9. Checkout – REQ-C5

### TC-37 – Prevent Checkout Without Login

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-37    |
| Category      | Negative |
| Priority      | High     |
| Requirement   | REQ-C5   |
| Related Story | SEQ-18   |

**Preconditions:**

- User is not authenticated.
- At least one product is present in the cart.

**Test Steps:**

1. Open the shopping cart.
2. Select the Checkout option.
3. Observe the application's response.

**Expected Result:**

The application should prevent guest checkout and require the user to log in before proceeding.

### TC-38 – Validate Mandatory Shipping Information

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-38    |
| Category      | Negative |
| Priority      | High     |
| Requirement   | REQ-C5   |
| Related Story | SEQ-18   |

**Preconditions:**

- User is authenticated.
- At least one product is present in the cart.

**Test Data:**

| Field         | Test Value |
| ------------- | ---------- |
| Shipping Name | Test User  |
| Phone Number  | 12345      |
| Address       | Empty      |
| City          | Hyderabad  |
| Pin Code      | 500001     |

**Test Steps:**

1. Log in to the application.
2. Add a product to the cart.
3. Proceed to checkout.
4. Enter the provided shipping details.
5. Leave the address field empty.
6. Enter an invalid phone number.
7. Submit the checkout form.

**Expected Result:**

The application should prevent checkout and display validation messages for the missing address and invalid phone number.

---

## 10. Payment and Order Confirmation – REQ-C6

### TC-39 – Complete Checkout Using Supported Payment Methods

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-39    |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-C6   |
| Related Story | SEQ-19   |

**Preconditions:**

- User is authenticated.
- A product is present in the cart.
- Valid shipping information has been entered.

**Payment Methods:**

- Card
- UPI
- Cash on Delivery (COD)

**Test Steps:**

1. Proceed to checkout.
2. Enter valid shipping details.
3. Select Card as the payment method.
4. Complete the payment using an approved test payment setup.
5. Repeat the payment selection and checkout flow for UPI and COD using appropriate test conditions.

**Expected Result:**

The application should support all three payment methods and process the order according to the selected payment method.

### TC-40 – Verify Order Confirmation Details

| Field         | Details  |
| ------------- | -------- |
| Test Case ID  | TC-40    |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-C6   |
| Related Story | SEQ-19   |

**Preconditions:**

- User is authenticated.
- Valid shipping information is available.
- An order has been successfully placed.

**Test Steps:**

1. Complete the checkout process.
2. Place the order successfully.
3. Observe the order confirmation page.
4. Verify the generated Order ID.
5. Check the registered email inbox.

**Expected Result:**

The application should display an order confirmation page with a unique Order ID and send a confirmation email to the registered email address.

---

## 11. Requirement Traceability

| Requirement | Jira Story | Test Cases   |
| ----------- | ---------- | ------------ |
| REQ-C1      | SEQ-14     | TC-29, TC-30 |
| REQ-C2      | SEQ-15     | TC-31, TC-32 |
| REQ-C3      | SEQ-16     | TC-33, TC-34 |
| REQ-C4      | SEQ-17     | TC-35, TC-36 |
| REQ-C5      | SEQ-18     | TC-37, TC-38 |
| REQ-C6      | SEQ-19     | TC-39, TC-40 |

## 12. Test Design Techniques

The following testing techniques are represented:

- Positive Testing
- Negative Testing
- Boundary Value Analysis
- Functional Testing
- Input Validation Testing
- Calculation Verification
- Payment Workflow Testing
- Order Confirmation Testing

## 13. Conclusion

The Cart and Checkout test cases validate the main purchasing workflow of the ShopEasy application.

They cover cart operations, quantity limits, coupon eligibility, checkout validation, payment methods, and order confirmation.

The test cases are mapped to their corresponding requirements and Jira User Stories to maintain traceability throughout the testing process.

---

**End of Document**
