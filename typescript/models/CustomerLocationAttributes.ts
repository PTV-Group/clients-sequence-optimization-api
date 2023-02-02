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
import {
    PositionInRoute,
    PositionInRouteFromJSON,
    PositionInRouteFromJSONTyped,
    PositionInRouteToJSON,
} from './PositionInRoute';

/**
 * Attributes for a location of type CUSTOMER.
 * @export
 * @interface CustomerLocationAttributes
 */
export interface CustomerLocationAttributes {
    /**
     * The service time [s] that is required each time this location is visited in order to pick goods up or to deliver them. The location-dependent service time represents, for example, the time to enter the premises or to register at a customer. Besides a location-dependent service time, the user may specify an additional transport-dependent service time at the transports.
     * @type {number}
     * @memberof CustomerLocationAttributes
     */
    serviceTimePerTransportStop?: number;
    /**
     * 
     * @type {PositionInRoute}
     * @memberof CustomerLocationAttributes
     */
    positionInRoute?: PositionInRoute | null;
    /**
     * If routeSectionNumber is specified, a stop at this customer location will be visited after stops at customer locations with specified lower routeSectionNumber and before stops at customer locations with specified higher routeSectionNumber. Consequently, the route section numbers of stops at customer locations must be non-decreasing. 
     * 
     * If specified, positionInRoute must not be set for the same location.
     * 
     * See [here](./concepts/route-sections-and-position-route) for more information.
     * @type {number}
     * @memberof CustomerLocationAttributes
     */
    routeSectionNumber?: number | null;
}

export function CustomerLocationAttributesFromJSON(json: any): CustomerLocationAttributes {
    return CustomerLocationAttributesFromJSONTyped(json, false);
}

export function CustomerLocationAttributesFromJSONTyped(json: any, ignoreDiscriminator: boolean): CustomerLocationAttributes {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'serviceTimePerTransportStop': !exists(json, 'serviceTimePerTransportStop') ? undefined : json['serviceTimePerTransportStop'],
        'positionInRoute': !exists(json, 'positionInRoute') ? undefined : PositionInRouteFromJSON(json['positionInRoute']),
        'routeSectionNumber': !exists(json, 'routeSectionNumber') ? undefined : json['routeSectionNumber'],
    };
}

export function CustomerLocationAttributesToJSON(value?: CustomerLocationAttributes | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'serviceTimePerTransportStop': value.serviceTimePerTransportStop,
        'positionInRoute': PositionInRouteToJSON(value.positionInRoute),
        'routeSectionNumber': value.routeSectionNumber,
    };
}

