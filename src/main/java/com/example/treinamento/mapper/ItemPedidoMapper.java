package com.example.treinamento.mapper;

import com.example.treinamento.dto.ItemPedidoDto;
import com.example.treinamento.entity.ItemPedido;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring", uses = {PedidoMapper.class, ProdutoMapper.class})
public interface ItemPedidoMapper {
    ItemPedidoDto mapToItemPedidoDto (ItemPedido itemPedido);

    ItemPedido mapToItemPedido (ItemPedidoDto itemPedidoDto);
}
