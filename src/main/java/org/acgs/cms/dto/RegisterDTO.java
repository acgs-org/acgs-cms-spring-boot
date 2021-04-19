package org.acgs.cms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @Author John@acgs-org
 * @Date 2021/4/19
 */
@Data
@NoArgsConstructor
public class RegisterDTO {

    @NotBlank(message = "{username.not-blank}")
    @Length(min = 2, max = 10, message = "{username.length")
    private String username;

    @Email(message = "{email}")
    private String email;

    @NotBlank(message = "{password.new.not-blank}")
    @Pattern(regexp = "^[A-Za-z0-9_*&$#@]{6,22}$", message = "{password.new.pattern}")
    private String password;

    @NotBlank(message = "{password.confirm.not-blank}")
    private String confirmPassword;
}
