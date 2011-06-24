package com.joinbright.grsm.model.base;

import java.util.HashSet;
import java.util.Set;

/**
 * Expressiondfined entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Expressiondfined extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer formulaindex;
    private Protectionrule protectionrule;
    private String formula;
    private Short mainformula;
    private Set expressioneditors = new HashSet(0);

    // Constructors

    /** default constructor */
    public Expressiondfined() {
    }

    /** minimal constructor */
    public Expressiondfined(Integer formulaindex) {
        this.formulaindex = formulaindex;
    }

    /** full constructor */
    public Expressiondfined(Integer formulaindex,
            Protectionrule protectionrule, String formula, Short mainformula,
            Set expressioneditors) {
        this.formulaindex = formulaindex;
        this.protectionrule = protectionrule;
        this.formula = formula;
        this.mainformula = mainformula;
        this.expressioneditors = expressioneditors;
    }

    // Property accessors

    public Integer getFormulaindex() {
        return this.formulaindex;
    }

    public void setFormulaindex(Integer formulaindex) {
        this.formulaindex = formulaindex;
    }

    public Protectionrule getProtectionrule() {
        return this.protectionrule;
    }

    public void setProtectionrule(Protectionrule protectionrule) {
        this.protectionrule = protectionrule;
    }

    public String getFormula() {
        return this.formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Short getMainformula() {
        return this.mainformula;
    }

    public void setMainformula(Short mainformula) {
        this.mainformula = mainformula;
    }

    public Set getExpressioneditors() {
        return this.expressioneditors;
    }

    public void setExpressioneditors(Set expressioneditors) {
        this.expressioneditors = expressioneditors;
    }

}