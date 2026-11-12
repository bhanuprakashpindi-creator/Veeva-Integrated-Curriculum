# ShopEasy QA – Browse and Search Test Cases

## 1. Overview

This document describes the test scenarios for the Browse and Search module of the ShopEasy application.

The module covers:

- Product Listing
- Product Search
- Product Filters
- Product Sorting
- Product Details

The test cases validate product discovery functionality and ensure that customers can find, filter, sort, and view products correctly.

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
| SEQ-8 | Products List | REQ-B1 |
| SEQ-9 | Search | REQ-B2 |
| SEQ-10 | Filters | REQ-B3 |
| SEQ-11 | Sorting | REQ-B4 |
| SEQ-12 | Product Details | REQ-B5 |

## 4. Test Case Summary

The following test cases cover the Browse and Search module.

| Test Case ID | Jira Test Key | Scenario | Category | Requirement |
|---|---|---|---|---|
| TC-19 | SEQ-44 | Product list displays required details | Positive | REQ-B1 |
| TC-20 | SEQ-45 | Product pagination displays next set | Positive | REQ-B1 |
| TC-46 | SEQ-46 | Search using matching keyword | Positive | REQ-B2 |
| TC-47 | SEQ-47 | Case-insensitive product search | Positive | REQ-B2 |
| TC-48 | SEQ-48 | Filter products by category | Positive | REQ-B3 |
| TC-49 | SEQ-49 | Filter products by price range | Positive | REQ-B3 |
| TC-50 | Documentation ID | Sort products by price: Low to High | Positive | REQ-B4 |
| TC-51 | Documentation ID | Sort products by price: High to Low | Positive | REQ-B4 |
| TC-52 | Documentation ID | Display complete product details | Positive | REQ-B5 |
| TC-53 | Documentation ID | Add to Cart disabled for out-of-stock product | Negative | REQ-B5 |
| TC-54 | Documentation ID | Search with no matching product | Negative | REQ-B2 |

**Total Test Cases:** 11.

**Jira Test Issues:** Six confirmed Jira Test issues.

**Documentation-only Test Cases:** TC-50 to TC-54.

**Note:** Documentation IDs are used for additional test scenarios that do not have confirmed Jira Test issue keys.

---

## 5. Product Listing – REQ-B1

### TC-19 – Product List Displays Required Details

| Field | Details |
|---|---|
| Jira Test Key | SEQ-44 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-B1 |
| Related Story | SEQ-8 |

**Preconditions:**

- The ShopEasy application is accessible.
- Products are available in the product catalog.

**Test Steps:**

1. Open the ShopEasy application.
2. Navigate to the product listing page.
3. Observe the displayed product cards.
4. Verify the product image, name, and price.

**Expected Result:**

- Each product card should display its product image.
- The product name should be displayed correctly.
- The product price should be visible.

### TC-20 – Product Pagination Displays Next Set

| Field | Details |
|---|---|
| Jira Test Key | SEQ-45 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-B1 |
| Related Story | SEQ-8 |

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

### TC-46 – Search Using Matching Keyword

| Field | Details |
|---|---|
| Jira Test Key | SEQ-46 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-B2 |
| Related Story | SEQ-9 |

**Preconditions:**

- Products with known names exist in the catalog.
- User is on the product listing page.

**Test Data:**

Search keyword: `laptop`

**Test Steps:**

1. Open the product listing page.
2. Enter `laptop` in the search field.
3. Submit the search.
4. Observe the displayed products.

**Expected Result:**

The application should display products whose names match the search keyword.

### TC-47 – Case-Insensitive Product Search

| Field | Details |
|---|---|
| Jira Test Key | SEQ-47 |
| Category | Positive |
| Priority | Medium |
| Requirement | REQ-B2 |
| Related Story | SEQ-9 |

**Preconditions:**

- Products with known names exist in the catalog.
- User is on the product listing page.

**Test Data:**

| Search Input | Expected Matching Product |
|---|---|
| laptop | Laptop |
| LAPTOP | Laptop |
| Laptop | Laptop |

**Test Steps:**

1. Open the product listing page.
2. Enter `laptop` in the search field.
3. Observe the search results.
4. Clear the search field.
5. Enter `LAPTOP`.
6. Submit the search.
7. Compare the displayed results.

**Expected Result:**

The application should return matching products regardless of uppercase or lowercase characters in the search keyword.

### TC-54 – Search With No Matching Product

| Field | Details |
|---|---|
| Test Case ID | TC-54 |
| Jira Test Key | Documentation ID |
| Category | Negative |
| Priority | Medium |
| Requirement | REQ-B2 |
| Related Story | SEQ-9 |

**Preconditions:**

- User is on the product listing page.
- The entered keyword does not match any available product.

**Test Data:**

Search keyword: `xyzproduct999`

**Test Steps:**

1. Open the product listing page.
2. Enter `xyzproduct999` in the search field.
3. Submit the search.
4. Observe the search results.

**Expected Result:**

