/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
@Table(name = "tb_ESOficial")
public class ESOficial extends EntradaSaida{
    
    @Id
    private int kmRegistrado;
    
    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Pessoa motorista;

    public ESOficial(TipoMovimentacao tipo, Veiculo veiculo, Pessoa motorista) {
        super(tipo, veiculo);
        this.motorista = motorista;
    }

    public int getKmRegistrado() {
        return kmRegistrado;
    }

    public void setKmRegistrado(int kmRegistrado) {
        this.kmRegistrado = kmRegistrado;
    }

    public Pessoa getMotorista() {
        return motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }
    
    
}
