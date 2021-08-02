package Pilha;

public class Testclasse {
	public static void main(String[] args) throws StackException {
		ArratPilhaTeste pilha = new ArratPilhaTeste(1);
		
		pilha.push(1);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		System.out.println(pilha);
	}
}
