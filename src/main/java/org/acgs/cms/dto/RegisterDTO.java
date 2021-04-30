package org.acgs.cms.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author John@acgs-org
 * create time 2021/4/30
 */
@Data
public class RegisterDTO {

    @NotBlank(message = "{username.not-blank}")
    @Length(min = 2, max = 10, message = "{username.length}")
    private String username;

    private String nickname;

    @NotBlank(message = "{password.new.not-blank}")
    @Pattern(regexp = "^[A-Za-z0-9_*&$#@]{6,22}$", message = "{password.new.pattern}")
    private String password;

    @Email
    private String email;

}
