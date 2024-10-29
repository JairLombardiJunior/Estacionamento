/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vanessalagomachado
 */
@Entity
@Table(name = "tb_entradasaida")
public class EntradaSaida {
    
    @Id
    private int id;
    
    @Column(nullable = false, length = 20)
    private Date data;
    
    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;
    
    @Column(nullable = false, length = 20)
    private final Veiculo veiculo;

    public EntradaSaida(TipoMovimentacao tipo, Veiculo veiculo) {
        tipoMovimentacao = tipo;
        this.veiculo = veiculo;
        data = new Date();
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    
}
