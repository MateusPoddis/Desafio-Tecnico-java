package com.example.treinamento.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "item_pedido",
        uniqueConstraints = {
                @UniqueConstraint(
                        name ="uk_pedido_produto",
                columnNames = {"pedido_id", "produto_id"}
            )
        }
)
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column(name ="quantidade")
    private Double quantidade;

    @Column(name = "valor_unitario")
    private Float valor_unitario;
}
