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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Attributes for a location of type DEPOT.
 */
@ApiModel(description = "Attributes for a location of type DEPOT.")
@JsonPropertyOrder({
  DepotLocationAttributes.JSON_PROPERTY_SERVICE_TIME_PER_PICKUP_STOP,
  DepotLocationAttributes.JSON_PROPERTY_SERVICE_TIME_PER_DELIVERY_STOP
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T07:57:32.884322Z[Etc/UTC]")
public class DepotLocationAttributes {
  public static final String JSON_PROPERTY_SERVICE_TIME_PER_PICKUP_STOP = "serviceTimePerPickupStop";
  private Integer serviceTimePerPickupStop = 0;

  public static final String JSON_PROPERTY_SERVICE_TIME_PER_DELIVERY_STOP = "serviceTimePerDeliveryStop";
  private Integer serviceTimePerDeliveryStop = 0;

  public DepotLocationAttributes() { 
  }

  public DepotLocationAttributes serviceTimePerPickupStop(Integer serviceTimePerPickupStop) {
    this.serviceTimePerPickupStop = serviceTimePerPickupStop;
    return this;
  }

   /**
   * The service time [s] that is required each time this location is visited in order to pick up goods. The location-dependent service time represents, for example, the time to enter the premises or to register at a depot. Besides a location-dependent service time, the user may specify an additional transport-dependent service time at the transports.
   * minimum: 0
   * @return serviceTimePerPickupStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The service time [s] that is required each time this location is visited in order to pick up goods. The location-dependent service time represents, for example, the time to enter the premises or to register at a depot. Besides a location-dependent service time, the user may specify an additional transport-dependent service time at the transports.")
  @JsonProperty(JSON_PROPERTY_SERVICE_TIME_PER_PICKUP_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServiceTimePerPickupStop() {
    return serviceTimePerPickupStop;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TIME_PER_PICKUP_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceTimePerPickupStop(Integer serviceTimePerPickupStop) {
    this.serviceTimePerPickupStop = serviceTimePerPickupStop;
  }


  public DepotLocationAttributes serviceTimePerDeliveryStop(Integer serviceTimePerDeliveryStop) {
    this.serviceTimePerDeliveryStop = serviceTimePerDeliveryStop;
    return this;
  }

   /**
   * The service time [s] that is required each time this location is visited in order to deliver goods. The location-dependent service time represents, for example, the time to enter the premises or to register at a depot. Besides a location-dependent service time, the user may specify an additional transport-dependent service time at the transports.
   * minimum: 0
   * @return serviceTimePerDeliveryStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The service time [s] that is required each time this location is visited in order to deliver goods. The location-dependent service time represents, for example, the time to enter the premises or to register at a depot. Besides a location-dependent service time, the user may specify an additional transport-dependent service time at the transports.")
  @JsonProperty(JSON_PROPERTY_SERVICE_TIME_PER_DELIVERY_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServiceTimePerDeliveryStop() {
    return serviceTimePerDeliveryStop;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TIME_PER_DELIVERY_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceTimePerDeliveryStop(Integer serviceTimePerDeliveryStop) {
    this.serviceTimePerDeliveryStop = serviceTimePerDeliveryStop;
  }


  /**
   * Return true if this DepotLocationAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepotLocationAttributes depotLocationAttributes = (DepotLocationAttributes) o;
    return Objects.equals(this.serviceTimePerPickupStop, depotLocationAttributes.serviceTimePerPickupStop) &&
        Objects.equals(this.serviceTimePerDeliveryStop, depotLocationAttributes.serviceTimePerDeliveryStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceTimePerPickupStop, serviceTimePerDeliveryStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepotLocationAttributes {\n");
    sb.append("    serviceTimePerPickupStop: ").append(toIndentedString(serviceTimePerPickupStop)).append("\n");
    sb.append("    serviceTimePerDeliveryStop: ").append(toIndentedString(serviceTimePerDeliveryStop)).append("\n");
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

