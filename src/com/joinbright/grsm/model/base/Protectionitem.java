package com.joinbright.grsm.model.base;

import java.util.HashSet;
import java.util.Set;

/**
 * Protectionitem entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Protectionitem extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer itemindex;
    private Protectionlist protectionlist;
    private String item;
    private String description;
    private Float minimumvalue;
    private Float maximumvalue;
    private String unit;
    private Short orinentation;
    private String branchtype;
    private Short branchsubtype;
    private Short orientation;
    private Short valuetype;
    private Short settingvaluetype;
    private String settingvaluesubtype;
    private String result;
    private Float ct1;
    private Float ct2;
    private Float pt1;
    private Float pt2;
    private Set protectionrules = new HashSet(0);

    // Constructors

    /** default constructor */
    public Protectionitem() {
    }

    /** minimal constructor */
    public Protectionitem(Integer itemindex) {
        this.itemindex = itemindex;
    }

    /** full constructor */
    public Protectionitem(Integer itemindex, Protectionlist protectionlist,
            String item, String description, Float minimumvalue,
            Float maximumvalue, String unit, Short orinentation,
            String branchtype, Short branchsubtype, Short orientation,
            Short valuetype, Short settingvaluetype,
            String settingvaluesubtype, String result, Float ct1, Float ct2,
            Float pt1, Float pt2, Set protectionrules) {
        this.itemindex = itemindex;
        this.protectionlist = protectionlist;
        this.item = item;
        this.description = description;
        this.minimumvalue = minimumvalue;
        this.maximumvalue = maximumvalue;
        this.unit = unit;
        this.orinentation = orinentation;
        this.branchtype = branchtype;
        this.branchsubtype = branchsubtype;
        this.orientation = orientation;
        this.valuetype = valuetype;
        this.settingvaluetype = settingvaluetype;
        this.settingvaluesubtype = settingvaluesubtype;
        this.result = result;
        this.ct1 = ct1;
        this.ct2 = ct2;
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.protectionrules = protectionrules;
    }

    // Property accessors

    public Integer getItemindex() {
        return this.itemindex;
    }

    public void setItemindex(Integer itemindex) {
        this.itemindex = itemindex;
    }

    public Protectionlist getProtectionlist() {
        return this.protectionlist;
    }

    public void setProtectionlist(Protectionlist protectionlist) {
        this.protectionlist = protectionlist;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getMinimumvalue() {
        return this.minimumvalue;
    }

    public void setMinimumvalue(Float minimumvalue) {
        this.minimumvalue = minimumvalue;
    }

    public Float getMaximumvalue() {
        return this.maximumvalue;
    }

    public void setMaximumvalue(Float maximumvalue) {
        this.maximumvalue = maximumvalue;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Short getOrinentation() {
        return this.orinentation;
    }

    public void setOrinentation(Short orinentation) {
        this.orinentation = orinentation;
    }

    public String getBranchtype() {
        return this.branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public Short getBranchsubtype() {
        return this.branchsubtype;
    }

    public void setBranchsubtype(Short branchsubtype) {
        this.branchsubtype = branchsubtype;
    }

    public Short getOrientation() {
        return this.orientation;
    }

    public void setOrientation(Short orientation) {
        this.orientation = orientation;
    }

    public Short getValuetype() {
        return this.valuetype;
    }

    public void setValuetype(Short valuetype) {
        this.valuetype = valuetype;
    }

    public Short getSettingvaluetype() {
        return this.settingvaluetype;
    }

    public void setSettingvaluetype(Short settingvaluetype) {
        this.settingvaluetype = settingvaluetype;
    }

    public String getSettingvaluesubtype() {
        return this.settingvaluesubtype;
    }

    public void setSettingvaluesubtype(String settingvaluesubtype) {
        this.settingvaluesubtype = settingvaluesubtype;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Float getCt1() {
        return this.ct1;
    }

    public void setCt1(Float ct1) {
        this.ct1 = ct1;
    }

    public Float getCt2() {
        return this.ct2;
    }

    public void setCt2(Float ct2) {
        this.ct2 = ct2;
    }

    public Float getPt1() {
        return this.pt1;
    }

    public void setPt1(Float pt1) {
        this.pt1 = pt1;
    }

    public Float getPt2() {
        return this.pt2;
    }

    public void setPt2(Float pt2) {
        this.pt2 = pt2;
    }

    public Set getProtectionrules() {
        return this.protectionrules;
    }

    public void setProtectionrules(Set protectionrules) {
        this.protectionrules = protectionrules;
    }

}