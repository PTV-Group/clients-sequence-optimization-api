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
    /// Defines when a break becomes necessary and how long it should be. See [here](./concepts/drivers-working-hours) for more information.
    /// </summary>
    [DataContract(Name = "BreakRule")]
    public partial class BreakRule : IEquatable<BreakRule>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BreakRule" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BreakRule() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BreakRule" /> class.
        /// </summary>
        /// <param name="breakTime">The minimum duration of a break [s]. Minimum is 15 minutes, maximum is 1 hour 30 minutes. (required).</param>
        /// <param name="maximumDrivingTimeBetweenBreaks">Maximum duration that the driver is allowed to drive [s] before taking a break. The maximum driving time is considered as infinite if it is not set..</param>
        /// <param name="maximumWorkingTimeBetweenBreaks">Maximum duration that the driver is allowed to work [s] before taking a break. The maximum working time is considered as infinite if it is not set..</param>
        /// <param name="workingTimeThreshold">Idle time of the driver counts as working time if it is shorter than this value [s]. May not be higher than **breakTime**. (default to 0).</param>
        public BreakRule(int breakTime = default(int), int? maximumDrivingTimeBetweenBreaks = default(int?), int? maximumWorkingTimeBetweenBreaks = default(int?), int workingTimeThreshold = 0)
        {
            this.BreakTime = breakTime;
            this.MaximumDrivingTimeBetweenBreaks = maximumDrivingTimeBetweenBreaks;
            this.MaximumWorkingTimeBetweenBreaks = maximumWorkingTimeBetweenBreaks;
            this.WorkingTimeThreshold = workingTimeThreshold;
        }

        /// <summary>
        /// The minimum duration of a break [s]. Minimum is 15 minutes, maximum is 1 hour 30 minutes.
        /// </summary>
        /// <value>The minimum duration of a break [s]. Minimum is 15 minutes, maximum is 1 hour 30 minutes.</value>
        [DataMember(Name = "breakTime", IsRequired = true, EmitDefaultValue = false)]
        public int BreakTime { get; set; }

        /// <summary>
        /// Maximum duration that the driver is allowed to drive [s] before taking a break. The maximum driving time is considered as infinite if it is not set.
        /// </summary>
        /// <value>Maximum duration that the driver is allowed to drive [s] before taking a break. The maximum driving time is considered as infinite if it is not set.</value>
        [DataMember(Name = "maximumDrivingTimeBetweenBreaks", EmitDefaultValue = true)]
        public int? MaximumDrivingTimeBetweenBreaks { get; set; }

        /// <summary>
        /// Maximum duration that the driver is allowed to work [s] before taking a break. The maximum working time is considered as infinite if it is not set.
        /// </summary>
        /// <value>Maximum duration that the driver is allowed to work [s] before taking a break. The maximum working time is considered as infinite if it is not set.</value>
        [DataMember(Name = "maximumWorkingTimeBetweenBreaks", EmitDefaultValue = true)]
        public int? MaximumWorkingTimeBetweenBreaks { get; set; }

        /// <summary>
        /// Idle time of the driver counts as working time if it is shorter than this value [s]. May not be higher than **breakTime**.
        /// </summary>
        /// <value>Idle time of the driver counts as working time if it is shorter than this value [s]. May not be higher than **breakTime**.</value>
        [DataMember(Name = "workingTimeThreshold", EmitDefaultValue = false)]
        public int WorkingTimeThreshold { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BreakRule {\n");
            sb.Append("  BreakTime: ").Append(BreakTime).Append("\n");
            sb.Append("  MaximumDrivingTimeBetweenBreaks: ").Append(MaximumDrivingTimeBetweenBreaks).Append("\n");
            sb.Append("  MaximumWorkingTimeBetweenBreaks: ").Append(MaximumWorkingTimeBetweenBreaks).Append("\n");
            sb.Append("  WorkingTimeThreshold: ").Append(WorkingTimeThreshold).Append("\n");
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
            return this.Equals(input as BreakRule);
        }

        /// <summary>
        /// Returns true if BreakRule instances are equal
        /// </summary>
        /// <param name="input">Instance of BreakRule to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BreakRule input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BreakTime == input.BreakTime ||
                    this.BreakTime.Equals(input.BreakTime)
                ) && 
                (
                    this.MaximumDrivingTimeBetweenBreaks == input.MaximumDrivingTimeBetweenBreaks ||
                    (this.MaximumDrivingTimeBetweenBreaks != null &&
                    this.MaximumDrivingTimeBetweenBreaks.Equals(input.MaximumDrivingTimeBetweenBreaks))
                ) && 
                (
                    this.MaximumWorkingTimeBetweenBreaks == input.MaximumWorkingTimeBetweenBreaks ||
                    (this.MaximumWorkingTimeBetweenBreaks != null &&
                    this.MaximumWorkingTimeBetweenBreaks.Equals(input.MaximumWorkingTimeBetweenBreaks))
                ) && 
                (
                    this.WorkingTimeThreshold == input.WorkingTimeThreshold ||
                    this.WorkingTimeThreshold.Equals(input.WorkingTimeThreshold)
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
                hashCode = (hashCode * 59) + this.BreakTime.GetHashCode();
                if (this.MaximumDrivingTimeBetweenBreaks != null)
                {
                    hashCode = (hashCode * 59) + this.MaximumDrivingTimeBetweenBreaks.GetHashCode();
                }
                if (this.MaximumWorkingTimeBetweenBreaks != null)
                {
                    hashCode = (hashCode * 59) + this.MaximumWorkingTimeBetweenBreaks.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.WorkingTimeThreshold.GetHashCode();
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
            // BreakTime (int) maximum
            if (this.BreakTime > (int)5400)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for BreakTime, must be a value less than or equal to 5400.", new [] { "BreakTime" });
            }

            // BreakTime (int) minimum
            if (this.BreakTime < (int)900)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for BreakTime, must be a value greater than or equal to 900.", new [] { "BreakTime" });
            }

            // MaximumDrivingTimeBetweenBreaks (int?) minimum
            if (this.MaximumDrivingTimeBetweenBreaks < (int?)3600)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MaximumDrivingTimeBetweenBreaks, must be a value greater than or equal to 3600.", new [] { "MaximumDrivingTimeBetweenBreaks" });
            }

            // MaximumWorkingTimeBetweenBreaks (int?) minimum
            if (this.MaximumWorkingTimeBetweenBreaks < (int?)3600)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MaximumWorkingTimeBetweenBreaks, must be a value greater than or equal to 3600.", new [] { "MaximumWorkingTimeBetweenBreaks" });
            }

            // WorkingTimeThreshold (int) minimum
            if (this.WorkingTimeThreshold < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for WorkingTimeThreshold, must be a value greater than or equal to 0.", new [] { "WorkingTimeThreshold" });
            }

            yield break;
        }
    }

}
