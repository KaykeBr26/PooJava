/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Kayke
 */
public class saldo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String receber;
    private String despesas;

    public saldo() {
    }

    public saldo(Long id, String receber, String despesas) {
        this.id = id;
        this.receber = receber;
        this.despesas = despesas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceber() {
        return receber;
    }

    public void setReceber(String receber) {
        this.receber = receber;
    }

    public String getDespesas() {
        return despesas;
    }

    public void setDespesas(String despesas) {
        this.despesas = despesas;
    }

    @Override
    public String toString() {
        return "saldo{" + "id=" + id + ", receber=" + receber + ", despesas=" + despesas + '}';
    }
    
    
}
