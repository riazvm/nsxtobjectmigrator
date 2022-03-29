package com.nsxt.nsxtobjectmigrator.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PolicyRule {
    public List<PolicyRuleResults> rules;
    public String id;
    public String display_name;
    public String category;

}
