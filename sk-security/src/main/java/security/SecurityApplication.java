package security;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class SecurityApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class,args);
    }
}
