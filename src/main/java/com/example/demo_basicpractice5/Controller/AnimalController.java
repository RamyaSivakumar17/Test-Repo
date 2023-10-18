package com.example.demo_basicpractice5.Controller;

import com.example.demo_basicpractice5.Model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {
    @GetMapping ("/creature")
    public List<Animal> getallAnimals(){
        List<Animal> creature = List.of(
                new Animal("dog", "Black", 15),
                new Animal("Cat", "White",5),
                new Animal("Bunny", "Brown", 4)
        );
        return creature;
    }
}
