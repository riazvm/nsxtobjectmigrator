package com.nsxt.nsxtobjectmigrator.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ServiceEntity {
    public List<com.nsxt.nsxtobjectmigrator.model.ServiceEntityResults> results;
    public int result_count;
    public String sort_by;
    public boolean sort_ascending;
}
