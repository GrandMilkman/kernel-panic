package file;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import liquibase.integration.spring.SpringLiquibase;

@SpringBootApplication
public class Main extends SpringBootServletInitializer {
	
	String changelog = "classpath:db-changelog.xml";
	String contexts = "derby";
	
    @Bean("liquibase")
    @ConfigurationProperties("spring.datasource")
    public SpringLiquibase springLiquibase(@Autowired final DataSource dataSource) {
        final SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog(changelog);
        liquibase.setContexts(contexts);
        return liquibase;
    }

    public static void main(String[] args) throws Exception {
            SpringApplication.run(Main.class, args);
    }

}
