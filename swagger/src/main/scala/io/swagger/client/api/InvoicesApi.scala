/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Inline_response_200
import io.swagger.client.model.Inline_response_400
import io.swagger.client.model.Invoice
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object InvoicesApi {

  /**
   * Retrieve invoices for the given account number within a date range.
   * 
   * Expected answers:
   *   code 200 : Inline_response_200 (search results matching criteria)
   *   code 400 : Inline_response_400 (BAD Request - Input contractAccountNumber pattern is invalid)
   * 
   * @param contractAccountNumber contract Account Number
   * @param fromDate indicates start date [dd/MM/yyyy], from when invoices to be fetched in the range of 12 months
   * @param toDate indicates end date [dd/MM/yyyy], till when invoices to be fetched in the range of 12 months
   */
  def retrieveInvoices(contractAccountNumber: String, fromDate: String, toDate: String): ApiRequest[Inline_response_200] =
    ApiRequest[Inline_response_200](ApiMethods.GET, "http://localhost:7001/api/secure/business", "/contract-accounts/{contractAccountNumber}/invoices", "application/json")
      .withQueryParam("fromDate", fromDate)
      .withQueryParam("toDate", toDate)
      .withPathParam("contractAccountNumber", contractAccountNumber)
      .withSuccessResponse[Inline_response_200](200)
      .withErrorResponse[Inline_response_400](400)
        /**
   * Downloads invoices for the given invoice numbers
   * 
   * Expected answers:
   *   code 200 : Seq[Invoice] (search results matching criteria)
   *   code 400 :  (bad input parameter)
   * 
   * @param contractAccountNumber contract Account Number
   * @param invoiceIds invoice numbers to be fetched 
   */
  def viewDownloadInvoices(contractAccountNumber: String, invoiceIds: String): ApiRequest[Seq[Invoice]] =
    ApiRequest[Seq[Invoice]](ApiMethods.GET, "http://localhost:7001/api/secure/business", "/contract-accounts/{contractAccountNumber}/invoices/{invoiceIds}", "application/json")
      .withPathParam("contractAccountNumber", contractAccountNumber)
      .withPathParam("invoiceIds", invoiceIds)
      .withSuccessResponse[Seq[Invoice]](200)
      .withErrorResponse[Unit](400)
      

}
