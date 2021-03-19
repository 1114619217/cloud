package com.cloud.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.order.model.Statistics;

import java.util.List;

public interface StatisticsService extends IService<Statistics> {
    List<Statistics> getInfo();
}
