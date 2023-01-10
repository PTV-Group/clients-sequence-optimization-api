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
    /// Contains restrictions that are to be considered during sequence optimization.
    /// </summary>
    [DataContract(Name = "Restrictions")]
    public partial class Restrictions : IEquatable<Restrictions>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets SequenceOfStops
        /// </summary>
        [DataMember(Name = "sequenceOfStops", EmitDefaultValue = false)]
        public StopsSequence? SequenceOfStops { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Restrictions" /> class.
        /// </summary>
        /// <param name="sequenceOfStops">sequenceOfStops.</param>
        public Restrictions(StopsSequence? sequenceOfStops = default(StopsSequence?))
        {
            this.SequenceOfStops = sequenceOfStops;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Restrictions {\n");
            sb.Append("  SequenceOfStops: ").Append(SequenceOfStops).Append("\n");
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
            return this.Equals(input as Restrictions);
        }

        /// <summary>
        /// Returns true if Restrictions instances are equal
        /// </summary>
        /// <param name="input">Instance of Restrictions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Restrictions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SequenceOfStops == input.SequenceOfStops ||
                    this.SequenceOfStops.Equals(input.SequenceOfStops)
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
                hashCode = (hashCode * 59) + this.SequenceOfStops.GetHashCode();
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