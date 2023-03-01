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
    /// A specific location where goods have to be picked up or delivered, or where the vehicle is located. A location is either a depot location or a customer location. Depot locations may be found at start or end of **route-stops**.  See [here](./concepts/locations-transports-and-stops) for more information.
    /// </summary>
    [DataContract(Name = "Location")]
    public partial class Location : IEquatable<Location>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public LocationType? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Location" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Location() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Location" /> class.
        /// </summary>
        /// <param name="id">The unique ID for this location. This ID can be used to reference the location from other elements, for example from transports or the vehicle. The ID does not influence the result. (required).</param>
        /// <param name="type">type.</param>
        /// <param name="latitude">The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="longitude">The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        /// <param name="openingIntervals">The opening intervals at this location. Leaving this parameter empty means that the location is always open. Service (pickup or delivery) can only start within one of the opening intervals. All opening intervals outside of driver availability interval are not considered during the optimization process..</param>
        /// <param name="customerLocationAttributes">customerLocationAttributes.</param>
        /// <param name="depotLocationAttributes">depotLocationAttributes.</param>
        public Location(string id = default(string), LocationType? type = default(LocationType?), double latitude = default(double), double longitude = default(double), List<TimeInterval> openingIntervals = default(List<TimeInterval>), CustomerLocationAttributes customerLocationAttributes = default(CustomerLocationAttributes), DepotLocationAttributes depotLocationAttributes = default(DepotLocationAttributes))
        {
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for Location and cannot be null");
            }
            this.Id = id;
            this.Latitude = latitude;
            this.Longitude = longitude;
            this.Type = type;
            this.OpeningIntervals = openingIntervals;
            this.CustomerLocationAttributes = customerLocationAttributes;
            this.DepotLocationAttributes = depotLocationAttributes;
        }

        /// <summary>
        /// The unique ID for this location. This ID can be used to reference the location from other elements, for example from transports or the vehicle. The ID does not influence the result.
        /// </summary>
        /// <value>The unique ID for this location. This ID can be used to reference the location from other elements, for example from transports or the vehicle. The ID does not influence the result.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north.</value>
        [DataMember(Name = "latitude", IsRequired = true, EmitDefaultValue = false)]
        public double Latitude { get; set; }

        /// <summary>
        /// The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east.</value>
        [DataMember(Name = "longitude", IsRequired = true, EmitDefaultValue = false)]
        public double Longitude { get; set; }

        /// <summary>
        /// The opening intervals at this location. Leaving this parameter empty means that the location is always open. Service (pickup or delivery) can only start within one of the opening intervals. All opening intervals outside of driver availability interval are not considered during the optimization process.
        /// </summary>
        /// <value>The opening intervals at this location. Leaving this parameter empty means that the location is always open. Service (pickup or delivery) can only start within one of the opening intervals. All opening intervals outside of driver availability interval are not considered during the optimization process.</value>
        [DataMember(Name = "openingIntervals", EmitDefaultValue = false)]
        public List<TimeInterval> OpeningIntervals { get; set; }

        /// <summary>
        /// Gets or Sets CustomerLocationAttributes
        /// </summary>
        [DataMember(Name = "customerLocationAttributes", EmitDefaultValue = false)]
        public CustomerLocationAttributes CustomerLocationAttributes { get; set; }

        /// <summary>
        /// Gets or Sets DepotLocationAttributes
        /// </summary>
        [DataMember(Name = "depotLocationAttributes", EmitDefaultValue = false)]
        public DepotLocationAttributes DepotLocationAttributes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Location {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  OpeningIntervals: ").Append(OpeningIntervals).Append("\n");
            sb.Append("  CustomerLocationAttributes: ").Append(CustomerLocationAttributes).Append("\n");
            sb.Append("  DepotLocationAttributes: ").Append(DepotLocationAttributes).Append("\n");
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
            return this.Equals(input as Location);
        }

        /// <summary>
        /// Returns true if Location instances are equal
        /// </summary>
        /// <param name="input">Instance of Location to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Location input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.Latitude == input.Latitude ||
                    this.Latitude.Equals(input.Latitude)
                ) && 
                (
                    this.Longitude == input.Longitude ||
                    this.Longitude.Equals(input.Longitude)
                ) && 
                (
                    this.OpeningIntervals == input.OpeningIntervals ||
                    this.OpeningIntervals != null &&
                    input.OpeningIntervals != null &&
                    this.OpeningIntervals.SequenceEqual(input.OpeningIntervals)
                ) && 
                (
                    this.CustomerLocationAttributes == input.CustomerLocationAttributes ||
                    (this.CustomerLocationAttributes != null &&
                    this.CustomerLocationAttributes.Equals(input.CustomerLocationAttributes))
                ) && 
                (
                    this.DepotLocationAttributes == input.DepotLocationAttributes ||
                    (this.DepotLocationAttributes != null &&
                    this.DepotLocationAttributes.Equals(input.DepotLocationAttributes))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                hashCode = (hashCode * 59) + this.Latitude.GetHashCode();
                hashCode = (hashCode * 59) + this.Longitude.GetHashCode();
                if (this.OpeningIntervals != null)
                {
                    hashCode = (hashCode * 59) + this.OpeningIntervals.GetHashCode();
                }
                if (this.CustomerLocationAttributes != null)
                {
                    hashCode = (hashCode * 59) + this.CustomerLocationAttributes.GetHashCode();
                }
                if (this.DepotLocationAttributes != null)
                {
                    hashCode = (hashCode * 59) + this.DepotLocationAttributes.GetHashCode();
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
            // Id (string) pattern
            Regex regexId = new Regex(@".*[^ ].*", RegexOptions.CultureInvariant);
            if (false == regexId.Match(this.Id).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Id, must match a pattern of " + regexId, new [] { "Id" });
            }

            // Latitude (double) maximum
            if (this.Latitude > (double)90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value less than or equal to 90.", new [] { "Latitude" });
            }

            // Latitude (double) minimum
            if (this.Latitude < (double)-90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value greater than or equal to -90.", new [] { "Latitude" });
            }

            // Longitude (double) maximum
            if (this.Longitude > (double)180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value less than or equal to 180.", new [] { "Longitude" });
            }

            // Longitude (double) minimum
            if (this.Longitude < (double)-180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value greater than or equal to -180.", new [] { "Longitude" });
            }

            yield break;
        }
    }

}
