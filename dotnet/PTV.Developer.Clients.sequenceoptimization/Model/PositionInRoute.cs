/*
 * Sequence Optimization
 *
 * With the Sequence Optimization service you can find the best route for your transports.
 *
 * The version of the OpenAPI document: 1.6
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
    /// If specified, this stop has to be the very first/last customer stop in the route whenever there is a stop at this location. There can only be one stop at a customer location with a position in route of type FIRST_CUSTOMER_STOP/LAST_CUSTOMER_STOP.   If specified, routeSectionNumber must not be set for the same location.   * &#x60;FIRST_CUSTOMER_STOP&#x60; - A stop at a customer location with this position type has to be the very first customer stop in the route.  * &#x60;LAST_CUSTOMER_STOP&#x60; - A stop at a customer location with this position type has to be the very last customer stop in the route.  See [here](./concepts/route-sections-and-position-route) for more information.
    /// </summary>
    /// <value>If specified, this stop has to be the very first/last customer stop in the route whenever there is a stop at this location. There can only be one stop at a customer location with a position in route of type FIRST_CUSTOMER_STOP/LAST_CUSTOMER_STOP.   If specified, routeSectionNumber must not be set for the same location.   * &#x60;FIRST_CUSTOMER_STOP&#x60; - A stop at a customer location with this position type has to be the very first customer stop in the route.  * &#x60;LAST_CUSTOMER_STOP&#x60; - A stop at a customer location with this position type has to be the very last customer stop in the route.  See [here](./concepts/route-sections-and-position-route) for more information.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum PositionInRoute
    {
        /// <summary>
        /// Enum FIRST_CUSTOMER_STOP for value: FIRST_CUSTOMER_STOP
        /// </summary>
        [EnumMember(Value = "FIRST_CUSTOMER_STOP")]
        FIRST_CUSTOMER_STOP = 1,

        /// <summary>
        /// Enum LAST_CUSTOMER_STOP for value: LAST_CUSTOMER_STOP
        /// </summary>
        [EnumMember(Value = "LAST_CUSTOMER_STOP")]
        LAST_CUSTOMER_STOP = 2

    }

}
