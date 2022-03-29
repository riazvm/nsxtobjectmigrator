package com.nsxt.nsxtobjectmigrator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryServiceRow {
    @JsonProperty("Service")
    public InventoryService service;
    public String resource_type;
    public boolean marked_for_delete;
}
