package guru.springframework.didemo;

import guru.springframework.didemo.controller.ConstructInjectedController;
import guru.springframework.didemo.controller.GetterInjectedController;
import guru.springframework.didemo.controller.MyController;
import guru.springframework.didemo.controller.PropertyInjectedController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        FakeJmsDataSource fakeJmsDataSource = ctx.getBean(FakeJmsDataSource.class);
        System.out.println(fakeJmsDataSource.getUser());

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructInjectedController.class).sayHello());
    }
}
