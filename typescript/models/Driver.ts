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
    BreakRule,
    BreakRuleFromJSON,
    BreakRuleFromJSONTyped,
    BreakRuleToJSON,
} from './BreakRule';
import {
    TimeInterval,
    TimeIntervalFromJSON,
    TimeIntervalFromJSONTyped,
    TimeIntervalToJSON,
} from './TimeInterval';
import {
    WorkLogbook,
    WorkLogbookFromJSON,
    WorkLogbookFromJSONTyped,
    WorkLogbookToJSON,
} from './WorkLogbook';
import {
    WorkingHoursPreset,
    WorkingHoursPresetFromJSON,
    WorkingHoursPresetFromJSONTyped,
    WorkingHoursPresetToJSON,
} from './WorkingHoursPreset';

/**
 * The driver of the specified vehicle. The driver can only operate the vehicle within the given time interval.
 * @export
 * @interface Driver
 */
export interface Driver {
    /**
     * Interval during which the driver is available. The route has to start and end within this interval. All opening intervals outside of this interval are not considered. The interval is restricted to a maximum duration of twenty four hours.
     * @type {TimeInterval}
     * @memberof Driver
     */
    availability: TimeInterval | null;
    /**
     * 
     * @type {WorkingHoursPreset}
     * @memberof Driver
     */
    workingHoursPreset?: WorkingHoursPreset | null;
    /**
     * 
     * @type {BreakRule}
     * @memberof Driver
     */
    breakRule?: BreakRule;
    /**
     * 
     * @type {WorkLogbook}
     * @memberof Driver
     */
    workLogbook?: WorkLogbook;
    /**
     * The maximum driving time of the driver [s]. 
     * 
     * The maximum driving time is considered as infinite if it is not set.
     * @type {number}
     * @memberof Driver
     */
    maximumDrivingTime?: number | null;
    /**
     * The maximum travel time of the driver [s]. The travel time contains all waiting, service and driving times.
     * 
     * The maximum travel time is considered as infinite if it is not set.
     * @type {number}
     * @memberof Driver
     */
    maximumTravelTime?: number | null;
}

export function DriverFromJSON(json: any): Driver {
    return DriverFromJSONTyped(json, false);
}

export function DriverFromJSONTyped(json: any, ignoreDiscriminator: boolean): Driver {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'availability': TimeIntervalFromJSON(json['availability']),
        'workingHoursPreset': !exists(json, 'workingHoursPreset') ? undefined : WorkingHoursPresetFromJSON(json['workingHoursPreset']),
        'breakRule': !exists(json, 'breakRule') ? undefined : BreakRuleFromJSON(json['breakRule']),
        'workLogbook': !exists(json, 'workLogbook') ? undefined : WorkLogbookFromJSON(json['workLogbook']),
        'maximumDrivingTime': !exists(json, 'maximumDrivingTime') ? undefined : json['maximumDrivingTime'],
        'maximumTravelTime': !exists(json, 'maximumTravelTime') ? undefined : json['maximumTravelTime'],
    };
}

export function DriverToJSON(value?: Driver | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'availability': TimeIntervalToJSON(value.availability),
        'workingHoursPreset': WorkingHoursPresetToJSON(value.workingHoursPreset),
        'breakRule': BreakRuleToJSON(value.breakRule),
        'workLogbook': WorkLogbookToJSON(value.workLogbook),
        'maximumDrivingTime': value.maximumDrivingTime,
        'maximumTravelTime': value.maximumTravelTime,
    };
}

