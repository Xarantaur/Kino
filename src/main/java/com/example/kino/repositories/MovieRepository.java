package com.example.kino.repositories;

import com.example.kino.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String>
{
}
