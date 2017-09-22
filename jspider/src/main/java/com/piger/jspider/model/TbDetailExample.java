package com.piger.jspider.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public TbDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNull() {
            addCriterion("id_code is null");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNotNull() {
            addCriterion("id_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdCodeEqualTo(String value) {
            addCriterion("id_code =", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotEqualTo(String value) {
            addCriterion("id_code <>", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThan(String value) {
            addCriterion("id_code >", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("id_code >=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThan(String value) {
            addCriterion("id_code <", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThanOrEqualTo(String value) {
            addCriterion("id_code <=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLike(String value) {
            addCriterion("id_code like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotLike(String value) {
            addCriterion("id_code not like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeIn(List<String> values) {
            addCriterion("id_code in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotIn(List<String> values) {
            addCriterion("id_code not in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeBetween(String value1, String value2) {
            addCriterion("id_code between", value1, value2, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotBetween(String value1, String value2) {
            addCriterion("id_code not between", value1, value2, "idCode");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(String value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(String value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(String value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(String value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(String value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLike(String value) {
            addCriterion("video_id like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotLike(String value) {
            addCriterion("video_id not like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<String> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<String> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(String value1, String value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(String value1, String value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andBigImageIsNull() {
            addCriterion("big_image is null");
            return (Criteria) this;
        }

        public Criteria andBigImageIsNotNull() {
            addCriterion("big_image is not null");
            return (Criteria) this;
        }

        public Criteria andBigImageEqualTo(String value) {
            addCriterion("big_image =", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageNotEqualTo(String value) {
            addCriterion("big_image <>", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageGreaterThan(String value) {
            addCriterion("big_image >", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageGreaterThanOrEqualTo(String value) {
            addCriterion("big_image >=", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageLessThan(String value) {
            addCriterion("big_image <", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageLessThanOrEqualTo(String value) {
            addCriterion("big_image <=", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageLike(String value) {
            addCriterion("big_image like", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageNotLike(String value) {
            addCriterion("big_image not like", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageIn(List<String> values) {
            addCriterion("big_image in", values, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageNotIn(List<String> values) {
            addCriterion("big_image not in", values, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageBetween(String value1, String value2) {
            addCriterion("big_image between", value1, value2, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageNotBetween(String value1, String value2) {
            addCriterion("big_image not between", value1, value2, "bigImage");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andUserWantedIsNull() {
            addCriterion("user_wanted is null");
            return (Criteria) this;
        }

        public Criteria andUserWantedIsNotNull() {
            addCriterion("user_wanted is not null");
            return (Criteria) this;
        }

        public Criteria andUserWantedEqualTo(Integer value) {
            addCriterion("user_wanted =", value, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWantedNotEqualTo(Integer value) {
            addCriterion("user_wanted <>", value, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWantedGreaterThan(Integer value) {
            addCriterion("user_wanted >", value, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWantedGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_wanted >=", value, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWantedLessThan(Integer value) {
            addCriterion("user_wanted <", value, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWantedLessThanOrEqualTo(Integer value) {
            addCriterion("user_wanted <=", value, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWantedIn(List<Integer> values) {
            addCriterion("user_wanted in", values, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWantedNotIn(List<Integer> values) {
            addCriterion("user_wanted not in", values, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWantedBetween(Integer value1, Integer value2) {
            addCriterion("user_wanted between", value1, value2, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWantedNotBetween(Integer value1, Integer value2) {
            addCriterion("user_wanted not between", value1, value2, "userWanted");
            return (Criteria) this;
        }

        public Criteria andUserWatchedIsNull() {
            addCriterion("user_watched is null");
            return (Criteria) this;
        }

        public Criteria andUserWatchedIsNotNull() {
            addCriterion("user_watched is not null");
            return (Criteria) this;
        }

        public Criteria andUserWatchedEqualTo(Integer value) {
            addCriterion("user_watched =", value, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserWatchedNotEqualTo(Integer value) {
            addCriterion("user_watched <>", value, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserWatchedGreaterThan(Integer value) {
            addCriterion("user_watched >", value, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserWatchedGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_watched >=", value, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserWatchedLessThan(Integer value) {
            addCriterion("user_watched <", value, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserWatchedLessThanOrEqualTo(Integer value) {
            addCriterion("user_watched <=", value, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserWatchedIn(List<Integer> values) {
            addCriterion("user_watched in", values, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserWatchedNotIn(List<Integer> values) {
            addCriterion("user_watched not in", values, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserWatchedBetween(Integer value1, Integer value2) {
            addCriterion("user_watched between", value1, value2, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserWatchedNotBetween(Integer value1, Integer value2) {
            addCriterion("user_watched not between", value1, value2, "userWatched");
            return (Criteria) this;
        }

        public Criteria andUserOwnedIsNull() {
            addCriterion("user_owned is null");
            return (Criteria) this;
        }

        public Criteria andUserOwnedIsNotNull() {
            addCriterion("user_owned is not null");
            return (Criteria) this;
        }

        public Criteria andUserOwnedEqualTo(String value) {
            addCriterion("user_owned =", value, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedNotEqualTo(String value) {
            addCriterion("user_owned <>", value, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedGreaterThan(String value) {
            addCriterion("user_owned >", value, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedGreaterThanOrEqualTo(String value) {
            addCriterion("user_owned >=", value, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedLessThan(String value) {
            addCriterion("user_owned <", value, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedLessThanOrEqualTo(String value) {
            addCriterion("user_owned <=", value, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedLike(String value) {
            addCriterion("user_owned like", value, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedNotLike(String value) {
            addCriterion("user_owned not like", value, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedIn(List<String> values) {
            addCriterion("user_owned in", values, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedNotIn(List<String> values) {
            addCriterion("user_owned not in", values, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedBetween(String value1, String value2) {
            addCriterion("user_owned between", value1, value2, "userOwned");
            return (Criteria) this;
        }

        public Criteria andUserOwnedNotBetween(String value1, String value2) {
            addCriterion("user_owned not between", value1, value2, "userOwned");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_detail
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}