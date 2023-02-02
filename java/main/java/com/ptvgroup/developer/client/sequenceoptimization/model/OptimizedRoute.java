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
import com.ptvgroup.developer.client.sequenceoptimization.model.Stop;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The optimized route contains a summary of the values of all events, including the start time and the end time of the route and the ids of the orders that remain unplanned.
 */
@ApiModel(description = "The optimized route contains a summary of the values of all events, including the start time and the end time of the route and the ids of the orders that remain unplanned.")
@JsonPropertyOrder({
  OptimizedRoute.JSON_PROPERTY_ROUTE,
  OptimizedRoute.JSON_PROPERTY_START_TIME,
  OptimizedRoute.JSON_PROPERTY_END_TIME,
  OptimizedRoute.JSON_PROPERTY_TRAVEL_TIME,
  OptimizedRoute.JSON_PROPERTY_DISTANCE,
  OptimizedRoute.JSON_PROPERTY_DRIVING_TIME,
  OptimizedRoute.JSON_PROPERTY_SERVICE_TIME,
  OptimizedRoute.JSON_PROPERTY_WAITING_TIME,
  OptimizedRoute.JSON_PROPERTY_BREAK_TIME,
  OptimizedRoute.JSON_PROPERTY_UNPLANNED_TRANSPORT_IDS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T08:09:27.762325Z[Etc/UTC]")
public class OptimizedRoute {
  public static final String JSON_PROPERTY_ROUTE = "route";
  private List<Stop> route = null;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private OffsetDateTime endTime;

  public static final String JSON_PROPERTY_TRAVEL_TIME = "travelTime";
  private Integer travelTime;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_DRIVING_TIME = "drivingTime";
  private Integer drivingTime;

  public static final String JSON_PROPERTY_SERVICE_TIME = "serviceTime";
  private Integer serviceTime;

  public static final String JSON_PROPERTY_WAITING_TIME = "waitingTime";
  private Integer waitingTime;

  public static final String JSON_PROPERTY_BREAK_TIME = "breakTime";
  private Integer breakTime;

  public static final String JSON_PROPERTY_UNPLANNED_TRANSPORT_IDS = "unplannedTransportIds";
  private List<String> unplannedTransportIds = null;

  public OptimizedRoute() { 
  }

  public OptimizedRoute route(List<Stop> route) {
    this.route = route;
    return this;
  }

  public OptimizedRoute addRouteItem(Stop routeItem) {
    if (this.route == null) {
      this.route = new ArrayList<>();
    }
    this.route.add(routeItem);
    return this;
  }

   /**
   * A route contains a sequence of stops. It specifies where and in which order goods are to be picked up or delivered. Each stop is at a specific location, either a customer location or a depot location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. The sequence of pickups and deliveries is always sorted by Last In - First Out (LIFO). At a depot location a stop groups either pickups or deliveries.
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A route contains a sequence of stops. It specifies where and in which order goods are to be picked up or delivered. Each stop is at a specific location, either a customer location or a depot location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. The sequence of pickups and deliveries is always sorted by Last In - First Out (LIFO). At a depot location a stop groups either pickups or deliveries.")
  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Stop> getRoute() {
    return route;
  }


  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoute(List<Stop> route) {
    this.route = route;
  }


  public OptimizedRoute startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339).")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public OptimizedRoute endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339).")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public OptimizedRoute travelTime(Integer travelTime) {
    this.travelTime = travelTime;
    return this;
  }

   /**
   * The total travel time of the route [s]. Equals difference between end time and start time.
   * @return travelTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total travel time of the route [s]. Equals difference between end time and start time.")
  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTravelTime() {
    return travelTime;
  }


  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTravelTime(Integer travelTime) {
    this.travelTime = travelTime;
  }


  public OptimizedRoute distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The total driving distance of the route [m].
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total driving distance of the route [m].")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public OptimizedRoute drivingTime(Integer drivingTime) {
    this.drivingTime = drivingTime;
    return this;
  }

   /**
   * The total driving time of the route [s].
   * @return drivingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total driving time of the route [s].")
  @JsonProperty(JSON_PROPERTY_DRIVING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDrivingTime() {
    return drivingTime;
  }


  @JsonProperty(JSON_PROPERTY_DRIVING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDrivingTime(Integer drivingTime) {
    this.drivingTime = drivingTime;
  }


  public OptimizedRoute serviceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
    return this;
  }

   /**
   * The total service time of the route [s].
   * @return serviceTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total service time of the route [s].")
  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServiceTime() {
    return serviceTime;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
  }


  public OptimizedRoute waitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
    return this;
  }

   /**
   * The total waiting time of the route [s].
   * @return waitingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total waiting time of the route [s].")
  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWaitingTime() {
    return waitingTime;
  }


  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
  }


  public OptimizedRoute breakTime(Integer breakTime) {
    this.breakTime = breakTime;
    return this;
  }

   /**
   * The total break time of the route [s].
   * @return breakTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total break time of the route [s].")
  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBreakTime() {
    return breakTime;
  }


  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakTime(Integer breakTime) {
    this.breakTime = breakTime;
  }


  public OptimizedRoute unplannedTransportIds(List<String> unplannedTransportIds) {
    this.unplannedTransportIds = unplannedTransportIds;
    return this;
  }

  public OptimizedRoute addUnplannedTransportIdsItem(String unplannedTransportIdsItem) {
    if (this.unplannedTransportIds == null) {
      this.unplannedTransportIds = new ArrayList<>();
    }
    this.unplannedTransportIds.add(unplannedTransportIdsItem);
    return this;
  }

   /**
   * Returns the transport IDs that could not be planned. These transports are not part of the route.
   * @return unplannedTransportIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the transport IDs that could not be planned. These transports are not part of the route.")
  @JsonProperty(JSON_PROPERTY_UNPLANNED_TRANSPORT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUnplannedTransportIds() {
    return unplannedTransportIds;
  }


  @JsonProperty(JSON_PROPERTY_UNPLANNED_TRANSPORT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnplannedTransportIds(List<String> unplannedTransportIds) {
    this.unplannedTransportIds = unplannedTransportIds;
  }


  /**
   * Return true if this OptimizedRoute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizedRoute optimizedRoute = (OptimizedRoute) o;
    return Objects.equals(this.route, optimizedRoute.route) &&
        Objects.equals(this.startTime, optimizedRoute.startTime) &&
        Objects.equals(this.endTime, optimizedRoute.endTime) &&
        Objects.equals(this.travelTime, optimizedRoute.travelTime) &&
        Objects.equals(this.distance, optimizedRoute.distance) &&
        Objects.equals(this.drivingTime, optimizedRoute.drivingTime) &&
        Objects.equals(this.serviceTime, optimizedRoute.serviceTime) &&
        Objects.equals(this.waitingTime, optimizedRoute.waitingTime) &&
        Objects.equals(this.breakTime, optimizedRoute.breakTime) &&
        Objects.equals(this.unplannedTransportIds, optimizedRoute.unplannedTransportIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(route, startTime, endTime, travelTime, distance, drivingTime, serviceTime, waitingTime, breakTime, unplannedTransportIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizedRoute {\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    drivingTime: ").append(toIndentedString(drivingTime)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
    sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
    sb.append("    breakTime: ").append(toIndentedString(breakTime)).append("\n");
    sb.append("    unplannedTransportIds: ").append(toIndentedString(unplannedTransportIds)).append("\n");
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

