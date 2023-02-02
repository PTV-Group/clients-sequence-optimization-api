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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines when a break becomes necessary and how long it should be. See [here](./concepts/drivers-working-hours) for more information.
 */
@ApiModel(description = "Defines when a break becomes necessary and how long it should be. See [here](./concepts/drivers-working-hours) for more information.")
@JsonPropertyOrder({
  BreakRule.JSON_PROPERTY_BREAK_TIME,
  BreakRule.JSON_PROPERTY_MAXIMUM_DRIVING_TIME_BETWEEN_BREAKS,
  BreakRule.JSON_PROPERTY_MAXIMUM_WORKING_TIME_BETWEEN_BREAKS,
  BreakRule.JSON_PROPERTY_WORKING_TIME_THRESHOLD
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T08:09:27.762325Z[Etc/UTC]")
public class BreakRule {
  public static final String JSON_PROPERTY_BREAK_TIME = "breakTime";
  private Integer breakTime;

  public static final String JSON_PROPERTY_MAXIMUM_DRIVING_TIME_BETWEEN_BREAKS = "maximumDrivingTimeBetweenBreaks";
  private JsonNullable<Integer> maximumDrivingTimeBetweenBreaks = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_MAXIMUM_WORKING_TIME_BETWEEN_BREAKS = "maximumWorkingTimeBetweenBreaks";
  private JsonNullable<Integer> maximumWorkingTimeBetweenBreaks = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_WORKING_TIME_THRESHOLD = "workingTimeThreshold";
  private Integer workingTimeThreshold = 0;

  public BreakRule() { 
  }

  public BreakRule breakTime(Integer breakTime) {
    this.breakTime = breakTime;
    return this;
  }

   /**
   * The minimum duration of a break [s]. Minimum is 15 minutes, maximum is 1 hour 30 minutes.
   * minimum: 900
   * maximum: 5400
   * @return breakTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The minimum duration of a break [s]. Minimum is 15 minutes, maximum is 1 hour 30 minutes.")
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


  public BreakRule maximumDrivingTimeBetweenBreaks(Integer maximumDrivingTimeBetweenBreaks) {
    this.maximumDrivingTimeBetweenBreaks = JsonNullable.<Integer>of(maximumDrivingTimeBetweenBreaks);
    return this;
  }

   /**
   * Maximum duration that the driver is allowed to drive [s] before taking a break. The maximum driving time is considered as infinite if it is not set.
   * minimum: 3600
   * @return maximumDrivingTimeBetweenBreaks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum duration that the driver is allowed to drive [s] before taking a break. The maximum driving time is considered as infinite if it is not set.")
  @JsonIgnore

  public Integer getMaximumDrivingTimeBetweenBreaks() {
        return maximumDrivingTimeBetweenBreaks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAXIMUM_DRIVING_TIME_BETWEEN_BREAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMaximumDrivingTimeBetweenBreaks_JsonNullable() {
    return maximumDrivingTimeBetweenBreaks;
  }
  
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DRIVING_TIME_BETWEEN_BREAKS)
  public void setMaximumDrivingTimeBetweenBreaks_JsonNullable(JsonNullable<Integer> maximumDrivingTimeBetweenBreaks) {
    this.maximumDrivingTimeBetweenBreaks = maximumDrivingTimeBetweenBreaks;
  }

  public void setMaximumDrivingTimeBetweenBreaks(Integer maximumDrivingTimeBetweenBreaks) {
    this.maximumDrivingTimeBetweenBreaks = JsonNullable.<Integer>of(maximumDrivingTimeBetweenBreaks);
  }


  public BreakRule maximumWorkingTimeBetweenBreaks(Integer maximumWorkingTimeBetweenBreaks) {
    this.maximumWorkingTimeBetweenBreaks = JsonNullable.<Integer>of(maximumWorkingTimeBetweenBreaks);
    return this;
  }

   /**
   * Maximum duration that the driver is allowed to work [s] before taking a break. The maximum working time is considered as infinite if it is not set.
   * minimum: 3600
   * @return maximumWorkingTimeBetweenBreaks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum duration that the driver is allowed to work [s] before taking a break. The maximum working time is considered as infinite if it is not set.")
  @JsonIgnore

  public Integer getMaximumWorkingTimeBetweenBreaks() {
        return maximumWorkingTimeBetweenBreaks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAXIMUM_WORKING_TIME_BETWEEN_BREAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMaximumWorkingTimeBetweenBreaks_JsonNullable() {
    return maximumWorkingTimeBetweenBreaks;
  }
  
  @JsonProperty(JSON_PROPERTY_MAXIMUM_WORKING_TIME_BETWEEN_BREAKS)
  public void setMaximumWorkingTimeBetweenBreaks_JsonNullable(JsonNullable<Integer> maximumWorkingTimeBetweenBreaks) {
    this.maximumWorkingTimeBetweenBreaks = maximumWorkingTimeBetweenBreaks;
  }

  public void setMaximumWorkingTimeBetweenBreaks(Integer maximumWorkingTimeBetweenBreaks) {
    this.maximumWorkingTimeBetweenBreaks = JsonNullable.<Integer>of(maximumWorkingTimeBetweenBreaks);
  }


  public BreakRule workingTimeThreshold(Integer workingTimeThreshold) {
    this.workingTimeThreshold = workingTimeThreshold;
    return this;
  }

   /**
   * Idle time of the driver counts as working time if it is shorter than this value [s]. May not be higher than **breakTime**.
   * minimum: 0
   * @return workingTimeThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Idle time of the driver counts as working time if it is shorter than this value [s]. May not be higher than **breakTime**.")
  @JsonProperty(JSON_PROPERTY_WORKING_TIME_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWorkingTimeThreshold() {
    return workingTimeThreshold;
  }


  @JsonProperty(JSON_PROPERTY_WORKING_TIME_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkingTimeThreshold(Integer workingTimeThreshold) {
    this.workingTimeThreshold = workingTimeThreshold;
  }


  /**
   * Return true if this BreakRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreakRule breakRule = (BreakRule) o;
    return Objects.equals(this.breakTime, breakRule.breakTime) &&
        equalsNullable(this.maximumDrivingTimeBetweenBreaks, breakRule.maximumDrivingTimeBetweenBreaks) &&
        equalsNullable(this.maximumWorkingTimeBetweenBreaks, breakRule.maximumWorkingTimeBetweenBreaks) &&
        Objects.equals(this.workingTimeThreshold, breakRule.workingTimeThreshold);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakTime, hashCodeNullable(maximumDrivingTimeBetweenBreaks), hashCodeNullable(maximumWorkingTimeBetweenBreaks), workingTimeThreshold);
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
    sb.append("class BreakRule {\n");
    sb.append("    breakTime: ").append(toIndentedString(breakTime)).append("\n");
    sb.append("    maximumDrivingTimeBetweenBreaks: ").append(toIndentedString(maximumDrivingTimeBetweenBreaks)).append("\n");
    sb.append("    maximumWorkingTimeBetweenBreaks: ").append(toIndentedString(maximumWorkingTimeBetweenBreaks)).append("\n");
    sb.append("    workingTimeThreshold: ").append(toIndentedString(workingTimeThreshold)).append("\n");
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

