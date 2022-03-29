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
public class SecurityDFWPolicyRule {
    public String display_name;
    public int sequence_number;
    public String description;
    public List<String> source_groups;
    public List<String> destination_groups;
    public List<String> services;
    public List<String> profiles;
    public boolean logged;
    public List<String> scope;
}
