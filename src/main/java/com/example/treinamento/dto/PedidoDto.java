package com.example.treinamento.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PedidoDto {
    private Long id;
    private ClienteDto cliente;
    private LocalDateTime data;
    private String status;
    private List<ItemPedidoDto> itemPedido;
}
