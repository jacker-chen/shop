package com.bjfn.myshop.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.bjfn.myshop.tiny.mbg.mapper")
public class MyBatisConfig {
}
