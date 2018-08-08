package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource("classpath:datasource.properties")
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        //@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl")
    String url;

    @Value("${guru.jms.username}")
    String jmsuser;

    @Value("${guru.jms.password}")
    String jmspassword;

    @Value("${guru.jms.dburl")
    String jmsurl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(this.user);
        fakeDataSource.setPassword(this.password);
        fakeDataSource.setUrl(this.url);
        return fakeDataSource;
    }


    @Bean
    public FakeJmsDataSource fakeJmsDataSource() {
        FakeJmsDataSource fakejmsDataSource = new FakeJmsDataSource();
        fakejmsDataSource.setUser(this.jmsuser);
        fakejmsDataSource.setPassword(this.jmspassword);
        fakejmsDataSource.setUrl(this.jmsurl);
        return fakejmsDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
