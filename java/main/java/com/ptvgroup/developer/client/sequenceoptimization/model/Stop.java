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
import com.ptvgroup.developer.client.sequenceoptimization.model.Event;
import com.ptvgroup.developer.client.sequenceoptimization.model.StopReport;
import com.ptvgroup.developer.client.sequenceoptimization.model.Violation;
import com.ptvgroup.developer.client.sequenceoptimization.model.WayReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A stop groups subsequent pickups and/or deliveries at the same location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. At a depot location a stop groups either pickups or deliveries.  See [here](./concepts/route-sections-and-position-route) for more information.
 */
@ApiModel(description = "A stop groups subsequent pickups and/or deliveries at the same location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. At a depot location a stop groups either pickups or deliveries.  See [here](./concepts/route-sections-and-position-route) for more information.")
@JsonPropertyOrder({
  Stop.JSON_PROPERTY_LOCATION_ID,
  Stop.JSON_PROPERTY_DELIVERY_IDS,
  Stop.JSON_PROPERTY_PICKUP_IDS,
  Stop.JSON_PROPERTY_REPORT_FOR_WAY_TO_STOP,
  Stop.JSON_PROPERTY_REPORT_FOR_STOP,
  Stop.JSON_PROPERTY_EVENTS_ON_WAY_TO_STOP,
  Stop.JSON_PROPERTY_EVENTS_AT_STOP,
  Stop.JSON_PROPERTY_VIOLATIONS_ON_WAY_TO_STOP,
  Stop.JSON_PROPERTY_VIOLATIONS_AT_STOP
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T08:09:27.762325Z[Etc/UTC]")
public class Stop {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_DELIVERY_IDS = "deliveryIds";
  private List<String> deliveryIds = null;

  public static final String JSON_PROPERTY_PICKUP_IDS = "pickupIds";
  private List<String> pickupIds = null;

  public static final String JSON_PROPERTY_REPORT_FOR_WAY_TO_STOP = "reportForWayToStop";
  private WayReport reportForWayToStop;

  public static final String JSON_PROPERTY_REPORT_FOR_STOP = "reportForStop";
  private StopReport reportForStop;

  public static final String JSON_PROPERTY_EVENTS_ON_WAY_TO_STOP = "eventsOnWayToStop";
  private List<Event> eventsOnWayToStop = new ArrayList<>();

  public static final String JSON_PROPERTY_EVENTS_AT_STOP = "eventsAtStop";
  private List<Event> eventsAtStop = new ArrayList<>();

  public static final String JSON_PROPERTY_VIOLATIONS_ON_WAY_TO_STOP = "violationsOnWayToStop";
  private List<Violation> violationsOnWayToStop = new ArrayList<>();

  public static final String JSON_PROPERTY_VIOLATIONS_AT_STOP = "violationsAtStop";
  private List<Violation> violationsAtStop = new ArrayList<>();

  public Stop() { 
  }

  @JsonCreator
  public Stop(
    @JsonProperty(JSON_PROPERTY_REPORT_FOR_WAY_TO_STOP) WayReport reportForWayToStop, 
    @JsonProperty(JSON_PROPERTY_REPORT_FOR_STOP) StopReport reportForStop, 
    @JsonProperty(JSON_PROPERTY_EVENTS_ON_WAY_TO_STOP) List<Event> eventsOnWayToStop, 
    @JsonProperty(JSON_PROPERTY_EVENTS_AT_STOP) List<Event> eventsAtStop, 
    @JsonProperty(JSON_PROPERTY_VIOLATIONS_ON_WAY_TO_STOP) List<Violation> violationsOnWayToStop, 
    @JsonProperty(JSON_PROPERTY_VIOLATIONS_AT_STOP) List<Violation> violationsAtStop
  ) {
  this();
    this.reportForWayToStop = reportForWayToStop;
    this.reportForStop = reportForStop;
    this.eventsOnWayToStop = eventsOnWayToStop;
    this.eventsAtStop = eventsAtStop;
    this.violationsOnWayToStop = violationsOnWayToStop;
    this.violationsAtStop = violationsAtStop;
  }

  public Stop locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * A reference to a location. Usually, goods are picked up or delivered here. If no goods are picked up or delivered, it is the location where a route starts or ends.
   * @return locationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A reference to a location. Usually, goods are picked up or delivered here. If no goods are picked up or delivered, it is the location where a route starts or ends.")
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocationId() {
    return locationId;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  public Stop deliveryIds(List<String> deliveryIds) {
    this.deliveryIds = deliveryIds;
    return this;
  }

  public Stop addDeliveryIdsItem(String deliveryIdsItem) {
    if (this.deliveryIds == null) {
      this.deliveryIds = new ArrayList<>();
    }
    this.deliveryIds.add(deliveryIdsItem);
    return this;
  }

   /**
   * A list of transport IDs that are delivered at this stop.
   * @return deliveryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of transport IDs that are delivered at this stop.")
  @JsonProperty(JSON_PROPERTY_DELIVERY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDeliveryIds() {
    return deliveryIds;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryIds(List<String> deliveryIds) {
    this.deliveryIds = deliveryIds;
  }


  public Stop pickupIds(List<String> pickupIds) {
    this.pickupIds = pickupIds;
    return this;
  }

  public Stop addPickupIdsItem(String pickupIdsItem) {
    if (this.pickupIds == null) {
      this.pickupIds = new ArrayList<>();
    }
    this.pickupIds.add(pickupIdsItem);
    return this;
  }

   /**
   * A list of transport IDs that are picked up at this stop.
   * @return pickupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of transport IDs that are picked up at this stop.")
  @JsonProperty(JSON_PROPERTY_PICKUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPickupIds() {
    return pickupIds;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupIds(List<String> pickupIds) {
    this.pickupIds = pickupIds;
  }


   /**
   * A way report contains a summary of the values of the events on the way from the previous stop to the current stop, including the driving time. The very first stop of a route has a way report with empty values.
   * @return reportForWayToStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A way report contains a summary of the values of the events on the way from the previous stop to the current stop, including the driving time. The very first stop of a route has a way report with empty values.")
  @JsonProperty(JSON_PROPERTY_REPORT_FOR_WAY_TO_STOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WayReport getReportForWayToStop() {
    return reportForWayToStop;
  }




   /**
   * A stop report contains a summary of the values of the events at a stop, including the arrival time, the departure time and the service time. It also contains information about the loaded quantities when leaving the current stop.
   * @return reportForStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A stop report contains a summary of the values of the events at a stop, including the arrival time, the departure time and the service time. It also contains information about the loaded quantities when leaving the current stop.")
  @JsonProperty(JSON_PROPERTY_REPORT_FOR_STOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StopReport getReportForStop() {
    return reportForStop;
  }




   /**
   * A list of events that occur on the way from the previous stop to this stop. An event specifies what happens on a route at a certain point in time. It can describe the driver&#39;s activity such as driving or break.
   * @return eventsOnWayToStop
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of events that occur on the way from the previous stop to this stop. An event specifies what happens on a route at a certain point in time. It can describe the driver's activity such as driving or break.")
  @JsonProperty(JSON_PROPERTY_EVENTS_ON_WAY_TO_STOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Event> getEventsOnWayToStop() {
    return eventsOnWayToStop;
  }




   /**
   * A list of events that occur at this stop. An event specifies what happens on a route at a certain point in time. It can describe the driver&#39;s activity such as performing service or waiting, or it can denote the start/end of a route.
   * @return eventsAtStop
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of events that occur at this stop. An event specifies what happens on a route at a certain point in time. It can describe the driver's activity such as performing service or waiting, or it can denote the start/end of a route.")
  @JsonProperty(JSON_PROPERTY_EVENTS_AT_STOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Event> getEventsAtStop() {
    return eventsAtStop;
  }




   /**
   * A list of violations that occur on the way from the previous stop to this stop. The following violation types can occur here: DRIVER_AVAILABILITY, MAXIMUM_TRAVEL_TIME_OF_DRIVER, MAXIMUM_DRIVING_TIME_OF_DRIVER. For each violation, the maximum time exceedance on the way to this stop is reported.
   * @return violationsOnWayToStop
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of violations that occur on the way from the previous stop to this stop. The following violation types can occur here: DRIVER_AVAILABILITY, MAXIMUM_TRAVEL_TIME_OF_DRIVER, MAXIMUM_DRIVING_TIME_OF_DRIVER. For each violation, the maximum time exceedance on the way to this stop is reported.")
  @JsonProperty(JSON_PROPERTY_VIOLATIONS_ON_WAY_TO_STOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Violation> getViolationsOnWayToStop() {
    return violationsOnWayToStop;
  }




   /**
   * A list of violations that occur at this stop. The following violation types can occur here: DRIVER_AVAILABILITY, OPENING_INTERVAL, VEHICLE_CAPACITY, MAXIMUM_TRAVEL_TIME_OF_DRIVER. For VEHICLE_CAPACITY the violation when leaving the stop is reported (i.e., at the last stop of the route, when everything is unloaded, there will be no such violation). For all other violations, the maximum time exceedance at this stop is reported.
   * @return violationsAtStop
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of violations that occur at this stop. The following violation types can occur here: DRIVER_AVAILABILITY, OPENING_INTERVAL, VEHICLE_CAPACITY, MAXIMUM_TRAVEL_TIME_OF_DRIVER. For VEHICLE_CAPACITY the violation when leaving the stop is reported (i.e., at the last stop of the route, when everything is unloaded, there will be no such violation). For all other violations, the maximum time exceedance at this stop is reported.")
  @JsonProperty(JSON_PROPERTY_VIOLATIONS_AT_STOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Violation> getViolationsAtStop() {
    return violationsAtStop;
  }




  /**
   * Return true if this Stop object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stop stop = (Stop) o;
    return Objects.equals(this.locationId, stop.locationId) &&
        Objects.equals(this.deliveryIds, stop.deliveryIds) &&
        Objects.equals(this.pickupIds, stop.pickupIds) &&
        Objects.equals(this.reportForWayToStop, stop.reportForWayToStop) &&
        Objects.equals(this.reportForStop, stop.reportForStop) &&
        Objects.equals(this.eventsOnWayToStop, stop.eventsOnWayToStop) &&
        Objects.equals(this.eventsAtStop, stop.eventsAtStop) &&
        Objects.equals(this.violationsOnWayToStop, stop.violationsOnWayToStop) &&
        Objects.equals(this.violationsAtStop, stop.violationsAtStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, deliveryIds, pickupIds, reportForWayToStop, reportForStop, eventsOnWayToStop, eventsAtStop, violationsOnWayToStop, violationsAtStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stop {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    deliveryIds: ").append(toIndentedString(deliveryIds)).append("\n");
    sb.append("    pickupIds: ").append(toIndentedString(pickupIds)).append("\n");
    sb.append("    reportForWayToStop: ").append(toIndentedString(reportForWayToStop)).append("\n");
    sb.append("    reportForStop: ").append(toIndentedString(reportForStop)).append("\n");
    sb.append("    eventsOnWayToStop: ").append(toIndentedString(eventsOnWayToStop)).append("\n");
    sb.append("    eventsAtStop: ").append(toIndentedString(eventsAtStop)).append("\n");
    sb.append("    violationsOnWayToStop: ").append(toIndentedString(violationsOnWayToStop)).append("\n");
    sb.append("    violationsAtStop: ").append(toIndentedString(violationsAtStop)).append("\n");
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

