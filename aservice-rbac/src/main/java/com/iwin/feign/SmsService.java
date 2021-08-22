package com.iwin.feign;

import com.iwin.response.AjaxResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @project_name: learn-spring-cloud
 * @package_name: com.iwin.feign
 * @description: 远程调用feign接口
 * @author: DingHaiTing
 * @create_time: 2021-08-22 22:21
 **/

@FeignClient("ASERVICE-SMS") //  需要调用哪个服务名
public interface SmsService {

    @PostMapping(value = "/sms/send")
    public AjaxResponse send(@RequestParam("phoneNo") String phoneNo,
                             @RequestParam("content") String content);
}
