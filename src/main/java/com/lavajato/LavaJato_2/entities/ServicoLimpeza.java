package com.lavajato.LavaJato_2.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "servicos_limpeza")
public class ServicoLimpeza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime datahora;
    private String tiposervico;
    private Cliente cliente;
    private ProdutoLimpeza produtolimpeza;
    private Pagamento pagamento;
    public LocalDateTime getDataHora() {
        return datahora;
    }

    public void adicionarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean verificarDisponibilidade(ProdutoLimpeza produtoLimpeza) {

        return true;
    }

    public void solicitarAgendamento() {

    }

    public String verificarDisponibilidadeDeAgendamento(LocalDateTime dataHora) {
        return "Disponível";
    }
}