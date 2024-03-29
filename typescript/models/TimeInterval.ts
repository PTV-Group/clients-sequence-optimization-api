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
 * A time interval specified by two points in time - the beginning and the end of the interval.
 * @export
 * @interface TimeInterval
 */
export interface TimeInterval {
    /**
     * The beginning of the time interval according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. The date must provide an offset.
     * @type {Date}
     * @memberof TimeInterval
     */
    start: Date;
    /**
     * The end of the time interval according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. The date must provide an offset.
     * @type {Date}
     * @memberof TimeInterval
     */
    end: Date;
}

export function TimeIntervalFromJSON(json: any): TimeInterval {
    return TimeIntervalFromJSONTyped(json, false);
}

export function TimeIntervalFromJSONTyped(json: any, ignoreDiscriminator: boolean): TimeInterval {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'start': (new Date(json['start'])),
        'end': (new Date(json['end'])),
    };
}

export function TimeIntervalToJSON(value?: TimeInterval | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'start': (value.start.toISOString()),
        'end': (value.end.toISOString()),
    };
}

