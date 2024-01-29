package com.example.springapi;
import com.example.springapi.controller.UserController;
import com.example.springapi.model.User;
import com.example.springapi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class SpringApiApplicationTests {

    @Test
    void contextLoads() {
    }

    private UserService service;
    private UserController controller;
    private MockMvc mockMvc;
    @Test
    public void testShouldReturn404NotFound() throws Exception
    {


    }

}
