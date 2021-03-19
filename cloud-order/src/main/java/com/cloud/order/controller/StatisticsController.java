package com.cloud.order.controller;


import com.cloud.common.model.Result;
import com.cloud.order.model.Statistics;
import com.cloud.order.service.StatisticsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author cgf
 * @since 2021-03-17
 */
@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Resource
    private StatisticsService statisticsService;


    @GetMapping("/get")
    public Result<Statistics> getStatistics() {
        List<Statistics> list = statisticsService.getInfo();
        return Result.success(list);
    }
}

