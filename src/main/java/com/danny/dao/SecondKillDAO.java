package com.danny.dao;

import com.danny.domain.SecondKill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author jiazhang-676002187@qq.com
 * @date 2019-05-13
 */
@Mapper
public interface SecondKillDAO {
    @Select("select user_id userId,sub_user_id subUserId," +
            "sub_status subStatus,create_time createTime,last_modify_time lastModifyTime " +
            "from biz_user_subscription " +
            "where user_id = #{userId}")
    List<SecondKill> findById(String userId);
}
