package com.example.treinamento.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProdutoDto {
    private Long id;
    private String nome;
    private Float preco;
    private boolean ativo;
    private List<ItemPedidoDto> itemPedido;
}
