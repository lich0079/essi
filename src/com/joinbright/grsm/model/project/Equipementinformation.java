package com.joinbright.grsm.model.project;

/**
 * Equipementinformation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Equipementinformation extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer index1;
    private String code;
    private Integer equipmentindex;
    private String branchid;
    private Short prolocation;
    private String branchtype;
    private String name;
    private Integer systemid;
    private Short status;
    private Short selected;
    private String primaryvalue;
    private String formerprimaryvalue;
    private String value1;
    private String formervalue;
    private Short orientation;
    private String unit;
    private Short valuetype;
    private Short settingvaluetype;
    private String result;
    private Float ct1;
    private Float ct2;
    private Short ctconnectiontype;
    private Float MCt1;
    private Float MCt2;
    private Float LCt1;
    private Float LCt2;
    private Short LCtconnectontype;
    private Short MCtconnectiontype;
    private Float pt1;
    private Float pt2;
    private Float MPt1;
    private Float MPt2;
    private Float LPt1;
    private Float LPt2;
    private Float earthCt1;
    private Float earthCt2;
    private Short earthCtconnectiontype;
    private Short basicprolocation;
    private Short configurationdisplay;
    private Short priority;

    // Constructors

    /** default constructor */
    public Equipementinformation() {
    }

    /** minimal constructor */
    public Equipementinformation(Integer index1, Short prolocation) {
        this.index1 = index1;
        this.prolocation = prolocation;
    }

    /** full constructor */
    public Equipementinformation(Integer index1, String code,
            Integer equipmentindex, String branchid, Short prolocation,
            String branchtype, String name, Integer systemid, Short status,
            Short selected, String primaryvalue, String formerprimaryvalue,
            String value1, String formervalue, Short orientation, String unit,
            Short valuetype, Short settingvaluetype, String result, Float ct1,
            Float ct2, Short ctconnectiontype, Float MCt1, Float MCt2,
            Float LCt1, Float LCt2, Short LCtconnectontype,
            Short MCtconnectiontype, Float pt1, Float pt2, Float MPt1,
            Float MPt2, Float LPt1, Float LPt2, Float earthCt1, Float earthCt2,
            Short earthCtconnectiontype, Short basicprolocation,
            Short configurationdisplay, Short priority) {
        this.index1 = index1;
        this.code = code;
        this.equipmentindex = equipmentindex;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.branchtype = branchtype;
        this.name = name;
        this.systemid = systemid;
        this.status = status;
        this.selected = selected;
        this.primaryvalue = primaryvalue;
        this.formerprimaryvalue = formerprimaryvalue;
        this.value1 = value1;
        this.formervalue = formervalue;
        this.orientation = orientation;
        this.unit = unit;
        this.valuetype = valuetype;
        this.settingvaluetype = settingvaluetype;
        this.result = result;
        this.ct1 = ct1;
        this.ct2 = ct2;
        this.ctconnectiontype = ctconnectiontype;
        this.MCt1 = MCt1;
        this.MCt2 = MCt2;
        this.LCt1 = LCt1;
        this.LCt2 = LCt2;
        this.LCtconnectontype = LCtconnectontype;
        this.MCtconnectiontype = MCtconnectiontype;
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.MPt1 = MPt1;
        this.MPt2 = MPt2;
        this.LPt1 = LPt1;
        this.LPt2 = LPt2;
        this.earthCt1 = earthCt1;
        this.earthCt2 = earthCt2;
        this.earthCtconnectiontype = earthCtconnectiontype;
        this.basicprolocation = basicprolocation;
        this.configurationdisplay = configurationdisplay;
        this.priority = priority;
    }

    // Property accessors

    public Integer getIndex1() {
        return this.index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getEquipmentindex() {
        return this.equipmentindex;
    }

    public void setEquipmentindex(Integer equipmentindex) {
        this.equipmentindex = equipmentindex;
    }

    public String getBranchid() {
        return this.branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public Short getProlocation() {
        return this.prolocation;
    }

    public void setProlocation(Short prolocation) {
        this.prolocation = prolocation;
    }

    public String getBranchtype() {
        return this.branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSystemid() {
        return this.systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }

    public Short getStatus() {
        return this.status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getSelected() {
        return this.selected;
    }

    public void setSelected(Short selected) {
        this.selected = selected;
    }

    public String getPrimaryvalue() {
        return this.primaryvalue;
    }

    public void setPrimaryvalue(String primaryvalue) {
        this.primaryvalue = primaryvalue;
    }

    public String getFormerprimaryvalue() {
        return this.formerprimaryvalue;
    }

    public void setFormerprimaryvalue(String formerprimaryvalue) {
        this.formerprimaryvalue = formerprimaryvalue;
    }

    public String getValue1() {
        return this.value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getFormervalue() {
        return this.formervalue;
    }

    public void setFormervalue(String formervalue) {
        this.formervalue = formervalue;
    }

    public Short getOrientation() {
        return this.orientation;
    }

    public void setOrientation(Short orientation) {
        this.orientation = orientation;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public Short getCtconnectiontype() {
        return this.ctconnectiontype;
    }

    public void setCtconnectiontype(Short ctconnectiontype) {
        this.ctconnectiontype = ctconnectiontype;
    }

    public Float getMCt1() {
        return this.MCt1;
    }

    public void setMCt1(Float MCt1) {
        this.MCt1 = MCt1;
    }

    public Float getMCt2() {
        return this.MCt2;
    }

    public void setMCt2(Float MCt2) {
        this.MCt2 = MCt2;
    }

    public Float getLCt1() {
        return this.LCt1;
    }

    public void setLCt1(Float LCt1) {
        this.LCt1 = LCt1;
    }

    public Float getLCt2() {
        return this.LCt2;
    }

    public void setLCt2(Float LCt2) {
        this.LCt2 = LCt2;
    }

    public Short getLCtconnectontype() {
        return this.LCtconnectontype;
    }

    public void setLCtconnectontype(Short LCtconnectontype) {
        this.LCtconnectontype = LCtconnectontype;
    }

    public Short getMCtconnectiontype() {
        return this.MCtconnectiontype;
    }

    public void setMCtconnectiontype(Short MCtconnectiontype) {
        this.MCtconnectiontype = MCtconnectiontype;
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

    public Float getMPt1() {
        return this.MPt1;
    }

    public void setMPt1(Float MPt1) {
        this.MPt1 = MPt1;
    }

    public Float getMPt2() {
        return this.MPt2;
    }

    public void setMPt2(Float MPt2) {
        this.MPt2 = MPt2;
    }

    public Float getLPt1() {
        return this.LPt1;
    }

    public void setLPt1(Float LPt1) {
        this.LPt1 = LPt1;
    }

    public Float getLPt2() {
        return this.LPt2;
    }

    public void setLPt2(Float LPt2) {
        this.LPt2 = LPt2;
    }

    public Float getEarthCt1() {
        return this.earthCt1;
    }

    public void setEarthCt1(Float earthCt1) {
        this.earthCt1 = earthCt1;
    }

    public Float getEarthCt2() {
        return this.earthCt2;
    }

    public void setEarthCt2(Float earthCt2) {
        this.earthCt2 = earthCt2;
    }

    public Short getEarthCtconnectiontype() {
        return this.earthCtconnectiontype;
    }

    public void setEarthCtconnectiontype(Short earthCtconnectiontype) {
        this.earthCtconnectiontype = earthCtconnectiontype;
    }

    public Short getBasicprolocation() {
        return this.basicprolocation;
    }

    public void setBasicprolocation(Short basicprolocation) {
        this.basicprolocation = basicprolocation;
    }

    public Short getConfigurationdisplay() {
        return this.configurationdisplay;
    }

    public void setConfigurationdisplay(Short configurationdisplay) {
        this.configurationdisplay = configurationdisplay;
    }

    public Short getPriority() {
        return this.priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }

}