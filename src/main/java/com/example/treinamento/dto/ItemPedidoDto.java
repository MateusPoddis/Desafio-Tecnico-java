package com.example.treinamento.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ItemPedidoDto {
    private Long id;
    private PedidoDto pedido;
    private ProdutoDto produto;
    private Integer quantidade;
    private Float Valor_unitario;
}
