/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vanessalagomachado
 */
@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    
    @Column(nullable = false, length = 20)
    private String nome;
    
    @Column(nullable = false, length = 13)
    private String fone;
    
    @Column(nullable = false, length = 40)
    private String email;
    
    @Enumerated(EnumType.STRING)
    private VinculoPessoa vinculoPessoa;
    
    //@Column(nullable = false, length = 40)
    //private List<Veiculo> listaVeiculos;

    //public Pessoa() {
    //    listaVeiculos = new ArrayList<>();
    //}
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VinculoPessoa getVinculoPessoa() {
        return vinculoPessoa;
    }

    public void setVinculoPessoa(VinculoPessoa vinculoPessoa) {
        this.vinculoPessoa = vinculoPessoa;
    }
    
    /*public void addVeiculo(Veiculo vei){
        listaVeiculos.add(vei);
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }*/
    
    
}
