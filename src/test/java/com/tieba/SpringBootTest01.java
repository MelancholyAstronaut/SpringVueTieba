package com.tieba;

import com.tieba.service.HottieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author qiu
 * @classname SpringBootTest
 * @description TODO
 * @date 2020/10/23 16:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTest01 {
    @Resource
    private HottieService hottieService;
    @Test
    public void test01(){
        System.out.println(hottieService.queryHotTie());
    }
}
