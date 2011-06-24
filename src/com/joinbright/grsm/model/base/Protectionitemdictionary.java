package com.joinbright.grsm.model.base;

/**
 * Protectionitemdictionary entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Protectionitemdictionary extends
        com.joinbright.grsm.model.BaseModel implements java.io.Serializable {

    // Fields

    private String id;
    private Integer sortindex;
    private String branchtype;
    private String type;
    private String description;

    // Constructors

    /** default constructor */
    public Protectionitemdictionary() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSortindex() {
        return sortindex;
    }

    public void setSortindex(Integer sortindex) {
        this.sortindex = sortindex;
    }

    public String getBranchtype() {
        return branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Protectionitemdictionary(String id, Integer sortindex,
            String branchtype, String type, String description) {
        super();
        this.id = id;
        this.sortindex = sortindex;
        this.branchtype = branchtype;
        this.type = type;
        this.description = description;
    }


}