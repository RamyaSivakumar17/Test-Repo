package com.example.demo_basicpractice5;

import com.example.demo_basicpractice5.Controller.AnimalController;
import com.example.demo_basicpractice5.Model.Animal;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AnimalController.class)
public class AnimalControllerObjectMapperTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setup(){}

    @Test
    public void testGetAllAnimals() throws Exception{
        List<Animal> expectedAnimal = List.of(
                new Animal("dog", "Black", 15),
                new Animal("Cat", "White",5),
                new Animal("Bunny", "Brown", 4)
        );
        String expectedJsonResponse = objectMapper.writeValueAsString(expectedAnimal);
        mockMvc.perform(get("/creature"))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJsonResponse));

    }
}

