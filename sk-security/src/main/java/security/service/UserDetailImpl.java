package security.service;

import security.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserDetailImpl implements UserDetailsService {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserDao userDao;

    public String getPassword(String s){
        return userDao.getPasswordByAccount(s);
    }

    @Override
    public UserDetails loadUserByUsername(String s) {
        String pwd=getPassword(s);
        if(pwd==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        String changePasswd=passwordEncoder.encode(pwd);
        UserDetails userDetails= User.withUsername(s).password(changePasswd).authorities("normal").build();
        return userDetails;
    }
}
