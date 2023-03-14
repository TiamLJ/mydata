import com.aoptest.config.AppConfig;
import com.aoptest.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void test1(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        UserService us= (UserService) applicationContext.getBean("uservice");
        us.fun1();
        us.fun2();
        us.fun3();
        us.fun4();
        us.fun5();
    }
}
