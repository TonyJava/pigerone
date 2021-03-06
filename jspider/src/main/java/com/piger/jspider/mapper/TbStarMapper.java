package com.piger.jspider.mapper;

import com.piger.jspider.model.TbStar;
import com.piger.jspider.model.TbStarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    int countByExample(TbStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    int deleteByExample(TbStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    int insert(TbStar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    int insertSelective(TbStar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    List<TbStar> selectByExample(TbStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    TbStar selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbStar record, @Param("example") TbStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbStar record, @Param("example") TbStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbStar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_star
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbStar record);
}