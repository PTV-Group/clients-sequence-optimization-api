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
import com.ptvgroup.developer.client.sequenceoptimization.model.PositionInRoute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Attributes for a location of type CUSTOMER.
 */
@ApiModel(description = "Attributes for a location of type CUSTOMER.")
@JsonPropertyOrder({
  CustomerLocationAttributes.JSON_PROPERTY_SERVICE_TIME_PER_TRANSPORT_STOP,
  CustomerLocationAttributes.JSON_PROPERTY_POSITION_IN_ROUTE,
  CustomerLocationAttributes.JSON_PROPERTY_ROUTE_SECTION_NUMBER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T07:57:32.884322Z[Etc/UTC]")
public class CustomerLocationAttributes {
  public static final String JSON_PROPERTY_SERVICE_TIME_PER_TRANSPORT_STOP = "serviceTimePerTransportStop";
  private Integer serviceTimePerTransportStop = 0;

  public static final String JSON_PROPERTY_POSITION_IN_ROUTE = "positionInRoute";
  private JsonNullable<PositionInRoute> positionInRoute = JsonNullable.<PositionInRoute>undefined();

  public static final String JSON_PROPERTY_ROUTE_SECTION_NUMBER = "routeSectionNumber";
  private JsonNullable<Integer> routeSectionNumber = JsonNullable.<Integer>undefined();

  public CustomerLocationAttributes() { 
  }

  public CustomerLocationAttributes serviceTimePerTransportStop(Integer serviceTimePerTransportStop) {
    this.serviceTimePerTransportStop = serviceTimePerTransportStop;
    return this;
  }

   /**
   * The service time [s] that is required each time this location is visited in order to pick goods up or to deliver them. The location-dependent service time represents, for example, the time to enter the premises or to register at a customer. Besides a location-dependent service time, the user may specify an additional transport-dependent service time at the transports.
   * minimum: 0
   * @return serviceTimePerTransportStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The service time [s] that is required each time this location is visited in order to pick goods up or to deliver them. The location-dependent service time represents, for example, the time to enter the premises or to register at a customer. Besides a location-dependent service time, the user may specify an additional transport-dependent service time at the transports.")
  @JsonProperty(JSON_PROPERTY_SERVICE_TIME_PER_TRANSPORT_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServiceTimePerTransportStop() {
    return serviceTimePerTransportStop;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TIME_PER_TRANSPORT_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceTimePerTransportStop(Integer serviceTimePerTransportStop) {
    this.serviceTimePerTransportStop = serviceTimePerTransportStop;
  }


  public CustomerLocationAttributes positionInRoute(PositionInRoute positionInRoute) {
    this.positionInRoute = JsonNullable.<PositionInRoute>of(positionInRoute);
    return this;
  }

   /**
   * Get positionInRoute
   * @return positionInRoute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public PositionInRoute getPositionInRoute() {
        return positionInRoute.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSITION_IN_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PositionInRoute> getPositionInRoute_JsonNullable() {
    return positionInRoute;
  }
  
  @JsonProperty(JSON_PROPERTY_POSITION_IN_ROUTE)
  public void setPositionInRoute_JsonNullable(JsonNullable<PositionInRoute> positionInRoute) {
    this.positionInRoute = positionInRoute;
  }

  public void setPositionInRoute(PositionInRoute positionInRoute) {
    this.positionInRoute = JsonNullable.<PositionInRoute>of(positionInRoute);
  }


  public CustomerLocationAttributes routeSectionNumber(Integer routeSectionNumber) {
    this.routeSectionNumber = JsonNullable.<Integer>of(routeSectionNumber);
    return this;
  }

   /**
   * If routeSectionNumber is specified, a stop at this customer location will be visited after stops at customer locations with specified lower routeSectionNumber and before stops at customer locations with specified higher routeSectionNumber. Consequently, the route section numbers of stops at customer locations must be non-decreasing.   If specified, positionInRoute must not be set for the same location.  See [here](./Concepts/Route%20sections%20and%20Position%20in%20route.htm) for more information.
   * minimum: 1
   * @return routeSectionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If routeSectionNumber is specified, a stop at this customer location will be visited after stops at customer locations with specified lower routeSectionNumber and before stops at customer locations with specified higher routeSectionNumber. Consequently, the route section numbers of stops at customer locations must be non-decreasing.   If specified, positionInRoute must not be set for the same location.  See [here](./Concepts/Route%20sections%20and%20Position%20in%20route.htm) for more information.")
  @JsonIgnore

  public Integer getRouteSectionNumber() {
        return routeSectionNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROUTE_SECTION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getRouteSectionNumber_JsonNullable() {
    return routeSectionNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_ROUTE_SECTION_NUMBER)
  public void setRouteSectionNumber_JsonNullable(JsonNullable<Integer> routeSectionNumber) {
    this.routeSectionNumber = routeSectionNumber;
  }

  public void setRouteSectionNumber(Integer routeSectionNumber) {
    this.routeSectionNumber = JsonNullable.<Integer>of(routeSectionNumber);
  }


  /**
   * Return true if this CustomerLocationAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLocationAttributes customerLocationAttributes = (CustomerLocationAttributes) o;
    return Objects.equals(this.serviceTimePerTransportStop, customerLocationAttributes.serviceTimePerTransportStop) &&
        equalsNullable(this.positionInRoute, customerLocationAttributes.positionInRoute) &&
        equalsNullable(this.routeSectionNumber, customerLocationAttributes.routeSectionNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceTimePerTransportStop, hashCodeNullable(positionInRoute), hashCodeNullable(routeSectionNumber));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLocationAttributes {\n");
    sb.append("    serviceTimePerTransportStop: ").append(toIndentedString(serviceTimePerTransportStop)).append("\n");
    sb.append("    positionInRoute: ").append(toIndentedString(positionInRoute)).append("\n");
    sb.append("    routeSectionNumber: ").append(toIndentedString(routeSectionNumber)).append("\n");
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

