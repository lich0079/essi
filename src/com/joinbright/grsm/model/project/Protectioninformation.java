package com.joinbright.grsm.model.project;

/**
 * Protectioninformation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Protectioninformation extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String index1;
    private String branchid;
    private String prolocation;
    private String substation;
    private String branchtype;
    private Short protectionscheme;
    private String protectionitem;
    private String protectioncode;
    private String protectioncode2;
    private String timecode;
    private Float defaultsettime;
    private Short valuestatus;
    private Short lockstatus;
    private Float primaryvalue;
    private Float formerprimaryvalue;
    private Float setvalue;
    private Float formervalue;
    private Float maximumprimaryvalue;
    private Float formermaximumprimaryvalue;
    private Float minimumprimaryvalue;
    private Float formerminimumprimaryvalue;
    private Short valuestatus2;
    private Float primaryvalue2;
    private Float formerprimaryvalue2;
    private Float setvalue2;
    private Float formervalue2;
    private Float maximumprimaryvalue2;
    private Float formermaximumprimaryvalue2;
    private Float minimumprimaryvalue2;
    private Float formerminimumprimaryvalue2;
    private Float timevalue;
    private Float formertimevalue;
    private Float maximumtimevalue;
    private Float formermaximumtimevalue;
    private Float minimumtimevalue;
    private Float formerminimumtimevalue;
    private Float ct1;
    private Float ct2;
    private Float pt1;
    private Float pt2;
    private Short rulezone;
    private String ruledescription;
    private Short ruletype;
    private Short settimetype;
    private Short selected;
    private Short priority;
    private Short getvaluetype;
    private String formula;
    private Short formulatype;
    private String displayformula;
    private Short formulaform;
    private String formulavariable;
    private Integer voltagelevel;
    private String variable;
    private String variabledescription;
    private Short variabletype;
    private Float variablevalue;
    private String variableunit;

    // Constructors

    /** default constructor */
    public Protectioninformation() {
    }


    public String getIndex1() {
        return index1;
    }


    public void setIndex1(String index1) {
        this.index1 = index1;
    }




    public String getBranchid() {
        return this.branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public String getProlocation() {
        return this.prolocation;
    }

    public void setProlocation(String prolocation) {
        this.prolocation = prolocation;
    }

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getBranchtype() {
        return this.branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public Short getProtectionscheme() {
        return this.protectionscheme;
    }

    public void setProtectionscheme(Short protectionscheme) {
        this.protectionscheme = protectionscheme;
    }

    public String getProtectionitem() {
        return this.protectionitem;
    }

    public void setProtectionitem(String protectionitem) {
        this.protectionitem = protectionitem;
    }

    public String getProtectioncode() {
        return this.protectioncode;
    }

    public void setProtectioncode(String protectioncode) {
        this.protectioncode = protectioncode;
    }

    public String getProtectioncode2() {
        return this.protectioncode2;
    }

    public void setProtectioncode2(String protectioncode2) {
        this.protectioncode2 = protectioncode2;
    }

    public String getTimecode() {
        return this.timecode;
    }

    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    public Float getDefaultsettime() {
        return this.defaultsettime;
    }

    public void setDefaultsettime(Float defaultsettime) {
        this.defaultsettime = defaultsettime;
    }

    public Short getValuestatus() {
        return this.valuestatus;
    }

    public void setValuestatus(Short valuestatus) {
        this.valuestatus = valuestatus;
    }

    public Short getLockstatus() {
        return this.lockstatus;
    }

    public void setLockstatus(Short lockstatus) {
        this.lockstatus = lockstatus;
    }

    public Float getPrimaryvalue() {
        return this.primaryvalue;
    }



    public Protectioninformation(String index1, String branchid,
            String prolocation, String substation, String branchtype,
            Short protectionscheme, String protectionitem,
            String protectioncode, String protectioncode2, String timecode,
            Float defaultsettime, Short valuestatus, Short lockstatus,
            Float primaryvalue, Float formerprimaryvalue, Float setvalue,
            Float formervalue, Float maximumprimaryvalue,
            Float formermaximumprimaryvalue, Float minimumprimaryvalue,
            Float formerminimumprimaryvalue, Short valuestatus2,
            Float primaryvalue2, Float formerprimaryvalue2, Float setvalue2,
            Float formervalue2, Float maximumprimaryvalue2,
            Float formermaximumprimaryvalue2, Float minimumprimaryvalue2,
            Float formerminimumprimaryvalue2, Float timevalue,
            Float formertimevalue, Float maximumtimevalue,
            Float formermaximumtimevalue, Float minimumtimevalue,
            Float formerminimumtimevalue, Float ct1, Float ct2, Float pt1,
            Float pt2, Short rulezone, String ruledescription, Short ruletype,
            Short settimetype, Short selected, Short priority,
            Short getvaluetype, String formula, Short formulatype,
            String displayformula, Short formulaform, String formulavariable,
            Integer voltagelevel, String variable, String variabledescription,
            Short variabletype, Float variablevalue, String variableunit) {
        super();
        this.index1 = index1;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.substation = substation;
        this.branchtype = branchtype;
        this.protectionscheme = protectionscheme;
        this.protectionitem = protectionitem;
        this.protectioncode = protectioncode;
        this.protectioncode2 = protectioncode2;
        this.timecode = timecode;
        this.defaultsettime = defaultsettime;
        this.valuestatus = valuestatus;
        this.lockstatus = lockstatus;
        this.primaryvalue = primaryvalue;
        this.formerprimaryvalue = formerprimaryvalue;
        this.setvalue = setvalue;
        this.formervalue = formervalue;
        this.maximumprimaryvalue = maximumprimaryvalue;
        this.formermaximumprimaryvalue = formermaximumprimaryvalue;
        this.minimumprimaryvalue = minimumprimaryvalue;
        this.formerminimumprimaryvalue = formerminimumprimaryvalue;
        this.valuestatus2 = valuestatus2;
        this.primaryvalue2 = primaryvalue2;
        this.formerprimaryvalue2 = formerprimaryvalue2;
        this.setvalue2 = setvalue2;
        this.formervalue2 = formervalue2;
        this.maximumprimaryvalue2 = maximumprimaryvalue2;
        this.formermaximumprimaryvalue2 = formermaximumprimaryvalue2;
        this.minimumprimaryvalue2 = minimumprimaryvalue2;
        this.formerminimumprimaryvalue2 = formerminimumprimaryvalue2;
        this.timevalue = timevalue;
        this.formertimevalue = formertimevalue;
        this.maximumtimevalue = maximumtimevalue;
        this.formermaximumtimevalue = formermaximumtimevalue;
        this.minimumtimevalue = minimumtimevalue;
        this.formerminimumtimevalue = formerminimumtimevalue;
        this.ct1 = ct1;
        this.ct2 = ct2;
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.rulezone = rulezone;
        this.ruledescription = ruledescription;
        this.ruletype = ruletype;
        this.settimetype = settimetype;
        this.selected = selected;
        this.priority = priority;
        this.getvaluetype = getvaluetype;
        this.formula = formula;
        this.formulatype = formulatype;
        this.displayformula = displayformula;
        this.formulaform = formulaform;
        this.formulavariable = formulavariable;
        this.voltagelevel = voltagelevel;
        this.variable = variable;
        this.variabledescription = variabledescription;
        this.variabletype = variabletype;
        this.variablevalue = variablevalue;
        this.variableunit = variableunit;
    }


    public void setPrimaryvalue(Float primaryvalue) {
        this.primaryvalue = primaryvalue;
    }

    public Float getFormerprimaryvalue() {
        return this.formerprimaryvalue;
    }

    public void setFormerprimaryvalue(Float formerprimaryvalue) {
        this.formerprimaryvalue = formerprimaryvalue;
    }

    public Float getSetvalue() {
        return this.setvalue;
    }

    public void setSetvalue(Float setvalue) {
        this.setvalue = setvalue;
    }

    public Float getFormervalue() {
        return this.formervalue;
    }

    public void setFormervalue(Float formervalue) {
        this.formervalue = formervalue;
    }

    public Float getMaximumprimaryvalue() {
        return this.maximumprimaryvalue;
    }

    public void setMaximumprimaryvalue(Float maximumprimaryvalue) {
        this.maximumprimaryvalue = maximumprimaryvalue;
    }

    public Float getFormermaximumprimaryvalue() {
        return this.formermaximumprimaryvalue;
    }

    public void setFormermaximumprimaryvalue(Float formermaximumprimaryvalue) {
        this.formermaximumprimaryvalue = formermaximumprimaryvalue;
    }

    public Float getMinimumprimaryvalue() {
        return this.minimumprimaryvalue;
    }

    public void setMinimumprimaryvalue(Float minimumprimaryvalue) {
        this.minimumprimaryvalue = minimumprimaryvalue;
    }

    public Float getFormerminimumprimaryvalue() {
        return this.formerminimumprimaryvalue;
    }

    public void setFormerminimumprimaryvalue(Float formerminimumprimaryvalue) {
        this.formerminimumprimaryvalue = formerminimumprimaryvalue;
    }

    public Short getValuestatus2() {
        return this.valuestatus2;
    }

    public void setValuestatus2(Short valuestatus2) {
        this.valuestatus2 = valuestatus2;
    }

    public Float getPrimaryvalue2() {
        return this.primaryvalue2;
    }

    public void setPrimaryvalue2(Float primaryvalue2) {
        this.primaryvalue2 = primaryvalue2;
    }

    public Float getFormerprimaryvalue2() {
        return this.formerprimaryvalue2;
    }

    public void setFormerprimaryvalue2(Float formerprimaryvalue2) {
        this.formerprimaryvalue2 = formerprimaryvalue2;
    }

    public Float getSetvalue2() {
        return this.setvalue2;
    }

    public void setSetvalue2(Float setvalue2) {
        this.setvalue2 = setvalue2;
    }

    public Float getFormervalue2() {
        return this.formervalue2;
    }

    public void setFormervalue2(Float formervalue2) {
        this.formervalue2 = formervalue2;
    }

    public Float getMaximumprimaryvalue2() {
        return this.maximumprimaryvalue2;
    }

    public void setMaximumprimaryvalue2(Float maximumprimaryvalue2) {
        this.maximumprimaryvalue2 = maximumprimaryvalue2;
    }

    public Float getFormermaximumprimaryvalue2() {
        return this.formermaximumprimaryvalue2;
    }

    public void setFormermaximumprimaryvalue2(Float formermaximumprimaryvalue2) {
        this.formermaximumprimaryvalue2 = formermaximumprimaryvalue2;
    }

    public Float getMinimumprimaryvalue2() {
        return this.minimumprimaryvalue2;
    }

    public void setMinimumprimaryvalue2(Float minimumprimaryvalue2) {
        this.minimumprimaryvalue2 = minimumprimaryvalue2;
    }

    public Float getFormerminimumprimaryvalue2() {
        return this.formerminimumprimaryvalue2;
    }

    public void setFormerminimumprimaryvalue2(Float formerminimumprimaryvalue2) {
        this.formerminimumprimaryvalue2 = formerminimumprimaryvalue2;
    }

    public Float getTimevalue() {
        return this.timevalue;
    }

    public void setTimevalue(Float timevalue) {
        this.timevalue = timevalue;
    }

    public Float getFormertimevalue() {
        return this.formertimevalue;
    }

    public void setFormertimevalue(Float formertimevalue) {
        this.formertimevalue = formertimevalue;
    }

    public Float getMaximumtimevalue() {
        return this.maximumtimevalue;
    }

    public void setMaximumtimevalue(Float maximumtimevalue) {
        this.maximumtimevalue = maximumtimevalue;
    }

    public Float getFormermaximumtimevalue() {
        return this.formermaximumtimevalue;
    }

    public void setFormermaximumtimevalue(Float formermaximumtimevalue) {
        this.formermaximumtimevalue = formermaximumtimevalue;
    }

    public Float getMinimumtimevalue() {
        return this.minimumtimevalue;
    }

    public void setMinimumtimevalue(Float minimumtimevalue) {
        this.minimumtimevalue = minimumtimevalue;
    }

    public Float getFormerminimumtimevalue() {
        return this.formerminimumtimevalue;
    }

    public void setFormerminimumtimevalue(Float formerminimumtimevalue) {
        this.formerminimumtimevalue = formerminimumtimevalue;
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

    public Short getRulezone() {
        return this.rulezone;
    }

    public void setRulezone(Short rulezone) {
        this.rulezone = rulezone;
    }

    public String getRuledescription() {
        return this.ruledescription;
    }

    public void setRuledescription(String ruledescription) {
        this.ruledescription = ruledescription;
    }

    public Short getRuletype() {
        return this.ruletype;
    }

    public void setRuletype(Short ruletype) {
        this.ruletype = ruletype;
    }

    public Short getSettimetype() {
        return this.settimetype;
    }

    public void setSettimetype(Short settimetype) {
        this.settimetype = settimetype;
    }

    public Short getSelected() {
        return this.selected;
    }

    public void setSelected(Short selected) {
        this.selected = selected;
    }

    public Short getPriority() {
        return this.priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }

    public Short getGetvaluetype() {
        return this.getvaluetype;
    }

    public void setGetvaluetype(Short getvaluetype) {
        this.getvaluetype = getvaluetype;
    }

    public String getFormula() {
        return this.formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Short getFormulatype() {
        return this.formulatype;
    }

    public void setFormulatype(Short formulatype) {
        this.formulatype = formulatype;
    }

    public String getDisplayformula() {
        return this.displayformula;
    }

    public void setDisplayformula(String displayformula) {
        this.displayformula = displayformula;
    }

    public Short getFormulaform() {
        return this.formulaform;
    }

    public void setFormulaform(Short formulaform) {
        this.formulaform = formulaform;
    }

    public String getFormulavariable() {
        return this.formulavariable;
    }

    public void setFormulavariable(String formulavariable) {
        this.formulavariable = formulavariable;
    }

    public Integer getVoltagelevel() {
        return this.voltagelevel;
    }

    public void setVoltagelevel(Integer voltagelevel) {
        this.voltagelevel = voltagelevel;
    }

    public String getVariable() {
        return this.variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getVariabledescription() {
        return this.variabledescription;
    }

    public void setVariabledescription(String variabledescription) {
        this.variabledescription = variabledescription;
    }

    public Short getVariabletype() {
        return this.variabletype;
    }

    public void setVariabletype(Short variabletype) {
        this.variabletype = variabletype;
    }

    public Float getVariablevalue() {
        return this.variablevalue;
    }

    public void setVariablevalue(Float variablevalue) {
        this.variablevalue = variablevalue;
    }

    public String getVariableunit() {
        return this.variableunit;
    }

    public void setVariableunit(String variableunit) {
        this.variableunit = variableunit;
    }

}