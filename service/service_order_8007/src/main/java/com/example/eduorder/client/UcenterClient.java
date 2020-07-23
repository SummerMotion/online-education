package com.example.eduorder.client;

import com.example.commonutils.ordervo.UcenterMemberOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(name="service-ucenter")
public interface UcenterClient {

    //根据用户id获取用户信息
    @PostMapping("/educenter/member/getUserOrder/{id}")
    public UcenterMemberOrder getUserOrder(@PathVariable("id") String id);
}
