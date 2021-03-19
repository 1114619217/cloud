package com.cloud.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.order.mapper.StatisticsMapper;
import com.cloud.order.model.Statistics;
import com.cloud.order.service.StatisticsService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author cgf
 * @since 2020-12-03
 */
@Service
public class StatisticsServiceImpl extends ServiceImpl<StatisticsMapper, Statistics> implements StatisticsService {

    @Override
    public List<Statistics> getInfo() {
        if (this.count() == 0) {
            Statistics statistics = new Statistics();
            statistics.setCreateTime(new Date());
            statistics.setOrderCnt(1);
            statistics.setUserCnt(1);
            this.save(statistics);
        }else {
            Statistics statistics = new Statistics();
            statistics.setOrderCnt(1);
            statistics.setUserCnt(1);
            statistics.setUpdateTime(new Date());
//            this.updateBatchById(statistics)
        }
        return this.getBaseMapper().selectList(null);
    }
}
