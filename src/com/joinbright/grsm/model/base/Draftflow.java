package com.joinbright.grsm.model.base;

/**
 * Draftflow entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Draftflow extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private Long id;
    private Integer draftindex;
    private String name;
    private String drafter1;
    private Integer draft1status;
    private String draft1time;
    private String draft1memo;
    private String drafter2;
    private Integer draft2status;
    private String draft2time;
    private String draft2memo;
    private String drafter3;
    private Integer draft3status;
    private String draft3time;
    private String draft3memo;
    private String drafter4;
    private Integer draft4status;
    private String draft4time;
    private String draft4memo;
    private Integer draftstatus;
    private Integer isreturn;

    // Constructors

    /** default constructor */
    public Draftflow() {
    }


    public Draftflow(Long id, Integer draftindex, String name, String drafter1,
            Integer draft1status, String draft1time, String draft1memo,
            String drafter2, Integer draft2status, String draft2time,
            String draft2memo, String drafter3, Integer draft3status,
            String draft3time, String draft3memo, String drafter4,
            Integer draft4status, String draft4time, String draft4memo,
            Integer draftstatus, Integer isreturn) {
        super();
        this.id = id;
        this.draftindex = draftindex;
        this.name = name;
        this.drafter1 = drafter1;
        this.draft1status = draft1status;
        this.draft1time = draft1time;
        this.draft1memo = draft1memo;
        this.drafter2 = drafter2;
        this.draft2status = draft2status;
        this.draft2time = draft2time;
        this.draft2memo = draft2memo;
        this.drafter3 = drafter3;
        this.draft3status = draft3status;
        this.draft3time = draft3time;
        this.draft3memo = draft3memo;
        this.drafter4 = drafter4;
        this.draft4status = draft4status;
        this.draft4time = draft4time;
        this.draft4memo = draft4memo;
        this.draftstatus = draftstatus;
        this.isreturn = isreturn;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Integer getDraftindex() {
        return draftindex;
    }


    public void setDraftindex(Integer draftindex) {
        this.draftindex = draftindex;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrafter1() {
        return this.drafter1;
    }

    public void setDrafter1(String drafter1) {
        this.drafter1 = drafter1;
    }

    public Integer getDraft1status() {
        return this.draft1status;
    }

    public void setDraft1status(Integer draft1status) {
        this.draft1status = draft1status;
    }

    public String getDraft1time() {
        return this.draft1time;
    }

    public void setDraft1time(String draft1time) {
        this.draft1time = draft1time;
    }

    public String getDraft1memo() {
        return this.draft1memo;
    }

    public void setDraft1memo(String draft1memo) {
        this.draft1memo = draft1memo;
    }

    public String getDrafter2() {
        return this.drafter2;
    }

    public void setDrafter2(String drafter2) {
        this.drafter2 = drafter2;
    }

    public Integer getDraft2status() {
        return this.draft2status;
    }

    public void setDraft2status(Integer draft2status) {
        this.draft2status = draft2status;
    }

    public String getDraft2time() {
        return this.draft2time;
    }

    public void setDraft2time(String draft2time) {
        this.draft2time = draft2time;
    }

    public String getDraft2memo() {
        return this.draft2memo;
    }

    public void setDraft2memo(String draft2memo) {
        this.draft2memo = draft2memo;
    }

    public String getDrafter3() {
        return this.drafter3;
    }

    public void setDrafter3(String drafter3) {
        this.drafter3 = drafter3;
    }

    public Integer getDraft3status() {
        return this.draft3status;
    }

    public void setDraft3status(Integer draft3status) {
        this.draft3status = draft3status;
    }

    public String getDraft3time() {
        return this.draft3time;
    }

    public void setDraft3time(String draft3time) {
        this.draft3time = draft3time;
    }

    public String getDraft3memo() {
        return this.draft3memo;
    }

    public void setDraft3memo(String draft3memo) {
        this.draft3memo = draft3memo;
    }

    public String getDrafter4() {
        return this.drafter4;
    }

    public void setDrafter4(String drafter4) {
        this.drafter4 = drafter4;
    }

    public Integer getDraft4status() {
        return this.draft4status;
    }

    public void setDraft4status(Integer draft4status) {
        this.draft4status = draft4status;
    }

    public String getDraft4time() {
        return this.draft4time;
    }

    public void setDraft4time(String draft4time) {
        this.draft4time = draft4time;
    }

    public String getDraft4memo() {
        return this.draft4memo;
    }

    public void setDraft4memo(String draft4memo) {
        this.draft4memo = draft4memo;
    }

    public Integer getDraftstatus() {
        return this.draftstatus;
    }

    public void setDraftstatus(Integer draftstatus) {
        this.draftstatus = draftstatus;
    }

    public Integer getIsreturn() {
        return this.isreturn;
    }

    public void setIsreturn(Integer isreturn) {
        this.isreturn = isreturn;
    }

}