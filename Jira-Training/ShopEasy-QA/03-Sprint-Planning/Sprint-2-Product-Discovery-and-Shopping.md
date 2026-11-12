# Sprint 2 – Product Discovery and Shopping

## 1. Sprint Information

| Attribute | Details |
|---|---|
| Project | ShopEasy QA |
| Project Key | SEQ |
| Sprint Name | Product Discovery & Shopping |
| Sprint Number | Sprint 2 |
| Duration | 1 Week |
| Methodology | Scrum |
| Jira Board | ShopEasy QA Scrum Board |
| Sprint Objective | Validate product discovery, shopping cart, and checkout functionalities. |
| Sprint Status | Completed |

## 2. Sprint Objective

The objective of Sprint 2 was to validate the product browsing and shopping functionalities of the ShopEasy application.

This Sprint focused on helping customers discover products, search and filter available items, manage their shopping carts, apply discounts, and complete the checkout process.

The Sprint covered 11 User Stories across two functional Epics. Positive, negative, and boundary test scenarios were designed to validate the application's shopping functionalities.

## 3. Sprint Scope

The Sprint contains 11 User Stories under two Epics.

### Epic 2 – Browse and Search

| Jira Key | User Story | Requirement | Status |
|---|---|---|---|
| SEQ-8 | Products List | REQ-B1 | Done |
| SEQ-9 | Search | REQ-B2 | Done |
| SEQ-10 | Filters | REQ-B3 | Done |
| SEQ-11 | Sorting | REQ-B4 | Done |
| SEQ-12 | Product Details | REQ-B5 | Done |

### Epic 3 – Cart and Checkout

| Jira Key | User Story | Requirement | Status |
|---|---|---|---|
| SEQ-14 | Add To Cart | REQ-C1 | Done |
| SEQ-15 | Quantity | REQ-C2 | Done |
| SEQ-16 | Remove Item | REQ-C3 | Done |
| SEQ-17 | Coupon | REQ-C4 | Done |
| SEQ-18 | Checkout | REQ-C5 | Done |
| SEQ-19 | Payment and Confirmation | REQ-C6 | Done |

**Total User Stories:** 11

## 4. Sprint Backlog

### SEQ-8 – Products List

**Description:** Display available products in a paginated listing.

**Completed Activities:**

- Verified product images, names, and prices.
- Validated the 12-products-per-page limit.
- Tested navigation between product pages.

**Testing Focus:** Product listing and pagination.

### SEQ-9 – Search

**Description:** Allow customers to search for products using keywords.

**Completed Activities:**

- Verified matching product searches.
- Validated case-insensitive searches.
- Checked behavior when no matching products exist.

**Testing Focus:** Positive and negative search testing.

### SEQ-10 – Filters

**Description:** Allow customers to filter products by category and price range.

**Completed Activities:**

- Verified category filtering.
- Validated minimum and maximum price filtering.
- Tested combined category and price filters.

**Testing Focus:** Filter combinations and boundary values.

### SEQ-11 – Sorting

**Description:** Allow customers to organize products using supported sorting options.

**Completed Activities:**

- Verified Price: Low to High.
- Verified Price: High to Low.
- Verified Name: A to Z.

**Testing Focus:** Sorting accuracy.

### SEQ-12 – Product Details

**Description:** Display detailed information about selected products.

**Completed Activities:**

- Verified product images and descriptions.
- Validated product prices.
- Checked stock availability.
- Verified Add to Cart behavior for out-of-stock products.

**Testing Focus:** Product information and availability.

### SEQ-14 – Add To Cart

**Description:** Allow customers to add available products to their shopping carts.

**Completed Activities:**

- Verified adding products to the cart.
- Checked the cart item count.
- Validated cart updates.

**Testing Focus:** Cart functionality.

### SEQ-15 – Quantity

**Description:** Allow customers to update the quantity of products in their carts.

**Completed Activities:**

- Verified minimum quantity of 1.
- Verified maximum quantity of 10.
- Validated line-total calculations.

**Testing Focus:** Quantity boundaries and calculations.

### SEQ-16 – Remove Item

