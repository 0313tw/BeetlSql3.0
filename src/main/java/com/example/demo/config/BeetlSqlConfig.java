/**
 * Author: SNIPER
 * Date: 2018/9/14 11:09
 * DESCRIPTION:
 **/
package com.example.demo.config;

//import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.env.Environment;

@Slf4j
@Configuration
public class BeetlSqlConfig {

//    @Primary
//    @Bean(name = "myDataSource1")
//    public HikariDataSource datasource(Environment env) {
//        HikariDataSource ds = new HikariDataSource();
//        ds.setJdbcUrl(env.getProperty("spring.datasource.druid.url"));
//        ds.setUsername(env.getProperty("spring.datasource.druid.username"));
//        ds.setPassword(env.getProperty("spring.datasource.druid.password"));
//        ds.setDriverClassName(env.getProperty("spring.datasource.druid.driver-class-name"));
//        return ds;
//    }

    @Bean
    public GroupTemplate getClasspathGroupTemplate() {
        val resourceLoader = new ClasspathResourceLoader();
        try {
            val cfg = org.beetl.core.Configuration.defaultConfiguration();
            cfg.setPlaceholderStart("#");
            cfg.setPlaceholderEnd("#");
            return new GroupTemplate(resourceLoader, cfg);
        } catch (Exception ex) {
            throw new RuntimeException("初始化ibeetl模板引擎出错");
        }
    }
}
