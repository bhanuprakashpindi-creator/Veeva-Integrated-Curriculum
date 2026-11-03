# ShopEasy QA – Browse and Search Test Cases

## 1. Overview

This document describes the test scenarios for the Browse and Search module of the ShopEasy application.

The module covers:

- Product Listing
- Product Search
- Product Filters
- Product Sorting
- Product Details

The test cases are designed to validate product discovery functionality and ensure that customers can find and view products correctly.

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

| Jira Key | User Story      | Requirement |
| -------- | --------------- | ----------- |
| SEQ-8    | Products List   | REQ-B1      |
| SEQ-9    | Search          | REQ-B2      |
| SEQ-10   | Filters         | REQ-B3      |
| SEQ-11   | Sorting         | REQ-B4      |
| SEQ-12   | Product Details | REQ-B5      |

## 4. Test Case Summary

The following test cases are planned for this module.

| Test Case ID | Jira Test Key | Scenario                                      | Category | Requirement |
| ------------ | ------------- | --------------------------------------------- | -------- | ----------- |
| TC-19        | SEQ-44        | Product list displays required details        | Positive | REQ-B1      |
| TC-20        | SEQ-45        | Product pagination displays next set          | Positive | REQ-B1      |
| TC-21        | To be created | Search using matching keyword                 | Positive | REQ-B2      |
| TC-22        | To be created | Search with no matching product               | Negative | REQ-B2      |
| TC-23        | To be created | Filter products by category                   | Positive | REQ-B3      |
| TC-24        | To be created | Filter products by price range                | Positive | REQ-B3      |
| TC-25        | To be created | Sort products by price                        | Positive | REQ-B4      |
| TC-26        | To be created | Sort products by name                         | Positive | REQ-B4      |
| TC-27        | To be created | Display complete product details              | Positive | REQ-B5      |
| TC-28        | To be created | Add to Cart disabled for out-of-stock product | Negative | REQ-B5      |

**Planned test cases:** 10

**Created Jira Test issues:** 2 confirmed (TC-19 and TC-20).

_The remaining eight scenarios are planned documentation entries. Their Jira issue keys should be added after the corresponding Xray Tests are created._

---

## 5. Product Listing – REQ-B1

### TC-19 – Product List Displays Required Details

| Field         | Details         |
| ------------- | --------------- |
| Jira Test Key | SEQ-44          |
| Category      | Positive        |
| Priority      | High            |
| Requirement   | REQ-B1          |
| Related Story | SEQ-8           |
| Status        | Created in Jira |

**Preconditions:**

- The ShopEasy application is accessible.
- Products are available in the product catalog.

**Test Steps:**

1. Open the ShopEasy application.
2. Navigate to the product listing page.
3. Observe the displayed product cards.
4. Verify the product image, name, and price.

**Expected Result:**

Each product card should display its product image, product name, and price.

### TC-20 – Product Pagination Displays Next Set

| Field         | Details         |
| ------------- | --------------- |
| Jira Test Key | SEQ-45          |
| Category      | Positive        |
| Priority      | High            |
| Requirement   | REQ-B1          |
| Related Story | SEQ-8           |
| Status        | Created in Jira |

**Preconditions:**

- More than 12 products are available in the product catalog.
- User is on the product listing page.

**Test Steps:**

1. Open the product listing page.
2. Verify that the first page displays a maximum of 12 products.
3. Select the Next Page option.
4. Observe the products displayed on the next page.

**Expected Result:**

The application should display the next set of products, with no more than 12 products per page.

---

## 6. Product Search – REQ-B2

### TC-21 – Search Using Matching Keyword

| Field         | Details       |
| ------------- | ------------- |
| Test Case ID  | TC-21         |
| Category      | Positive      |
| Priority      | High          |
| Requirement   | REQ-B2        |
| Related Story | SEQ-9         |
| Jira Test Key | To be created |

**Preconditions:**

- Products with known names exist in the catalog.

**Test Data:**

Search keyword: `laptop`

**Test Steps:**

1. Open the product listing page.
2. Enter `laptop` in the search field.
3. Submit the search.
4. Observe the displayed products.

**Expected Result:**

The application should display products whose names match the search keyword.

### TC-22 – Search With No Matching Product

| Field         | Details       |
| ------------- | ------------- |
| Test Case ID  | TC-22         |
| Category      | Negative      |
| Priority      | Medium        |
| Requirement   | REQ-B2        |
| Related Story | SEQ-9         |
| Jira Test Key | To be created |

**Preconditions:**

- User is on the product listing page.

**Test Data:**

Search keyword: `xyzproduct999`

**Test Steps:**

1. Open the product listing page.
2. Enter a keyword that does not match any product.
3. Submit the search.
4. Observe the search results.

**Expected Result:**

The application should display:

`No products found`

---

## 7. Product Filters – REQ-B3

