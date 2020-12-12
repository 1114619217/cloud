package com.cloud.order.feign;

import com.cloud.common.model.Result;
import com.cloud.common.model.vo.UserVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFallbackFactory implements UserClient {
    @Override
    public Result<List<UserVo>> getUsers() {
        return Result.fail("系统异常，请稍后再试!");
    }

    @Override
    public UserVo update(Long userId, UserVo user) {
        return null;
    }
}
