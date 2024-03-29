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
/**
 * A stop report contains a summary of the values of the events at a stop, including the arrival time, the departure time and the service time. It also contains information about the loaded quantities when leaving the current stop.
 * @export
 * @interface StopReport
 */
export interface StopReport {
    /**
     * The planned time of arrival at the stop according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * @type {Date}
     * @memberof StopReport
     */
    arrivalTime: Date;
    /**
     * The planned time of departure from the stop according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * @type {Date}
     * @memberof StopReport
     */
    departureTime: Date;
    /**
     * The service time at the stop [s].
     * @type {number}
     * @memberof StopReport
     */
    serviceTime: number;
    /**
     * The waiting time at the stop [s].
     * @type {number}
     * @memberof StopReport
     */
    waitingTime: number;
    /**
     * The break time at the stop [s].
     * @type {number}
     * @memberof StopReport
     */
    breakTime: number;
    /**
     * The quantities loaded on the vehicle when leaving the stop.
     * @type {Array<number>}
     * @memberof StopReport
     */
    quantities?: Array<number>;
}

export function StopReportFromJSON(json: any): StopReport {
    return StopReportFromJSONTyped(json, false);
}

export function StopReportFromJSONTyped(json: any, ignoreDiscriminator: boolean): StopReport {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'arrivalTime': (new Date(json['arrivalTime'])),
        'departureTime': (new Date(json['departureTime'])),
        'serviceTime': json['serviceTime'],
        'waitingTime': json['waitingTime'],
        'breakTime': json['breakTime'],
        'quantities': !exists(json, 'quantities') ? undefined : json['quantities'],
    };
}

export function StopReportToJSON(value?: StopReport | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'arrivalTime': (value.arrivalTime.toISOString()),
        'departureTime': (value.departureTime.toISOString()),
        'serviceTime': value.serviceTime,
        'waitingTime': value.waitingTime,
        'breakTime': value.breakTime,
        'quantities': value.quantities,
    };
}

