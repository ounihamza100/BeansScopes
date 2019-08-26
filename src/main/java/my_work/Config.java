//package my_work;
//
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.ScopedProxyMode;
//import org.springframework.web.context.WebApplicationContext;
//
///**
// * @author Hamza Ouni
// */
//@Configuration
//public class Config {
//    //The proxyMode attribute is necessary because, at the moment of the instantiation of the web application context,
//    // there is no active request. Spring will create a proxy to be injected as a dependency, and instantiate the target bean when it is needed in a request.
//    @Bean
//    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public HelloMessageGenerator requestScopedBean() {
//        return new HelloMessageGenerator();
//    }
//}
