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

Each test case is mapped to its corresponding functional requirement and Jira User Story to maintain requirement traceability.

## 2. Test Environment

| Configuration | Details |
|---|---|
| Application | ShopEasy |
| Build | 1.0.3 |
| Environment | Staging |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |
| Test Management Tool | Xray |

## 3. Related Jira User Stories

| Jira Key | User Story | Requirement |
|---|---|---|
| SEQ-14 | Add To Cart | REQ-C1 |
| SEQ-15 | Quantity | REQ-C2 |
| SEQ-16 | Remove Item | REQ-C3 |
| SEQ-17 | Coupon | REQ-C4 |
| SEQ-18 | Checkout | REQ-C5 |
| SEQ-19 | Payment and Confirmation | REQ-C6 |

## 4. Test Case Summary

The following test cases cover the Cart and Checkout module.

| Test Case ID | Jira Test Key | Scenario | Category | Requirement |
|---|---|---|---|---|
| TC-54 | Documentation ID | Successfully add product to cart | Positive | REQ-C1 |
| TC-55 | Documentation ID | Prevent adding unavailable product to cart | Negative | REQ-C1 |
| TC-56 | Documentation ID | Update product quantity | Positive | REQ-C2 |
| TC-57 | Documentation ID | Prevent quantity above 10 | Boundary | REQ-C2 |
| TC-58 | Documentation ID | Remove product from cart | Positive | REQ-C3 |
| TC-59 | Documentation ID | Display empty cart message | Edge | REQ-C3 |
| TC-60 | Documentation ID | Apply valid SAVE10 coupon | Positive | REQ-C4 |
| TC-61 | Documentation ID | Reject coupon below minimum cart value | Negative | REQ-C4 |
| TC-62 | Documentation ID | Complete checkout with valid shipping details | Positive | REQ-C5 |
| TC-63 | Documentation ID | Reject invalid shipping information | Negative | REQ-C5 |
| TC-64 | Documentation ID | Complete order using Cash on Delivery | Positive | REQ-C6 |
| TC-65 | Documentation ID | Verify unique Order ID and confirmation | Positive | REQ-C6 |
| TC-66 | Documentation ID | Verify Card and UPI payment options | Positive | REQ-C6 |

**Total Test Cases:** 13.

**Jira User Stories Covered:** 6.

**Note:** These are documentation IDs for the additional test scenarios. They should not be treated as confirmed Jira Test issue keys.

---

## 5. Add to Cart – REQ-C1

### TC-54 – Successfully Add Product to Cart

| Field | Details |
|---|---|
| Test Case ID | TC-54 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-C1 |
| Related Story | SEQ-14 |

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
6. Observe the cart icon.

**Expected Result:**

- The selected product should be successfully added to the shopping cart.
- The cart icon should display the updated total item count.

### TC-55 – Prevent Adding Unavailable Product to Cart

| Field | Details |
|---|---|
| Test Case ID | TC-55 |
| Category | Negative |
| Priority | High |
| Requirement | REQ-C1 |
| Related Story | SEQ-14 |

**Preconditions:**

- A product marked as out of stock is available.
- User can access the product details page.

**Test Steps:**

1. Open the product listing page.
2. Select an out-of-stock product.
3. Navigate to its details page.
4. Observe the Add to Cart option.
5. Attempt to add the product to the cart.

**Expected Result:**

The application should prevent the unavailable product from being added to the shopping cart.

---

## 6. Quantity Management – REQ-C2

### TC-56 – Update Product Quantity

| Field | Details |
|---|---|
| Test Case ID | TC-56 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-C2 |
| Related Story | SEQ-15 |

**Preconditions:**

- At least one product is present in the shopping cart.

**Test Data:**

| Product | Initial Quantity | Updated Quantity |
|---|---:|---:|
| Product A | 1 | 3 |

**Test Steps:**

1. Open the shopping cart.
2. Locate the selected product.
3. Change its quantity from 1 to 3.
4. Observe the updated quantity.
5. Verify the item's line total.

**Expected Result:**

The application should update the quantity and recalculate the line total correctly.

### TC-57 – Prevent Quantity Above 10

| Field | Details |
|---|---|
| Test Case ID | TC-57 |
| Category | Boundary |
| Priority | High |
| Requirement | REQ-C2 |
| Related Story | SEQ-15 |

**Preconditions:**

- A product is present in the shopping cart.

**Test Data:**

| Test Input | Expected Behavior |
|---:|---|
| 0 | Reject or prevent quantity below 1 |
| 1 | Accept |
| 10 | Accept |
| 11 | Reject or prevent quantity above 10 |

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

### TC-58 – Remove Product from Cart

| Field | Details |
|---|---|
| Test Case ID | TC-58 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-C3 |
| Related Story | SEQ-16 |

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

### TC-59 – Display Empty Cart Message

| Field | Details |
|---|---|
| Test Case ID | TC-59 |
| Category | Edge |
| Priority | Medium |
| Requirement | REQ-C3 |
| Related Story | SEQ-16 |

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

### TC-60 – Apply Valid SAVE10 Coupon

| Field | Details |
|---|---|
| Test Case ID | TC-60 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-C4 |
| Related Story | SEQ-17 |

**Preconditions:**

- Products are available in the shopping cart.
- The cart value is at least Rs. 1,000.
- No other coupon has been applied.

**Test Data:**

