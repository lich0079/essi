package com.joinbright.grsm.model.base;

/**
 * Settingparameter entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Settingparameter extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Float voltagedegree;
    private Short type;
    private String mode;
    private Short forwardcheck;
    private Integer forwarddegree;
    private Short forwardn1orn2;
    private Short backcheck;
    private Integer backdegree;
    private Short backn1orn2;
    private Short n2degree;
    private Short lineandtrancheck;
    private Short sourcechangecheck;
    private Integer sourcescandegree;
    private Short singlecheck;
    private Short doublecheck;
    private Short keepzeropointstability;
    private Short keepchangezeropoint;
    private Short fzNeighborbegin;
    private Short fzNeighborscope;
    private Float fzNeighborscopemax;
    private Float fzNeighborscopemin;
    private Short fzNeighborend;
    private Short fzNeighboropen;
    private Short currentSelfbus;
    private Short currentBackbus;
    private Short currentOutletbus;
    private Short currentForwardnext;
    private Short currentBacknext;
    private Short currentNeighboropen;
    private Short currentNonallphase;
    private Float currentNonallphaseangle;
    private Short backup1;
    private Short backup2;
    private Short backup3;
    private Short backup4;
    private Short backup5;
    private Short backup6;
    private Short backup7;
    private Short backup8;
    private Short backup9;
    private Short backup10;

    // Constructors

    /** default constructor */
    public Settingparameter() {
    }

    public Float getVoltagedegree() {
        return voltagedegree;
    }

    public void setVoltagedegree(Float voltagedegree) {
        this.voltagedegree = voltagedegree;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Short getForwardcheck() {
        return forwardcheck;
    }

    public void setForwardcheck(Short forwardcheck) {
        this.forwardcheck = forwardcheck;
    }

    public Integer getForwarddegree() {
        return forwarddegree;
    }

    public void setForwarddegree(Integer forwarddegree) {
        this.forwarddegree = forwarddegree;
    }

    public Short getForwardn1orn2() {
        return forwardn1orn2;
    }

    public void setForwardn1orn2(Short forwardn1orn2) {
        this.forwardn1orn2 = forwardn1orn2;
    }

    public Short getBackcheck() {
        return backcheck;
    }

    public void setBackcheck(Short backcheck) {
        this.backcheck = backcheck;
    }

    public Integer getBackdegree() {
        return backdegree;
    }

    public void setBackdegree(Integer backdegree) {
        this.backdegree = backdegree;
    }

    public Short getBackn1orn2() {
        return backn1orn2;
    }

    public void setBackn1orn2(Short backn1orn2) {
        this.backn1orn2 = backn1orn2;
    }

    public Short getN2degree() {
        return n2degree;
    }

    public void setN2degree(Short n2degree) {
        this.n2degree = n2degree;
    }

    public Short getLineandtrancheck() {
        return lineandtrancheck;
    }

    public void setLineandtrancheck(Short lineandtrancheck) {
        this.lineandtrancheck = lineandtrancheck;
    }

    public Short getSourcechangecheck() {
        return sourcechangecheck;
    }

    public void setSourcechangecheck(Short sourcechangecheck) {
        this.sourcechangecheck = sourcechangecheck;
    }

    public Integer getSourcescandegree() {
        return sourcescandegree;
    }

    public void setSourcescandegree(Integer sourcescandegree) {
        this.sourcescandegree = sourcescandegree;
    }

    public Short getSinglecheck() {
        return singlecheck;
    }

    public void setSinglecheck(Short singlecheck) {
        this.singlecheck = singlecheck;
    }

    public Short getDoublecheck() {
        return doublecheck;
    }

    public void setDoublecheck(Short doublecheck) {
        this.doublecheck = doublecheck;
    }

    public Short getKeepzeropointstability() {
        return keepzeropointstability;
    }

    public void setKeepzeropointstability(Short keepzeropointstability) {
        this.keepzeropointstability = keepzeropointstability;
    }

    public Short getKeepchangezeropoint() {
        return keepchangezeropoint;
    }

    public void setKeepchangezeropoint(Short keepchangezeropoint) {
        this.keepchangezeropoint = keepchangezeropoint;
    }

    public Short getFzNeighborbegin() {
        return fzNeighborbegin;
    }

    public void setFzNeighborbegin(Short fzNeighborbegin) {
        this.fzNeighborbegin = fzNeighborbegin;
    }

    public Short getFzNeighborscope() {
        return fzNeighborscope;
    }

    public void setFzNeighborscope(Short fzNeighborscope) {
        this.fzNeighborscope = fzNeighborscope;
    }

    public Float getFzNeighborscopemax() {
        return fzNeighborscopemax;
    }

    public void setFzNeighborscopemax(Float fzNeighborscopemax) {
        this.fzNeighborscopemax = fzNeighborscopemax;
    }

    public Float getFzNeighborscopemin() {
        return fzNeighborscopemin;
    }

    public void setFzNeighborscopemin(Float fzNeighborscopemin) {
        this.fzNeighborscopemin = fzNeighborscopemin;
    }

    public Short getFzNeighborend() {
        return fzNeighborend;
    }

    public void setFzNeighborend(Short fzNeighborend) {
        this.fzNeighborend = fzNeighborend;
    }

    public Short getFzNeighboropen() {
        return fzNeighboropen;
    }

    public void setFzNeighboropen(Short fzNeighboropen) {
        this.fzNeighboropen = fzNeighboropen;
    }

    public Short getCurrentSelfbus() {
        return currentSelfbus;
    }

    public void setCurrentSelfbus(Short currentSelfbus) {
        this.currentSelfbus = currentSelfbus;
    }

    public Short getCurrentBackbus() {
        return currentBackbus;
    }

    public void setCurrentBackbus(Short currentBackbus) {
        this.currentBackbus = currentBackbus;
    }

    public Short getCurrentOutletbus() {
        return currentOutletbus;
    }

    public void setCurrentOutletbus(Short currentOutletbus) {
        this.currentOutletbus = currentOutletbus;
    }

    public Short getCurrentForwardnext() {
        return currentForwardnext;
    }

    public void setCurrentForwardnext(Short currentForwardnext) {
        this.currentForwardnext = currentForwardnext;
    }

    public Short getCurrentBacknext() {
        return currentBacknext;
    }

    public void setCurrentBacknext(Short currentBacknext) {
        this.currentBacknext = currentBacknext;
    }

    public Short getCurrentNeighboropen() {
        return currentNeighboropen;
    }

    public void setCurrentNeighboropen(Short currentNeighboropen) {
        this.currentNeighboropen = currentNeighboropen;
    }

    public Short getCurrentNonallphase() {
        return currentNonallphase;
    }

    public void setCurrentNonallphase(Short currentNonallphase) {
        this.currentNonallphase = currentNonallphase;
    }

    public Float getCurrentNonallphaseangle() {
        return currentNonallphaseangle;
    }

    public void setCurrentNonallphaseangle(Float currentNonallphaseangle) {
        this.currentNonallphaseangle = currentNonallphaseangle;
    }

    public Short getBackup1() {
        return backup1;
    }

    public void setBackup1(Short backup1) {
        this.backup1 = backup1;
    }

    public Short getBackup2() {
        return backup2;
    }

    public void setBackup2(Short backup2) {
        this.backup2 = backup2;
    }

    public Short getBackup3() {
        return backup3;
    }

    public void setBackup3(Short backup3) {
        this.backup3 = backup3;
    }

    public Short getBackup4() {
        return backup4;
    }

    public void setBackup4(Short backup4) {
        this.backup4 = backup4;
    }

    public Short getBackup5() {
        return backup5;
    }

    public void setBackup5(Short backup5) {
        this.backup5 = backup5;
    }

    public Short getBackup6() {
        return backup6;
    }

    public void setBackup6(Short backup6) {
        this.backup6 = backup6;
    }

    public Short getBackup7() {
        return backup7;
    }

    public void setBackup7(Short backup7) {
        this.backup7 = backup7;
    }

    public Short getBackup8() {
        return backup8;
    }

    public void setBackup8(Short backup8) {
        this.backup8 = backup8;
    }

    public Short getBackup9() {
        return backup9;
    }

    public void setBackup9(Short backup9) {
        this.backup9 = backup9;
    }

    public Short getBackup10() {
        return backup10;
    }

    public void setBackup10(Short backup10) {
        this.backup10 = backup10;
    }

    public Settingparameter(Float voltagedegree, Short type, String mode,
            Short forwardcheck, Integer forwarddegree, Short forwardn1orn2,
            Short backcheck, Integer backdegree, Short backn1orn2,
            Short n2degree, Short lineandtrancheck, Short sourcechangecheck,
            Integer sourcescandegree, Short singlecheck, Short doublecheck,
            Short keepzeropointstability, Short keepchangezeropoint,
            Short fzNeighborbegin, Short fzNeighborscope,
            Float fzNeighborscopemax, Float fzNeighborscopemin,
            Short fzNeighborend, Short fzNeighboropen, Short currentSelfbus,
            Short currentBackbus, Short currentOutletbus,
            Short currentForwardnext, Short currentBacknext,
            Short currentNeighboropen, Short currentNonallphase,
            Float currentNonallphaseangle, Short backup1, Short backup2,
            Short backup3, Short backup4, Short backup5, Short backup6,
            Short backup7, Short backup8, Short backup9, Short backup10) {
        super();
        this.voltagedegree = voltagedegree;
        this.type = type;
        this.mode = mode;
        this.forwardcheck = forwardcheck;
        this.forwarddegree = forwarddegree;
        this.forwardn1orn2 = forwardn1orn2;
        this.backcheck = backcheck;
        this.backdegree = backdegree;
        this.backn1orn2 = backn1orn2;
        this.n2degree = n2degree;
        this.lineandtrancheck = lineandtrancheck;
        this.sourcechangecheck = sourcechangecheck;
        this.sourcescandegree = sourcescandegree;
        this.singlecheck = singlecheck;
        this.doublecheck = doublecheck;
        this.keepzeropointstability = keepzeropointstability;
        this.keepchangezeropoint = keepchangezeropoint;
        this.fzNeighborbegin = fzNeighborbegin;
        this.fzNeighborscope = fzNeighborscope;
        this.fzNeighborscopemax = fzNeighborscopemax;
        this.fzNeighborscopemin = fzNeighborscopemin;
        this.fzNeighborend = fzNeighborend;
        this.fzNeighboropen = fzNeighboropen;
        this.currentSelfbus = currentSelfbus;
        this.currentBackbus = currentBackbus;
        this.currentOutletbus = currentOutletbus;
        this.currentForwardnext = currentForwardnext;
        this.currentBacknext = currentBacknext;
        this.currentNeighboropen = currentNeighboropen;
        this.currentNonallphase = currentNonallphase;
        this.currentNonallphaseangle = currentNonallphaseangle;
        this.backup1 = backup1;
        this.backup2 = backup2;
        this.backup3 = backup3;
        this.backup4 = backup4;
        this.backup5 = backup5;
        this.backup6 = backup6;
        this.backup7 = backup7;
        this.backup8 = backup8;
        this.backup9 = backup9;
        this.backup10 = backup10;
    }



}