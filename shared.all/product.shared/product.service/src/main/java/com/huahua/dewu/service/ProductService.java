package com.huahua.dewu.service;

import com.youkeda.comment.model.Paging;
import com.huahua.dewu.model.Product;
import com.huahua.dewu.param.BasePageParam;

public interface ProductService {

    /**
     * 增加或修改商品
     * @param product 商品
     * @return Product
     */
    int save(Product product);

    /**
     * 分页查询商品
     * @param param 商品分页参数
     * @return PagingData<Product>
     */
    Paging<Product> pageQueryProduct(BasePageParam param);

    /**
     * 根据主键获取商品
     * @param productId 商品主键
     * @return Product
     */
    Product get(String productId);

}
