package cn.zc.user.client;

import cn.zc.user.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserClient {

    @GetMapping("user/id/{id}")
    User getById(@PathVariable("id") Long id);

}
