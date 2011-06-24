package com.joinbright.grsm.model.base;

import java.util.HashSet;
import java.util.Set;

/**
 * Protectionlist entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Protectionlist extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer protectionindex;
    private String protection;
    private String branchtype;
    private String branchsubtype;
    private Float ct1;
    private Float ct2;
    private Short ctconnectiontype;
    private Float LCt1;
    private Float LCt2;
    private Short LCtconnectiontype;
    private Float MCt1;
    private Float MCt2;
    private Short MCtconnectiontype;
    private Float pt1;
    private Float pt2;
    private Float MPt1;
    private Float MPt2;
    private Float LPt1;
    private Float LPt2;
    private Short connectionfactor;
    private Short basicprolocation;
    private Short brakeprolocation;
    private Short selected;
    private Set protectionitems = new HashSet(0);

    // Constructors

    /** default constructor */
    public Protectionlist() {
    }

    /** minimal constructor */
    public Protectionlist(Integer protectionindex) {
        this.protectionindex = protectionindex;
    }

    /** full constructor */
    public Protectionlist(Integer protectionindex, String protection,
            String branchtype, String branchsubtype, Float ct1, Float ct2,
            Short ctconnectiontype, Float LCt1, Float LCt2,
            Short LCtconnectiontype, Float MCt1, Float MCt2,
            Short MCtconnectiontype, Float pt1, Float pt2, Float MPt1,
            Float MPt2, Float LPt1, Float LPt2, Short connectionfactor,
            Short basicprolocation, Short brakeprolocation, Short selected,
            Set protectionitems) {
        this.protectionindex = protectionindex;
        this.protection = protection;
        this.branchtype = branchtype;
        this.branchsubtype = branchsubtype;
        this.ct1 = ct1;
        this.ct2 = ct2;
        this.ctconnectiontype = ctconnectiontype;
        this.LCt1 = LCt1;
        this.LCt2 = LCt2;
        this.LCtconnectiontype = LCtconnectiontype;
        this.MCt1 = MCt1;
        this.MCt2 = MCt2;
        this.MCtconnectiontype = MCtconnectiontype;
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.MPt1 = MPt1;
        this.MPt2 = MPt2;
        this.LPt1 = LPt1;
        this.LPt2 = LPt2;
        this.connectionfactor = connectionfactor;
        this.basicprolocation = basicprolocation;
        this.brakeprolocation = brakeprolocation;
        this.selected = selected;
        this.protectionitems = protectionitems;
    }

    // Property accessors

    public Integer getProtectionindex() {
        return this.protectionindex;
    }

    public void setProtectionindex(Integer protectionindex) {
        this.protectionindex = protectionindex;
    }

    public String getProtection() {
        return this.protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public String getBranchtype() {
        return this.branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public String getBranchsubtype() {
        return this.branchsubtype;
    }

    public void setBranchsubtype(String branchsubtype) {
        this.branchsubtype = branchsubtype;
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

    public Short getLCtconnectiontype() {
        return this.LCtconnectiontype;
    }

    public void setLCtconnectiontype(Short LCtconnectiontype) {
        this.LCtconnectiontype = LCtconnectiontype;
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

    public Short getConnectionfactor() {
        return this.connectionfactor;
    }

    public void setConnectionfactor(Short connectionfactor) {
        this.connectionfactor = connectionfactor;
    }

    public Short getBasicprolocation() {
        return this.basicprolocation;
    }

    public void setBasicprolocation(Short basicprolocation) {
        this.basicprolocation = basicprolocation;
    }

    public Short getBrakeprolocation() {
        return this.brakeprolocation;
    }

    public void setBrakeprolocation(Short brakeprolocation) {
        this.brakeprolocation = brakeprolocation;
    }

    public Short getSelected() {
        return this.selected;
    }

    public void setSelected(Short selected) {
        this.selected = selected;
    }

    public Set getProtectionitems() {
        return this.protectionitems;
    }

    public void setProtectionitems(Set protectionitems) {
        this.protectionitems = protectionitems;
    }

}