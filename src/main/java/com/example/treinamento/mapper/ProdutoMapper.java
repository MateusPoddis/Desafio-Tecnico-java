package com.example.treinamento.mapper;

import com.example.treinamento.dto.ProdutoDto;
import com.example.treinamento.entity.Produto;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring", uses = {ItemPedidoMapper.class} )
public interface ProdutoMapper {
    ProdutoDto mapToProdutoDto (Produto produto);

    Produto mapToProduto (ProdutoDto produtoDto);
}
