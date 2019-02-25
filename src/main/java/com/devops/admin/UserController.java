package com.devops.admin;

import com.devops.base.controller.BaseController;
import com.devops.base.dto.ResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jzx
 * @date 2019/02/25 10:46
 * @Description:
 */
@RestController
@RequestMapping("admin/user")
public class UserController extends BaseController {
    
    @RequestMapping("/login")
    public ResponseDto login() throws Exception {
        return success();
    }
}
