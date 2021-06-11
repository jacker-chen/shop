package com.bjfn.myshop.tiny.controller;

import com.bjfn.myshop.tiny.common.api.CommonResult;
import com.bjfn.myshop.tiny.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sso")
@Api(tags = "会员管理")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode",method = RequestMethod.GET)
    public CommonResult getAuthCode(@RequestParam String telephone){
        return umsMemberService.generateAuthCode(telephone);
    }

    @ApiOperation("验证验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode",method = RequestMethod.POST)
    public CommonResult updatePassword(@RequestParam String telephone,@RequestParam String authcode){
        return umsMemberService.verifyAuthCode(telephone, authcode);
    }
}
