package com.huahua.dewu.service;

import com.huahua.dewu.model.ProductDetail;

import java.util.List;

public interface ProductDetailService {
    /**
     * 获取多个商品详情
     *
     * @param productDetailIds  查询参数
     * @return
     */
    public List<ProductDetail> queryProductDetail(List<String> productDetailIds);

    /**
     * 添加或者修改
     *
     * @param productDetail 产品
     * @return int
     */
    int save(ProductDetail productDetail);

    /**
     * 获取商品详情
     *
     * @param productId 商品主键
     * @return ProductDetail
     */
    List<ProductDetail> getByProductId(String productId);

    /**
     * 获取商品详情
     *
     * @param id 主键
     * @return ProductDetail
     */
    ProductDetail get(String id);
}