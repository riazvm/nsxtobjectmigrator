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
public class InventoryServiceEntryRow {

    @JsonProperty("ServiceEntry")
    public com.nsxt.nsxtobjectmigrator.model.InventoryServiceEntry serviceEntry;
    public String resource_type;
    public boolean marked_for_delete;

}
