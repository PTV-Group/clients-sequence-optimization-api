/* tslint:disable */
/* eslint-disable */
/**
 * Sequence Optimization
 * With the Sequence Optimization service you can find the best route for your transports.
 *
 * The version of the OpenAPI document: 1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    CustomerLocationAttributes,
    CustomerLocationAttributesFromJSON,
    CustomerLocationAttributesFromJSONTyped,
    CustomerLocationAttributesToJSON,
} from './CustomerLocationAttributes';
import {
    DepotLocationAttributes,
    DepotLocationAttributesFromJSON,
    DepotLocationAttributesFromJSONTyped,
    DepotLocationAttributesToJSON,
} from './DepotLocationAttributes';
import {
    LocationType,
    LocationTypeFromJSON,
    LocationTypeFromJSONTyped,
    LocationTypeToJSON,
} from './LocationType';
import {
    TimeInterval,
    TimeIntervalFromJSON,
    TimeIntervalFromJSONTyped,
    TimeIntervalToJSON,
} from './TimeInterval';

/**
 * A specific location where goods have to be picked up or delivered, or where the vehicle is located. A location is either a depot location or a customer location. Depot locations may be found at start or end of **route-stops**.
 * 
 * See [here](./concepts/locations-transports-and-stops) for more information.
 * @export
 * @interface Location
 */
export interface Location {
    /**
     * The unique ID for this location. This ID can be used to reference the location from other elements, for example from transports or the vehicle. The ID does not influence the result.
     * @type {string}
     * @memberof Location
     */
    id: string;
    /**
     * 
     * @type {LocationType}
     * @memberof Location
     */
    type?: LocationType;
    /**
     * The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof Location
     */
    latitude: number;
    /**
     * The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof Location
     */
    longitude: number;
    /**
     * The opening intervals at this location. Leaving this parameter empty means that the location is always open. Service (pickup or delivery) can only start within one of the opening intervals. All opening intervals outside of driver availability interval are not considered during the optimization process.
     * @type {Array<TimeInterval>}
     * @memberof Location
     */
    openingIntervals?: Array<TimeInterval>;
    /**
     * 
     * @type {CustomerLocationAttributes}
     * @memberof Location
     */
    customerLocationAttributes?: CustomerLocationAttributes;
    /**
     * 
     * @type {DepotLocationAttributes}
     * @memberof Location
     */
    depotLocationAttributes?: DepotLocationAttributes;
}

export function LocationFromJSON(json: any): Location {
    return LocationFromJSONTyped(json, false);
}

export function LocationFromJSONTyped(json: any, ignoreDiscriminator: boolean): Location {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'type': !exists(json, 'type') ? undefined : LocationTypeFromJSON(json['type']),
        'latitude': json['latitude'],
        'longitude': json['longitude'],
        'openingIntervals': !exists(json, 'openingIntervals') ? undefined : ((json['openingIntervals'] as Array<any>).map(TimeIntervalFromJSON)),
        'customerLocationAttributes': !exists(json, 'customerLocationAttributes') ? undefined : CustomerLocationAttributesFromJSON(json['customerLocationAttributes']),
        'depotLocationAttributes': !exists(json, 'depotLocationAttributes') ? undefined : DepotLocationAttributesFromJSON(json['depotLocationAttributes']),
    };
}

export function LocationToJSON(value?: Location | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'type': LocationTypeToJSON(value.type),
        'latitude': value.latitude,
        'longitude': value.longitude,
        'openingIntervals': value.openingIntervals === undefined ? undefined : ((value.openingIntervals as Array<any>).map(TimeIntervalToJSON)),
        'customerLocationAttributes': CustomerLocationAttributesToJSON(value.customerLocationAttributes),
        'depotLocationAttributes': DepotLocationAttributesToJSON(value.depotLocationAttributes),
    };
}

