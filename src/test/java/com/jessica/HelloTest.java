package com.jessica;

import com.jessica.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by guanyiting on 2018/6/11 0011.
 * desc:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {
    private MockMvc mvc;

    @Before
    public void SetUp() throws Exception{
        mvc= MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void TestHello()throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/hello/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("new Create SpringBoot Application.")));
    }
}