**Description:** Allow customers to remove selected products from their carts.

**Completed Activities:**

- Verified item removal.
- Validated immediate cart total updates.
- Checked empty-cart behavior.

**Testing Focus:** Cart updates and empty-cart handling.

### SEQ-17 – Coupon

**Description:** Allow customers to apply eligible discount coupons.

**Completed Activities:**

- Verified the SAVE10 coupon.
- Validated the Rs. 1,000 minimum cart value.
- Verified the 10% discount calculation.
- Checked that only one coupon could be applied.

**Testing Focus:** Discount calculations and coupon validation.

### SEQ-18 – Checkout

**Description:** Allow authenticated customers to submit shipping details and proceed with checkout.

**Completed Activities:**

- Verified login requirements.
- Validated mandatory shipping fields.
- Checked 10-digit phone number validation.
- Checked 6-digit pin code validation.

**Testing Focus:** Checkout validation.

### SEQ-19 – Payment and Confirmation

**Description:** Allow customers to select a payment method and receive order confirmation.

**Completed Activities:**

- Verified Card, UPI, and Cash on Delivery options.
- Validated order placement.
- Verified unique Order ID generation.
- Checked confirmation email behavior.

**Testing Focus:** Payment and order confirmation.

## 5. Story Point Estimation

Story points represent the relative complexity of the Sprint backlog items.

| Jira Key | User Story | Story Points |
|---|---|---|
| SEQ-8 | Products List | As configured in Jira |
| SEQ-9 | Search | As configured in Jira |
| SEQ-10 | Filters | As configured in Jira |
| SEQ-11 | Sorting | As configured in Jira |
| SEQ-12 | Product Details | As configured in Jira |
| SEQ-14 | Add To Cart | As configured in Jira |
| SEQ-15 | Quantity | As configured in Jira |
| SEQ-16 | Remove Item | As configured in Jira |
| SEQ-17 | Coupon | As configured in Jira |
| SEQ-18 | Checkout | As configured in Jira |
| SEQ-19 | Payment and Confirmation | As configured in Jira |
| **Total** | **11 Stories** | **Refer to Jira** |

## 6. Test Case Planning and Coverage

A total of 22 test cases were designed to cover the 11 User Stories included in Sprint 2.

Each User Story has two test cases to cover the important functional scenarios.

### 6.1 Complete Test Case List

| Test Case ID | Jira Test Key | Test Scenario | Related Story | Test Type |
|---|---|---|---|---|
| TC-19 | SEQ-44 | Product list displays required details | SEQ-8 | Positive |
| TC-20 | SEQ-45 | Product pagination displays next set | SEQ-8 | Positive |
| TC-46 | SEQ-46 | Valid product search | SEQ-9 | Positive |
| TC-47 | SEQ-47 | Case-insensitive product search | SEQ-9 | Positive |
| TC-48 | SEQ-48 | Products filtered by selected category | SEQ-10 | Positive |
| TC-49 | SEQ-49 | Products filtered by minimum and maximum price | SEQ-10 | Positive |
| TC-50 | Documentation ID | Sort products by price low to high | SEQ-11 | Positive |
| TC-51 | Documentation ID | Sort products by price high to low | SEQ-11 | Positive |
| TC-52 | Documentation ID | Verify complete product details | SEQ-12 | Positive |
| TC-53 | Documentation ID | Add to Cart disabled for out-of-stock product | SEQ-12 | Negative |
| TC-54 | Documentation ID | Successfully add product to cart | SEQ-14 | Positive |
| TC-55 | Documentation ID | Prevent adding unavailable product to cart | SEQ-14 | Negative |
| TC-56 | Documentation ID | Update product quantity within allowed range | SEQ-15 | Positive |
| TC-57 | Documentation ID | Prevent quantity exceeding maximum limit | SEQ-15 | Boundary |
| TC-58 | Documentation ID | Successfully remove product from cart | SEQ-16 | Positive |
| TC-59 | Documentation ID | Verify empty cart message | SEQ-16 | Edge |
| TC-60 | Documentation ID | Apply valid SAVE10 coupon | SEQ-17 | Positive |
| TC-61 | Documentation ID | Reject coupon below minimum cart value | SEQ-17 | Negative |
| TC-62 | Documentation ID | Successfully submit checkout with valid details | SEQ-18 | Positive |
| TC-63 | Documentation ID | Prevent checkout with invalid phone number | SEQ-18 | Negative |
| TC-64 | Documentation ID | Complete order using Cash on Delivery | SEQ-19 | Positive |
| TC-65 | Documentation ID | Verify unique Order ID | SEQ-19 | Positive |

