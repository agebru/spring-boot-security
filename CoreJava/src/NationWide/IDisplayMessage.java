package NationWide;

import java.util.List;

public interface IDisplayMessage<T> {
	public T getOne(String id);
	public List<T> getAll();
	public void setT(T t);

}
