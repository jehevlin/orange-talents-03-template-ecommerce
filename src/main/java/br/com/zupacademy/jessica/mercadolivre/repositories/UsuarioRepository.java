package br.com.zupacademy.jessica.mercadolivre.repositories;

import br.com.zupacademy.jessica.mercadolivre.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
