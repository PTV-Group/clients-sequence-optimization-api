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
import com.ptvgroup.developer.client.sequenceoptimization.model.EventType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An event specifies what happens on a route at a certain point in time. It can describe the driver&#39;s activity such as driving or performing service, or it can denote the start/end of a route.
 */
@ApiModel(description = "An event specifies what happens on a route at a certain point in time. It can describe the driver's activity such as driving or performing service, or it can denote the start/end of a route.")
@JsonPropertyOrder({
  Event.JSON_PROPERTY_TYPE,
  Event.JSON_PROPERTY_START_TIME,
  Event.JSON_PROPERTY_DURATION,
  Event.JSON_PROPERTY_TRANSPORT_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T09:26:08.496004Z[Etc/UTC]")
public class Event {
  public static final String JSON_PROPERTY_TYPE = "type";
  private EventType type;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_TRANSPORT_ID = "transportId";
  private String transportId;

  public Event() { 
  }

  public Event type(EventType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(EventType type) {
    this.type = type;
  }


  public Event startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time of the event according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
   * @return startTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The start time of the event according to [RFC 3339](https://tools.ietf.org/html/rfc3339).")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public Event duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the event [s]. The duration may be 0.
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The duration of the event [s]. The duration may be 0.")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public Event transportId(String transportId) {
    this.transportId = transportId;
    return this;
  }

   /**
   * The ID of the corresponding transport if the event is a service event. Otherwise the ID is null.
   * @return transportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the corresponding transport if the event is a service event. Otherwise the ID is null.")
  @JsonProperty(JSON_PROPERTY_TRANSPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransportId() {
    return transportId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportId(String transportId) {
    this.transportId = transportId;
  }


  /**
   * Return true if this Event object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.type, event.type) &&
        Objects.equals(this.startTime, event.startTime) &&
        Objects.equals(this.duration, event.duration) &&
        Objects.equals(this.transportId, event.transportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startTime, duration, transportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    transportId: ").append(toIndentedString(transportId)).append("\n");
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

