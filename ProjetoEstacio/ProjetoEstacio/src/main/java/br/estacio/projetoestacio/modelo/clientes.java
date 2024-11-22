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
@Table(name="clientes")
public class clientes {
    //Wrappers --> Integer, Double, Float, Boolean, ...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(nullable = false)
    private String nomeusuario;
    @Column(nullable = true, unique = true)
    private String cpf;
    @Column(nullable = false)
    private String emailUsuario;
    @Column(nullable = false, unique = true)
    private String celular;    
    @Column(nullable = false)
    private String observaçãoUsuario;
    @Column(nullable = false) 
    private String nascimentoUsuario;
    @Column(nullable = false)
    private String entradaUsuario;
    @Column(nullable = false)
    private String cmbFunção;
    @Column(nullable = false)
    private String sexoUsuario;
    @Column(nullable = false)
    private String salarioBase;
    
    public clientes() {
    }

    public clientes(Integer codigo, String nomeusuario, String cpf, String emailUsuario, String celular, String observaçãoUsuario, String nascimentoUsuario, String entradaUsuario, String cmbFunção, String sexoUsuario, String salarioBase) {
        this.codigo = codigo;
        this.nomeusuario = nomeusuario;
        this.cpf = cpf;
        this.emailUsuario = emailUsuario;
        this.celular = celular;
        this.observaçãoUsuario = observaçãoUsuario;
        this.nascimentoUsuario = nascimentoUsuario;
        this.entradaUsuario = entradaUsuario;
        this.cmbFunção = cmbFunção;
        this.sexoUsuario = sexoUsuario;
        this.salarioBase = salarioBase;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObservaçãoUsuario() {
        return observaçãoUsuario;
    }

    public void setObservaçãoUsuario(String observaçãoUsuario) {
        this.observaçãoUsuario = observaçãoUsuario;
    }

    public String getNascimentoUsuario() {
        return nascimentoUsuario;
    }

    public void setNascimentoUsuario(String nascimentoUsuario) {
        this.nascimentoUsuario = nascimentoUsuario;
    }

    public String getEntradaUsuario() {
        return entradaUsuario;
    }

    public void setEntradaUsuario(String entradaUsuario) {
        this.entradaUsuario = entradaUsuario;
    }

    public String getCmbFunção() {
        return cmbFunção;
    }

    public void setCmbFunção(String cmbFunção) {
        this.cmbFunção = cmbFunção;
    }

    public String getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(String sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    public String getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(String salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "clientes{" + "codigo=" + codigo + ", nomeusuario=" + nomeusuario + ", cpf=" + cpf + ", emailUsuario=" + emailUsuario + ", celular=" + celular + ", observa\u00e7\u00e3oUsuario=" + observaçãoUsuario + ", nascimentoUsuario=" + nascimentoUsuario + ", entradaUsuario=" + entradaUsuario + ", cmbFun\u00e7\u00e3o=" + cmbFunção + ", sexoUsuario=" + sexoUsuario + ", salarioBase=" + salarioBase + '}';
    }
    
    
}
