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
public class InventoryGroup {
    public List<InventoryGroupExpression> expression;
    public String display_name;
    public String description;
    public List<Tags> tags;
    public int _revision;
    /*
    public String id;
    public List<Object> extended_expression;
    public boolean reference;
    public String resource_type;
    public String path;
    public String relative_path;
    public String parent_path;
    public String unique_id;
    public String realization_id;
    public boolean marked_for_delete;
    public boolean overridden;
    public Object _create_time;
    public String _create_user;
    public Object _last_modified_time;
    public String _last_modified_user;
    public boolean _system_owned;
    public String _protection;

     */
}
