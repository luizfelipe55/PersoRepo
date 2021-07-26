package Pilha;

public class ArratPilhaTeste implements Ipilha {
	
	private Object[] arr;
	private int top;
	
	public ArratPilhaTeste(int capacity) {
		arr = new Object[capacity];
		top = -1;
	}

	@Override
	public int tamanho() {
		return (top + 1);
	}

	@Override
	public boolean isEmpty() {
		if (top == -1) return true;
		else return false;
	}

	@Override
	public void push(Object o) throws StackException {
		if(tamanho() == arr.length) throw new StackException("A pilha est� cheia");
		top = top + 1;
		arr[top] = o;
	}

	@Override
	public Object pop() throws StackException {
		if (isEmpty()) throw new StackException("A pilha est� vazia");
		Object toReturn = arr[top];
		arr[top] = null;
		top--;
		return toReturn;
	}

	@Override
	public Object top() throws StackException {
		if (isEmpty()) throw new StackException("A pilha est� vazia");
		return arr[top];
	}
}
