package com.piger.jspider.model;

public class TbStar {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_star.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_star.hash_id
     *
     * @mbggenerated
     */
    private String hashId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_star.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_star.id
     *
     * @return the value of tb_star.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_star.id
     *
     * @param id the value for tb_star.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_star.hash_id
     *
     * @return the value of tb_star.hash_id
     *
     * @mbggenerated
     */
    public String getHashId() {
        return hashId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_star.hash_id
     *
     * @param hashId the value for tb_star.hash_id
     *
     * @mbggenerated
     */
    public void setHashId(String hashId) {
        this.hashId = hashId == null ? null : hashId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_star.name
     *
     * @return the value of tb_star.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_star.name
     *
     * @param name the value for tb_star.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}