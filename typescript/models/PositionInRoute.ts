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

/**
 * If specified, this stop has to be the very first/last customer stop in the route whenever there is a stop at this location. There can only be one stop at a customer location with a position in route of type FIRST_CUSTOMER_STOP/LAST_CUSTOMER_STOP.  
 * If specified, routeSectionNumber must not be set for the same location. 
 *  * `FIRST_CUSTOMER_STOP` - A stop at a customer location with this position type has to be the very first customer stop in the route.
 *  * `LAST_CUSTOMER_STOP` - A stop at a customer location with this position type has to be the very last customer stop in the route.
 * 
 * See [here](./concepts/route-sections-and-position-route) for more information.
 * @export
 * @enum {string}
 */
export enum PositionInRoute {
    FIRST_CUSTOMER_STOP = 'FIRST_CUSTOMER_STOP',
    LAST_CUSTOMER_STOP = 'LAST_CUSTOMER_STOP'
}

export function PositionInRouteFromJSON(json: any): PositionInRoute {
    return PositionInRouteFromJSONTyped(json, false);
}

export function PositionInRouteFromJSONTyped(json: any, ignoreDiscriminator: boolean): PositionInRoute {
    return json as PositionInRoute;
}

export function PositionInRouteToJSON(value?: PositionInRoute | null): any {
    return value as any;
}

