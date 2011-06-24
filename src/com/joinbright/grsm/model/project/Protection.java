package com.joinbright.grsm.model.project;

/**
 * Protection entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Protection extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String index1;
    private String protection;
    private String protectionitem;
    private String protectioncode;
    private String protectioncode2;
    private String timecode;
    private Float defaultsettime;
    private Short rulezone;
    private String ruledescription;
    private Short ruletype;
    private Short settimetype;
    private Short defaultpriority;
    private Short defaultselected;
    private Short getvaluetype;
    private String formula;
    private Short formulatype;
    private String formuladisplay;
    private Short formulaform;
    private String formulavariable;
    private Integer voltagelevel;
    private String variable;
    private String variabledescription;
    private Short variabletype;
    private Float variablevalue;
    private String variableunit;
    private String version;

    // Constructors

    /** default constructor */
    public Protection() {
    }

    /** minimal constructor */
    public Protection(String index1) {
        this.index1 = index1;
    }

    /** full constructor */
    public Protection(String index1, String protection, String protectionitem,
            String protectioncode, String protectioncode2, String timecode,
            Float defaultsettime, Short rulezone, String ruledescription,
            Short ruletype, Short settimetype, Short defaultpriority,
            Short defaultselected, Short getvaluetype, String formula,
            Short formulatype, String formuladisplay, Short formulaform,
            String formulavariable, Integer voltagelevel, String variable,
            String variabledescription, Short variabletype,
            Float variablevalue, String variableunit, String version) {
        this.index1 = index1;
        this.protection = protection;
        this.protectionitem = protectionitem;
        this.protectioncode = protectioncode;
        this.protectioncode2 = protectioncode2;
        this.timecode = timecode;
        this.defaultsettime = defaultsettime;
        this.rulezone = rulezone;
        this.ruledescription = ruledescription;
        this.ruletype = ruletype;
        this.settimetype = settimetype;
        this.defaultpriority = defaultpriority;
        this.defaultselected = defaultselected;
        this.getvaluetype = getvaluetype;
        this.formula = formula;
        this.formulatype = formulatype;
        this.formuladisplay = formuladisplay;
        this.formulaform = formulaform;
        this.formulavariable = formulavariable;
        this.voltagelevel = voltagelevel;
        this.variable = variable;
        this.variabledescription = variabledescription;
        this.variabletype = variabletype;
        this.variablevalue = variablevalue;
        this.variableunit = variableunit;
        this.version = version;
    }

    // Property accessors

    public String getIndex1() {
        return this.index1;
    }

    public void setIndex1(String index1) {
        this.index1 = index1;
    }

    public String getProtection() {
        return this.protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
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

    public Short getDefaultpriority() {
        return this.defaultpriority;
    }

    public void setDefaultpriority(Short defaultpriority) {
        this.defaultpriority = defaultpriority;
    }

    public Short getDefaultselected() {
        return this.defaultselected;
    }

    public void setDefaultselected(Short defaultselected) {
        this.defaultselected = defaultselected;
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

    public String getFormuladisplay() {
        return this.formuladisplay;
    }

    public void setFormuladisplay(String formuladisplay) {
        this.formuladisplay = formuladisplay;
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

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}