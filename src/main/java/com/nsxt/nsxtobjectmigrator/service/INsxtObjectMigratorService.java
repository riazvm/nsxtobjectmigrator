package com.nsxt.nsxtobjectmigrator.service;

import com.nsxt.nsxtobjectmigrator.model.Policy;
import com.nsxt.nsxtobjectmigrator.model.PolicyRule;
import com.nsxt.nsxtobjectmigrator.model.ServiceEntity;
import reactor.core.publisher.Mono;

/**
 * <h1>IDfwOptimizerService</h1>
 * Interface for DfwOptimizerService Implementation
 *
 * @author Riaz Mohamed
 * @version 1.0
 * @since 03/25/2022
 */
public interface INsxtObjectMigratorService {

   //void findAll();

   public Mono<Policy> getAllPolicies() throws Exception;

   public Mono<PolicyRule> getPolicy(String policyID) throws Exception;

   public Mono<ServiceEntity> getServiceEntity(String serviceID) throws Exception;

   public void optimizeServiceByRule(String policyID, String ruleID) throws Exception;

   public void optimizeServiceByPolicy(String policyID) throws Exception;

   public void optimizeServiceAll() throws Exception;
}
