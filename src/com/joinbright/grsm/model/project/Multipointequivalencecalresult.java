package com.joinbright.grsm.model.project;

/**
 * Multipointequivalencecalresult entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Multipointequivalencecalresult extends
        com.joinbright.grsm.model.BaseModel implements java.io.Serializable {

    // Fields

    private Integer id;
    private Multipointequivalencecase multipointequivalencecase;
    private String borderbus1;
    private String borderbus2;
    private Float equizbbPosiR;
    private Float equizbbPosiX;
    private Float equizbbZeroR;
    private Float equizbbZeroX;
    private String caldatetime;

    // Constructors

    /** default constructor */
    public Multipointequivalencecalresult() {
    }

    /** minimal constructor */
    public Multipointequivalencecalresult(Integer id) {
        this.id = id;
    }

    /** full constructor */
    public Multipointequivalencecalresult(Integer id,
            Multipointequivalencecase multipointequivalencecase,
            String borderbus1, String borderbus2, Float equizbbPosiR,
            Float equizbbPosiX, Float equizbbZeroR, Float equizbbZeroX,
            String caldatetime) {
        this.id = id;
        this.multipointequivalencecase = multipointequivalencecase;
        this.borderbus1 = borderbus1;
        this.borderbus2 = borderbus2;
        this.equizbbPosiR = equizbbPosiR;
        this.equizbbPosiX = equizbbPosiX;
        this.equizbbZeroR = equizbbZeroR;
        this.equizbbZeroX = equizbbZeroX;
        this.caldatetime = caldatetime;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Multipointequivalencecase getMultipointequivalencecase() {
        return this.multipointequivalencecase;
    }

    public void setMultipointequivalencecase(
            Multipointequivalencecase multipointequivalencecase) {
        this.multipointequivalencecase = multipointequivalencecase;
    }

    public String getBorderbus1() {
        return this.borderbus1;
    }

    public void setBorderbus1(String borderbus1) {
        this.borderbus1 = borderbus1;
    }

    public String getBorderbus2() {
        return this.borderbus2;
    }

    public void setBorderbus2(String borderbus2) {
        this.borderbus2 = borderbus2;
    }

    public Float getEquizbbPosiR() {
        return this.equizbbPosiR;
    }

    public void setEquizbbPosiR(Float equizbbPosiR) {
        this.equizbbPosiR = equizbbPosiR;
    }

    public Float getEquizbbPosiX() {
        return this.equizbbPosiX;
    }

    public void setEquizbbPosiX(Float equizbbPosiX) {
        this.equizbbPosiX = equizbbPosiX;
    }

    public Float getEquizbbZeroR() {
        return this.equizbbZeroR;
    }

    public void setEquizbbZeroR(Float equizbbZeroR) {
        this.equizbbZeroR = equizbbZeroR;
    }

    public Float getEquizbbZeroX() {
        return this.equizbbZeroX;
    }

    public void setEquizbbZeroX(Float equizbbZeroX) {
        this.equizbbZeroX = equizbbZeroX;
    }

    public String getCaldatetime() {
        return this.caldatetime;
    }

    public void setCaldatetime(String caldatetime) {
        this.caldatetime = caldatetime;
    }

}