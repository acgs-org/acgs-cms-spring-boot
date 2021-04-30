package org.acgs.cms.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author John@acgs-org
 * create time 2021/5/1
 */
@Data
public class LoginDTO {

    @NotBlank(message = "{username.not-blank}")
    private String username;

    @NotBlank(message = "{password.new.not-blank}")
    private String password;

}
