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
    /// Indicates if and how the sequence of stops that is already part of the input route, should be retained. Will be ignored, if there are no stops in input route.  * &#x60;ANY&#x60; - Sequence of stops already in input route can be modified arbitrarily in order to obtain an optimal route.  * &#x60;RELATIVE&#x60; - Relative sequence of stops as given in input route should be retained.
    /// </summary>
    /// <value>Indicates if and how the sequence of stops that is already part of the input route, should be retained. Will be ignored, if there are no stops in input route.  * &#x60;ANY&#x60; - Sequence of stops already in input route can be modified arbitrarily in order to obtain an optimal route.  * &#x60;RELATIVE&#x60; - Relative sequence of stops as given in input route should be retained.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum StopsSequence
    {
        /// <summary>
        /// Enum ANY for value: ANY
        /// </summary>
        [EnumMember(Value = "ANY")]
        ANY = 1,

        /// <summary>
        /// Enum RELATIVE for value: RELATIVE
        /// </summary>
        [EnumMember(Value = "RELATIVE")]
        RELATIVE = 2

    }

}