The application should display:

`No products found`

No unrelated products should be displayed.

---

## 7. Product Filters – REQ-B3

### TC-48 – Filter Products by Category

| Field | Details |
|---|---|
| Jira Test Key | SEQ-48 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-B3 |
| Related Story | SEQ-10 |

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

### TC-49 – Filter Products by Price Range

| Field | Details |
|---|---|
| Jira Test Key | SEQ-49 |
| Category | Positive |
| Priority | High |
| Requirement | REQ-B3 |
| Related Story | SEQ-10 |

**Preconditions:**

- Products with different prices are available.
- User is on the product listing page.

**Test Data:**

| Field | Value |
|---|---:|
| Minimum Price | Rs. 500 |
| Maximum Price | Rs. 2,000 |

**Test Steps:**

1. Open the product listing page.
2. Enter Rs. 500 as the minimum price.
3. Enter Rs. 2,000 as the maximum price.
4. Apply the price filter.
5. Observe the displayed products.

**Expected Result:**

Only products priced between Rs. 500 and Rs. 2,000 should be displayed.

---

## 8. Product Sorting – REQ-B4

### TC-50 – Sort Products by Price: Low to High

| Field | Details |
|---|---|
| Test Case ID | TC-50 |
| Jira Test Key | Documentation ID |
| Category | Positive |
| Priority | High |
| Requirement | REQ-B4 |
| Related Story | SEQ-11 |

**Preconditions:**

- Multiple products with different prices are available.
- User is on the product listing page.

**Test Steps:**

1. Open the product listing page.
2. Select Price: Low to High.
3. Observe the displayed product prices.
4. Verify the order of the products.

**Expected Result:**

Products should be displayed in ascending order of price, from the lowest price to the highest price.

### TC-51 – Sort Products by Price: High to Low

| Field | Details |
|---|---|
| Test Case ID | TC-51 |
| Jira Test Key | Documentation ID |
| Category | Positive |
| Priority | High |
| Requirement | REQ-B4 |
| Related Story | SEQ-11 |

**Preconditions:**

- Multiple products with different prices are available.
- User is on the product listing page.

**Test Steps:**

1. Open the product listing page.
2. Select Price: High to Low.
3. Observe the displayed product prices.
4. Verify the order of the products.

**Expected Result:**

Products should be displayed in descending order of price, from the highest price to the lowest price.

---

## 9. Product Details – REQ-B5

### TC-52 – Display Complete Product Details

| Field | Details |
|---|---|
| Test Case ID | TC-52 |
| Jira Test Key | Documentation ID |
| Category | Positive |
| Priority | High |
| Requirement | REQ-B5 |
| Related Story | SEQ-12 |

**Preconditions:**

- A product is available in the catalog.
- User can access the product listing page.

**Test Steps:**

1. Open the product listing page.
2. Select an available product.
3. Navigate to its details page.
4. Verify the product images.
5. Verify the product name and price.
6. Verify the product description.
7. Check the stock availability.

**Expected Result:**

The application should display all required product information correctly, including images, name, price, description, and stock status.

### TC-53 – Add to Cart Disabled for Out-of-Stock Product

| Field | Details |
|---|---|
| Test Case ID | TC-53 |
| Jira Test Key | Documentation ID |
| Category | Negative |
| Priority | High |
| Requirement | REQ-B5 |
| Related Story | SEQ-12 |

**Preconditions:**

- A product marked as out of stock is available.
- User can access the product details page.

**Test Steps:**

1. Open the product listing page.
2. Select an out-of-stock product.
3. Navigate to its details page.
4. Observe the Add to Cart option.
5. Attempt to select the Add to Cart option.

**Expected Result:**

The Add to Cart option should be disabled for the out-of-stock product, and the application should prevent the user from adding it to the cart.

---

## 10. Requirement Traceability

| Requirement | Jira Story | Test Cases |
|---|---|---|
| REQ-B1 | SEQ-8 | TC-19, TC-20 |
| REQ-B2 | SEQ-9 | TC-46, TC-47, TC-54 |
| REQ-B3 | SEQ-10 | TC-48, TC-49 |
| REQ-B4 | SEQ-11 | TC-50, TC-51 |
| REQ-B5 | SEQ-12 | TC-52, TC-53 |

## 11. Test Design Techniques

The following testing techniques are represented:

- Positive Testing
- Negative Testing
- Input Validation Testing
- Boundary Value Analysis
- Functional Testing
- Data Verification
- Requirement-Based Testing

## 12. Conclusion

The Browse and Search test cases cover the product discovery functionality of ShopEasy.

The test scenarios validate:

- Product listing and pagination.
- Keyword-based product search.
- Case-insensitive search.
- Category and price filtering.
- Product sorting.
- Product details and stock availability.

A total of 11 test scenarios are documented and mapped to five Jira User Stories and their corresponding functional requirements.

This test documentation provides structured functional test coverage and maintains requirement traceability across the Browse and Search module.

---

**End of Document**
