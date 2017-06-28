/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for retrieving the list of top level domain legal agreements.
 */
public class TopLevelDomainAgreementOptionInner {
    /**
     * If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will
     * include agreements for domain privacy as well; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "includePrivacy")
    private Boolean includePrivacy;

    /**
     * If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will
     * include agreements for domain transfer as well; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "forTransfer")
    private Boolean forTransfer;

    /**
     * Get the includePrivacy value.
     *
     * @return the includePrivacy value
     */
    public Boolean includePrivacy() {
        return this.includePrivacy;
    }

    /**
     * Set the includePrivacy value.
     *
     * @param includePrivacy the includePrivacy value to set
     * @return the TopLevelDomainAgreementOptionInner object itself.
     */
    public TopLevelDomainAgreementOptionInner withIncludePrivacy(Boolean includePrivacy) {
        this.includePrivacy = includePrivacy;
        return this;
    }

    /**
     * Get the forTransfer value.
     *
     * @return the forTransfer value
     */
    public Boolean forTransfer() {
        return this.forTransfer;
    }

    /**
     * Set the forTransfer value.
     *
     * @param forTransfer the forTransfer value to set
     * @return the TopLevelDomainAgreementOptionInner object itself.
     */
    public TopLevelDomainAgreementOptionInner withForTransfer(Boolean forTransfer) {
        this.forTransfer = forTransfer;
        return this;
    }

}
