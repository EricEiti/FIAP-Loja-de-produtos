package br.com.fiap.store.dao;

import java.util.List;

import br.com.fiap.store.exception.DBException;

public interface ProdutoDAO {

	void cadastrar(ProdutoDAO produto) throws DBException;

	void atualizar(ProdutoDAO produto) throws DBException;

	void remover(int codigo) throws DBException;

	ProdutoDAO buscar(int id);

	List<ProdutoDAO> listar();

}
