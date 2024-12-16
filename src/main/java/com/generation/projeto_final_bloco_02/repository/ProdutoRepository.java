package com.generation.projeto_final_bloco_02.repository;
import com.generation.projeto_final_bloco_02.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}