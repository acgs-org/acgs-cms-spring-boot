package org.acgs.cms.entity;

import cn.hutool.core.lang.ObjectId;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author John@acgs-org
 * @Date 2021/4/19
 */
@Data
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = -3258839839160856613L;

    @Id
    private String id;
    private String username;
    private String password;
    private String email;

}
