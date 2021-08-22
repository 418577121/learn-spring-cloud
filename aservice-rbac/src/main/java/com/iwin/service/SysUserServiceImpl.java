package com.iwin.service;

import com.iwin.exception.CustomException;
import com.iwin.exception.CustomExceptionType;
import com.iwin.feign.SmsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @project_name: learn-spring-cloud
 * @package_name: com.iwin.service
 * @description:
 * @author: DingHaiTing
 * @create_time: 2021-08-22 22:26
 **/

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SmsService smsService;
    @Override
    public void pwdRest(Integer userId) {
        if(userId == null){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR,
                    "重置密码必须带主键");
        }else{
            /*SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);

            //去数据库sys_config表加载用户初始化默认密码，key为user.init.password
            String defaultPwd = dbLoadSysConfig.getConfigItem("user.init.password");
            sysUser.setPassword(passwordEncoder.encode(defaultPwd));
            //更新该用户密码为默认初始化密码
            sysUserMapper.updateByPrimaryKeySelective(sysUser);*/
            //看上去就像是本地调用smsService接口方法，实际是发送http请求调用远程服务
            smsService.send("1232","您好，管理员已经将您的密码重置为" + "1232");
        }
    }
}
