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
    /// A stop groups subsequent pickups and/or deliveries at the same location. At a customer location, transports are scheduled in order of their type: pickups after deliveries. At a depot location a stop groups either pickups or deliveries.  See [here](./concepts/route-sections-and-position-route) for more information.
    /// </summary>
    [DataContract(Name = "Stop")]
    public partial class Stop : IEquatable<Stop>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Stop" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Stop() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Stop" /> class.
        /// </summary>
        /// <param name="locationId">A reference to a location. Usually, goods are picked up or delivered here. If no goods are picked up or delivered, it is the location where a route starts or ends. (required).</param>
        /// <param name="deliveryIds">A list of transport IDs that are delivered at this stop..</param>
        /// <param name="pickupIds">A list of transport IDs that are picked up at this stop..</param>
        public Stop(string locationId = default(string), List<string> deliveryIds = default(List<string>), List<string> pickupIds = default(List<string>))
        {
            // to ensure "locationId" is required (not null)
            if (locationId == null) {
                throw new ArgumentNullException("locationId is a required property for Stop and cannot be null");
            }
            this.LocationId = locationId;
            this.DeliveryIds = deliveryIds;
            this.PickupIds = pickupIds;
        }

        /// <summary>
        /// A reference to a location. Usually, goods are picked up or delivered here. If no goods are picked up or delivered, it is the location where a route starts or ends.
        /// </summary>
        /// <value>A reference to a location. Usually, goods are picked up or delivered here. If no goods are picked up or delivered, it is the location where a route starts or ends.</value>
        [DataMember(Name = "locationId", IsRequired = true, EmitDefaultValue = false)]
        public string LocationId { get; set; }

        /// <summary>
        /// A list of transport IDs that are delivered at this stop.
        /// </summary>
        /// <value>A list of transport IDs that are delivered at this stop.</value>
        [DataMember(Name = "deliveryIds", EmitDefaultValue = false)]
        public List<string> DeliveryIds { get; set; }

        /// <summary>
        /// A list of transport IDs that are picked up at this stop.
        /// </summary>
        /// <value>A list of transport IDs that are picked up at this stop.</value>
        [DataMember(Name = "pickupIds", EmitDefaultValue = false)]
        public List<string> PickupIds { get; set; }

        /// <summary>
        /// A way report contains a summary of the values of the events on the way from the previous stop to the current stop, including the driving time. The very first stop of a route has a way report with empty values.
        /// </summary>
        /// <value>A way report contains a summary of the values of the events on the way from the previous stop to the current stop, including the driving time. The very first stop of a route has a way report with empty values.</value>
        [DataMember(Name = "reportForWayToStop", IsRequired = true, EmitDefaultValue = true)]
        public WayReport ReportForWayToStop { get; private set; }

        /// <summary>
        /// Returns false as ReportForWayToStop should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeReportForWayToStop()
        {
            return false;
        }
        /// <summary>
        /// A stop report contains a summary of the values of the events at a stop, including the arrival time, the departure time and the service time. It also contains information about the loaded quantities when leaving the current stop.
        /// </summary>
        /// <value>A stop report contains a summary of the values of the events at a stop, including the arrival time, the departure time and the service time. It also contains information about the loaded quantities when leaving the current stop.</value>
        [DataMember(Name = "reportForStop", IsRequired = true, EmitDefaultValue = true)]
        public StopReport ReportForStop { get; private set; }

        /// <summary>
        /// Returns false as ReportForStop should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeReportForStop()
        {
            return false;
        }
        /// <summary>
        /// A list of events that occur on the way from the previous stop to this stop. An event specifies what happens on a route at a certain point in time. It can describe the driver&#39;s activity such as driving or break.
        /// </summary>
        /// <value>A list of events that occur on the way from the previous stop to this stop. An event specifies what happens on a route at a certain point in time. It can describe the driver&#39;s activity such as driving or break.</value>
        [DataMember(Name = "eventsOnWayToStop", IsRequired = true, EmitDefaultValue = false)]
        public List<Event> EventsOnWayToStop { get; private set; }

        /// <summary>
        /// Returns false as EventsOnWayToStop should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeEventsOnWayToStop()
        {
            return false;
        }
        /// <summary>
        /// A list of events that occur at this stop. An event specifies what happens on a route at a certain point in time. It can describe the driver&#39;s activity such as performing service or waiting, or it can denote the start/end of a route.
        /// </summary>
        /// <value>A list of events that occur at this stop. An event specifies what happens on a route at a certain point in time. It can describe the driver&#39;s activity such as performing service or waiting, or it can denote the start/end of a route.</value>
        [DataMember(Name = "eventsAtStop", IsRequired = true, EmitDefaultValue = false)]
        public List<Event> EventsAtStop { get; private set; }

        /// <summary>
        /// Returns false as EventsAtStop should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeEventsAtStop()
        {
            return false;
        }
        /// <summary>
        /// A list of violations that occur on the way from the previous stop to this stop. The following violation types can occur here: DRIVER_AVAILABILITY, MAXIMUM_TRAVEL_TIME_OF_DRIVER, MAXIMUM_DRIVING_TIME_OF_DRIVER. For each violation, the maximum time exceedance on the way to this stop is reported.
        /// </summary>
        /// <value>A list of violations that occur on the way from the previous stop to this stop. The following violation types can occur here: DRIVER_AVAILABILITY, MAXIMUM_TRAVEL_TIME_OF_DRIVER, MAXIMUM_DRIVING_TIME_OF_DRIVER. For each violation, the maximum time exceedance on the way to this stop is reported.</value>
        [DataMember(Name = "violationsOnWayToStop", IsRequired = true, EmitDefaultValue = false)]
        public List<Violation> ViolationsOnWayToStop { get; private set; }

        /// <summary>
        /// Returns false as ViolationsOnWayToStop should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeViolationsOnWayToStop()
        {
            return false;
        }
        /// <summary>
        /// A list of violations that occur at this stop. The following violation types can occur here: DRIVER_AVAILABILITY, OPENING_INTERVAL, VEHICLE_CAPACITY, MAXIMUM_TRAVEL_TIME_OF_DRIVER. For VEHICLE_CAPACITY the violation when leaving the stop is reported (i.e., at the last stop of the route, when everything is unloaded, there will be no such violation). For all other violations, the maximum time exceedance at this stop is reported.
        /// </summary>
        /// <value>A list of violations that occur at this stop. The following violation types can occur here: DRIVER_AVAILABILITY, OPENING_INTERVAL, VEHICLE_CAPACITY, MAXIMUM_TRAVEL_TIME_OF_DRIVER. For VEHICLE_CAPACITY the violation when leaving the stop is reported (i.e., at the last stop of the route, when everything is unloaded, there will be no such violation). For all other violations, the maximum time exceedance at this stop is reported.</value>
        [DataMember(Name = "violationsAtStop", IsRequired = true, EmitDefaultValue = false)]
        public List<Violation> ViolationsAtStop { get; private set; }

        /// <summary>
        /// Returns false as ViolationsAtStop should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeViolationsAtStop()
        {
            return false;
        }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Stop {\n");
            sb.Append("  LocationId: ").Append(LocationId).Append("\n");
            sb.Append("  DeliveryIds: ").Append(DeliveryIds).Append("\n");
            sb.Append("  PickupIds: ").Append(PickupIds).Append("\n");
            sb.Append("  ReportForWayToStop: ").Append(ReportForWayToStop).Append("\n");
            sb.Append("  ReportForStop: ").Append(ReportForStop).Append("\n");
            sb.Append("  EventsOnWayToStop: ").Append(EventsOnWayToStop).Append("\n");
            sb.Append("  EventsAtStop: ").Append(EventsAtStop).Append("\n");
            sb.Append("  ViolationsOnWayToStop: ").Append(ViolationsOnWayToStop).Append("\n");
            sb.Append("  ViolationsAtStop: ").Append(ViolationsAtStop).Append("\n");
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
            return this.Equals(input as Stop);
        }

        /// <summary>
        /// Returns true if Stop instances are equal
        /// </summary>
        /// <param name="input">Instance of Stop to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Stop input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.LocationId == input.LocationId ||
                    (this.LocationId != null &&
                    this.LocationId.Equals(input.LocationId))
                ) && 
                (
                    this.DeliveryIds == input.DeliveryIds ||
                    this.DeliveryIds != null &&
                    input.DeliveryIds != null &&
                    this.DeliveryIds.SequenceEqual(input.DeliveryIds)
                ) && 
                (
                    this.PickupIds == input.PickupIds ||
                    this.PickupIds != null &&
                    input.PickupIds != null &&
                    this.PickupIds.SequenceEqual(input.PickupIds)
                ) && 
                (
                    this.ReportForWayToStop == input.ReportForWayToStop ||
                    (this.ReportForWayToStop != null &&
                    this.ReportForWayToStop.Equals(input.ReportForWayToStop))
                ) && 
                (
                    this.ReportForStop == input.ReportForStop ||
                    (this.ReportForStop != null &&
                    this.ReportForStop.Equals(input.ReportForStop))
                ) && 
                (
                    this.EventsOnWayToStop == input.EventsOnWayToStop ||
                    this.EventsOnWayToStop != null &&
                    input.EventsOnWayToStop != null &&
                    this.EventsOnWayToStop.SequenceEqual(input.EventsOnWayToStop)
                ) && 
                (
                    this.EventsAtStop == input.EventsAtStop ||
                    this.EventsAtStop != null &&
                    input.EventsAtStop != null &&
                    this.EventsAtStop.SequenceEqual(input.EventsAtStop)
                ) && 
                (
                    this.ViolationsOnWayToStop == input.ViolationsOnWayToStop ||
                    this.ViolationsOnWayToStop != null &&
                    input.ViolationsOnWayToStop != null &&
                    this.ViolationsOnWayToStop.SequenceEqual(input.ViolationsOnWayToStop)
                ) && 
                (
                    this.ViolationsAtStop == input.ViolationsAtStop ||
                    this.ViolationsAtStop != null &&
                    input.ViolationsAtStop != null &&
                    this.ViolationsAtStop.SequenceEqual(input.ViolationsAtStop)
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
                if (this.LocationId != null)
                {
                    hashCode = (hashCode * 59) + this.LocationId.GetHashCode();
                }
                if (this.DeliveryIds != null)
                {
                    hashCode = (hashCode * 59) + this.DeliveryIds.GetHashCode();
                }
                if (this.PickupIds != null)
                {
                    hashCode = (hashCode * 59) + this.PickupIds.GetHashCode();
                }
                if (this.ReportForWayToStop != null)
                {
                    hashCode = (hashCode * 59) + this.ReportForWayToStop.GetHashCode();
                }
                if (this.ReportForStop != null)
                {
                    hashCode = (hashCode * 59) + this.ReportForStop.GetHashCode();
                }
                if (this.EventsOnWayToStop != null)
                {
                    hashCode = (hashCode * 59) + this.EventsOnWayToStop.GetHashCode();
                }
                if (this.EventsAtStop != null)
                {
                    hashCode = (hashCode * 59) + this.EventsAtStop.GetHashCode();
                }
                if (this.ViolationsOnWayToStop != null)
                {
                    hashCode = (hashCode * 59) + this.ViolationsOnWayToStop.GetHashCode();
                }
                if (this.ViolationsAtStop != null)
                {
                    hashCode = (hashCode * 59) + this.ViolationsAtStop.GetHashCode();
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
            // LocationId (string) pattern
            Regex regexLocationId = new Regex(@".*[^ ].*", RegexOptions.CultureInvariant);
            if (false == regexLocationId.Match(this.LocationId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for LocationId, must match a pattern of " + regexLocationId, new [] { "LocationId" });
            }

            yield break;
        }
    }

}
