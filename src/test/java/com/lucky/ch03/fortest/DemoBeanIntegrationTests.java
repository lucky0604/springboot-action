package com.lucky.ch03.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lucky on 12/30/16.
 */
// SpringJUnit4ClassRunner在JUnit环境下提供
@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration用来加载配置ApplicationContext，其中classes属性用来加载配置类
@ContextConfiguration(classes = {TestConfig.class})
// @ActiveProfiles用来声明活动的profile
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

    // 可使用普通的@Autowired注入Bean
    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        // 测试代码，通过JUnit的Assert来校验结果是否何预期一致
        Assert.assertEquals(expected, actual);
    }
}
