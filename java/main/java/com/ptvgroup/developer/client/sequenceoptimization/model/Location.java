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
import com.ptvgroup.developer.client.sequenceoptimization.model.CustomerLocationAttributes;
import com.ptvgroup.developer.client.sequenceoptimization.model.DepotLocationAttributes;
import com.ptvgroup.developer.client.sequenceoptimization.model.LocationType;
import com.ptvgroup.developer.client.sequenceoptimization.model.TimeInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A specific location where goods have to be picked up or delivered, or where the vehicle is located. A location is either a depot location or a customer location. Depot locations may be found at start or end of **route-stops**.  See [here](./Concepts/Locations,%20Transports%20and%20Stops.htm) for more information.
 */
@ApiModel(description = "A specific location where goods have to be picked up or delivered, or where the vehicle is located. A location is either a depot location or a customer location. Depot locations may be found at start or end of **route-stops**.  See [here](./Concepts/Locations,%20Transports%20and%20Stops.htm) for more information.")
@JsonPropertyOrder({
  Location.JSON_PROPERTY_ID,
  Location.JSON_PROPERTY_TYPE,
  Location.JSON_PROPERTY_LATITUDE,
  Location.JSON_PROPERTY_LONGITUDE,
  Location.JSON_PROPERTY_OPENING_INTERVALS,
  Location.JSON_PROPERTY_CUSTOMER_LOCATION_ATTRIBUTES,
  Location.JSON_PROPERTY_DEPOT_LOCATION_ATTRIBUTES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T14:00:36.487937Z[Etc/UTC]")
public class Location {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LocationType type = LocationType.CUSTOMER;

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_OPENING_INTERVALS = "openingIntervals";
  private List<TimeInterval> openingIntervals = null;

  public static final String JSON_PROPERTY_CUSTOMER_LOCATION_ATTRIBUTES = "customerLocationAttributes";
  private CustomerLocationAttributes customerLocationAttributes;

  public static final String JSON_PROPERTY_DEPOT_LOCATION_ATTRIBUTES = "depotLocationAttributes";
  private DepotLocationAttributes depotLocationAttributes;

  public Location() { 
  }

  public Location id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for this location. This ID can be used to reference the location from other elements, for example from transports or the vehicle. For multiple identical requests the optimized route will always be the same. But please be aware that different IDs can lead to different results.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique ID for this location. This ID can be used to reference the location from other elements, for example from transports or the vehicle. For multiple identical requests the optimized route will always be the same. But please be aware that different IDs can lead to different results.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public Location type(LocationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocationType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(LocationType type) {
    this.type = type;
  }


  public Location latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north.")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public Location longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east.")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public Location openingIntervals(List<TimeInterval> openingIntervals) {
    this.openingIntervals = openingIntervals;
    return this;
  }

  public Location addOpeningIntervalsItem(TimeInterval openingIntervalsItem) {
    if (this.openingIntervals == null) {
      this.openingIntervals = new ArrayList<>();
    }
    this.openingIntervals.add(openingIntervalsItem);
    return this;
  }

   /**
   * The opening intervals at this location. Leaving this parameter empty means that the location is always open. Service (pickup or delivery) can only start within one of the opening intervals. All opening intervals outside of driver availability interval are not considered during the optimization process.
   * @return openingIntervals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The opening intervals at this location. Leaving this parameter empty means that the location is always open. Service (pickup or delivery) can only start within one of the opening intervals. All opening intervals outside of driver availability interval are not considered during the optimization process.")
  @JsonProperty(JSON_PROPERTY_OPENING_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TimeInterval> getOpeningIntervals() {
    return openingIntervals;
  }


  @JsonProperty(JSON_PROPERTY_OPENING_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpeningIntervals(List<TimeInterval> openingIntervals) {
    this.openingIntervals = openingIntervals;
  }


  public Location customerLocationAttributes(CustomerLocationAttributes customerLocationAttributes) {
    this.customerLocationAttributes = customerLocationAttributes;
    return this;
  }

   /**
   * Get customerLocationAttributes
   * @return customerLocationAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_LOCATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerLocationAttributes getCustomerLocationAttributes() {
    return customerLocationAttributes;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_LOCATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerLocationAttributes(CustomerLocationAttributes customerLocationAttributes) {
    this.customerLocationAttributes = customerLocationAttributes;
  }


  public Location depotLocationAttributes(DepotLocationAttributes depotLocationAttributes) {
    this.depotLocationAttributes = depotLocationAttributes;
    return this;
  }

   /**
   * Get depotLocationAttributes
   * @return depotLocationAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPOT_LOCATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepotLocationAttributes getDepotLocationAttributes() {
    return depotLocationAttributes;
  }


  @JsonProperty(JSON_PROPERTY_DEPOT_LOCATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepotLocationAttributes(DepotLocationAttributes depotLocationAttributes) {
    this.depotLocationAttributes = depotLocationAttributes;
  }


  /**
   * Return true if this Location object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.type, location.type) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.longitude, location.longitude) &&
        Objects.equals(this.openingIntervals, location.openingIntervals) &&
        Objects.equals(this.customerLocationAttributes, location.customerLocationAttributes) &&
        Objects.equals(this.depotLocationAttributes, location.depotLocationAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, latitude, longitude, openingIntervals, customerLocationAttributes, depotLocationAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    openingIntervals: ").append(toIndentedString(openingIntervals)).append("\n");
    sb.append("    customerLocationAttributes: ").append(toIndentedString(customerLocationAttributes)).append("\n");
    sb.append("    depotLocationAttributes: ").append(toIndentedString(depotLocationAttributes)).append("\n");
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

