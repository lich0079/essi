package com.joinbright.grsm.model.base;

import java.util.HashSet;
import java.util.Set;

/**
 * Protectionrule entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Protectionrule extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer ruleindex;
    private Protectionitem protectionitem;
    private String rulename;
    private Integer ruletype;
    private String branchtype;
    private String branchsubtype;
    private Short priority;
    private Short selected;
    private Short getvaluetype;
    private Set expressiondfineds = new HashSet(0);

    // Constructors

    /** default constructor */
    public Protectionrule() {
    }

    /** minimal constructor */
    public Protectionrule(Integer ruleindex) {
        this.ruleindex = ruleindex;
    }

    /** full constructor */
    public Protectionrule(Integer ruleindex, Protectionitem protectionitem,
            String rulename, Integer ruletype, String branchtype,
            String branchsubtype, Short priority, Short selected,
            Short getvaluetype, Set expressiondfineds) {
        this.ruleindex = ruleindex;
        this.protectionitem = protectionitem;
        this.rulename = rulename;
        this.ruletype = ruletype;
        this.branchtype = branchtype;
        this.branchsubtype = branchsubtype;
        this.priority = priority;
        this.selected = selected;
        this.getvaluetype = getvaluetype;
        this.expressiondfineds = expressiondfineds;
    }

    // Property accessors

    public Integer getRuleindex() {
        return this.ruleindex;
    }

    public void setRuleindex(Integer ruleindex) {
        this.ruleindex = ruleindex;
    }

    public Protectionitem getProtectionitem() {
        return this.protectionitem;
    }

    public void setProtectionitem(Protectionitem protectionitem) {
        this.protectionitem = protectionitem;
    }

    public String getRulename() {
        return this.rulename;
    }

    public void setRulename(String rulename) {
        this.rulename = rulename;
    }

    public Integer getRuletype() {
        return this.ruletype;
    }

    public void setRuletype(Integer ruletype) {
        this.ruletype = ruletype;
    }

    public String getBranchtype() {
        return this.branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public String getBranchsubtype() {
        return this.branchsubtype;
    }

    public void setBranchsubtype(String branchsubtype) {
        this.branchsubtype = branchsubtype;
    }

    public Short getPriority() {
        return this.priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }

    public Short getSelected() {
        return this.selected;
    }

    public void setSelected(Short selected) {
        this.selected = selected;
    }

    public Short getGetvaluetype() {
        return this.getvaluetype;
    }

    public void setGetvaluetype(Short getvaluetype) {
        this.getvaluetype = getvaluetype;
    }

    public Set getExpressiondfineds() {
        return this.expressiondfineds;
    }

    public void setExpressiondfineds(Set expressiondfineds) {
        this.expressiondfineds = expressiondfineds;
    }

}