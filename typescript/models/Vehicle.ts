/* tslint:disable */
/* eslint-disable */
/**
 * Sequence Optimization
 * With the Sequence Optimization service you can find the best route for your transports.
 *
 * The version of the OpenAPI document: 1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * The vehicle used to transport goods.
 * @export
 * @interface Vehicle
 */
export interface Vehicle {
    /**
     * The list of capacities for the different quantity dimensions of goods that can be transported. The maximum length of this list is 100. That is, up to 100 different quantity dimensions (e.g. number of pallets, weight, volume, etc.) can be distinguished. Transports can only be executed by a vehicle with a higher (or an equal) maximum capacity in every quantity dimension. The length of this list has to be the same for all transports and the vehicle. If and only if this list of capacities is empty for the given vehicle, the quantities of each transport must be empty.
     * @type {Array<number>}
     * @memberof Vehicle
     */
    capacities?: Array<number>;
    /**
     * The profile defines attributes of the vehicle relevant to determine travel times and distances between any two locations.  
     * Default profile is _EUR_VAN_. See [here](./concepts/profiles-and-countries) for a complete list of allowed values.
     * @type {string}
     * @memberof Vehicle
     */
    profile?: string;
    /**
     * ID of the vehicle's start location. If vehicle's start location does not coincide with the location of the first pickup, only the coordinates of vehicle's start location are considered and all other attributes such as opening intervals, service time or type are ignored. If no start location is specified, it is assumed that the vehicle is available at the first stop.
     * @type {string}
     * @memberof Vehicle
     */
    startLocationId?: string;
    /**
     * ID of the vehicle's end location. If vehicle's end location does not coincide with the location of the last delivery, only the coordinates of vehicle's end location are considered and all other attributes such as opening intervals, service time or type are ignored. If no end location is specified, it is assumed that the vehicle remains at the last stop.
     * @type {string}
     * @memberof Vehicle
     */
    endLocationId?: string;
}

export function VehicleFromJSON(json: any): Vehicle {
    return VehicleFromJSONTyped(json, false);
}

export function VehicleFromJSONTyped(json: any, ignoreDiscriminator: boolean): Vehicle {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'capacities': !exists(json, 'capacities') ? undefined : json['capacities'],
        'profile': !exists(json, 'profile') ? undefined : json['profile'],
        'startLocationId': !exists(json, 'startLocationId') ? undefined : json['startLocationId'],
        'endLocationId': !exists(json, 'endLocationId') ? undefined : json['endLocationId'],
    };
}

export function VehicleToJSON(value?: Vehicle | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'capacities': value.capacities,
        'profile': value.profile,
        'startLocationId': value.startLocationId,
        'endLocationId': value.endLocationId,
    };
}

