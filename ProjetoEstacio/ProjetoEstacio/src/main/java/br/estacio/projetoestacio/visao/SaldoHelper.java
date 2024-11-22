/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.visao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Kayke
 */
public class SaldoHelper {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_Projeto");

    public static double calcularSaldo() {
        EntityManager em = emf.createEntityManager();

        try {
            // Consulta para somar os valores de Pagamento (como String)
            String queryPagamento = "SELECT p.valorPagamento FROM receber p";
            List<String> pagamentos = em.createQuery(queryPagamento, String.class).getResultList();

            // Consulta para somar os valores de Despesa (como String)
            String queryDespesa = "SELECT d.pagamento FROM pagamentofuncionario d";
            List<String> despesas = em.createQuery(queryDespesa, String.class).getResultList();

            // Soma dos pagamentos e despesas convertidos para Double
            double totalRecebido = pagamentos.stream()
                    .mapToDouble(p -> parseValor(p)) // Converte cada valor de String para Double
                    .sum();

            double totalDespesas = despesas.stream()
                    .mapToDouble(d -> parseValor(d)) // Converte cada valor de String para Double
                    .sum();

            // Calcula o saldo
            return totalRecebido - totalDespesas;

        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        } finally {
            em.close();
        }
    }

    // Método para tentar converter uma String para Double (com tratamento de exceções)
    private static double parseValor(String valor) {
        try {
            if (valor != null && !valor.isEmpty()) {
                return Double.parseDouble(valor); // Converte String para Double
            } else {
                return 0.0; // Caso a String esteja vazia ou nula, retorna 0.0
            }
        } catch (NumberFormatException e) {
            return 0.0; // Se ocorrer erro na conversão, retorna 0.0
        }
    } 
}
