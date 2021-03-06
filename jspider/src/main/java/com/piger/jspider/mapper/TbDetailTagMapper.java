package com.piger.jspider.mapper;

import com.piger.jspider.model.TbDetailTag;
import com.piger.jspider.model.TbDetailTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDetailTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    int countByExample(TbDetailTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    int deleteByExample(TbDetailTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    int insert(TbDetailTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    int insertSelective(TbDetailTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    List<TbDetailTag> selectByExample(TbDetailTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    TbDetailTag selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbDetailTag record, @Param("example") TbDetailTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbDetailTag record, @Param("example") TbDetailTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbDetailTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbDetailTag record);
}