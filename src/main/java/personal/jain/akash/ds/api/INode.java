package personal.jain.akash.ds.api;

public interface INode<T> {
	public void setValue(T o);
	public T getValue();
	public void setNext(INode<T> node);
	public INode<T> next();
	public boolean hasNext();
}