**Total Test Cases: 22**

### 6.2 Detailed Test Case Descriptions

#### TC-50 – Sort Products by Price Low to High

- **Requirement ID:** REQ-B4
- **Related User Story:** SEQ-11
- **Test Type:** Positive
- **Preconditions:**
  1. Product listing is available.
  2. Products have different prices.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the product listing. | ShopEasy | Product listing should be displayed. |
| Select sorting option. | Price: Low to High | Sorting option should be applied. |
| Verify product prices. | Available product prices | Products should appear in ascending order of price. |

**Expected Result:** Products should be displayed in ascending order, starting with the lowest-priced product.

#### TC-51 – Sort Products by Price High to Low

- **Requirement ID:** REQ-B4
- **Related User Story:** SEQ-11
- **Test Type:** Positive
- **Preconditions:**
  1. Product listing is available.
  2. Products have different prices.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the product listing. | ShopEasy | Product listing should be displayed. |
| Select sorting option. | Price: High to Low | Sorting option should be applied. |
| Verify product prices. | Available product prices | Products should appear in descending order of price. |

**Expected Result:** Products should be displayed in descending order, starting with the highest-priced product.

#### TC-52 – Verify Complete Product Details

- **Requirement ID:** REQ-B5
- **Related User Story:** SEQ-12
- **Test Type:** Positive
- **Preconditions:**
  1. Product listing is available.
  2. At least one product is available.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the product listing. | ShopEasy | Product listing should be displayed. |
| Select a product. | Available product | Product details page should open. |
| Verify product information. | Product image, name, price, description, stock | All required product details should be displayed. |

**Expected Result:** The product details page should display the product image, name, price, description, and stock availability.

#### TC-53 – Add to Cart Disabled for Out-of-Stock Product

- **Requirement ID:** REQ-B5
- **Related User Story:** SEQ-12
- **Test Type:** Negative
- **Preconditions:**
  1. Product listing is available.
  2. An out-of-stock product exists.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the product listing. | ShopEasy | Product listing should be displayed. |
| Select an out-of-stock product. | Out-of-stock product | Product details should be displayed. |
| Check Add to Cart button. | Out-of-stock status | Add to Cart button should be disabled. |

**Expected Result:** Customers should not be able to add an out-of-stock product to the shopping cart.

#### TC-54 – Successfully Add Product to Cart

- **Requirement ID:** REQ-C1
- **Related User Story:** SEQ-14
- **Test Type:** Positive
- **Preconditions:**
  1. Product listing is available.
  2. An available product exists.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the product listing. | ShopEasy | Product listing should be displayed. |
| Select an available product. | Available product | Product details should be displayed. |
| Click Add to Cart. | Selected product | Product should be added to the cart. |
| Check cart icon. | Cart item count | Cart count should be updated. |

**Expected Result:** The selected product should be added to the cart, and the cart item count should increase.

#### TC-55 – Prevent Adding Unavailable Product to Cart

- **Requirement ID:** REQ-C1
- **Related User Story:** SEQ-14
- **Test Type:** Negative
- **Preconditions:**
  1. Product listing is available.
  2. An unavailable product exists.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the product listing. | ShopEasy | Product listing should be displayed. |
| Select an unavailable product. | Unavailable product | Product details should be displayed. |
| Attempt to add the product to cart. | Unavailable product | Application should prevent the operation. |

**Expected Result:** The application should prevent unavailable products from being added to the shopping cart.

#### TC-56 – Update Product Quantity Within Allowed Range

