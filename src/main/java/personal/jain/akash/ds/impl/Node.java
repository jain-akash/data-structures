package personal.jain.akash.ds.impl;

import personal.jain.akash.ds.api.INode;

public class Node<T> implements INode<T> {

	private T _value;
	private INode<T> _next;
	
	@Override
	public void setValue(T o) {
		_value = o;
	}

	@Override
	public T getValue() {
		return _value;
	}

	@Override
	public void setNext(INode<T> node) {
		_next = node;		
	}

	@Override
	public INode<T> next() {
		return _next;
	}

	@Override
	public boolean hasNext() {
		return _next != null;
	}

}
