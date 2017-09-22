package com.piger.jspider.mapper;

import com.piger.jspider.model.TbDetail;
import com.piger.jspider.model.TbDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    int countByExample(TbDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    int deleteByExample(TbDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    int insert(TbDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    int insertSelective(TbDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    List<TbDetail> selectByExample(TbDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    TbDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbDetail record, @Param("example") TbDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbDetail record, @Param("example") TbDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbDetail record);
}