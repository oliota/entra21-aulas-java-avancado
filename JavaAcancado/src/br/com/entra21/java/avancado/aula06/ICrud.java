package br.com.entra21.java.avancado.aula06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import br.com.entra21.java.avancado.aula03.anotacoes.Lembrete;

//<QualquerLetra> serve como alias para um tipo que ser� informado por quem implementar essa interface
//em cada assinatura de m�todo que possuir o alias 
//ser� criado um m�todo para implementar com o retorno ou parametro j� atualizado conforme solicitado
public interface ICrud<T> {

	// atributos s�o est�ticos em interfaces e podem ser utilizados para fornecer de
	// forma facil um lista
	ArrayList<String> opcoes = new ArrayList<String>(
			Arrays.asList("Listar", "Adicionar", "Buscar", "Editar", "Deletar"));

	@Lembrete(value = "Inclui um valor, fa�a do seu jeito") 
	public void listar(HashMap<String, T> lista);
	// Perfeita forma de generics, solicitar parametro de uma Collection
	// que gerencia um 'Tipo' que eu ainda nem sei oq �

	@Lembrete(value = "Inclui um valor, fa�a do seu jeito")
	public void adicionar();// m�todo simples em uma interface, nao tem parametros nem retorno

	@Lembrete(value = "Busca um valor com base em um campo chave e devolve o item quando encontra, fa�a do seu jeito\"")
	public T buscar(T chave);
	// 3� forma de generics, retonar e solicitar parametro de um 'Tipo' que eu ainda
	// nem sei oq �

	@Lembrete(value = "Edita um valor com base em um campo chave, fa�a do seu jeito")
	public void editar(T chave);
	// 2� forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei
	// oq �


	@Lembrete(value = "Deleta um item com base em um campo chave, fa�a do seu jeito")
	public void deletar(T chave);
	// 2� forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei
	// oq �


	@Lembrete(value = "Retorna um valor que � considerado chave de busca, fa�a do seu jeito")
	public T capturarChave();
	// 1� forma de generics, retonar um 'Tipo' que eu ainda nem sei oq �


	@Lembrete(value = "Retorna um valor que � considerado item completo, fa�a do seu jeito")
	public T capturarValores();
	// 1� forma de generics, retonar um 'Tipo' que eu ainda nem sei oq �


	@Lembrete(value = "Espera um item completo para exibir seus detalhes, fa�a do seu jeito")
	public void exibirDetalhes(T completo);
	// 2� forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem
	// sei oq �
}
