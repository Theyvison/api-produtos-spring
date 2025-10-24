package io.github.theyvison.produtosapi.repository;

import io.github.theyvison.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
