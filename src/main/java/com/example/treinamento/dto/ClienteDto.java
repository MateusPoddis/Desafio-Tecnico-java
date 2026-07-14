package com.example.treinamento.dto;

import com.example.treinamento.entity.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ClienteDto {
    private Long id;
    private String nome;
    private String email;
    private boolean vip;
    private List<PedidoDto> pedidos;
}
