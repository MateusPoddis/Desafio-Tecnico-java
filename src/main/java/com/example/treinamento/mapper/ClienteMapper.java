package com.example.treinamento.mapper;

import com.example.treinamento.dto.ClienteDto;
import com.example.treinamento.entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses ={PedidoMapper.class})
public interface ClienteMapper {
    ClienteDto mapToClienteDto (Cliente cliente);

    Cliente mapToCliente (ClienteDto clienteDto);
}
