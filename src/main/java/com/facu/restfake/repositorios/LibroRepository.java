package com.facu.restfake.repositorios;

import com.facu.restfake.entidades.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long>{
}
