/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author frede
 */
public class ModeloCidades {
    
    private int cod; // pk
    private String nome;
    private int cod_estado; // fk

    public ModeloCidades() {
    }

    public ModeloCidades(int cod, String nome, int cod_estado) {
        this.cod = cod;
        this.nome = nome;
        this.cod_estado = cod_estado;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod_estado() {
        return cod_estado;
    }

    public void setCod_estado(int cod_estado) {
        this.cod_estado = cod_estado;
    }
    
}
