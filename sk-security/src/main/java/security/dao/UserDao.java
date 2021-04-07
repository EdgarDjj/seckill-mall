package security.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("select user_password from um_user_info where user_account=#{user_acc}")
    String getPasswordByAccount(@Param("user_acc") String account);
}
