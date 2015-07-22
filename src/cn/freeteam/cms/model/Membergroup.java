package cn.freeteam.cms.model;

public class Membergroup {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.id
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.type
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.name
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.orderNum
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private Integer ordernum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.beginCredit
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private Integer beginexperience;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.endCredit
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private Integer endcredit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.img
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.color
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private String color;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.maxAttchSize
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private Integer maxattchsize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.maxFriendNum
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private Integer maxfriendnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberGroup.commentNeedCheck
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    private Integer commentneedcheck;
    private String commentneedcheckStr;



    public String getCommentneedcheckStr() {
    	if (1==commentneedcheck) {
    		commentneedcheckStr="是";
		}else {
    		commentneedcheckStr="否";
		}
		return commentneedcheckStr;
	}

	public void setCommentneedcheckStr(String commentneedcheckStr) {
		this.commentneedcheckStr = commentneedcheckStr;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.id
     *
     * @return the value of freecms_memberGroup.id
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.id
     *
     * @param id the value for freecms_memberGroup.id
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.type
     *
     * @return the value of freecms_memberGroup.type
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.type
     *
     * @param type the value for freecms_memberGroup.type
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.name
     *
     * @return the value of freecms_memberGroup.name
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.name
     *
     * @param name the value for freecms_memberGroup.name
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.orderNum
     *
     * @return the value of freecms_memberGroup.orderNum
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public Integer getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.orderNum
     *
     * @param ordernum the value for freecms_memberGroup.orderNum
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }


    public Integer getBeginexperience() {
		return beginexperience;
	}

	public void setBeginexperience(Integer beginexperience) {
		this.beginexperience = beginexperience;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.endCredit
     *
     * @return the value of freecms_memberGroup.endCredit
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public Integer getEndcredit() {
        return endcredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.endCredit
     *
     * @param endcredit the value for freecms_memberGroup.endCredit
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setEndcredit(Integer endcredit) {
        this.endcredit = endcredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.img
     *
     * @return the value of freecms_memberGroup.img
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.img
     *
     * @param img the value for freecms_memberGroup.img
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.color
     *
     * @return the value of freecms_memberGroup.color
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.color
     *
     * @param color the value for freecms_memberGroup.color
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.maxAttchSize
     *
     * @return the value of freecms_memberGroup.maxAttchSize
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public Integer getMaxattchsize() {
        return maxattchsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.maxAttchSize
     *
     * @param maxattchsize the value for freecms_memberGroup.maxAttchSize
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setMaxattchsize(Integer maxattchsize) {
        this.maxattchsize = maxattchsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.maxFriendNum
     *
     * @return the value of freecms_memberGroup.maxFriendNum
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public Integer getMaxfriendnum() {
        return maxfriendnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.maxFriendNum
     *
     * @param maxfriendnum the value for freecms_memberGroup.maxFriendNum
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setMaxfriendnum(Integer maxfriendnum) {
        this.maxfriendnum = maxfriendnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberGroup.commentNeedCheck
     *
     * @return the value of freecms_memberGroup.commentNeedCheck
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public Integer getCommentneedcheck() {
        return commentneedcheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberGroup.commentNeedCheck
     *
     * @param commentneedcheck the value for freecms_memberGroup.commentNeedCheck
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setCommentneedcheck(Integer commentneedcheck) {
        this.commentneedcheck = commentneedcheck;
    }

}