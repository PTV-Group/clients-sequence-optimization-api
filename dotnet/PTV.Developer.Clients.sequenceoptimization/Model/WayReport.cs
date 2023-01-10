/*
 * Sequence Optimization
 *
 * With the Sequence Optimization service you can find the best route for your transports.
 *
 * The version of the OpenAPI document: 1.5
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
    /// A way report contains a summary of the values of the events on the way from the previous stop to the current stop, including the driving time. The very first stop of a route has a way report with empty values.
    /// </summary>
    [DataContract(Name = "WayReport")]
    public partial class WayReport : IEquatable<WayReport>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WayReport" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WayReport() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WayReport" /> class.
        /// </summary>
        /// <param name="distance">The driving distance from the previous stop to this stop [m]. (required).</param>
        /// <param name="drivingTime">The driving time from the previous stop to this stop [s]. (required).</param>
        /// <param name="breakTime">The sum of break times between the departure from the previous stop and the arrival at this stop [s]. (required).</param>
        public WayReport(int distance = default(int), int drivingTime = default(int), int breakTime = default(int))
        {
            this.Distance = distance;
            this.DrivingTime = drivingTime;
            this.BreakTime = breakTime;
        }

        /// <summary>
        /// The driving distance from the previous stop to this stop [m].
        /// </summary>
        /// <value>The driving distance from the previous stop to this stop [m].</value>
        [DataMember(Name = "distance", IsRequired = true, EmitDefaultValue = false)]
        public int Distance { get; set; }

        /// <summary>
        /// The driving time from the previous stop to this stop [s].
        /// </summary>
        /// <value>The driving time from the previous stop to this stop [s].</value>
        [DataMember(Name = "drivingTime", IsRequired = true, EmitDefaultValue = false)]
        public int DrivingTime { get; set; }

        /// <summary>
        /// The sum of break times between the departure from the previous stop and the arrival at this stop [s].
        /// </summary>
        /// <value>The sum of break times between the departure from the previous stop and the arrival at this stop [s].</value>
        [DataMember(Name = "breakTime", IsRequired = true, EmitDefaultValue = false)]
        public int BreakTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class WayReport {\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  DrivingTime: ").Append(DrivingTime).Append("\n");
            sb.Append("  BreakTime: ").Append(BreakTime).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as WayReport);
        }

        /// <summary>
        /// Returns true if WayReport instances are equal
        /// </summary>
        /// <param name="input">Instance of WayReport to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WayReport input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Distance == input.Distance ||
                    this.Distance.Equals(input.Distance)
                ) && 
                (
                    this.DrivingTime == input.DrivingTime ||
                    this.DrivingTime.Equals(input.DrivingTime)
                ) && 
                (
                    this.BreakTime == input.BreakTime ||
                    this.BreakTime.Equals(input.BreakTime)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.Distance.GetHashCode();
                hashCode = (hashCode * 59) + this.DrivingTime.GetHashCode();
                hashCode = (hashCode * 59) + this.BreakTime.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
