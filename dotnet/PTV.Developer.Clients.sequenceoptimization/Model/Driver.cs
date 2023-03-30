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
    /// The driver of the specified vehicle. The driver can only operate the vehicle within the given time interval.
    /// </summary>
    [DataContract(Name = "Driver")]
    public partial class Driver : IEquatable<Driver>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets WorkingHoursPreset
        /// </summary>
        [DataMember(Name = "workingHoursPreset", EmitDefaultValue = true)]
        public WorkingHoursPreset? WorkingHoursPreset { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Driver" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Driver() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Driver" /> class.
        /// </summary>
        /// <param name="availability">Interval during which the driver is available. The route has to start and end within this interval. All opening intervals outside of this interval are not considered. The interval is restricted to a maximum duration of twenty four hours. (required).</param>
        /// <param name="workingHoursPreset">workingHoursPreset.</param>
        /// <param name="breakRule">breakRule.</param>
        /// <param name="workLogbook">workLogbook.</param>
        /// <param name="maximumDrivingTime">The maximum driving time of the driver [s].   The maximum driving time is considered as infinite if it is not set..</param>
        /// <param name="maximumTravelTime">The maximum travel time of the driver [s]. The travel time contains all waiting, service and driving times.  The maximum travel time is considered as infinite if it is not set..</param>
        public Driver(TimeInterval availability = default(TimeInterval), WorkingHoursPreset? workingHoursPreset = default(WorkingHoursPreset?), BreakRule breakRule = default(BreakRule), WorkLogbook workLogbook = default(WorkLogbook), int? maximumDrivingTime = default(int?), int? maximumTravelTime = default(int?))
        {
            // to ensure "availability" is required (not null)
            if (availability == null) {
                throw new ArgumentNullException("availability is a required property for Driver and cannot be null");
            }
            this.Availability = availability;
            this.WorkingHoursPreset = workingHoursPreset;
            this.BreakRule = breakRule;
            this.WorkLogbook = workLogbook;
            this.MaximumDrivingTime = maximumDrivingTime;
            this.MaximumTravelTime = maximumTravelTime;
        }

        /// <summary>
        /// Interval during which the driver is available. The route has to start and end within this interval. All opening intervals outside of this interval are not considered. The interval is restricted to a maximum duration of twenty four hours.
        /// </summary>
        /// <value>Interval during which the driver is available. The route has to start and end within this interval. All opening intervals outside of this interval are not considered. The interval is restricted to a maximum duration of twenty four hours.</value>
        [DataMember(Name = "availability", IsRequired = true, EmitDefaultValue = true)]
        public TimeInterval Availability { get; set; }

        /// <summary>
        /// Gets or Sets BreakRule
        /// </summary>
        [DataMember(Name = "breakRule", EmitDefaultValue = false)]
        public BreakRule BreakRule { get; set; }

        /// <summary>
        /// Gets or Sets WorkLogbook
        /// </summary>
        [DataMember(Name = "workLogbook", EmitDefaultValue = false)]
        public WorkLogbook WorkLogbook { get; set; }

        /// <summary>
        /// The maximum driving time of the driver [s].   The maximum driving time is considered as infinite if it is not set.
        /// </summary>
        /// <value>The maximum driving time of the driver [s].   The maximum driving time is considered as infinite if it is not set.</value>
        [DataMember(Name = "maximumDrivingTime", EmitDefaultValue = true)]
        public int? MaximumDrivingTime { get; set; }

        /// <summary>
        /// The maximum travel time of the driver [s]. The travel time contains all waiting, service and driving times.  The maximum travel time is considered as infinite if it is not set.
        /// </summary>
        /// <value>The maximum travel time of the driver [s]. The travel time contains all waiting, service and driving times.  The maximum travel time is considered as infinite if it is not set.</value>
        [DataMember(Name = "maximumTravelTime", EmitDefaultValue = true)]
        public int? MaximumTravelTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Driver {\n");
            sb.Append("  Availability: ").Append(Availability).Append("\n");
            sb.Append("  WorkingHoursPreset: ").Append(WorkingHoursPreset).Append("\n");
            sb.Append("  BreakRule: ").Append(BreakRule).Append("\n");
            sb.Append("  WorkLogbook: ").Append(WorkLogbook).Append("\n");
            sb.Append("  MaximumDrivingTime: ").Append(MaximumDrivingTime).Append("\n");
            sb.Append("  MaximumTravelTime: ").Append(MaximumTravelTime).Append("\n");
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
            return this.Equals(input as Driver);
        }

        /// <summary>
        /// Returns true if Driver instances are equal
        /// </summary>
        /// <param name="input">Instance of Driver to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Driver input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Availability == input.Availability ||
                    (this.Availability != null &&
                    this.Availability.Equals(input.Availability))
                ) && 
                (
                    this.WorkingHoursPreset == input.WorkingHoursPreset ||
                    this.WorkingHoursPreset.Equals(input.WorkingHoursPreset)
                ) && 
                (
                    this.BreakRule == input.BreakRule ||
                    (this.BreakRule != null &&
                    this.BreakRule.Equals(input.BreakRule))
                ) && 
                (
                    this.WorkLogbook == input.WorkLogbook ||
                    (this.WorkLogbook != null &&
                    this.WorkLogbook.Equals(input.WorkLogbook))
                ) && 
                (
                    this.MaximumDrivingTime == input.MaximumDrivingTime ||
                    (this.MaximumDrivingTime != null &&
                    this.MaximumDrivingTime.Equals(input.MaximumDrivingTime))
                ) && 
                (
                    this.MaximumTravelTime == input.MaximumTravelTime ||
                    (this.MaximumTravelTime != null &&
                    this.MaximumTravelTime.Equals(input.MaximumTravelTime))
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
                if (this.Availability != null)
                {
                    hashCode = (hashCode * 59) + this.Availability.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.WorkingHoursPreset.GetHashCode();
                if (this.BreakRule != null)
                {
                    hashCode = (hashCode * 59) + this.BreakRule.GetHashCode();
                }
                if (this.WorkLogbook != null)
                {
                    hashCode = (hashCode * 59) + this.WorkLogbook.GetHashCode();
                }
                if (this.MaximumDrivingTime != null)
                {
                    hashCode = (hashCode * 59) + this.MaximumDrivingTime.GetHashCode();
                }
                if (this.MaximumTravelTime != null)
                {
                    hashCode = (hashCode * 59) + this.MaximumTravelTime.GetHashCode();
                }
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
            // MaximumDrivingTime (int?) minimum
            if (this.MaximumDrivingTime < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MaximumDrivingTime, must be a value greater than or equal to 1.", new [] { "MaximumDrivingTime" });
            }

            // MaximumTravelTime (int?) minimum
            if (this.MaximumTravelTime < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MaximumTravelTime, must be a value greater than or equal to 1.", new [] { "MaximumTravelTime" });
            }

            yield break;
        }
    }

}
