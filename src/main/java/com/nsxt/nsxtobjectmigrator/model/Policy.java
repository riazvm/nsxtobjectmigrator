package com.nsxt.nsxtobjectmigrator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Policy {
        @JsonProperty(required = true)
        public boolean sort_ascending;
        public String sort_by;
        public int result_count;
        public List<com.nsxt.nsxtobjectmigrator.model.PolicyResults> results;

}
