/* tslint:disable */
/* eslint-disable */
/**
 * Sequence Optimization
 * With the Sequence Optimization service you can find the best route for your transports.
 *
 * The version of the OpenAPI document: 1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    ViolationType,
    ViolationTypeFromJSON,
    ViolationTypeFromJSONTyped,
    ViolationTypeToJSON,
} from './ViolationType';

/**
 * Specifies a violation of a route.
 * @export
 * @interface Violation
 */
export interface Violation {
    /**
     * 
     * @type {ViolationType}
     * @memberof Violation
     */
    type: ViolationType;
    /**
     * Specifies a violation that involves a time limit: Time by which the limit is exceeded. Is only filled for the following violation types: _ROUTE_START_INTERVAL_, DRIVER_AVAILABILITY, OPENING_INTERVAL, MAXIMUM_TRAVEL_TIME_OF_DRIVER and MAXIMUM_DRIVING_TIME_OF_DRIVER.
     * @type {number}
     * @memberof Violation
     */
    timeExceedance?: number;
    /**
     * Specifies a violation that involves a distance limit: Distance by which the limit is exceeded. Is only filled for the following violation type: _MAXIMUM_DISTANCE_.
     * @type {number}
     * @memberof Violation
     */
    distanceExceedance?: number;
    /**
     * Specifies a violation of the capacities of the used vehicle: Exceedance of the capacity in each quantity dimension of goods. Is only filled for the following violation types: VEHICLE_CAPACITY.
     * @type {Array<number>}
     * @memberof Violation
     */
    capacityExceedance?: Array<number>;
}

export function ViolationFromJSON(json: any): Violation {
    return ViolationFromJSONTyped(json, false);
}

export function ViolationFromJSONTyped(json: any, ignoreDiscriminator: boolean): Violation {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'type': ViolationTypeFromJSON(json['type']),
        'timeExceedance': !exists(json, 'timeExceedance') ? undefined : json['timeExceedance'],
        'distanceExceedance': !exists(json, 'distanceExceedance') ? undefined : json['distanceExceedance'],
        'capacityExceedance': !exists(json, 'capacityExceedance') ? undefined : json['capacityExceedance'],
    };
}

export function ViolationToJSON(value?: Violation | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'type': ViolationTypeToJSON(value.type),
        'timeExceedance': value.timeExceedance,
        'distanceExceedance': value.distanceExceedance,
        'capacityExceedance': value.capacityExceedance,
    };
}

