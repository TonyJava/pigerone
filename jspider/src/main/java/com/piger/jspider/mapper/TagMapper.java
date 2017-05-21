package com.piger.jspider.mapper;

import com.piger.jspider.model.Tag;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * Created by pigercc.liang on 2017/5/21.
 */
public interface TagMapper {

    @Insert("insert into tb_tag value(#{hashId},#{name}")
    @Options(useGeneratedKeys = true)
    void add(Tag tag);
}
