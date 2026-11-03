# Sprint 2 – Product Discovery and Shopping

## 1. Sprint Information

| Attribute        | Details                                                                  |
| ---------------- | ------------------------------------------------------------------------ |
| Project          | ShopEasy QA                                                              |
| Project Key      | SEQ                                                                      |
| Sprint Name      | Product Discovery & Shopping                                             |
| Sprint Number    | Sprint 2                                                                 |
| Duration         | 1 Week                                                                   |
| Methodology      | Scrum                                                                    |
| Jira Board       | ShopEasy QA Scrum Board                                                  |
| Sprint Objective | Validate product discovery, shopping cart, and checkout functionalities. |

## 2. Sprint Objective

The objective of Sprint 2 is to validate the product browsing and shopping functionalities of the ShopEasy application.

This Sprint focuses on helping customers discover products, search and filter available items, manage their shopping carts, apply discounts, and complete the checkout process.

## 3. Sprint Scope

The Sprint contains 11 User Stories under two Epics.

### Epic 2 – Browse and Search

| Jira Key | User Story      | Requirement |
| -------- | --------------- | ----------- |
| SEQ-8    | Products List   | REQ-B1      |
| SEQ-9    | Search          | REQ-B2      |
| SEQ-10   | Filters         | REQ-B3      |
| SEQ-11   | Sorting         | REQ-B4      |
| SEQ-12   | Product Details | REQ-B5      |

### Epic 3 – Cart and Checkout

| Jira Key | User Story               | Requirement |
| -------- | ------------------------ | ----------- |
| SEQ-14   | Add To Cart              | REQ-C1      |
| SEQ-15   | Quantity                 | REQ-C2      |
| SEQ-16   | Remove Item              | REQ-C3      |
| SEQ-17   | Coupon                   | REQ-C4      |
| SEQ-18   | Checkout                 | REQ-C5      |
| SEQ-19   | Payment and Confirmation | REQ-C6      |

**Total User Stories:** 11

## 4. Sprint Backlog

### SEQ-8 – Products List

**Description:** Display available products in a paginated listing.

**Key Activities:**

- Verify product images, names, and prices.
- Validate the 12-products-per-page limit.
- Test navigation between product pages.

**Testing Focus:** Product listing and pagination.

### SEQ-9 – Search

**Description:** Allow customers to search for products using keywords.

**Key Activities:**

- Verify matching product searches.
- Validate case-insensitive searches.
- Check behavior when no matching products exist.

**Testing Focus:** Positive and negative search testing.

### SEQ-10 – Filters

**Description:** Allow customers to filter products by category and price range.

**Key Activities:**

- Verify category filtering.
- Validate minimum and maximum price filtering.
- Test combined category and price filters.

**Testing Focus:** Filter combinations and boundary values.

### SEQ-11 – Sorting

**Description:** Allow customers to organize products using supported sorting options.

**Key Activities:**

- Verify Price: Low to High.
- Verify Price: High to Low.
- Verify Name: A to Z.

**Testing Focus:** Sorting accuracy.

### SEQ-12 – Product Details

**Description:** Display detailed information about selected products.

**Key Activities:**

- Verify product images and descriptions.
- Validate product prices.
- Check stock availability.
- Verify Add to Cart behavior for out-of-stock products.

**Testing Focus:** Product information and availability.

### SEQ-14 – Add To Cart

**Description:** Allow customers to add available products to their shopping carts.

**Key Activities:**

- Verify adding products to the cart.
- Check the cart item count.
- Validate cart updates.

**Testing Focus:** Cart functionality.

### SEQ-15 – Quantity

**Description:** Allow customers to update the quantity of products in their carts.

**Key Activities:**

- Verify minimum quantity of 1.
- Verify maximum quantity of 10.
- Validate line-total calculations.

**Testing Focus:** Quantity boundaries and calculations.

### SEQ-16 – Remove Item

**Description:** Allow customers to remove selected products from their carts.

**Key Activities:**

