# Test Cases for Star Airline Invoice Processing

## Test Case Summary

<table>
  <tr>
    <th>Test Case ID</th>
    <th>Description</th>
    <th>Status</th>
  </tr>
  <tr>
    <td>TC_Invoice_1</td>
    <td>Validate the ability to log in to the Star Airline website</td>
    <td style="color: green; font-weight: bold;">Passed</td>
  </tr>
  <tr>
    <td>TC_Invoice_2</td>
    <td>Validate the navigation to the Customer Tax Invoice section</td>
    <td style="color: green; font-weight: bold;">Passed</td>
  </tr>
  <tr>
    <td>TC_Invoice_3</td>
    <td>Verify entering valid PNR number and GST registration number</td>
    <td style="color: green; font-weight: bold;">Passed</td>
  </tr>
  <tr>
    <td>TC_Invoice_4</td>
    <td>Verify the retrieval and download of invoice PDFs</td>
    <td style="color: green; font-weight: bold;">Passed</td>
  </tr>
  <tr>
    <td>TC_Invoice_5</td>
    <td>Ensure booking information is correctly extracted from the PDFs</td>
    <td style="color: green; font-weight: bold;">Passed</td>
  </tr>
  <tr>
    <td>TC_Invoice_6</td>
    <td>Verify storage of PDFs and booking information in Amazon S3</td>
    <td style="color: green; font-weight: bold;">Passed</td>
  </tr>
  <tr>
    <td>TC_Invoice_7</td>
    <td>Check if PDFs are enhanced with additional details</td>
    <td style="color: green; font-weight: bold;">Passed</td>
  </tr>
  <tr>
    <td>TC_Invoice_8</td>
    <td>Ensure data integrity by comparing downloaded invoices and extracted information</td>
    <td style="color: green; font-weight: bold;">Passed</td>
  </tr>
  <tr>
    <td>TC_Invoice_9</td>
    <td>Verify completeness and accuracy of the final documents</td>
    <td style="color: green; font-weight: bold;">Passed</td>
  </tr>
</table>

## Detailed Test Cases

### Test Case ID: TC_Invoice_1
- **Description**: Validate the ability to log in to the Star Airline website.
- **Preconditions**: Valid login credentials.
- **Steps to Execute**:
  1. Navigate to the [Star Airline login page](https://starair.in).
  2. Enter valid login credentials.
  3. Click on the login button.
- **Expected Result**: Successful login to the website.
- **Actual Result**: As Expected Result.
- **Status**: <span style="color: green; font-weight: bold;">Passed</span>

### Test Case ID: TC_Invoice_2
- **Description**: Validate the navigation to the Customer Tax Invoice section.
- **Preconditions**: User must be logged in.
- **Steps to Execute**:
  1. Go to the [Customer Tax Invoice Section](https://starair.in/Customer/GstInvoice).
- **Expected Result**: Successfully navigates to the Customer Tax Invoice section.
- **Actual Result**: As Expected Result.
- **Status**: <span style="color: green; font-weight: bold;">Passed</span>

### Test Case ID: TC_Invoice_3
- **Description**: Verify entering valid PNR number and GST registration number.
- **Preconditions**: Valid PNR number and GST registration number.
- **Steps to Execute**:
  1. Enter the PNR number.
  2. Enter the GST registration number.
  3. Click the search button.
- **Expected Result**: Invoices corresponding to the entered details are retrieved.
- **Actual Result**: As Expected Result.
- **Status**: <span style="color: green; font-weight: bold;">Passed</span>

### Test Case ID: TC_Invoice_4
- **Description**: Verify the retrieval and download of invoice PDFs.
- **Preconditions**: Invoices should be displayed after a successful search.
- **Steps to Execute**:
  1. Click on each invoice link to download the PDFs.
- **Expected Result**: PDF files are downloaded successfully.
- **Actual Result**: As Expected Result.
- **Status**: <span style="color: green; font-weight: bold;">Passed</span>

### Test Case ID: TC_Invoice_5
- **Description**: Ensure booking information is correctly extracted from the PDFs.
- **Preconditions**: PDF files are downloaded.
- **Steps to Execute**:
  1. Extract booking information such as trade name, address, city, and state from the PDFs.
- **Expected Result**: Booking information is accurately extracted.
- **Actual Result**: As Expected Result.
- **Status**: <span style="color: green; font-weight: bold;">Passed</span>

### Test Case ID: TC_Invoice_6
- **Description**: Verify storage of PDFs and booking information in Amazon S3.
- **Preconditions**: Data should be ready for storage.
- **Steps to Execute**:
  1. Upload the PDFs and booking information to Amazon S3 storage.
- **Expected Result**: Data is securely stored in Amazon S3.
- **Actual Result**: As Expected Result.
- **Status**: <span style="color: green; font-weight: bold;">Passed</span>

### Test Case ID: TC_Invoice_7
- **Description**: Check if PDFs are enhanced with additional details.
- **Preconditions**: PDFs must be available for enhancement.
- **Steps to Execute**:
  1. Add additional details such as PNR number and GST registration number to the PDFs.
- **Expected Result**: PDFs are enhanced with the additional details.
- **Actual Result**: As Expected Result.
- **Status**: <span style="color: green; font-weight: bold;">Passed</span>

### Test Case ID: TC_Invoice_8
- **Description**: Ensure data integrity by comparing downloaded invoices and extracted information.
- **Preconditions**: Invoices and extracted data should be available.
- **Steps to Execute**:
  1. Compare the downloaded invoices with the extracted booking information.
- **Expected Result**: Data matches accurately.
- **Actual Result**: As Expected Result.
- **Status**: <span style="color: green; font-weight: bold;">Passed</span>

### Test Case ID: TC_Invoice_9
- **Description**: Verify completeness and accuracy of the final documents.
- **Preconditions**: Final documents should be prepared.
- **Steps to Execute**:
  1. Review the final documents for completeness and accuracy.
- **Expected Result**: Documents are complete and accurate.
- **Actual Result**:As Expected Result.
- **Status**: <span style="color: green; font-weight: bold;">Passed</span>

## Summary Report

All test cases are designed to validate the functionality of the Star Airline invoice processing system. Each test case ensures that different aspects of invoice extraction, enhancement, and storage are thoroughly tested. The results of these tests will confirm the accuracy and reliability of the invoice management process.

---

*Documentation created by Omkar G*
