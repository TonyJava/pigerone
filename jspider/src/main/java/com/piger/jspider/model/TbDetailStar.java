package com.piger.jspider.model;

public class TbDetailStar {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_detail_star.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_detail_star.detail_Id
     *
     * @mbggenerated
     */
    private Long detailId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_detail_star.star_hash_id
     *
     * @mbggenerated
     */
    private String starHashId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_detail_star.id
     *
     * @return the value of tb_detail_star.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_detail_star.id
     *
     * @param id the value for tb_detail_star.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_detail_star.detail_Id
     *
     * @return the value of tb_detail_star.detail_Id
     *
     * @mbggenerated
     */
    public Long getDetailId() {
        return detailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_detail_star.detail_Id
     *
     * @param detailId the value for tb_detail_star.detail_Id
     *
     * @mbggenerated
     */
    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_detail_star.star_hash_id
     *
     * @return the value of tb_detail_star.star_hash_id
     *
     * @mbggenerated
     */
    public String getStarHashId() {
        return starHashId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_detail_star.star_hash_id
     *
     * @param starHashId the value for tb_detail_star.star_hash_id
     *
     * @mbggenerated
     */
    public void setStarHashId(String starHashId) {
        this.starHashId = starHashId == null ? null : starHashId.trim();
    }
}