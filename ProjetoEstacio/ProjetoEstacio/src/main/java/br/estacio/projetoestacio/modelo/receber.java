/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 16380127763
 */
@Entity
@Table(name="receber")
public class receber {
    //Wrappers --> Integer, Double, Float, Boolean, ...
    //Geral
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(nullable = false)
    private String nomeCliente;
    @Column(nullable = false)
    private String númeroCliente;
    @Column(nullable = false)
    private String endereçoServiço;
    @Column(nullable = false)
    private String dataServiço;
    @Column(nullable = false)
    private String descriçãoServiço;
    @Column(nullable = false)
    private String duraçãoServiço;
    @Column(nullable = false)
    private String tipoDrone;
    
    //Financeiro
    @Column(nullable = false)
    private String valorPagamento;
    @Column(nullable = false)
    private String dataPagamento;
    @Column(nullable = false)
    private String metodoPagamento;
    @Column(nullable = false)
    private String statusPagamento;
    
    //Notas
    @Column(nullable = false)
    private String notasAdicionais;
    @Column(nullable = false)
    private String observacaoPagamento;
    

    public receber() {
    }

    public receber(Integer codigo, String nomeCliente, String númeroCliente, String endereçoServiço, String dataServiço, String descriçãoServiço, String duraçãoServiço, String tipoDrone, String valorPagamento, String dataPagamento, String metodoPagamento, String statusPagamento, String notasAdicionais, String observacaoPagamento) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.númeroCliente = númeroCliente;
        this.endereçoServiço = endereçoServiço;
        this.dataServiço = dataServiço;
        this.descriçãoServiço = descriçãoServiço;
        this.duraçãoServiço = duraçãoServiço;
        this.tipoDrone = tipoDrone;
        this.valorPagamento = valorPagamento;
        this.dataPagamento = dataPagamento;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
        this.notasAdicionais = notasAdicionais;
        this.observacaoPagamento = observacaoPagamento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNúmeroCliente() {
        return númeroCliente;
    }

    public void setNúmeroCliente(String númeroCliente) {
        this.númeroCliente = númeroCliente;
    }

    public String getEndereçoServiço() {
        return endereçoServiço;
    }

    public void setEndereçoServiço(String endereçoServiço) {
        this.endereçoServiço = endereçoServiço;
    }

    public String getDataServiço() {
        return dataServiço;
    }

    public void setDataServiço(String dataServiço) {
        this.dataServiço = dataServiço;
    }

    public String getDescriçãoServiço() {
        return descriçãoServiço;
    }

    public void setDescriçãoServiço(String descriçãoServiço) {
        this.descriçãoServiço = descriçãoServiço;
    }

    public String getDuraçãoServiço() {
        return duraçãoServiço;
    }

    public void setDuraçãoServiço(String duraçãoServiço) {
        this.duraçãoServiço = duraçãoServiço;
    }

    public String getTipoDrone() {
        return tipoDrone;
    }

    public void setTipoDrone(String tipoDrone) {
        this.tipoDrone = tipoDrone;
    }

    public String getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(String valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getNotasAdicionais() {
        return notasAdicionais;
    }

    public void setNotasAdicionais(String notasAdicionais) {
        this.notasAdicionais = notasAdicionais;
    }

    public String getObservacaoPagamento() {
        return observacaoPagamento;
    }

    public void setObservacaoPagamento(String observacaoPagamento) {
        this.observacaoPagamento = observacaoPagamento;
    }

    @Override
    public String toString() {
        return "receber{" + "codigo=" + codigo + ", nomeCliente=" + nomeCliente + ", n\u00fameroCliente=" + númeroCliente + ", endere\u00e7oServi\u00e7o=" + endereçoServiço + ", dataServi\u00e7o=" + dataServiço + ", descri\u00e7\u00e3oServi\u00e7o=" + descriçãoServiço + ", dura\u00e7\u00e3oServi\u00e7o=" + duraçãoServiço + ", tipoDrone=" + tipoDrone + ", valorPagamento=" + valorPagamento + ", dataPagamento=" + dataPagamento + ", metodoPagamento=" + metodoPagamento + ", statusPagamento=" + statusPagamento + ", notasAdicionais=" + notasAdicionais + ", observacaoPagamento=" + observacaoPagamento + '}';
    }

  
}
