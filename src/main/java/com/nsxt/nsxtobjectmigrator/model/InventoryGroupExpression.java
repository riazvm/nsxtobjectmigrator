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

public class InventoryGroupExpression {

    public String key;
    public String operator;
    public String value;
    public String scope_operator;
    public String resource_type;
    public List<InventoryGroupExpressions> expressions;
    /*
    public List<String> ip_addresses;
    public String id;
    public String path;
    public String relative_path;
    public String parent_path;
    public boolean marked_for_delete;
    public boolean overridden;
    public String _protection;
    public String member_type;
    public List<String> paths;
    public List<String> external_ids;
    public String conjunction_operator;

     */
}
