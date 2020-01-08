package gmall.atguigu.com.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "gmall.atguigu.com.user.mapper")
public class UserGmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserGmallApplication.class, args);
    }

}
