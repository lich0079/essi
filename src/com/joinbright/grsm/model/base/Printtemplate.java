package com.joinbright.grsm.model.base;

/**
 * Printtemplate entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Printtemplate extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String printtype;
    private String printtemplate;
    private Short templatetype;

    // Constructors

    /** default constructor */
    public Printtemplate() {
    }

    public String getPrinttype() {
        return printtype;
    }

    public void setPrinttype(String printtype) {
        this.printtype = printtype;
    }

    public String getPrinttemplate() {
        return printtemplate;
    }

    public void setPrinttemplate(String printtemplate) {
        this.printtemplate = printtemplate;
    }

    public Short getTemplatetype() {
        return templatetype;
    }

    public void setTemplatetype(Short templatetype) {
        this.templatetype = templatetype;
    }

    public Printtemplate(String printtype, String printtemplate,
            Short templatetype) {
        super();
        this.printtype = printtype;
        this.printtemplate = printtemplate;
        this.templatetype = templatetype;
    }


}