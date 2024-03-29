/*
 * Sequence Optimization
 *
 * With the Sequence Optimization service you can find the best route for your transports.
 *
 * The version of the OpenAPI document: 1.7
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.sequenceoptimization.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.sequenceoptimization.Model
{
    /// <summary>
    /// Specifies the type of violation.  * &#x60;DRIVER_AVAILABILITY&#x60; - The driver availability is violated.  * &#x60;ROUTE_START_INTERVAL&#x60; - The route start interval is violated.   * &#x60;OPENING_INTERVAL&#x60; - The opening intervals of the location are violated.  * &#x60;MAXIMUM_TRAVEL_TIME_OF_DRIVER&#x60; - Indicates a violation of the maximum allowed travel time of driver as specified by the drivers&#39; working hours restriction.  * &#x60;MAXIMUM_DRIVING_TIME_OF_DRIVER&#x60; - Indicates a violation of the maximum allowed driving time of driver as specified by the drivers&#39; working hours restriction.  * &#x60;MAXIMUM_DISTANCE&#x60; - Indicates a violation of the maximum allowed driving distance as specified at the vehicle.   * &#x60;MAXIMUM_NUMBER_OF_CUSTOMER_STOPS&#x60; - Indicates a violation of the maximum allowed number of customer stops as specified at the vehicle.   * &#x60;VEHICLE_CAPACITY&#x60; - At least one of the vehicle capacities is violated.  * &#x60;STOP_POSITION&#x60; - Indicates a violation of the position of a stop.  * &#x60;ROUTE_SECTION&#x60; - Indicates a violation of the route section numbers of a customer stop.
    /// </summary>
    /// <value>Specifies the type of violation.  * &#x60;DRIVER_AVAILABILITY&#x60; - The driver availability is violated.  * &#x60;ROUTE_START_INTERVAL&#x60; - The route start interval is violated.   * &#x60;OPENING_INTERVAL&#x60; - The opening intervals of the location are violated.  * &#x60;MAXIMUM_TRAVEL_TIME_OF_DRIVER&#x60; - Indicates a violation of the maximum allowed travel time of driver as specified by the drivers&#39; working hours restriction.  * &#x60;MAXIMUM_DRIVING_TIME_OF_DRIVER&#x60; - Indicates a violation of the maximum allowed driving time of driver as specified by the drivers&#39; working hours restriction.  * &#x60;MAXIMUM_DISTANCE&#x60; - Indicates a violation of the maximum allowed driving distance as specified at the vehicle.   * &#x60;MAXIMUM_NUMBER_OF_CUSTOMER_STOPS&#x60; - Indicates a violation of the maximum allowed number of customer stops as specified at the vehicle.   * &#x60;VEHICLE_CAPACITY&#x60; - At least one of the vehicle capacities is violated.  * &#x60;STOP_POSITION&#x60; - Indicates a violation of the position of a stop.  * &#x60;ROUTE_SECTION&#x60; - Indicates a violation of the route section numbers of a customer stop.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ViolationType
    {
        /// <summary>
        /// Enum DRIVER_AVAILABILITY for value: DRIVER_AVAILABILITY
        /// </summary>
        [EnumMember(Value = "DRIVER_AVAILABILITY")]
        DRIVER_AVAILABILITY = 1,

        /// <summary>
        /// Enum ROUTE_START_INTERVAL for value: ROUTE_START_INTERVAL
        /// </summary>
        [EnumMember(Value = "ROUTE_START_INTERVAL")]
        ROUTE_START_INTERVAL = 2,

        /// <summary>
        /// Enum OPENING_INTERVAL for value: OPENING_INTERVAL
        /// </summary>
        [EnumMember(Value = "OPENING_INTERVAL")]
        OPENING_INTERVAL = 3,

        /// <summary>
        /// Enum MAXIMUM_TRAVEL_TIME_OF_DRIVER for value: MAXIMUM_TRAVEL_TIME_OF_DRIVER
        /// </summary>
        [EnumMember(Value = "MAXIMUM_TRAVEL_TIME_OF_DRIVER")]
        MAXIMUM_TRAVEL_TIME_OF_DRIVER = 4,

        /// <summary>
        /// Enum MAXIMUM_DRIVING_TIME_OF_DRIVER for value: MAXIMUM_DRIVING_TIME_OF_DRIVER
        /// </summary>
        [EnumMember(Value = "MAXIMUM_DRIVING_TIME_OF_DRIVER")]
        MAXIMUM_DRIVING_TIME_OF_DRIVER = 5,

        /// <summary>
        /// Enum MAXIMUM_DISTANCE for value: MAXIMUM_DISTANCE
        /// </summary>
        [EnumMember(Value = "MAXIMUM_DISTANCE")]
        MAXIMUM_DISTANCE = 6,

        /// <summary>
        /// Enum VEHICLE_CAPACITY for value: VEHICLE_CAPACITY
        /// </summary>
        [EnumMember(Value = "VEHICLE_CAPACITY")]
        VEHICLE_CAPACITY = 7,

        /// <summary>
        /// Enum STOP_POSITION for value: STOP_POSITION
        /// </summary>
        [EnumMember(Value = "STOP_POSITION")]
        STOP_POSITION = 8,

        /// <summary>
        /// Enum ROUTE_SECTION for value: ROUTE_SECTION
        /// </summary>
        [EnumMember(Value = "ROUTE_SECTION")]
        ROUTE_SECTION = 9

    }

}
