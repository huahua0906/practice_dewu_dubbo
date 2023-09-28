package com.huahua.dewu.dao;

import com.huahua.dewu.dataobject.OrderDO;
import com.huahua.dewu.param.QueryOrderParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDAO {
    int insert(OrderDO order);
    int selectCounts(QueryOrderParam param);
    List<OrderDO> pageQuery(QueryOrderParam param);

}
