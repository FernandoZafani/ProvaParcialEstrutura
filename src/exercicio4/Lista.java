package exercicio4;

public class Lista {
	No inicio;
	No fim;

	// m�todo para inserir um elemento na lista.
	// a inser��o deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);

		if (inicio == null) {
			inicio = aux;
			fim = aux;
		} else if (aux.dado >= fim.dado) {
			fim.dir = aux;
			aux.esq = fim;
			fim = aux;
		} else if (aux.dado <= inicio.dado) {
			inicio.esq = aux;
			aux.dir = inicio;
			inicio = aux;
		} else {
			No aux2 = inicio;
			while (aux2 != null) {
				if (aux.dado < aux2.dir.dado && aux.dado > aux2.dado) {
					aux.dir = aux2.dir;
					aux2.dir = aux;
					aux.esq = aux2;
					aux.dir.esq = aux;
					break;
				}
				aux2=aux2.dir;
			}
		}
	}

	// m�todo para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while (aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
