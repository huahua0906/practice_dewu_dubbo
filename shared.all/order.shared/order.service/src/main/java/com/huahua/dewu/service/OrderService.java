package com.huahua.dewu.service;

import com.huahua.dewu.model.Order;
import com.youkeda.comment.model.Paging;
import com.huahua.dewu.param.QueryOrderParam;

public interface OrderService {
    /**
     * 下单
     *
     * @param order 接收的Order模型
     * @return
     */
    public Order add(Order order);

    /**
     * 查询订单
     *
     * @param queryOrderParam 查询参数
     * @return
     */
    Paging<Order> queryRecentPaySuccess(QueryOrderParam queryOrderParam);
}
