package com.iwin.controller;

import com.iwin.exception.CustomException;
import com.iwin.exception.CustomExceptionType;
import com.iwin.response.AjaxResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project_name: learn-spring-cloud
 * @package_name: com.iwin
 * @description: 测试
 * @author: DingHaiTing
 * @create_time: 2021-08-22 21:54
 **/

@RestController
@RequestMapping("/sms")
public class SmsController {
    /**
     * 模拟短信发送
     * @param phoneNo
     * @param content
     * @return 短信发送结果
     */
    @PostMapping(value = "/send")
    public AjaxResponse send(@RequestParam String phoneNo,
                             @RequestParam String content) {
        if(content.isEmpty() || phoneNo.isEmpty()){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR,
                    "消息内容或手机号不能为空！");
        }
        System.out.println("发送短消息:" + content);

        return AjaxResponse.success("短消息发送成功！");
    }
}
