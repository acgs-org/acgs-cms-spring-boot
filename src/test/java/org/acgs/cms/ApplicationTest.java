package org.acgs.cms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author John@acgs-org
 * @Date 2020/12/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Test
    public static void main(String[] args) {
        SpringApplication.run(ApplicationTest.class, args);
    }

}
