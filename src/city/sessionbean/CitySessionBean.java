package city.sessionbean;

import city.CityService;
import city.impl.CityServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class CitySessionBean {

    @Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public CityService cityService(){
        return new CityServiceImpl();
    }

}