| Field | Value |
|---|---:|
| Cart Value | Rs. 1,500 |
| Coupon Code | SAVE10 |
| Discount | 10% |
| Discount Amount | Rs. 150 |
| Final Cart Value | Rs. 1,350 |

**Test Steps:**

1. Open the shopping cart.
2. Verify that the cart value is Rs. 1,500.
3. Enter the coupon code SAVE10.
4. Apply the coupon.
5. Observe the discount amount and final cart value.

**Expected Result:**

The application should apply a 10% discount and display Rs. 1,350 as the final cart value.

### TC-61 – Reject Coupon Below Minimum Cart Value

| Field | Details |
|---|---|
| Test Case ID | TC-61 |
| Category | Negative |
| Priority | Medium |
| Requirement | REQ-C4 |
| Related Story | SEQ-17 |

**Preconditions:**

- Products are present in the shopping cart.
- The cart value is below Rs. 1,000.

**Test Data:**

| Field | Value |
|---|---:|
| Cart Value | Rs. 800 |
| Coupon Code | SAVE10 |

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

### TC-62 – Complete Checkout with Valid Shipping Details

| Field | Details |
|---|---|
| Test Case ID | TC-62 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-C5 |
| Related Story | SEQ-18 |

**Preconditions:**

- User is authenticated.
- At least one product is present in the cart.

**Test Data:**

| Field | Test Value |
|---|---|
| Shipping Name | Test User |
| Phone Number | 9876543210 |
| Address | 12, Main Road |
| City | Hyderabad |
| Pin Code | 500001 |

**Test Steps:**

1. Log in to the application.
2. Add a product to the cart.
3. Proceed to checkout.
4. Enter a valid shipping name.
5. Enter a valid 10-digit phone number.
6. Enter the shipping address.
7. Enter the city and six-digit pin code.
8. Submit the checkout form.

**Expected Result:**

The application should accept the valid shipping information and allow the user to proceed to the payment stage.

### TC-63 – Reject Invalid Shipping Information

| Field | Details |
|---|---|
| Test Case ID | TC-63 |
| Category | Negative |
| Priority | High |
| Requirement | REQ-C5 |
| Related Story | SEQ-18 |

**Preconditions:**

- User is authenticated.
- At least one product is present in the cart.

**Test Data:**

| Field | Test Value |
|---|---|
| Shipping Name | Test User |
| Phone Number | 12345 |
| Address | Empty |
| City | Hyderabad |
| Pin Code | 500001 |

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

### TC-64 – Complete Order Using Cash on Delivery

| Field | Details |
|---|---|
| Test Case ID | TC-64 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-C6 |
| Related Story | SEQ-19 |

**Preconditions:**

- User is authenticated.
- A product is present in the cart.
- Valid shipping information has been entered.
- Cash on Delivery is available.

**Test Steps:**

1. Proceed to checkout.
2. Enter valid shipping details.
3. Select Cash on Delivery (COD).
4. Review the order summary.
5. Confirm the order.
6. Observe the application response.

**Expected Result:**

The application should successfully place the order using Cash on Delivery and display the order confirmation.

### TC-65 – Verify Unique Order ID and Confirmation

| Field | Details |
|---|---|
| Test Case ID | TC-65 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-C6 |
| Related Story | SEQ-19 |

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
6. Verify the order confirmation details.

**Expected Result:**

- The application should display an order confirmation page.
- A unique Order ID should be generated.
- The order confirmation email should be sent to the registered email address.

### TC-66 – Verify Card and UPI Payment Options

| Field | Details |
|---|---|
| Test Case ID | TC-66 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-C6 |
| Related Story | SEQ-19 |

**Preconditions:**

- User is authenticated.
- A product is present in the cart.
- Valid shipping information has been entered.
- Card and UPI payment options are available.

**Test Steps:**

1. Proceed to checkout.
2. Enter valid shipping information.
3. Select Card as the payment method.
4. Verify that the card payment option is available.
5. Return to the payment selection stage.
6. Select UPI as the payment method.
7. Verify that the UPI payment option is available.

**Expected Result:**

The application should display both Card and UPI as supported payment methods and allow the user to proceed with the selected payment option.

---

## 11. Requirement Traceability

| Requirement | Jira Story | Test Cases |
|---|---|---|
| REQ-C1 | SEQ-14 | TC-54, TC-55 |
| REQ-C2 | SEQ-15 | TC-56, TC-57 |
| REQ-C3 | SEQ-16 | TC-58, TC-59 |
| REQ-C4 | SEQ-17 | TC-60, TC-61 |
| REQ-C5 | SEQ-18 | TC-62, TC-63 |
| REQ-C6 | SEQ-19 | TC-64, TC-65, TC-66 |

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
- Requirement-Based Testing

## 13. Conclusion

The Cart and Checkout test cases validate the main purchasing workflow of the ShopEasy application.

The test scenarios cover:

- Adding products to the shopping cart.
- Managing product quantities.
- Removing products from the cart.
- Applying coupons and verifying discount calculations.
- Validating checkout and shipping information.
- Verifying supported payment methods.
- Checking order confirmation and unique Order ID generation.

A total of 13 test scenarios are documented and mapped to six Jira User Stories and their corresponding functional requirements.

This documentation provides structured functional test coverage and maintains requirement traceability across the Cart and Checkout module.

---

**End of Document**
