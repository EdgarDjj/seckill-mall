package com.edgar.common.dao;

import com.edgar.common.domain.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("select * from um_user_info where user_account = #{account} ")
    UserInfo getUserByAccount(@Param("account") Long account);

}
