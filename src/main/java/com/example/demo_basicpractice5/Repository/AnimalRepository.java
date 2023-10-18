package com.example.demo_basicpractice5.Repository;

import com.example.demo_basicpractice5.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
