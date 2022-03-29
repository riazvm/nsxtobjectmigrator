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

public class InventoryGroupExpressions {



    public String member_type;
    public String key;
    public String operator;
    public String scope_operator;
    public String value;
    public String resource_type;
    /*public String id;
    public String path;
    public String relative_path;
    public String parent_path;
    public boolean marked_for_delete;
    public boolean overridden;
    public String _protection;
    public String conjunction_operator;
     */
}
