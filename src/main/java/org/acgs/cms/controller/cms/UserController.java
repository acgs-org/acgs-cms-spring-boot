package org.acgs.cms.controller.cms;

import org.acgs.cms.dto.RegisterDTO;
import org.acgs.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author John@acgs-org
 * create time 2021/4/30
 */
@RestController
@RequestMapping("/cms/user")
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody @Validated RegisterDTO validator) {
        userService.createUser(validator);
    }

}
