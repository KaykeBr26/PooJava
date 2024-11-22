/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.material;
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
public class MaterialDAO {
    private final EntityManager EM;

    public MaterialDAO(EntityManager EM) {
        this.EM = EM;
    }
    
    public void Material(material MaterialComprado){
        EntityTransaction transaction = null;
                try {
                    transaction = EM.getTransaction();
                    transaction.begin();

                    EM.persist(MaterialComprado); // Insere o cliente no banco de dados

                    transaction.commit(); // Confirma a transação
                    System.out.println("Material Comprado inserido com sucesso.");

                } catch (Exception e) {
                    if (transaction != null && transaction.isActive()) {
                        transaction.rollback(); // Desfaz a transação em caso de erro
                    }
                    System.out.println("Erro ao tentar inserir Material Comprado: " + e.getMessage());
                }
    }
        
   private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_Projeto"); // Nome da unidade de persistência
    public static void preencherTabelaMaterial(JTable table) {
        EntityManager em = emf.createEntityManager();

        try {
            // JPQL para buscar os dados de nomeCliente, dataPagamento e valorPagamento
            String jpql = "SELECT r.PreçoCompra, r.DataCompra, r.Modelo,r.Produto, r.Comprador  FROM material r";
            TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);

            // Recupera os resultados
            List<Object[]> resultados = query.getResultList();

            // Modelo da tabela
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Limpa a tabela

            // Adiciona os dados no modelo da tabela
            for (Object[] linha : resultados) {
                model.addRow(new Object[]{
                        linha[0], // preçoCompra
                        linha[1], // dataCompra
                        linha[2], // modeloCompra
                        linha[3], // Produto
                        linha[4]  // Comprador
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
   
    
       
  
}
