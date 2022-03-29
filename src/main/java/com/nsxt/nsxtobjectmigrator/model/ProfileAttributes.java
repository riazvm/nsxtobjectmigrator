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

public class ProfileAttributes {

    public String key;
    public List<String> value;
    public String datatype;
    public String attribute_source;
    public List<ProfileSubAttribute> sub_attributes;
}
