package com.demo.rabbitmq.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author: wufeng
 * @date: 2018/7/12 10:56
 * @desrcption: 集成Mybatis的基本入口
 */
@Deprecated
public class DataSourceConfig {

    @Value("${driverClassName}")
    private String driverClass;
    @Value("${url}")
    private String url;
    @Value("${username}")
    private String userName;
    @Value("${password}")
    private String passWord;
    @Value("${typeAliasesPackage}")
    private String typeAliasesPackage;
    @Value("${mapperLocations}")
    private String mapperLocations;

    @Autowired
    private Environment environment;

    /**
     * @Title: getDataSource
     * @Description: 创建数据源
     * @param @return
     * @return DataSource
     * @throws
     */
    @Bean
    public DataSource getDataSource(){
        Properties props = new Properties();
        props.put("driverClass", typeAliasesPackage);
        props.put("url", url);
        props.put("username", userName);
        props.put("password", passWord);
        try {
            return DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * @Title: sqlSessionFactory
     * @Description:  根据数据源创建SqlSessionFactory
     * @param @param ds
     * @param @return
     * @param @throws Exception
     * @return SqlSessionFactory
     * @throws
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception{
        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
        sfb.setDataSource(ds);
        //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        sfb.setTypeAliasesPackage(typeAliasesPackage);
        sfb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
        return sfb.getObject();
    }
}
