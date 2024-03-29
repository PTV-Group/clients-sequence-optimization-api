/*
 * Sequence Optimization
 * With the Sequence Optimization service you can find the best route for your transports.
 *
 * The version of the OpenAPI document: 1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.sequenceoptimization.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A stop report contains a summary of the values of the events at a stop, including the arrival time, the departure time and the service time. It also contains information about the loaded quantities when leaving the current stop.
 */
@ApiModel(description = "A stop report contains a summary of the values of the events at a stop, including the arrival time, the departure time and the service time. It also contains information about the loaded quantities when leaving the current stop.")
@JsonPropertyOrder({
  StopReport.JSON_PROPERTY_ARRIVAL_TIME,
  StopReport.JSON_PROPERTY_DEPARTURE_TIME,
  StopReport.JSON_PROPERTY_SERVICE_TIME,
  StopReport.JSON_PROPERTY_WAITING_TIME,
  StopReport.JSON_PROPERTY_BREAK_TIME,
  StopReport.JSON_PROPERTY_QUANTITIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T09:26:08.496004Z[Etc/UTC]")
public class StopReport {
  public static final String JSON_PROPERTY_ARRIVAL_TIME = "arrivalTime";
  private OffsetDateTime arrivalTime;

  public static final String JSON_PROPERTY_DEPARTURE_TIME = "departureTime";
  private OffsetDateTime departureTime;

  public static final String JSON_PROPERTY_SERVICE_TIME = "serviceTime";
  private Integer serviceTime;

  public static final String JSON_PROPERTY_WAITING_TIME = "waitingTime";
  private Integer waitingTime;

  public static final String JSON_PROPERTY_BREAK_TIME = "breakTime";
  private Integer breakTime;

  public static final String JSON_PROPERTY_QUANTITIES = "quantities";
  private List<Integer> quantities = null;

  public StopReport() { 
  }

  public StopReport arrivalTime(OffsetDateTime arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

   /**
   * The planned time of arrival at the stop according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
   * @return arrivalTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The planned time of arrival at the stop according to [RFC 3339](https://tools.ietf.org/html/rfc3339).")
  @JsonProperty(JSON_PROPERTY_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getArrivalTime() {
    return arrivalTime;
  }


  @JsonProperty(JSON_PROPERTY_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArrivalTime(OffsetDateTime arrivalTime) {
    this.arrivalTime = arrivalTime;
  }


  public StopReport departureTime(OffsetDateTime departureTime) {
    this.departureTime = departureTime;
    return this;
  }

   /**
   * The planned time of departure from the stop according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
   * @return departureTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The planned time of departure from the stop according to [RFC 3339](https://tools.ietf.org/html/rfc3339).")
  @JsonProperty(JSON_PROPERTY_DEPARTURE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDepartureTime() {
    return departureTime;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTURE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDepartureTime(OffsetDateTime departureTime) {
    this.departureTime = departureTime;
  }


  public StopReport serviceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
    return this;
  }

   /**
   * The service time at the stop [s].
   * @return serviceTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The service time at the stop [s].")
  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getServiceTime() {
    return serviceTime;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
  }


  public StopReport waitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
    return this;
  }

   /**
   * The waiting time at the stop [s].
   * @return waitingTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The waiting time at the stop [s].")
  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getWaitingTime() {
    return waitingTime;
  }


  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWaitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
  }


  public StopReport breakTime(Integer breakTime) {
    this.breakTime = breakTime;
    return this;
  }

   /**
   * The break time at the stop [s].
   * @return breakTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The break time at the stop [s].")
  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBreakTime() {
    return breakTime;
  }


  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBreakTime(Integer breakTime) {
    this.breakTime = breakTime;
  }


  public StopReport quantities(List<Integer> quantities) {
    this.quantities = quantities;
    return this;
  }

  public StopReport addQuantitiesItem(Integer quantitiesItem) {
    if (this.quantities == null) {
      this.quantities = new ArrayList<>();
    }
    this.quantities.add(quantitiesItem);
    return this;
  }

   /**
   * The quantities loaded on the vehicle when leaving the stop.
   * @return quantities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quantities loaded on the vehicle when leaving the stop.")
  @JsonProperty(JSON_PROPERTY_QUANTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getQuantities() {
    return quantities;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantities(List<Integer> quantities) {
    this.quantities = quantities;
  }


  /**
   * Return true if this StopReport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopReport stopReport = (StopReport) o;
    return Objects.equals(this.arrivalTime, stopReport.arrivalTime) &&
        Objects.equals(this.departureTime, stopReport.departureTime) &&
        Objects.equals(this.serviceTime, stopReport.serviceTime) &&
        Objects.equals(this.waitingTime, stopReport.waitingTime) &&
        Objects.equals(this.breakTime, stopReport.breakTime) &&
        Objects.equals(this.quantities, stopReport.quantities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalTime, departureTime, serviceTime, waitingTime, breakTime, quantities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopReport {\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
    sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
    sb.append("    breakTime: ").append(toIndentedString(breakTime)).append("\n");
    sb.append("    quantities: ").append(toIndentedString(quantities)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

