package security.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String userAccount;
    private String userNickname;
    private String userPassword;
    private String userEmail;
    private Integer isBan;
    private Date createTime;
    private Date updateTime;

}
