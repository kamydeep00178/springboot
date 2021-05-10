    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codingboost.webapp.webapp.restservice;

import java.util.Date;

/**
 *
 * @author kamal
 */
public class ErrorResponse {
     private Date timestamp;
  private String status;
  private String message;
  private String details;

  /**
   * Instantiates a new Error response.
   *
   * @param timestamp the timestamp
   * @param status the status
   * @param message the message
   * @param details the details
   */
  public ErrorResponse(Date timestamp, String status, String message, String details) {
    this.timestamp = timestamp;
    this.status = status;
    this.message = message;
    this.details = details;
  }

  /**
   * Gets timestamp.
   *
   * @return the timestamp
   */
  public Date getTimestamp() {
    return timestamp;
  }

  /**
   * Sets timestamp.
   *
   * @param timestamp the timestamp
   */
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Gets status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Sets status.
   *
   * @param status the status
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Gets message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Sets message.
   *
   * @param message the message
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Gets details.
   *
   * @return the details
   */
  public String getDetails() {
    return details;
  }

  /**
   * Sets details.
   *
   * @param details the details
   */
  public void setDetails(String details) {
    this.details = details;
  }
}
