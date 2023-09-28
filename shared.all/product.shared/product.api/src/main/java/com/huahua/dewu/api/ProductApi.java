package com.huahua.dewu.api;

import com.youkeda.comment.model.Paging;
import com.huahua.dewu.model.Product;
import com.youkeda.comment.model.Result;
import com.huahua.dewu.param.BasePageParam;
import com.huahua.dewu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/api/product")
@Controller
public class ProductApi {

    @Autowired
    private ProductService productService;

    @ResponseBody
    @GetMapping("/page")
    public Result<Paging<Product>> pageQuery(BasePageParam param) {

        Result<Paging<Product>> result = new Result<>();

        result.setSuccess(true);
        result.setData(productService.pageQueryProduct(param));
        return result;
    }

    @ResponseBody
    @GetMapping("/get")
    public Result<Product> get(@RequestParam("productId") String productId) {

        Result<Product> result = new Result<>();

        result.setSuccess(true);
        result.setData(productService.get(productId));
        return result;
    }

}
