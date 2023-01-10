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
    /// An event specifies what happens on a route at a certain point in time. It can describe the driver&#39;s activity such as driving or performing service, or it can denote the start/end of a route.
    /// </summary>
    [DataContract(Name = "Event")]
    public partial class Event : IEquatable<Event>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public EventType Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Event" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Event() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Event" /> class.
        /// </summary>
        /// <param name="type">type (required).</param>
        /// <param name="startTime">The start time of the event according to [RFC 3339](https://tools.ietf.org/html/rfc3339). (required).</param>
        /// <param name="duration">The duration of the event [s]. The duration may be 0. (required).</param>
        /// <param name="transportId">The ID of the corresponding transport if the event is a service event. Otherwise the ID is null..</param>
        public Event(EventType type = default(EventType), DateTimeOffset startTime = default(DateTimeOffset), int duration = default(int), string transportId = default(string))
        {
            this.Type = type;
            this.StartTime = startTime;
            this.Duration = duration;
            this.TransportId = transportId;
        }

        /// <summary>
        /// The start time of the event according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>The start time of the event according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        [DataMember(Name = "startTime", IsRequired = true, EmitDefaultValue = false)]
        public DateTimeOffset StartTime { get; set; }

        /// <summary>
        /// The duration of the event [s]. The duration may be 0.
        /// </summary>
        /// <value>The duration of the event [s]. The duration may be 0.</value>
        [DataMember(Name = "duration", IsRequired = true, EmitDefaultValue = false)]
        public int Duration { get; set; }

        /// <summary>
        /// The ID of the corresponding transport if the event is a service event. Otherwise the ID is null.
        /// </summary>
        /// <value>The ID of the corresponding transport if the event is a service event. Otherwise the ID is null.</value>
        [DataMember(Name = "transportId", EmitDefaultValue = false)]
        public string TransportId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Event {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  Duration: ").Append(Duration).Append("\n");
            sb.Append("  TransportId: ").Append(TransportId).Append("\n");
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
            return this.Equals(input as Event);
        }

        /// <summary>
        /// Returns true if Event instances are equal
        /// </summary>
        /// <param name="input">Instance of Event to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Event input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.StartTime == input.StartTime ||
                    (this.StartTime != null &&
                    this.StartTime.Equals(input.StartTime))
                ) && 
                (
                    this.Duration == input.Duration ||
                    this.Duration.Equals(input.Duration)
                ) && 
                (
                    this.TransportId == input.TransportId ||
                    (this.TransportId != null &&
                    this.TransportId.Equals(input.TransportId))
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
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                if (this.StartTime != null)
                {
                    hashCode = (hashCode * 59) + this.StartTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Duration.GetHashCode();
                if (this.TransportId != null)
                {
                    hashCode = (hashCode * 59) + this.TransportId.GetHashCode();
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
            // TransportId (string) pattern
            Regex regexTransportId = new Regex(@".*[^ ].*", RegexOptions.CultureInvariant);
            if (false == regexTransportId.Match(this.TransportId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TransportId, must match a pattern of " + regexTransportId, new [] { "TransportId" });
            }

            yield break;
        }
    }

}
