/*
 * Sequence Optimization
 * With the Sequence Optimization service you can find the best route for your transports.
 *
 * The version of the OpenAPI document: 1.5
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CausingError
 */
@JsonPropertyOrder({
  CausingError.JSON_PROPERTY_DESCRIPTION,
  CausingError.JSON_PROPERTY_ERROR_CODE,
  CausingError.JSON_PROPERTY_PARAMETER,
  CausingError.JSON_PROPERTY_DETAILS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T08:09:27.762325Z[Etc/UTC]")
public class CausingError {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, Object> details = null;

  public CausingError() { 
  }

  public CausingError description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable message that describes the error.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A human readable message that describes the error.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CausingError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60; * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_INVALID_INTERVAL&#x60; - A time interval is invalid, i.e. start is greater than end. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_DUPLICATE_ID&#x60; - Two or more objects of the same type have the same ID.   * &#x60;value&#x60; - The duplicated value.   * &#x60;indexes&#x60; - The list indexes of the objects with the same ID. * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;SEQUENCEOPTIMIZATION_EMPTY_ID&#x60; - The ID is empty or contains only whitespace. * &#x60;SEQUENCEOPTIMIZATION_LOCATION_CANNOT_BE_MATCHED&#x60; - The location cannot be matched to a street and no airline distance fallback is possible. * &#x60;SEQUENCEOPTIMIZATION_DUPLICATE_TRANSPORT&#x60; - The transport with ID &#39;&#39; is picked up and/or delivered multiple times.   * &#x60;transportId&#x60; - The duplicated transport ID. * &#x60;SEQUENCEOPTIMIZATION_ILLEGAL_EMPTY_STOP&#x60; - Empty stops without any pickup or delivery are only allowed for the vehicle start/end location. * &#x60;SEQUENCEOPTIMIZATION_DELIVERY_EXECUTED_BEFORE_PICKUP&#x60; - Delivery of transport with ID &#39;&#39; is executed before the corresponding pickup.   * &#x60;transportId&#x60; - The transport ID. * &#x60;SEQUENCEOPTIMIZATION_NO_TRANSPORT_IN_ROUTE&#x60; - There is no transport in the route. Please add a transport or remove the whole route. * &#x60;SEQUENCEOPTIMIZATION_DELIVERY_MISSING_IN_ROUTE&#x60; - Delivery of transport with ID &#39;&#39; is missing in the given route. Pickup and delivery of a transport must either both be planned or must both remain unplanned.   * &#x60;transportId&#x60; - The transport ID. * &#x60;SEQUENCEOPTIMIZATION_PICKUP_MISSING_IN_ROUTE&#x60; - Pickup of transport with ID &#39;&#39; is missing in the given route. Pickup and delivery of a transport must either both be planned or must both remain unplanned.   * &#x60;transportId&#x60; - The transport ID. * &#x60;SEQUENCEOPTIMIZATION_PICKUP_EQUAL_TO_DELIVERY_LOCATION&#x60; - Pickup and delivery of transport with ID &#39;&#39; are at the same location. Pickup and delivery of a transport need to be at different locations.   * &#x60;transportId&#x60; - The transport ID.   * &#x60;locationId&#x60; - The location ID of the transport pickup and delivery. * &#x60;SEQUENCEOPTIMIZATION_PICKUP_MISSING_IN_LOCATIONS&#x60; - The locations list does not contain the pickup location with ID &#39;&#39;.   * &#x60;locationId&#x60; - The location ID. * &#x60;SEQUENCEOPTIMIZATION_DELIVERY_MISSING_IN_LOCATIONS&#x60; - The locations list does not contain the delivery location with ID &#39;&#39;.   * &#x60;locationId&#x60; - The location ID. * &#x60;SEQUENCEOPTIMIZATION_VEHICLE_START_LOCATION_MISSING_IN_ROUTE&#x60; - Vehicle start location must be the first stop of the vehicle route.   * &#x60;expectedLocationIdOfFirstStop&#x60; - The expected location ID of the first stop of the route which is the given vehicle start location.   * &#x60;actualLocationIdOfFirstStop&#x60; - The actual location ID of the first stop of the route. * &#x60;SEQUENCEOPTIMIZATION_VEHICLE_END_LOCATION_MISSING_IN_ROUTE&#x60; - Vehicle end location must be the last stop of the vehicle route.   * &#x60;expectedLocationIdOfLastStop&#x60; - The expected location ID of the last stop of the route which is the given vehicle end location.   * &#x60;actualLocationIdOfLastStop&#x60; - The actual location ID of the last stop of the route. * &#x60;SEQUENCEOPTIMIZATION_INCONSISTENT_NUMBER_OF_QUANTITIES_AND_CAPACITIES&#x60; - The list of the capacities of the vehicle and the list of the quantities of all transports must have the same length. The reference list is given in the parameter field.   * &#x60;expectedLength&#x60; - The expected length of the list.   * &#x60;vehicleHasInconsistentCapacity&#x60; - If true the vehicle has the wrong number of capacities.   * &#x60;transportIndexes&#x60; - The list indexes of the transports with the wrong number of quantities. * &#x60;SEQUENCEOPTIMIZATION_UNKNOWN_LOCATION_ID&#x60; - A location with ID &#39;&#39; does not exist in the locations list.   * &#x60;locationId&#x60; - The location ID. * &#x60;SEQUENCEOPTIMIZATION_UNREFERENCED_LOCATIONS&#x60; - Locations with IDs &#39;&#39; are not referenced or used anywhere. These and all other unreferenced locations must be left out.   * &#x60;locationIds&#x60; - The IDs of some unreferenced locations. * &#x60;SEQUENCEOPTIMIZATION_UNKNOWN_TRANSPORT_ID&#x60; - A transport with ID &#39;&#39; does not exist in the transports list.   * &#x60;transportId&#x60; - The transport ID. * &#x60;SEQUENCEOPTIMIZATION_PICKUP_AT_UNEXPECTED_LOCATION&#x60; - Transport with ID &#39;&#39; should not be picked up at this location.   * &#x60;transportId&#x60; - The ID of the transport which is picked up at an unexpected location.   * &#x60;expectedPickupLocationId&#x60; - The location ID where transport should be picked up.   * &#x60;actualPickupLocationId&#x60; - The location ID of the stop where transport is actually picked up. * &#x60;SEQUENCEOPTIMIZATION_DELIVERY_AT_UNEXPECTED_LOCATION&#x60; - Transport with ID &#39;&#39; should not be delivered at this location.   * &#x60;transportId&#x60; - The ID of the transport which is delivered at an unexpected location.   * &#x60;expectedDeliveryLocationId&#x60; - The location ID where transport should be delivered.   * &#x60;actualDeliveryLocationId&#x60; - The location ID of the stop where transport is actually delivered. * &#x60;SEQUENCEOPTIMIZATION_ILLEGAL_SPLIT_STOP&#x60; - Subsequent stops at the same location are not allowed. The given stops must be merged to one stop.   * &#x60;stopIndexes&#x60; - The list indexes of the stops which should be merged. * &#x60;SEQUENCEOPTIMIZATION_INVALID_LOADING_SEQUENCE&#x60; - A location in a route is left with unfinished tasks: Either a location is left although there is still load FOR it on the vehicle or a location is visited again although there are still pickups FROM it on the vehicle.   * &#x60;locationId&#x60; - The location ID with unfinished tasks. * &#x60;SEQUENCEOPTIMIZATION_AVAILABILITY_TOO_LONG&#x60; - The driver availability must not be longer than 24 hours. * &#x60;SEQUENCEOPTIMIZATION_ROUTE_STRUCTURE_VIOLATED&#x60; - Route structure violated. * &#x60;SEQUENCEOPTIMIZATION_OPERATION_IN_PROCESS&#x60; - Optimized route with ID &#39;&#39; is being processed. Please wait or terminate current optimization process.   * &#x60;Id&#x60; - The optimized route ID. * &#x60;SEQUENCEOPTIMIZATION_HPR_NETWORK_FOR_PROFILE_NOT_AVAILABLE&#x60; - High performance routing network is not available for profile:    * &#x60;profile&#x60; - The profile for which the high performance routing network is not available.  **Error codes for** &#x60;SEQUENCEOPTIMIZATION_RESTRICTION_EXCEEDED&#x60; * &#x60;SEQUENCEOPTIMIZATION_NUMBER_OF_TRANSPORTS_EXCEEDED&#x60; - The request contains too many transports.   * &#x60;transports&#x60; - The number of transports.   * &#x60;limit&#x60; - The maximum number of transports.  **Error codes for** &#x60;GENERAL_RESOURCE_NOT_FOUND&#x60; * &#x60;GENERAL_INVALID_ID&#x60; - The ID does not exist.   * &#x60;value&#x60; - The invalid ID.
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  **Error codes for** `GENERAL_VALIDATION_ERROR` * `GENERAL_INVALID_VALUE` - A parameter is set to an invalid value.   * `value` - The invalid value. * `GENERAL_UNRECOGNIZED_PARAMETER` - A parameter is unknown. * `GENERAL_MISSING_PARAMETER` - A required parameter is missing. * `GENERAL_INVALID_INTERVAL` - A time interval is invalid, i.e. start is greater than end. * `GENERAL_MINIMUM_LENGTH_VIOLATED` - The minimum length is violated.   * `minimumLength` - The minimum length (integer). * `GENERAL_MAXIMUM_LENGTH_VIOLATED` - The maximum length is violated.   * `maximumLength` - The maximum length (integer). * `GENERAL_DUPLICATE_ID` - Two or more objects of the same type have the same ID.   * `value` - The duplicated value.   * `indexes` - The list indexes of the objects with the same ID. * `GENERAL_MINIMUM_VALUE_VIOLATED` - The minimum value restriction is violated.   * `minimumValue` - The minimum value (integer or double). * `GENERAL_MAXIMUM_VALUE_VIOLATED` - The maximum value restriction is violated.   * `maximumValue` - The maximum value (integer or double). * `GENERAL_DUPLICATE_PARAMETER` - A parameter is duplicated. * `SEQUENCEOPTIMIZATION_EMPTY_ID` - The ID is empty or contains only whitespace. * `SEQUENCEOPTIMIZATION_LOCATION_CANNOT_BE_MATCHED` - The location cannot be matched to a street and no airline distance fallback is possible. * `SEQUENCEOPTIMIZATION_DUPLICATE_TRANSPORT` - The transport with ID '' is picked up and/or delivered multiple times.   * `transportId` - The duplicated transport ID. * `SEQUENCEOPTIMIZATION_ILLEGAL_EMPTY_STOP` - Empty stops without any pickup or delivery are only allowed for the vehicle start/end location. * `SEQUENCEOPTIMIZATION_DELIVERY_EXECUTED_BEFORE_PICKUP` - Delivery of transport with ID '' is executed before the corresponding pickup.   * `transportId` - The transport ID. * `SEQUENCEOPTIMIZATION_NO_TRANSPORT_IN_ROUTE` - There is no transport in the route. Please add a transport or remove the whole route. * `SEQUENCEOPTIMIZATION_DELIVERY_MISSING_IN_ROUTE` - Delivery of transport with ID '' is missing in the given route. Pickup and delivery of a transport must either both be planned or must both remain unplanned.   * `transportId` - The transport ID. * `SEQUENCEOPTIMIZATION_PICKUP_MISSING_IN_ROUTE` - Pickup of transport with ID '' is missing in the given route. Pickup and delivery of a transport must either both be planned or must both remain unplanned.   * `transportId` - The transport ID. * `SEQUENCEOPTIMIZATION_PICKUP_EQUAL_TO_DELIVERY_LOCATION` - Pickup and delivery of transport with ID '' are at the same location. Pickup and delivery of a transport need to be at different locations.   * `transportId` - The transport ID.   * `locationId` - The location ID of the transport pickup and delivery. * `SEQUENCEOPTIMIZATION_PICKUP_MISSING_IN_LOCATIONS` - The locations list does not contain the pickup location with ID ''.   * `locationId` - The location ID. * `SEQUENCEOPTIMIZATION_DELIVERY_MISSING_IN_LOCATIONS` - The locations list does not contain the delivery location with ID ''.   * `locationId` - The location ID. * `SEQUENCEOPTIMIZATION_VEHICLE_START_LOCATION_MISSING_IN_ROUTE` - Vehicle start location must be the first stop of the vehicle route.   * `expectedLocationIdOfFirstStop` - The expected location ID of the first stop of the route which is the given vehicle start location.   * `actualLocationIdOfFirstStop` - The actual location ID of the first stop of the route. * `SEQUENCEOPTIMIZATION_VEHICLE_END_LOCATION_MISSING_IN_ROUTE` - Vehicle end location must be the last stop of the vehicle route.   * `expectedLocationIdOfLastStop` - The expected location ID of the last stop of the route which is the given vehicle end location.   * `actualLocationIdOfLastStop` - The actual location ID of the last stop of the route. * `SEQUENCEOPTIMIZATION_INCONSISTENT_NUMBER_OF_QUANTITIES_AND_CAPACITIES` - The list of the capacities of the vehicle and the list of the quantities of all transports must have the same length. The reference list is given in the parameter field.   * `expectedLength` - The expected length of the list.   * `vehicleHasInconsistentCapacity` - If true the vehicle has the wrong number of capacities.   * `transportIndexes` - The list indexes of the transports with the wrong number of quantities. * `SEQUENCEOPTIMIZATION_UNKNOWN_LOCATION_ID` - A location with ID '' does not exist in the locations list.   * `locationId` - The location ID. * `SEQUENCEOPTIMIZATION_UNREFERENCED_LOCATIONS` - Locations with IDs '' are not referenced or used anywhere. These and all other unreferenced locations must be left out.   * `locationIds` - The IDs of some unreferenced locations. * `SEQUENCEOPTIMIZATION_UNKNOWN_TRANSPORT_ID` - A transport with ID '' does not exist in the transports list.   * `transportId` - The transport ID. * `SEQUENCEOPTIMIZATION_PICKUP_AT_UNEXPECTED_LOCATION` - Transport with ID '' should not be picked up at this location.   * `transportId` - The ID of the transport which is picked up at an unexpected location.   * `expectedPickupLocationId` - The location ID where transport should be picked up.   * `actualPickupLocationId` - The location ID of the stop where transport is actually picked up. * `SEQUENCEOPTIMIZATION_DELIVERY_AT_UNEXPECTED_LOCATION` - Transport with ID '' should not be delivered at this location.   * `transportId` - The ID of the transport which is delivered at an unexpected location.   * `expectedDeliveryLocationId` - The location ID where transport should be delivered.   * `actualDeliveryLocationId` - The location ID of the stop where transport is actually delivered. * `SEQUENCEOPTIMIZATION_ILLEGAL_SPLIT_STOP` - Subsequent stops at the same location are not allowed. The given stops must be merged to one stop.   * `stopIndexes` - The list indexes of the stops which should be merged. * `SEQUENCEOPTIMIZATION_INVALID_LOADING_SEQUENCE` - A location in a route is left with unfinished tasks: Either a location is left although there is still load FOR it on the vehicle or a location is visited again although there are still pickups FROM it on the vehicle.   * `locationId` - The location ID with unfinished tasks. * `SEQUENCEOPTIMIZATION_AVAILABILITY_TOO_LONG` - The driver availability must not be longer than 24 hours. * `SEQUENCEOPTIMIZATION_ROUTE_STRUCTURE_VIOLATED` - Route structure violated. * `SEQUENCEOPTIMIZATION_OPERATION_IN_PROCESS` - Optimized route with ID '' is being processed. Please wait or terminate current optimization process.   * `Id` - The optimized route ID. * `SEQUENCEOPTIMIZATION_HPR_NETWORK_FOR_PROFILE_NOT_AVAILABLE` - High performance routing network is not available for profile:    * `profile` - The profile for which the high performance routing network is not available.  **Error codes for** `SEQUENCEOPTIMIZATION_RESTRICTION_EXCEEDED` * `SEQUENCEOPTIMIZATION_NUMBER_OF_TRANSPORTS_EXCEEDED` - The request contains too many transports.   * `transports` - The number of transports.   * `limit` - The maximum number of transports.  **Error codes for** `GENERAL_RESOURCE_NOT_FOUND` * `GENERAL_INVALID_ID` - The ID does not exist.   * `value` - The invalid ID.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public CausingError parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * The name of the affected query or path parameter or a JSONPath to the affected property of the request.
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the affected query or path parameter or a JSONPath to the affected property of the request.")
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameter() {
    return parameter;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public CausingError details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public CausingError putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Additional properties specific to this error class.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional properties specific to this error class.")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }


  /**
   * Return true if this CausingError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CausingError causingError = (CausingError) o;
    return Objects.equals(this.description, causingError.description) &&
        Objects.equals(this.errorCode, causingError.errorCode) &&
        Objects.equals(this.parameter, causingError.parameter) &&
        Objects.equals(this.details, causingError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, errorCode, parameter, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CausingError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

