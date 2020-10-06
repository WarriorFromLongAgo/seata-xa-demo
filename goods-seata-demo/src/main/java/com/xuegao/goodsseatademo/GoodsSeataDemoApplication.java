package com.xuegao.goodsseatademo;

import com.xuegao.goodsseatademo.config.DataSourceProxyConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 取消数据源的自动创建，使用Seata对数据源进行代理
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = "com.xuegao.goodsseatademo.dao")
// 导入自定义数据源配置
@Import({DataSourceProxyConfig.class})
@EnableTransactionManagement
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.xuegao.goodsseatademo.openfeign")
public class GoodsSeataDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsSeataDemoApplication.class, args);
    }

}
