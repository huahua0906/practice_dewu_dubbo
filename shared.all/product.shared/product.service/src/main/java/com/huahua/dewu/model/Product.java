package com.huahua.dewu.model;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {

    /**
     * 主键
     */
    private String id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品参考价格
     */
    private Double price;

    /**
     * 商品销量
     */
    private Integer purchaseNum;

    /**
     * 商品介绍
     */
    private String productIntro;

    /**
     * 商品图片
     */
    private String productImgs;

    /**
     * 创建时间
     */
    private Date gmtCreated;

    /**
     * 修改日期
     */
    private Date gmtModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public String getProductIntro() {
        return productIntro;
    }

    public void setProductIntro(String productIntro) {
        this.productIntro = productIntro;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getProductImgs() {
        return productImgs;
    }

    public void setProductImgs(String productImgs) {
        this.productImgs = productImgs;
    }
}
