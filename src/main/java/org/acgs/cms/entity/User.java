package org.acgs.cms.entity;

import lombok.Data;
import org.bson.types.ObjectId;

/**
 * @author John@acgs-org
 * create time 2021/4/30
 */
@Data
public class User {

    private static final long serialVersionUID = -1463999384554707735L;

    private ObjectId id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

}
