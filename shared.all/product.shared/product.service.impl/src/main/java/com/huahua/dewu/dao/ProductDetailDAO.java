package com.huahua.dewu.dao;

import com.huahua.dewu.dataobject.ProductDetailDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDetailDAO {
    List<ProductDetailDO> selectByIds(List<String> ids);
    int deleteByPrimaryKey(String id);

    int insert(ProductDetailDO record);

    ProductDetailDO selectByPrimaryKey(String id);

    List<ProductDetailDO> selectAll();

    List<ProductDetailDO> selectByProductId(String productId);

    int updateByPrimaryKey(ProductDetailDO record);
}
