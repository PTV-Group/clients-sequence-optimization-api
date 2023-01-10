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
    /// The optimized route contains a summary of the values of all events, including the start time and the end time of the route and the ids of the orders that remain unplanned.
    /// </summary>
    [DataContract(Name = "OptimizedRoute")]
    public partial class OptimizedRoute : IEquatable<OptimizedRoute>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizedRoute" /> class.
        /// </summary>
        /// <param name="route">A route contains a sequence of stops. It specifies where and in which order goods are to be picked up or delivered. Each stop is at a specific location, either a customer location or a depot location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. The sequence of pickups and deliveries is always sorted by Last In - First Out (LIFO). At a depot location a stop groups either pickups or deliveries..</param>
        /// <param name="startTime">The start time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339)..</param>
        /// <param name="endTime">The end time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339)..</param>
        /// <param name="travelTime">The total travel time of the route [s]. Equals difference between end time and start time..</param>
        /// <param name="distance">The total driving distance of the route [m]..</param>
        /// <param name="drivingTime">The total driving time of the route [s]..</param>
        /// <param name="serviceTime">The total service time of the route [s]..</param>
        /// <param name="waitingTime">The total waiting time of the route [s]..</param>
        /// <param name="breakTime">The total break time of the route [s]..</param>
        /// <param name="unplannedTransportIds">Returns the transport IDs that could not be planned. These transports are not part of the route..</param>
        public OptimizedRoute(List<Stop> route = default(List<Stop>), DateTimeOffset startTime = default(DateTimeOffset), DateTimeOffset endTime = default(DateTimeOffset), int travelTime = default(int), int distance = default(int), int drivingTime = default(int), int serviceTime = default(int), int waitingTime = default(int), int breakTime = default(int), List<string> unplannedTransportIds = default(List<string>))
        {
            this.Route = route;
            this.StartTime = startTime;
            this.EndTime = endTime;
            this.TravelTime = travelTime;
            this.Distance = distance;
            this.DrivingTime = drivingTime;
            this.ServiceTime = serviceTime;
            this.WaitingTime = waitingTime;
            this.BreakTime = breakTime;
            this.UnplannedTransportIds = unplannedTransportIds;
        }

        /// <summary>
        /// A route contains a sequence of stops. It specifies where and in which order goods are to be picked up or delivered. Each stop is at a specific location, either a customer location or a depot location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. The sequence of pickups and deliveries is always sorted by Last In - First Out (LIFO). At a depot location a stop groups either pickups or deliveries.
        /// </summary>
        /// <value>A route contains a sequence of stops. It specifies where and in which order goods are to be picked up or delivered. Each stop is at a specific location, either a customer location or a depot location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. The sequence of pickups and deliveries is always sorted by Last In - First Out (LIFO). At a depot location a stop groups either pickups or deliveries.</value>
        [DataMember(Name = "route", EmitDefaultValue = false)]
        public List<Stop> Route { get; set; }

        /// <summary>
        /// The start time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>The start time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        [DataMember(Name = "startTime", EmitDefaultValue = false)]
        public DateTimeOffset StartTime { get; set; }

        /// <summary>
        /// The end time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>The end time of the route according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        [DataMember(Name = "endTime", EmitDefaultValue = false)]
        public DateTimeOffset EndTime { get; set; }

        /// <summary>
        /// The total travel time of the route [s]. Equals difference between end time and start time.
        /// </summary>
        /// <value>The total travel time of the route [s]. Equals difference between end time and start time.</value>
        [DataMember(Name = "travelTime", EmitDefaultValue = false)]
        public int TravelTime { get; set; }

        /// <summary>
        /// The total driving distance of the route [m].
        /// </summary>
        /// <value>The total driving distance of the route [m].</value>
        [DataMember(Name = "distance", EmitDefaultValue = false)]
        public int Distance { get; set; }

        /// <summary>
        /// The total driving time of the route [s].
        /// </summary>
        /// <value>The total driving time of the route [s].</value>
        [DataMember(Name = "drivingTime", EmitDefaultValue = false)]
        public int DrivingTime { get; set; }

        /// <summary>
        /// The total service time of the route [s].
        /// </summary>
        /// <value>The total service time of the route [s].</value>
        [DataMember(Name = "serviceTime", EmitDefaultValue = false)]
        public int ServiceTime { get; set; }

        /// <summary>
        /// The total waiting time of the route [s].
        /// </summary>
        /// <value>The total waiting time of the route [s].</value>
        [DataMember(Name = "waitingTime", EmitDefaultValue = false)]
        public int WaitingTime { get; set; }

        /// <summary>
        /// The total break time of the route [s].
        /// </summary>
        /// <value>The total break time of the route [s].</value>
        [DataMember(Name = "breakTime", EmitDefaultValue = false)]
        public int BreakTime { get; set; }

        /// <summary>
        /// Returns the transport IDs that could not be planned. These transports are not part of the route.
        /// </summary>
        /// <value>Returns the transport IDs that could not be planned. These transports are not part of the route.</value>
        [DataMember(Name = "unplannedTransportIds", EmitDefaultValue = false)]
        public List<string> UnplannedTransportIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizedRoute {\n");
            sb.Append("  Route: ").Append(Route).Append("\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  EndTime: ").Append(EndTime).Append("\n");
            sb.Append("  TravelTime: ").Append(TravelTime).Append("\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  DrivingTime: ").Append(DrivingTime).Append("\n");
            sb.Append("  ServiceTime: ").Append(ServiceTime).Append("\n");
            sb.Append("  WaitingTime: ").Append(WaitingTime).Append("\n");
            sb.Append("  BreakTime: ").Append(BreakTime).Append("\n");
            sb.Append("  UnplannedTransportIds: ").Append(UnplannedTransportIds).Append("\n");
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
            return this.Equals(input as OptimizedRoute);
        }

        /// <summary>
        /// Returns true if OptimizedRoute instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizedRoute to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizedRoute input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Route == input.Route ||
                    this.Route != null &&
                    input.Route != null &&
                    this.Route.SequenceEqual(input.Route)
                ) && 
                (
                    this.StartTime == input.StartTime ||
                    (this.StartTime != null &&
                    this.StartTime.Equals(input.StartTime))
                ) && 
                (
                    this.EndTime == input.EndTime ||
                    (this.EndTime != null &&
                    this.EndTime.Equals(input.EndTime))
                ) && 
                (
                    this.TravelTime == input.TravelTime ||
                    this.TravelTime.Equals(input.TravelTime)
                ) && 
                (
                    this.Distance == input.Distance ||
                    this.Distance.Equals(input.Distance)
                ) && 
                (
                    this.DrivingTime == input.DrivingTime ||
                    this.DrivingTime.Equals(input.DrivingTime)
                ) && 
                (
                    this.ServiceTime == input.ServiceTime ||
                    this.ServiceTime.Equals(input.ServiceTime)
                ) && 
                (
                    this.WaitingTime == input.WaitingTime ||
                    this.WaitingTime.Equals(input.WaitingTime)
                ) && 
                (
                    this.BreakTime == input.BreakTime ||
                    this.BreakTime.Equals(input.BreakTime)
                ) && 
                (
                    this.UnplannedTransportIds == input.UnplannedTransportIds ||
                    this.UnplannedTransportIds != null &&
                    input.UnplannedTransportIds != null &&
                    this.UnplannedTransportIds.SequenceEqual(input.UnplannedTransportIds)
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
                if (this.Route != null)
                {
                    hashCode = (hashCode * 59) + this.Route.GetHashCode();
                }
                if (this.StartTime != null)
                {
                    hashCode = (hashCode * 59) + this.StartTime.GetHashCode();
                }
                if (this.EndTime != null)
                {
                    hashCode = (hashCode * 59) + this.EndTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TravelTime.GetHashCode();
                hashCode = (hashCode * 59) + this.Distance.GetHashCode();
                hashCode = (hashCode * 59) + this.DrivingTime.GetHashCode();
                hashCode = (hashCode * 59) + this.ServiceTime.GetHashCode();
                hashCode = (hashCode * 59) + this.WaitingTime.GetHashCode();
                hashCode = (hashCode * 59) + this.BreakTime.GetHashCode();
                if (this.UnplannedTransportIds != null)
                {
                    hashCode = (hashCode * 59) + this.UnplannedTransportIds.GetHashCode();
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
            yield break;
        }
    }

}