package com.iwin.controller;

import com.iwin.response.AjaxResponse;
import com.iwin.service.SysUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @project_name: learn-spring-cloud
 * @package_name: com.iwin.controller
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-22 22:23
 **/

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserService sysuserService;

    @PostMapping(value = "/pwd/reset")
    public AjaxResponse pwdreset(@RequestParam("userId") Integer userId) {
        sysuserService.pwdRest(userId);
        return AjaxResponse.success("重置密码成功!");
    }
}
