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

/**
 * The type of the location.
 * @export
 * @enum {string}
 */
export enum LocationType {
    DEPOT = 'DEPOT',
    CUSTOMER = 'CUSTOMER'
}

export function LocationTypeFromJSON(json: any): LocationType {
    return LocationTypeFromJSONTyped(json, false);
}

export function LocationTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): LocationType {
    return json as LocationType;
}

export function LocationTypeToJSON(value?: LocationType | null): any {
    return value as any;
}

