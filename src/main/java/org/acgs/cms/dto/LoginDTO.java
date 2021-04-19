package org.acgs.cms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @Author John@acgs-org
 * @Date 2021/4/19
 */
@Data
@NoArgsConstructor
public class LoginDTO {

    @NotBlank(message = "{username.not-blank}")
    private String username;

    @NotBlank(message = "{password.new.not-blank}")
    private String password;
}
