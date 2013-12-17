// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.monitoring.metrics.models;

import java.util.ArrayList;
import java.util.Calendar;
import javax.xml.datatype.Duration;

/**
* A metric value set.
*/
public class MetricValueSet
{
    private String displayName;
    
    /**
    * Metric display name.
    */
    public String getDisplayName() { return this.displayName; }
    
    /**
    * Metric display name.
    */
    public void setDisplayName(String displayName) { this.displayName = displayName; }
    
    private Calendar endTime;
    
    /**
    * Metric end time.
    */
    public Calendar getEndTime() { return this.endTime; }
    
    /**
    * Metric end time.
    */
    public void setEndTime(Calendar endTime) { this.endTime = endTime; }
    
    private ArrayList<MetricValue> metricValues;
    
    /**
    * Metric values.
    */
    public ArrayList<MetricValue> getMetricValues() { return this.metricValues; }
    
    /**
    * Metric values.
    */
    public void setMetricValues(ArrayList<MetricValue> metricValues) { this.metricValues = metricValues; }
    
    private String name;
    
    /**
    * Metric name.
    */
    public String getName() { return this.name; }
    
    /**
    * Metric name.
    */
    public void setName(String name) { this.name = name; }
    
    private String namespace;
    
    /**
    * Metric namespace.
    */
    public String getNamespace() { return this.namespace; }
    
    /**
    * Metric namespace.
    */
    public void setNamespace(String namespace) { this.namespace = namespace; }
    
    private String primaryAggregation;
    
    /**
    * Metric primary aggregation.
    */
    public String getPrimaryAggregation() { return this.primaryAggregation; }
    
    /**
    * Metric primary aggregation.
    */
    public void setPrimaryAggregation(String primaryAggregation) { this.primaryAggregation = primaryAggregation; }
    
    private Calendar startTime;
    
    /**
    * Metric start time.
    */
    public Calendar getStartTime() { return this.startTime; }
    
    /**
    * Metric start time.
    */
    public void setStartTime(Calendar startTime) { this.startTime = startTime; }
    
    private Duration timeGrain;
    
    /**
    * Metric time grain.
    */
    public Duration getTimeGrain() { return this.timeGrain; }
    
    /**
    * Metric time grain.
    */
    public void setTimeGrain(Duration timeGrain) { this.timeGrain = timeGrain; }
    
    private String unit;
    
    /**
    * Metric unit.
    */
    public String getUnit() { return this.unit; }
    
    /**
    * Metric unit.
    */
    public void setUnit(String unit) { this.unit = unit; }
    
    /**
    * Initializes a new instance of the MetricValueSet class.
    *
    */
    public MetricValueSet()
    {
        this.metricValues = new ArrayList<MetricValue>();
    }
}
