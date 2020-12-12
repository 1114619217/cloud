package com.cloud.order.feign;

import com.cloud.common.constants.ApplicationConstants;
import com.cloud.common.model.Result;
import com.cloud.common.model.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = ApplicationConstants.ApplicationName.CLOUD_USER, fallback = UserFallbackFactory.class)
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user/list")
    Result<List<UserVo>> getUsers();

    @RequestMapping(method = RequestMethod.POST, value = "/users/{userId}", consumes = "application/json")
    UserVo update(@PathVariable("userId") Long userId, UserVo user);
}
