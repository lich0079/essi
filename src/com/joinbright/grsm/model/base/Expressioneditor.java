package com.joinbright.grsm.model.base;

/**
 * Expressioneditor entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Expressioneditor extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer variableindex;
    private Expressiondfined expressiondfined;
    private String code;
    private String name;
    private String description;
    private Short sortindex;
    private Short type;
    private Short valuetype;
    private Short inputtype;
    private String variablevalue;
    private Short variabletop;
    private Short variableleft;
    private Short variableheight;
    private Short variablewidth;

    // Constructors

    /** default constructor */
    public Expressioneditor() {
    }

    /** minimal constructor */
    public Expressioneditor(Integer variableindex) {
        this.variableindex = variableindex;
    }

    /** full constructor */
    public Expressioneditor(Integer variableindex,
            Expressiondfined expressiondfined, String code, String name,
            String description, Short sortindex, Short type, Short valuetype,
            Short inputtype, String variablevalue, Short variabletop,
            Short variableleft, Short variableheight, Short variablewidth) {
        this.variableindex = variableindex;
        this.expressiondfined = expressiondfined;
        this.code = code;
        this.name = name;
        this.description = description;
        this.sortindex = sortindex;
        this.type = type;
        this.valuetype = valuetype;
        this.inputtype = inputtype;
        this.variablevalue = variablevalue;
        this.variabletop = variabletop;
        this.variableleft = variableleft;
        this.variableheight = variableheight;
        this.variablewidth = variablewidth;
    }

    // Property accessors

    public Integer getVariableindex() {
        return this.variableindex;
    }

    public void setVariableindex(Integer variableindex) {
        this.variableindex = variableindex;
    }

    public Expressiondfined getExpressiondfined() {
        return this.expressiondfined;
    }

    public void setExpressiondfined(Expressiondfined expressiondfined) {
        this.expressiondfined = expressiondfined;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getSortindex() {
        return this.sortindex;
    }

    public void setSortindex(Short sortindex) {
        this.sortindex = sortindex;
    }

    public Short getType() {
        return this.type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getValuetype() {
        return this.valuetype;
    }

    public void setValuetype(Short valuetype) {
        this.valuetype = valuetype;
    }

    public Short getInputtype() {
        return this.inputtype;
    }

    public void setInputtype(Short inputtype) {
        this.inputtype = inputtype;
    }

    public String getVariablevalue() {
        return this.variablevalue;
    }

    public void setVariablevalue(String variablevalue) {
        this.variablevalue = variablevalue;
    }

    public Short getVariabletop() {
        return this.variabletop;
    }

    public void setVariabletop(Short variabletop) {
        this.variabletop = variabletop;
    }

    public Short getVariableleft() {
        return this.variableleft;
    }

    public void setVariableleft(Short variableleft) {
        this.variableleft = variableleft;
    }

    public Short getVariableheight() {
        return this.variableheight;
    }

    public void setVariableheight(Short variableheight) {
        this.variableheight = variableheight;
    }

    public Short getVariablewidth() {
        return this.variablewidth;
    }

    public void setVariablewidth(Short variablewidth) {
        this.variablewidth = variablewidth;
    }

}