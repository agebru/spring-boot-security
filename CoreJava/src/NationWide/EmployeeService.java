package NationWide;

import java.util.List;

public class EmployeeService<T> implements IDisplayMessage<T> {
 Class<T> classType;
 
  public void setClassType(Class<T> type){
	  this.classType=type;
  }
 
	@Override
	public T getOne(String id) {
		 return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setT(T t) {
		// TODO Auto-generated method stub
		
	}

}
