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
public class DFWSecurityPolicyRules {
    public boolean logging_enabled;
    public String resource_type;
    public String id;
    public String display_name;
    public String description;
    public List<Tags> tags;
    public String path;
    public String relative_path;
    public String parent_path;
    public String unique_id;
    public String realization_id;
    public boolean marked_for_delete;
    public boolean overridden;
    public long sequence_number;
    public long internal_sequence_number;
    public String category;
    public boolean stateful;
    public boolean tcp_strict;
    public boolean locked;
    public int lock_modified_time;
    public List<String> scope;
    public boolean is_default;
    public Object _create_time;
    public String _create_user;
    public Object _last_modified_time;
    public String _last_modified_user;
    public boolean _system_owned;
    public String _protection;
    public int _revision;
    public String target_type;

}
