package kr.re.kitri.minisns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class MinisnsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinisnsApplication.class, args);
    }

}
