package com.bestzyx.canal.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhangyongxiang on 2024/4/1 5:39 PM
 **/

@Configuration
@EnableConfigurationProperties({ CanalAdminProperties.class })
public class CanalAutoConfiguration {

}
