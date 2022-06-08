package br.com.entra21.java.avancado.aula06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import br.com.entra21.java.avancado.aula03.anotacoes.Lembrete;

//<QualquerLetra> serve como alias para um tipo que será informado por quem implementar essa interface
//em cada assinatura de método que possuir o alias 
//será criado um método para implementar com o retorno ou parametro já atualizado conforme solicitado
public interface ICrud<T> {

	// atributos são estáticos em interfaces e podem ser utilizados para fornecer de
	// forma facil um lista
	ArrayList<String> opcoes = new ArrayList<String>(
			Arrays.asList("Listar", "Adicionar", "Buscar", "Editar", "Deletar"));

	@Lembrete(value = "Inclui um valor, faça do seu jeito") 
	public void listar(HashMap<String, T> lista);
	// Perfeita forma de generics, solicitar parametro de uma Collection
	// que gerencia um 'Tipo' que eu ainda nem sei oq é

	@Lembrete(value = "Inclui um valor, faça do seu jeito")
	public void adicionar();// método simples em uma interface, nao tem parametros nem retorno

	@Lembrete(value = "Busca um valor com base em um campo chave e devolve o item quando encontra, faça do seu jeito\"")
	public T buscar(T chave);
	// 3º forma de generics, retonar e solicitar parametro de um 'Tipo' que eu ainda
	// nem sei oq é

	@Lembrete(value = "Edita um valor com base em um campo chave, faça do seu jeito")
	public void editar(T chave);
	// 2º forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei
	// oq é


	@Lembrete(value = "Deleta um item com base em um campo chave, faça do seu jeito")
	public void deletar(T chave);
	// 2º forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei
	// oq é


	@Lembrete(value = "Retorna um valor que é considerado chave de busca, faça do seu jeito")
	public T capturarChave();
	// 1º forma de generics, retonar um 'Tipo' que eu ainda nem sei oq é


	@Lembrete(value = "Retorna um valor que é considerado item completo, faça do seu jeito")
	public T capturarValores();
	// 1º forma de generics, retonar um 'Tipo' que eu ainda nem sei oq é


	@Lembrete(value = "Espera um item completo para exibir seus detalhes, faça do seu jeito")
	public void exibirDetalhes(T completo);
	// 2º forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem
	// sei oq é
}
