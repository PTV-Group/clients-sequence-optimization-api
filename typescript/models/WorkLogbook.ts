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
 * Defines the accumulated driving and working times since the last break.
 * 
 * See [here](./concepts/drivers-working-hours) for more information.
 * @export
 * @interface WorkLogbook
 */
export interface WorkLogbook {
    /**
     * The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. The date must provide an offset to UTC.
     * @type {Date}
     * @memberof WorkLogbook
     */
    lastTimeTheDriverWorked: Date;
    /**
     * Accumulated driving time since end of last break [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenBreaks**. If no other value is specified, the value defaults to 0. The value counts towards **maximumDrivingTime** if the latter is specified.
     * @type {number}
     * @memberof WorkLogbook
     */
    accumulatedDrivingTimeSinceLastBreak?: number;
    /**
     * Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold. Values higher than **maximumWorkingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumWorkingTimeBetweenBreaks**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the value defaults to **accumulatedDrivingTimeBetweenBreaks**. The value counts towards **maximumWorkingTime** if the latter is specified.
     * @type {number}
     * @memberof WorkLogbook
     */
    accumulatedWorkingTimeSinceLastBreak?: number | null;
}

export function WorkLogbookFromJSON(json: any): WorkLogbook {
    return WorkLogbookFromJSONTyped(json, false);
}

export function WorkLogbookFromJSONTyped(json: any, ignoreDiscriminator: boolean): WorkLogbook {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'lastTimeTheDriverWorked': (new Date(json['lastTimeTheDriverWorked'])),
        'accumulatedDrivingTimeSinceLastBreak': !exists(json, 'accumulatedDrivingTimeSinceLastBreak') ? undefined : json['accumulatedDrivingTimeSinceLastBreak'],
        'accumulatedWorkingTimeSinceLastBreak': !exists(json, 'accumulatedWorkingTimeSinceLastBreak') ? undefined : json['accumulatedWorkingTimeSinceLastBreak'],
    };
}

export function WorkLogbookToJSON(value?: WorkLogbook | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'lastTimeTheDriverWorked': (value.lastTimeTheDriverWorked.toISOString()),
        'accumulatedDrivingTimeSinceLastBreak': value.accumulatedDrivingTimeSinceLastBreak,
        'accumulatedWorkingTimeSinceLastBreak': value.accumulatedWorkingTimeSinceLastBreak,
    };
}

