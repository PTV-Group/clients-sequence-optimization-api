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
    StopsSequence,
    StopsSequenceFromJSON,
    StopsSequenceFromJSONTyped,
    StopsSequenceToJSON,
} from './StopsSequence';

/**
 * Contains restrictions that are to be considered during sequence optimization.
 * @export
 * @interface Restrictions
 */
export interface Restrictions {
    /**
     * 
     * @type {StopsSequence}
     * @memberof Restrictions
     */
    sequenceOfStops?: StopsSequence;
}

export function RestrictionsFromJSON(json: any): Restrictions {
    return RestrictionsFromJSONTyped(json, false);
}

export function RestrictionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Restrictions {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'sequenceOfStops': !exists(json, 'sequenceOfStops') ? undefined : StopsSequenceFromJSON(json['sequenceOfStops']),
    };
}

export function RestrictionsToJSON(value?: Restrictions | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'sequenceOfStops': StopsSequenceToJSON(value.sequenceOfStops),
    };
}

