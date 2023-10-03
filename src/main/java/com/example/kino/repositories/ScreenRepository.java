package com.example.kino.repositories;

import com.example.kino.model.Screen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreenRepository extends JpaRepository<Screen, String>
{

}