### TC-23 – Filter Products by Category

| Field         | Details       |
| ------------- | ------------- |
| Test Case ID  | TC-23         |
| Category      | Positive      |
| Priority      | High          |
| Requirement   | REQ-B3        |
| Related Story | SEQ-10        |
| Jira Test Key | To be created |

**Preconditions:**

- Products from multiple categories are available.
- User is on the product listing page.

**Test Steps:**

1. Open the product listing page.
2. Select a product category.
3. Apply the filter.
4. Observe the displayed products.

**Expected Result:**

Only products belonging to the selected category should be displayed.

### TC-24 – Filter Products by Price Range

| Field         | Details       |
| ------------- | ------------- |
| Test Case ID  | TC-24         |
| Category      | Positive      |
| Priority      | High          |
| Requirement   | REQ-B3        |
| Related Story | SEQ-10        |
| Jira Test Key | To be created |

**Preconditions:**

- Products with different prices are available.

**Test Data:**

| Field         |     Value |
| ------------- | --------: |
| Minimum Price |   Rs. 500 |
| Maximum Price | Rs. 2,000 |

**Test Steps:**

1. Open the product listing page.
2. Enter Rs. 500 as the minimum price.
3. Enter Rs. 2,000 as the maximum price.
4. Apply the price filter.
5. Observe the displayed products.

**Expected Result:**

Only products within the specified price range should be displayed.

---

## 8. Product Sorting – REQ-B4

### TC-25 – Sort Products by Price

| Field         | Details       |
| ------------- | ------------- |
| Test Case ID  | TC-25         |
| Category      | Positive      |
| Priority      | High          |
| Requirement   | REQ-B4        |
| Related Story | SEQ-11        |
| Jira Test Key | To be created |

**Preconditions:**

- Multiple products with different prices are available.

**Test Steps:**

1. Open the product listing page.
2. Select Price: Low to High.
3. Verify the product order.
4. Select Price: High to Low.
5. Verify the product order again.

**Expected Result:**

Products should be displayed in ascending order for Low to High and descending order for High to Low.

### TC-26 – Sort Products by Name

| Field         | Details       |
| ------------- | ------------- |
| Test Case ID  | TC-26         |
| Category      | Positive      |
| Priority      | Medium        |
| Requirement   | REQ-B4        |
| Related Story | SEQ-11        |
| Jira Test Key | To be created |

**Preconditions:**

- Multiple products with different names are available.

**Test Steps:**

1. Open the product listing page.
2. Select Name: A to Z.
3. Observe the product names.
4. Verify their alphabetical order.

**Expected Result:**

Products should be displayed in alphabetical order from A to Z.

---

## 9. Product Details – REQ-B5

### TC-27 – Display Complete Product Details

| Field         | Details       |
| ------------- | ------------- |
| Test Case ID  | TC-27         |
| Category      | Positive      |
| Priority      | High          |
| Requirement   | REQ-B5        |
| Related Story | SEQ-12        |
| Jira Test Key | To be created |

**Preconditions:**

- A product is available in the catalog.

**Test Steps:**

1. Open the product listing page.
2. Select an available product.
3. Navigate to its details page.
4. Verify the product images, name, price, description, and stock status.

**Expected Result:**

The application should display all required product information correctly.

### TC-28 – Add to Cart Disabled for Out-of-Stock Product

| Field         | Details       |
| ------------- | ------------- |
| Test Case ID  | TC-28         |
| Category      | Negative      |
| Priority      | High          |
| Requirement   | REQ-B5        |
| Related Story | SEQ-12        |
| Jira Test Key | To be created |

**Preconditions:**

- A product marked as out of stock is available.

**Test Steps:**

1. Open the product listing page.
2. Select an out-of-stock product.
3. Navigate to its details page.
4. Observe the Add to Cart option.

**Expected Result:**

The Add to Cart option should be disabled for the out-of-stock product.

---

## 10. Requirement Traceability

| Requirement | Jira Story | Test Cases   |
| ----------- | ---------- | ------------ |
| REQ-B1      | SEQ-8      | TC-19, TC-20 |
| REQ-B2      | SEQ-9      | TC-21, TC-22 |
| REQ-B3      | SEQ-10     | TC-23, TC-24 |
| REQ-B4      | SEQ-11     | TC-25, TC-26 |
| REQ-B5      | SEQ-12     | TC-27, TC-28 |

## 11. Test Design Techniques

The following testing techniques are used:

- Positive Testing
- Negative Testing
- Input Validation Testing
- Boundary Value Analysis
- Functional Testing
- Data Verification

## 12. Conclusion

The Browse and Search test cases cover the product discovery functionality of ShopEasy.

They verify product listing, pagination, search behavior, filtering, sorting, and product information.

The test cases are mapped to Jira User Stories and functional requirements to maintain requirement traceability.

---

**End of Document**