- **Requirement ID:** REQ-C2
- **Related User Story:** SEQ-15
- **Test Type:** Positive
- **Preconditions:**
  1. Customer has a product in the cart.
  2. Product quantity is initially 1.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the shopping cart. | Existing cart item | Cart details should be displayed. |
| Change product quantity. | 5 | Quantity should update to 5. |
| Verify line total. | Unit price × 5 | Line total should be recalculated. |

**Expected Result:** The application should accept the updated quantity and calculate the correct line total.

#### TC-57 – Prevent Quantity Exceeding Maximum Limit

- **Requirement ID:** REQ-C2
- **Related User Story:** SEQ-15
- **Test Type:** Boundary
- **Preconditions:**
  1. Customer has a product in the cart.
  2. Quantity management is available.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the shopping cart. | Existing cart item | Cart details should be displayed. |
| Enter quantity. | 11 | Quantity should not exceed the allowed maximum. |
| Verify quantity value. | Maximum allowed: 10 | Application should enforce the maximum quantity. |

**Expected Result:** The application should prevent quantities greater than 10.

#### TC-58 – Successfully Remove Product from Cart

- **Requirement ID:** REQ-C3
- **Related User Story:** SEQ-16
- **Test Type:** Positive
- **Preconditions:**
  1. Shopping cart contains at least one product.
  2. Customer can access the shopping cart.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the shopping cart. | Existing cart item | Cart contents should be displayed. |
| Select Remove Item. | Selected product | Product should be removed. |
| Verify cart total. | Remaining cart items | Cart total should update immediately. |

**Expected Result:** The selected product should be removed, and the cart total should be recalculated.

#### TC-59 – Verify Empty Cart Message

- **Requirement ID:** REQ-C3
- **Related User Story:** SEQ-16
- **Test Type:** Edge
- **Preconditions:**
  1. Shopping cart contains products.
  2. Customer can remove cart items.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the shopping cart. | Existing cart items | Cart contents should be displayed. |
| Remove all products. | All cart items | All products should be removed. |
| Verify cart page. | Empty cart | Appropriate empty-cart message should appear. |

**Expected Result:** The application should display an appropriate empty-cart message when no products remain.

#### TC-60 – Apply Valid SAVE10 Coupon

- **Requirement ID:** REQ-C4
- **Related User Story:** SEQ-17
- **Test Type:** Positive
- **Preconditions:**
  1. Shopping cart contains products.
  2. Cart value is at least Rs. 1,000.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the shopping cart. | Cart value: Rs. 2,000 | Cart details should be displayed. |
| Enter coupon code. | SAVE10 | Coupon should be accepted. |
| Apply coupon. | 10% discount | Discount of Rs. 200 should be applied. |
| Verify final total. | Rs. 1,800 | Correct discounted total should be displayed. |

**Expected Result:** The application should apply a 10% discount when the cart value meets the minimum eligibility requirement.

#### TC-61 – Reject Coupon Below Minimum Cart Value

- **Requirement ID:** REQ-C4
- **Related User Story:** SEQ-17
- **Test Type:** Negative
- **Preconditions:**
  1. Shopping cart contains products.
  2. Cart value is below Rs. 1,000.

| Action | Test Data | Expected Result |
|---|---|---|
| Open the shopping cart. | Cart value: Rs. 800 | Cart details should be displayed. |
| Enter coupon code. | SAVE10 | Coupon should be evaluated. |
| Apply coupon. | Below minimum value | Coupon should be rejected. |

**Expected Result:** The application should reject the coupon and display an appropriate eligibility message.

#### TC-62 – Successfully Submit Checkout with Valid Details

- **Requirement ID:** REQ-C5
- **Related User Story:** SEQ-18
- **Test Type:** Positive
- **Preconditions:**
  1. Customer is logged in.
  2. Shopping cart contains products.

| Action | Test Data | Expected Result |
|---|---|---|
| Open checkout page. | Logged-in customer | Checkout form should be displayed. |
| Enter customer name. | Bhanu Kumar | Name should be accepted. |
| Enter phone number. | 9876543210 | Phone number should be accepted. |
| Enter address and city. | Valid shipping address | Address details should be accepted. |
| Enter pin code. | 534426 | Pin code should be accepted. |
| Submit checkout details. | All valid details | Customer should proceed to the next checkout step. |

