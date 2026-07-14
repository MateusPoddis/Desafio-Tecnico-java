package com.example.treinamento.mapper;

import com.example.treinamento.dto.PedidoDto;
import com.example.treinamento.entity.Pedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {ClienteMapper.class, ItemPedidoMapper.class})
public interface PedidoMapper {
    PedidoDto mapToPedidoDto (Pedido pedido);

    Pedido mapToPedido (PedidoDto pedidoDto);
}
