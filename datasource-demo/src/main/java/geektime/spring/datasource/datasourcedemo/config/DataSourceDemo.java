//package geektime.spring.datasource.datasourcedemo.config;
//
//import org.apache.commons.dbcp2.BasicDataSourceFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.Arrays;
//import java.util.Properties;
//
///**
// * @author zangtao
// */
//@Configuration
//@EnableTransactionManagement
//public class DataSourceDemo {
//
//    @Autowired
//    private DataSource dataSource;
//
//    public static void main(String[] args) {
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("applicationContext*.xml");
//
//        showBeans(applicationContext);
//        datasourceDemo(applicationContext);
//    }
//
//    @Bean(destroyMethod = "close")
//    public DataSource dataSource() throws Exception {
//        Properties properties = new Properties();
//        properties.setProperty("driverClassName","org.h2.Driver");
//        properties.setProperty("url","jdbc:h2:men:testdb");
//        properties.setProperty("username","sa");
//        return BasicDataSourceFactory.createDataSource(properties);
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() throws Exception {
//        return new DataSourceTransactionManager(dataSource());
//
//    }
//
//    private static void datasourceDemo(ApplicationContext applicationContext) {
//        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
//    }
//
//    private static void showBeans(ApplicationContext applicationContext) {
//        DataSourceDemo demo = applicationContext.getBean("dataSourceDemo",DataSourceDemo.class);
//        demo.showDataSource();
//    }
//
//    private void showDataSource() {
//    }
//}