- Verify item removal.
- Validate immediate cart total updates.
- Check empty-cart behavior.

**Testing Focus:** Cart updates and empty-cart handling.

### SEQ-17 – Coupon

**Description:** Allow customers to apply eligible discount coupons.

**Key Activities:**

- Verify the SAVE10 coupon.
- Validate the Rs. 1,000 minimum cart value.
- Verify the 10% discount calculation.
- Check that only one coupon can be applied.

**Testing Focus:** Discount calculations and coupon validation.

### SEQ-18 – Checkout

**Description:** Allow authenticated customers to submit shipping details and proceed with checkout.

**Key Activities:**

- Verify login requirements.
- Validate mandatory shipping fields.
- Check 10-digit phone number validation.
- Check 6-digit pin code validation.

**Testing Focus:** Checkout validation.

### SEQ-19 – Payment and Confirmation

**Description:** Allow customers to select a payment method and receive order confirmation.

**Key Activities:**

- Verify Card, UPI, and Cash on Delivery options.
- Validate successful order placement.
- Verify unique Order ID generation.
- Check confirmation email behavior.

**Testing Focus:** Payment and order confirmation.

## 5. Story Point Estimation

Story points represent the relative complexity of the Sprint backlog items.

| Jira Key  | User Story               |          Story Points |
| --------- | ------------------------ | --------------------: |
| SEQ-8     | Products List            | As configured in Jira |
| SEQ-9     | Search                   | As configured in Jira |
| SEQ-10    | Filters                  | As configured in Jira |
| SEQ-11    | Sorting                  | As configured in Jira |
| SEQ-12    | Product Details          | As configured in Jira |
| SEQ-14    | Add To Cart              | As configured in Jira |
| SEQ-15    | Quantity                 | As configured in Jira |
| SEQ-16    | Remove Item              | As configured in Jira |
| SEQ-17    | Coupon                   | As configured in Jira |
| SEQ-18    | Checkout                 | As configured in Jira |
| SEQ-19    | Payment and Confirmation | As configured in Jira |
| **Total** | **11 Stories**           |  **Update from Jira** |

_Use the actual story point values recorded in Jira._

## 6. Test Case Planning

Sprint 2 test cases are organized into three functional groups:

| Test Case Range     | Module               | Coverage                                                       |
| ------------------- | -------------------- | -------------------------------------------------------------- |
| TC-19 onwards       | Browse and Search    | Product listing, search, filters, sorting, and product details |
| Continuing sequence | Cart and Checkout    | Add to cart, quantity, removal, and coupons                    |
| Continuing sequence | Checkout and Payment | Checkout validation, payment, and confirmation                 |

The planned target is two test cases per User Story, resulting in 22 test cases for Sprint 2.

Test cases are created in Xray and linked to their corresponding Jira User Stories.

## 7. Test Environment

| Configuration    | Value                  |
| ---------------- | ---------------------- |
| Application      | ShopEasy               |
| Build            | 1.0.3                  |
| Environment      | Staging                |
| Browser          | Google Chrome – Latest |
| Operating System | Windows 11             |

## 8. Sprint Monitoring

Sprint progress is monitored through the Jira Scrum Board.

The following activities are tracked:

- User Story status.
- Sprint backlog progress.
- Story completion.
- Test case creation.
- Test execution results.
- Identified defects.
- Remaining work.

## 9. Sprint Deliverables

The planned Sprint 2 deliverables include:

- 11 User Stories.
- 22 Xray test cases.
- Test coverage for product discovery.
- Test coverage for shopping cart operations.
- Test coverage for checkout and payment.
- Updated test management records.
- Documented defects, where identified.
- Sprint progress records.

## 10. Conclusion

Sprint 2 focuses on validating the ShopEasy product discovery and shopping experience.

It covers product browsing, searching, filtering, sorting, cart management, coupon application, checkout, and payment confirmation.

Jira Scrum is used to manage Sprint activities, while Xray supports test case management and execution tracking.

---

**End of Document**
