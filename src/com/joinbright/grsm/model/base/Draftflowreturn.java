package com.joinbright.grsm.model.base;

/**
 * Draftflowreturn entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Draftflowreturn extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String id;
    private Integer draftindex;
    private String drafter1;
    private String draft1status;

    // Constructors

    /** default constructor */
    public Draftflowreturn() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getDraftindex() {
        return draftindex;
    }

    public void setDraftindex(Integer draftindex) {
        this.draftindex = draftindex;
    }

    public String getDrafter1() {
        return drafter1;
    }

    public void setDrafter1(String drafter1) {
        this.drafter1 = drafter1;
    }

    public String getDraft1status() {
        return draft1status;
    }

    public void setDraft1status(String draft1status) {
        this.draft1status = draft1status;
    }

    public Draftflowreturn(String id, Integer draftindex, String drafter1,
            String draft1status) {
        super();
        this.id = id;
        this.draftindex = draftindex;
        this.drafter1 = drafter1;
        this.draft1status = draft1status;
    }


}