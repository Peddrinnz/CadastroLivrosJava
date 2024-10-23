package br.respository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.model.LivroModel;
public class LivroRepository {
    private static LivroRepository instance;
	protected EntityManager entityManager;

	public LivroRepository() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public static LivroRepository getInstance() {
		if (instance == null) {
			instance = new LivroRepository();
		}
		return instance;
	}

    public String salvar(LivroModel livro) {
        return "Salvo com sucesso";
    }   
}    