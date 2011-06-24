package com.joinbright.grsm.model.project;

/**
 * Runwaydescription entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Runwaydescription extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String runwaycode;
    private String runway;
    private String description;
    private String explanation;
    private String fatherrunway;
    private Short isnormal;
    private Short modifystatus;

    // Constructors

    /** default constructor */
    public Runwaydescription() {
    }

    /** minimal constructor */
    public Runwaydescription(String runwaycode, String runway) {
        this.runwaycode = runwaycode;
        this.runway = runway;
    }

    /** full constructor */
    public Runwaydescription(String runwaycode, String runway,
            String description, String explanation, String fatherrunway,
            Short isnormal, Short modifystatus) {
        this.runwaycode = runwaycode;
        this.runway = runway;
        this.description = description;
        this.explanation = explanation;
        this.fatherrunway = fatherrunway;
        this.isnormal = isnormal;
        this.modifystatus = modifystatus;
    }

    // Property accessors

    public String getRunwaycode() {
        return this.runwaycode;
    }

    public void setRunwaycode(String runwaycode) {
        this.runwaycode = runwaycode;
    }

    public String getRunway() {
        return this.runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getFatherrunway() {
        return this.fatherrunway;
    }

    public void setFatherrunway(String fatherrunway) {
        this.fatherrunway = fatherrunway;
    }

    public Short getIsnormal() {
        return this.isnormal;
    }

    public void setIsnormal(Short isnormal) {
        this.isnormal = isnormal;
    }

    public Short getModifystatus() {
        return this.modifystatus;
    }

    public void setModifystatus(Short modifystatus) {
        this.modifystatus = modifystatus;
    }

}