package br.com.foton.teste;

import javax.persistence.EntityManager;

import br.com.foton.financas.modelo.Conta;
import br.com.foton.financas.util.JPAUtil;

public class TesteBuscaConta {
	
 public static void main(String[] args) {
	EntityManager em = new JPAUtil().getEntityManager();
	em.getTransaction().begin();
	
	Conta conta = em.find(Conta.class, 1);
	conta.setTitular("Douglas Silva Dias");
	System.out.println(conta.getTitular());
	
	em.getTransaction().commit();
	
}
}
