package com.bjfn.myshop.tiny.controller;

import com.bjfn.myshop.tiny.common.api.CommonResult;
import com.bjfn.myshop.tiny.mbg.model.PmsBrand;
import com.bjfn.myshop.tiny.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
@Api(tags = "商品管理")
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    @ApiOperation(value = "获取全部品牌列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsBrand>> getList() {
        return CommonResult.sucess(pmsBrandService.listAllBrand());
    }
}