**Expected Result:** The application should accept valid shipping information and allow the customer to proceed with checkout.

#### TC-63 – Prevent Checkout with Invalid Phone Number

- **Requirement ID:** REQ-C5
- **Related User Story:** SEQ-18
- **Test Type:** Negative
- **Preconditions:**
  1. Customer is logged in.
  2. Shopping cart contains products.

| Action | Test Data | Expected Result |
|---|---|---|
| Open checkout page. | Logged-in customer | Checkout form should be displayed. |
| Enter customer details. | Valid name and address | Details should be accepted. |
| Enter phone number. | 98765 | Phone number should be rejected. |
| Submit checkout form. | Invalid phone number | Checkout should not proceed. |

**Expected Result:** The application should reject phone numbers that do not contain exactly 10 digits and display a validation message.

#### TC-64 – Complete Order Using Cash on Delivery

- **Requirement ID:** REQ-C6
- **Related User Story:** SEQ-19
- **Test Type:** Positive
- **Preconditions:**
  1. Customer is logged in.
  2. Valid shipping details are provided.
  3. Shopping cart contains products.

| Action | Test Data | Expected Result |
|---|---|---|
| Proceed to payment. | Valid checkout details | Payment options should be displayed. |
| Select payment method. | Cash on Delivery | Payment option should be selected. |
| Confirm order. | Valid order details | Order should be placed successfully. |
| Verify confirmation. | Order confirmation page | Confirmation details should be displayed. |

**Expected Result:** The application should successfully place the order using Cash on Delivery and display an order confirmation.

#### TC-65 – Verify Unique Order ID

- **Requirement ID:** REQ-C6
- **Related User Story:** SEQ-19
- **Test Type:** Positive
- **Preconditions:**
  1. Customer has successfully placed an order.
  2. Order confirmation page is available.

| Action | Test Data | Expected Result |
|---|---|---|
| Complete an order. | Valid order details | Order should be placed successfully. |
| Open confirmation page. | Completed order | Confirmation page should appear. |
| Verify Order ID. | Generated Order ID | A unique Order ID should be displayed. |
| Verify confirmation details. | Order summary | Order confirmation information should be available. |

**Expected Result:** The order confirmation page should display a unique Order ID and the relevant order confirmation details.

## 7. Test Environment

| Configuration | Value |
|---|---|
| Application | ShopEasy |
| Build | 1.0.3 |
| Environment | Staging |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |

## 8. Sprint Monitoring

Sprint progress was managed through the Jira Scrum Board.

The following activities were covered:

- User Story status tracking.
- Sprint backlog management.
- Story completion monitoring.
- Test case creation and linking.
- Test execution tracking.
- Defect identification and management.
- Remaining work monitoring.

## 9. Sprint Deliverables

The Sprint 2 deliverables include:

- 11 User Stories.
- 22 planned Xray Test Cases.
- Test coverage for product listing and pagination.
- Test coverage for product searching and filtering.
- Test coverage for sorting and product details.
- Test coverage for shopping cart operations.
- Test coverage for coupon validation.
- Test coverage for checkout and payment.
- Test management documentation.
- Defect documentation and tracking.
- Sprint completion documentation.

## 10. Sprint Completion Summary

| Activity | Planned | Status |
|---|---:|---|
| User Stories | 11 | Completed |
| Test Case Design | 22 | Completed in documentation |
| Functional Modules | 2 Epics | Completed |
| Test Management Documentation | 1 Set | Completed |
| Sprint Documentation | 1 Document | Completed |

## 11. Conclusion

Sprint 2 covered the ShopEasy product discovery and shopping functionalities.

The Sprint included product browsing, searching, filtering, sorting, cart management, coupon application, checkout, and payment confirmation.

A total of 22 test cases were designed to provide two test scenarios for each of the 11 User Stories. These scenarios cover positive, negative, and boundary conditions across the shopping application.

Jira Scrum provides the structure for Sprint management, while Xray supports test case organization and traceability.

---

**End of Document**
