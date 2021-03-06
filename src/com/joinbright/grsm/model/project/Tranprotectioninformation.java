package com.joinbright.grsm.model.project;

/**
 * Tranprotectioninformation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Tranprotectioninformation extends
        com.joinbright.grsm.model.BaseModel implements java.io.Serializable {

    // Fields

    private String index1;
    private String branchid;
    private String prolocation;
    private String substation;
    private String breaker;
    private String branchtype;
    private Short protectionscheme;
    private String protection;
    private String protectionitem;
    private Short itemdirection;
    private String protectioncode;
    private String protectioncode2;
    private String protectioncode3;
    private String timecode;
    private String timecode2;
    private String timecode3;
    private String timecode4;
    private Short rulezone;
    private String ruledescription;
    private Short ruletype;
    private String fitcondition;
    private Short settimetype;
    private Short priority;
    private Short selected;
    private Short getvaluetype;
    private String formula;
    private Short formulatype;
    private String formuladisplay;
    private Short formulaform;
    private String formulavariable;
    private Short voltagelevel;
    private String variable;
    private String variabledescription;
    private Short variabletype;
    private Float variablevalue;
    private String variableunit;

    // Constructors

    /** default constructor */
    public Tranprotectioninformation() {
    }


    public String getIndex1() {
        return index1;
    }


    public void setIndex1(String index1) {
        this.index1 = index1;
    }




    public String getProlocation() {
        return prolocation;
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

    public String getBreaker() {
        return this.breaker;
    }

    public void setBreaker(String breaker) {
        this.breaker = breaker;
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

    public Short getItemdirection() {
        return this.itemdirection;
    }

    public void setItemdirection(Short itemdirection) {
        this.itemdirection = itemdirection;
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



    public Tranprotectioninformation(String index1, String branchid,
            String prolocation, String substation, String breaker,
            String branchtype, Short protectionscheme, String protection,
            String protectionitem, Short itemdirection, String protectioncode,
            String protectioncode2, String protectioncode3, String timecode,
            String timecode2, String timecode3, String timecode4,
            Short rulezone, String ruledescription, Short ruletype,
            String fitcondition, Short settimetype, Short priority,
            Short selected, Short getvaluetype, String formula,
            Short formulatype, String formuladisplay, Short formulaform,
            String formulavariable, Short voltagelevel, String variable,
            String variabledescription, Short variabletype,
            Float variablevalue, String variableunit) {
        super();
        this.index1 = index1;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.substation = substation;
        this.breaker = breaker;
        this.branchtype = branchtype;
        this.protectionscheme = protectionscheme;
        this.protection = protection;
        this.protectionitem = protectionitem;
        this.itemdirection = itemdirection;
        this.protectioncode = protectioncode;
        this.protectioncode2 = protectioncode2;
        this.protectioncode3 = protectioncode3;
        this.timecode = timecode;
        this.timecode2 = timecode2;
        this.timecode3 = timecode3;
        this.timecode4 = timecode4;
        this.rulezone = rulezone;
        this.ruledescription = ruledescription;
        this.ruletype = ruletype;
        this.fitcondition = fitcondition;
        this.settimetype = settimetype;
        this.priority = priority;
        this.selected = selected;
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
    }


    public String getBranchid() {
        return branchid;
    }


    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }


    public void setProtectioncode2(String protectioncode2) {
        this.protectioncode2 = protectioncode2;
    }

    public String getProtectioncode3() {
        return this.protectioncode3;
    }

    public void setProtectioncode3(String protectioncode3) {
        this.protectioncode3 = protectioncode3;
    }

    public String getTimecode() {
        return this.timecode;
    }

    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    public String getTimecode2() {
        return this.timecode2;
    }

    public void setTimecode2(String timecode2) {
        this.timecode2 = timecode2;
    }

    public String getTimecode3() {
        return this.timecode3;
    }

    public void setTimecode3(String timecode3) {
        this.timecode3 = timecode3;
    }

    public String getTimecode4() {
        return this.timecode4;
    }

    public void setTimecode4(String timecode4) {
        this.timecode4 = timecode4;
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

    public String getFitcondition() {
        return this.fitcondition;
    }

    public void setFitcondition(String fitcondition) {
        this.fitcondition = fitcondition;
    }

    public Short getSettimetype() {
        return this.settimetype;
    }

    public void setSettimetype(Short settimetype) {
        this.settimetype = settimetype;
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

    public Short getVoltagelevel() {
        return this.voltagelevel;
    }

    public void setVoltagelevel(Short voltagelevel) {
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