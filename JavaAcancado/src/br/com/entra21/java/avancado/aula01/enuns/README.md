# Aprender classes ENUM

## São enumeradores, que organizam a leitura e organização do código

> Semelhante a Classes, Interfaces agora o Enum esta na lista de elementos java que podemos utilizar


> enum simples

```java
   public enum EstacoesSimples {
		PRIMAVERA, VERAO, OUTONO, INVERNO,
	} 
	 
```

> - enum com atributo


```java 
	static public enum VideoGames {
		XBOX_S("Irmão menor do XBOX-S", 2800.50), XBOX_X("Console mais recente do XBOX", 4200.5),
		PS4("Versão boa para comprar agora", 3000.5), PS5("Mais caro console no momento", 6000.5);

		private final String nome;
		private final double preco;

		private VideoGames(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;

		}

		public String getNome() {
			return nome;
		}

		public double getPreco() {
			return preco;
		}
	}
```


> - enum com vários atributos


```java 
	static public enum VideoGames {
		XBOX_S("Irmão menor do XBOX-S", 2800.50), XBOX_X("Console mais recente do XBOX", 4200.5),
		PS4("Versão boa para comprar agora", 3000.5), PS5("Mais caro console no momento", 6000.5);

		private final String nome;
		private final double preco;

		private VideoGames(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;

		}

		public String getNome() {
			return nome;
		}

		public double getPreco() {
			return preco;
		}
	}
```
 

> - percorrer enum

```java 
	for (VideoGames videoGame : VideoGames.values()) {
            System.out.println("TITULO = "+videoGame+" -  getName()= "+videoGame.name()+" - atributo getNome()= "+videoGame.getNome()+" - atributo getPreco()= "+videoGame.getPreco());
        }
```