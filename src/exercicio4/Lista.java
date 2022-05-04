package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
