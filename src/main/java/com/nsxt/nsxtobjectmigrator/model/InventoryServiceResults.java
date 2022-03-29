package com.nsxt.nsxtobjectmigrator.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryServiceResults {
    public List<InventoryService> results;
    public int result_count;
    public String sort_by;
    public boolean sort_ascending;
}

