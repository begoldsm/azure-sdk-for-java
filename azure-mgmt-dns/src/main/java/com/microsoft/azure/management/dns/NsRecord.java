/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns;


/**
 * An NS record.
 */
public class NsRecord {
    /**
     * Gets or sets the name server name for this record, without a
     * terminating dot.
     */
    private String nsdname;

    /**
     * Get the nsdname value.
     *
     * @return the nsdname value
     */
    public String nsdname() {
        return this.nsdname;
    }

    /**
     * Set the nsdname value.
     *
     * @param nsdname the nsdname value to set
     * @return the NsRecord object itself.
     */
    public NsRecord withNsdname(String nsdname) {
        this.nsdname = nsdname;
        return this;
    }

}