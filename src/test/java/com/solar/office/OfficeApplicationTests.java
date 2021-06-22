package com.solar.office;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class OfficeApplicationTests {

    @Autowired
    TestRestTemplate trt;

    @Test
    public void contextLoads() {
        this.getClass().getClassLoader();
        CountDownLatch cdl = new CountDownLatch(1);
        CountDownLatch counter = new CountDownLatch(30);
        for (int i = 0; i < 30; i++) {
            final int finalI = i;
            new Thread(() -> {

                try {
                    cdl.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String url = "http://localhost:8080/user/1001";
                Map forObject = trt.getForObject(url, Map.class);
                System.out.println("this is " + finalI + " and result is" + forObject);
                counter.countDown();
            }).start();
        }

        cdl.countDown();
        try {
            counter.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------");

    }


}
