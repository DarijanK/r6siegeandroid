package hr.android.webapi.r6siege;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"hr.android.webapi.r6siege.operator", "hr.android.webapi.r6siege.map", "hr.android.webapi.r6siege.controller"})
@Configuration
@SpringBootApplication
public class R6siegeApplication {

    public static void main(String[] args) {
        SpringApplication.run(R6siegeApplication.class, args);
    }

}
