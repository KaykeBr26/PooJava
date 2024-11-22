/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.receber;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 16380127763
 */
public class ReceberDAO {
    private final EntityManager EM;

    public ReceberDAO(EntityManager EM) {
        this.EM = EM;
    }
    

    public void Receber(receber recebimento){
        EntityTransaction transaction = null;
                try {
                    transaction = EM.getTransaction();
                    transaction.begin();

                    EM.persist(recebimento); // Insere o cliente no banco de dados

                    transaction.commit(); // Confirma a transação
                    System.out.println("Recebimento inserido com sucesso.");

                } catch (Exception e) {
                    if (transaction != null && transaction.isActive()) {
                        transaction.rollback(); // Desfaz a transação em caso de erro
                    }
                    System.out.println("Erro ao tentar inserir Recebimento: " + e.getMessage());
                }
    }
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_Projeto");
    
    public static void preencherTabelaRecebimento(JTable table) {
        EntityManager em = emf.createEntityManager();

        try {
            // JPQL para buscar os dados de nomeCliente, dataPagamento e valorPagamento
            String jpql = "SELECT r.nomeCliente, r.valorPagamento, r.dataPagamento FROM receber r";
            TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);

            // Recupera os resultados
            List<Object[]> resultados = query.getResultList();

            // Modelo da tabela
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Limpa a tabela

            // Adiciona os dados no modelo da tabela
            for (Object[] linha : resultados) {
                model.addRow(new Object[]{
                        linha[0], // nomeCliente
                        linha[1], // dataPagamento
                        linha[2]  // valorPagamento
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
   
    
}
