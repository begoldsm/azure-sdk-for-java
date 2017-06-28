/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.documentdb;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The consistency policy for the DocumentDB database account.
 */
public class ConsistencyPolicy {
    /**
     * The default consistency level and configuration settings of the
     * DocumentDB account. Possible values include: 'Eventual', 'Session',
     * 'BoundedStaleness', 'Strong'.
     */
    @JsonProperty(value = "defaultConsistencyLevel", required = true)
    private DefaultConsistencyLevel defaultConsistencyLevel;

    /**
     * When used with the Bounded Staleness consistency level, this value
     * represents the number of stale requests tolerated. Accepted range for
     * this value is 1 – 2,147,483,647. Required when defaultConsistencyPolicy
     * is set to 'BoundedStaleness'.
     */
    @JsonProperty(value = "maxStalenessPrefix")
    private Long maxStalenessPrefix;

    /**
     * When used with the Bounded Staleness consistency level, this value
     * represents the time amount of staleness (in seconds) tolerated. Accepted
     * range for this value is 1 - 100. Required when defaultConsistencyPolicy
     * is set to 'BoundedStaleness'.
     */
    @JsonProperty(value = "maxIntervalInSeconds")
    private Integer maxIntervalInSeconds;

    /**
     * Get the defaultConsistencyLevel value.
     *
     * @return the defaultConsistencyLevel value
     */
    public DefaultConsistencyLevel defaultConsistencyLevel() {
        return this.defaultConsistencyLevel;
    }

    /**
     * Set the defaultConsistencyLevel value.
     *
     * @param defaultConsistencyLevel the defaultConsistencyLevel value to set
     * @return the ConsistencyPolicy object itself.
     */
    public ConsistencyPolicy withDefaultConsistencyLevel(DefaultConsistencyLevel defaultConsistencyLevel) {
        this.defaultConsistencyLevel = defaultConsistencyLevel;
        return this;
    }

    /**
     * Get the maxStalenessPrefix value.
     *
     * @return the maxStalenessPrefix value
     */
    public Long maxStalenessPrefix() {
        return this.maxStalenessPrefix;
    }

    /**
     * Set the maxStalenessPrefix value.
     *
     * @param maxStalenessPrefix the maxStalenessPrefix value to set
     * @return the ConsistencyPolicy object itself.
     */
    public ConsistencyPolicy withMaxStalenessPrefix(Long maxStalenessPrefix) {
        this.maxStalenessPrefix = maxStalenessPrefix;
        return this;
    }

    /**
     * Get the maxIntervalInSeconds value.
     *
     * @return the maxIntervalInSeconds value
     */
    public Integer maxIntervalInSeconds() {
        return this.maxIntervalInSeconds;
    }

    /**
     * Set the maxIntervalInSeconds value.
     *
     * @param maxIntervalInSeconds the maxIntervalInSeconds value to set
     * @return the ConsistencyPolicy object itself.
     */
    public ConsistencyPolicy withMaxIntervalInSeconds(Integer maxIntervalInSeconds) {
        this.maxIntervalInSeconds = maxIntervalInSeconds;
        return this;
    }

}
