package br.com.zupacademy.jessica.mercadolivre.repositories;

import br.com.zupacademy.jessica.mercadolivre.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, String> {
}
