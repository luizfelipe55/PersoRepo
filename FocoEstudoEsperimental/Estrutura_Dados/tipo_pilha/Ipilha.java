package Pilha;

public interface Ipilha {
	public int tamanho();
	public boolean isEmpty();
	
	
	public void push (Object o) throws StackException;
	public Object pop() throws StackException;
	public Object top() throws StackException;
}
