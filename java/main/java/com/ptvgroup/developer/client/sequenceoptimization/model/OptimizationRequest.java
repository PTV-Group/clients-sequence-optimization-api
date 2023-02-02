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
import com.ptvgroup.developer.client.sequenceoptimization.model.Driver;
import com.ptvgroup.developer.client.sequenceoptimization.model.Location;
import com.ptvgroup.developer.client.sequenceoptimization.model.Restrictions;
import com.ptvgroup.developer.client.sequenceoptimization.model.Stop;
import com.ptvgroup.developer.client.sequenceoptimization.model.Transport;
import com.ptvgroup.developer.client.sequenceoptimization.model.Vehicle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An input object for the service method &#39;startAndCreateOptimizedRoute&#39;.
 */
@ApiModel(description = "An input object for the service method 'startAndCreateOptimizedRoute'.")
@JsonPropertyOrder({
  OptimizationRequest.JSON_PROPERTY_LOCATIONS,
  OptimizationRequest.JSON_PROPERTY_VEHICLE,
  OptimizationRequest.JSON_PROPERTY_DRIVER,
  OptimizationRequest.JSON_PROPERTY_TRANSPORTS,
  OptimizationRequest.JSON_PROPERTY_ROUTE,
  OptimizationRequest.JSON_PROPERTY_RESTRICTIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T08:22:26.165041Z[Etc/UTC]")
public class OptimizationRequest {
  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<Location> locations = new ArrayList<>();

  public static final String JSON_PROPERTY_VEHICLE = "vehicle";
  private Vehicle vehicle;

  public static final String JSON_PROPERTY_DRIVER = "driver";
  private Driver driver;

  public static final String JSON_PROPERTY_TRANSPORTS = "transports";
  private List<Transport> transports = new ArrayList<>();

  public static final String JSON_PROPERTY_ROUTE = "route";
  private List<Stop> route = null;

  public static final String JSON_PROPERTY_RESTRICTIONS = "restrictions";
  private Restrictions restrictions;

  public OptimizationRequest() { 
  }

  public OptimizationRequest locations(List<Location> locations) {
    this.locations = locations;
    return this;
  }

  public OptimizationRequest addLocationsItem(Location locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * The list of depot or customer locations that may be referenced by the vehicle, transports and stops. A location is a place where goods have to be picked up or delivered, or where the vehicle is located. A location is either a depot location or a customer location. Depot locations may be found at start or end of **route-stops**. Each location must be referenced by another object. If a request contains a location not referenced by any other object, the request will be rejected.
   * @return locations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of depot or customer locations that may be referenced by the vehicle, transports and stops. A location is a place where goods have to be picked up or delivered, or where the vehicle is located. A location is either a depot location or a customer location. Depot locations may be found at start or end of **route-stops**. Each location must be referenced by another object. If a request contains a location not referenced by any other object, the request will be rejected.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Location> getLocations() {
    return locations;
  }


  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }


  public OptimizationRequest vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Vehicle getVehicle() {
    return vehicle;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }


  public OptimizationRequest driver(Driver driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Driver getDriver() {
    return driver;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDriver(Driver driver) {
    this.driver = driver;
  }


  public OptimizationRequest transports(List<Transport> transports) {
    this.transports = transports;
    return this;
  }

  public OptimizationRequest addTransportsItem(Transport transportsItem) {
    this.transports.add(transportsItem);
    return this;
  }

   /**
   * The list of transports, that is, orders to transport goods from one location to another location. Depending on your subscription, a more restrictive value for maximum number of transport may apply. Check request limits of your subscription.
   * @return transports
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of transports, that is, orders to transport goods from one location to another location. Depending on your subscription, a more restrictive value for maximum number of transport may apply. Check request limits of your subscription.")
  @JsonProperty(JSON_PROPERTY_TRANSPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Transport> getTransports() {
    return transports;
  }


  @JsonProperty(JSON_PROPERTY_TRANSPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransports(List<Transport> transports) {
    this.transports = transports;
  }


  public OptimizationRequest route(List<Stop> route) {
    this.route = route;
    return this;
  }

  public OptimizationRequest addRouteItem(Stop routeItem) {
    if (this.route == null) {
      this.route = new ArrayList<>();
    }
    this.route.add(routeItem);
    return this;
  }

   /**
   * The route containing a sequence of stops. It specifies where and in which order goods are to be picked up or delivered. Each stop is at a specific location, either a customer location or a depot location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. The sequence of pickups and deliveries is always sorted by Last In - First Out (LIFO). At a depot location a stop groups either pickups or deliveries. A (partial) route already containing the corresponding stops at depot and/or customer locations can be input here. If stops are specified, the **Restrictions** should be set accordingly.
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The route containing a sequence of stops. It specifies where and in which order goods are to be picked up or delivered. Each stop is at a specific location, either a customer location or a depot location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. The sequence of pickups and deliveries is always sorted by Last In - First Out (LIFO). At a depot location a stop groups either pickups or deliveries. A (partial) route already containing the corresponding stops at depot and/or customer locations can be input here. If stops are specified, the **Restrictions** should be set accordingly.")
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


  public OptimizationRequest restrictions(Restrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Get restrictions
   * @return restrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Restrictions getRestrictions() {
    return restrictions;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrictions(Restrictions restrictions) {
    this.restrictions = restrictions;
  }


  /**
   * Return true if this OptimizationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizationRequest optimizationRequest = (OptimizationRequest) o;
    return Objects.equals(this.locations, optimizationRequest.locations) &&
        Objects.equals(this.vehicle, optimizationRequest.vehicle) &&
        Objects.equals(this.driver, optimizationRequest.driver) &&
        Objects.equals(this.transports, optimizationRequest.transports) &&
        Objects.equals(this.route, optimizationRequest.route) &&
        Objects.equals(this.restrictions, optimizationRequest.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations, vehicle, driver, transports, route, restrictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationRequest {\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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

