package com.piger.jspider.mapper;

import com.piger.jspider.model.Detail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * Created by pigercc.liang on 2017/5/21.
 */
public interface DetailMapper {

    @Select("select * from tb_detail where is_del=0 and id=#{id}")
    Detail selectDetail(long id);

    @Insert("insert into tb_detail(title, id_code, video_id, big_image, score, user_wanted, user_watched, user_owned) " +
            "value(#{title},#{idCode},#{videoId},#{bigImage},#{score},#{userWanted},#{userWatched},#{userOwned})")
    @Options(useGeneratedKeys = true)
    void insertDetail(Detail detail);
}
