package cl.acc.tutorial.config;

import com.github.dozermapper.spring.DozerBeanMapperFactoryBean;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author fseguel
 */
@Configuration
public class MappingConfiguration {
    
    @Bean
    public DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean(@Value("classpath*:mapping.xml") Resource[] resources) throws Exception {
        final DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
        dozerBeanMapperFactoryBean.setMappingFiles(resources);
        return dozerBeanMapperFactoryBean;
    }
}
