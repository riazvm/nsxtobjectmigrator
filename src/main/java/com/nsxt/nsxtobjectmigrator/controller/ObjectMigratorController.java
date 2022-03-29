package com.nsxt.nsxtobjectmigrator.controller;

import com.nsxt.nsxtobjectmigrator.model.Policy;
import com.nsxt.nsxtobjectmigrator.model.PolicyRule;
import com.nsxt.nsxtobjectmigrator.service.NsxtObjectMigratorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * <h1>ObjectMigratorController</h1>
 *
 * @author Riaz Mohamed
 * @version 1.0
 * @since 03/25/2022
 */

@RestController
public class ObjectMigratorController {

    Logger logger = LoggerFactory.getLogger(ObjectMigratorController.class);

    @Autowired
    private NsxtObjectMigratorService nsxtObjectMigratorService;

    /**
     * getHealth - To be replaced by actuator
     */
    @RequestMapping("/health")
    public String getHealth() throws InterruptedException {
        return "Ok";
    }
    /**
     * getAllPolicies - Call NSX to get all policies
     *
     * @return All policies
     */
    @RequestMapping("/getAllPolicies")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Policy> getAllPolicies() throws Exception {
        Mono<Policy> policy = nsxtObjectMigratorService.getAllPolicies();
        return policy;
    }
    /**
     * getPolicy - Get a Specific policy
     * @param policyID
     * @return All rules for the Policy
     */
    @RequestMapping("/getPolicy")
    @ResponseStatus(HttpStatus.OK)
    public Mono<PolicyRule> getPolicy(@RequestParam String policyID) throws Exception {
        Mono<PolicyRule> policyRules = nsxtObjectMigratorService.getPolicy(policyID);
        return policyRules;
    }
    /**
     * optimizeServiceByPolicy - Optimize service by a policy ID
     * @param policyID
     *
     */
    @PostMapping
    @RequestMapping("/optimizeServiceByPolicy")
    @ResponseStatus(HttpStatus.OK)
    public void optimizeServiceByPolicy(@RequestParam String policyID) throws Exception {
        nsxtObjectMigratorService.optimizeServiceByPolicy(policyID);
    }
    /**
     * optimizeServiceByRule - Optimize service in a rule of a policy
     * @param policyID
     * @param ruleID
     *
     */
    @PostMapping
    @RequestMapping("/optimizeServiceByRule")
    @ResponseStatus(HttpStatus.OK)
    public void optimizeServiceByRule(@RequestParam String policyID, @RequestParam String ruleID) throws Exception {
        System.out.println("optimizeServiceByRule"+policyID+"----"+ruleID);
        nsxtObjectMigratorService.optimizeServiceByRule(policyID,ruleID);
    }
    /**
     * optimizeServiceAll - Optimize all services
     *
     */
    @PostMapping
    @RequestMapping("/optimizeServiceAll")
    @ResponseStatus(HttpStatus.OK)
    public void optimizeServiceAll() throws Exception {
        nsxtObjectMigratorService.optimizeServiceAll();
    }
}