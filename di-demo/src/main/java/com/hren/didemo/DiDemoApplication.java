package com.hren.didemo;

import com.hren.didemo.controllers.ConstructorInjectedController;
import com.hren.didemo.controllers.MyController;
import com.hren.didemo.controllers.PropertyInjectedController;
import com.hren.didemo.controllers.SetterInjectedController;
import com.hren.didemo.datasource.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUserName());

    }
}
