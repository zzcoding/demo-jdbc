package com.example.demo.config;

import com.jmapper.core.BaseRepository;
import com.jmapper.core.engine.MapperEngine;
import com.jmapper.core.exception.MappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @created by zhaoguang on 2018/1/6.
 */
@Configuration
@AutoConfigureAfter(DruidConfig.class)
public class JdbcMapperConfig {


    @Autowired
    DataSource dataSource;

    @Bean
    public MapperEngine mapperEngine() {
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        List<File> sqlfileList = new ArrayList<File>();
        List<File> entitiesfileList = new ArrayList<File>();
        MapperEngine mapperEngine = new MapperEngine();
        try {
            Resource[] sqls = resolver.getResources("classpath*:**/*.sql.xml");
            for (Resource resource : sqls) {
                sqlfileList.add(resource.getFile());
            }
            mapperEngine.initSqlMapper(sqlfileList);
            Resource[] entities = resolver.getResources("classpath*:**/*.hbm.xml");
            for (Resource resource : entities) {
                entitiesfileList.add(resource.getFile());
            }
            mapperEngine.initEntityMapper(entitiesfileList);


        } catch (Exception e) {
            e.printStackTrace();
            throw new MappingException("加载jmapper映射xml文件出错！"+e.getMessage());

        }
        return mapperEngine;
    }

    @Bean
    public BaseRepository baseRepository() {
        return new BaseRepository(mapperEngine(), dataSource);
    }

}
