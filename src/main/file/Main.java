package file;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import liquibase.integration.spring.SpringLiquibase;

@SpringBootApplication
public class Main extends SpringBootServletInitializer {
    @Bean("liquibase")
    @ConfigurationProperties("spring.datasource")
    public SpringLiquibase springLiquibase(@Autowired final DataSource dataSource) {
        final SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
//        liquibase.setChangeLog(changelog);
//        liquibase.setContexts(contexts);
        return liquibase;
    }

    public static void main(String[] args) throws Exception {
        Logger logger = LoggerFactory.getLogger(Main.class);
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
    }

}
