package br.com.foton.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.foton.financas.modelo.Conta;
import br.com.foton.financas.util.JPAUtil;

public class TesteConta {
  public static void main(String[] args) {
	Conta conta = new Conta();
	conta.setTitular("Douglas Lima");
	conta.setAgencia("123");
	conta.setBanco("Caixa Econômica");
	conta.setNumero("456");
	

	EntityManager em = new JPAUtil().getEntityManager();
    em.getTransaction().begin();
	em.persist(conta);
	 em.getTransaction().commit();
	
	em.close();
	
} 
}
