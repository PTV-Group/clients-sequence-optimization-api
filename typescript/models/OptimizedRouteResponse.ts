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
    ErrorResponse,
    ErrorResponseFromJSON,
    ErrorResponseFromJSONTyped,
    ErrorResponseToJSON,
} from './ErrorResponse';
import {
    OperationStatus,
    OperationStatusFromJSON,
    OperationStatusFromJSONTyped,
    OperationStatusToJSON,
} from './OperationStatus';
import {
    OptimizedRoute,
    OptimizedRouteFromJSON,
    OptimizedRouteFromJSONTyped,
    OptimizedRouteToJSON,
} from './OptimizedRoute';

/**
 * Contains the results of an optimization. If the 'status' is 'RUNNING', the calculation is still running and no further properties are set. If the 'status' is 'SUCCEEDED', the optimization result is present as property 'optimizedRoute'. If the 'status' is 'FAILED', the failure result is present as property 'error'.
 * @export
 * @interface OptimizedRouteResponse
 */
export interface OptimizedRouteResponse {
    /**
     * 
     * @type {OperationStatus}
     * @memberof OptimizedRouteResponse
     */
    status: OperationStatus;
    /**
     * 
     * @type {OptimizedRoute}
     * @memberof OptimizedRouteResponse
     */
    optimizedRoute?: OptimizedRoute;
    /**
     * A human readable message that describes the error. Set and used only when operation status is FAILED.
     * @type {ErrorResponse}
     * @memberof OptimizedRouteResponse
     */
    error?: ErrorResponse | null;
}

export function OptimizedRouteResponseFromJSON(json: any): OptimizedRouteResponse {
    return OptimizedRouteResponseFromJSONTyped(json, false);
}

export function OptimizedRouteResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): OptimizedRouteResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'status': OperationStatusFromJSON(json['status']),
        'optimizedRoute': !exists(json, 'optimizedRoute') ? undefined : OptimizedRouteFromJSON(json['optimizedRoute']),
        'error': !exists(json, 'error') ? undefined : ErrorResponseFromJSON(json['error']),
    };
}

export function OptimizedRouteResponseToJSON(value?: OptimizedRouteResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'status': OperationStatusToJSON(value.status),
        'optimizedRoute': OptimizedRouteToJSON(value.optimizedRoute),
        'error': ErrorResponseToJSON(value.error),
    };
}

