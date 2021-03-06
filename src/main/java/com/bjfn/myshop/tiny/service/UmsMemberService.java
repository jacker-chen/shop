package com.bjfn.myshop.tiny.service;

import com.bjfn.myshop.tiny.common.api.CommonResult;

/**
 * 会员管理
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
