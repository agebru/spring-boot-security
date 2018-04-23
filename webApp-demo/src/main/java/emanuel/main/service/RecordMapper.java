package emanuel.main.service;

import java.util.ArrayList;
import java.util.List;

public class RecordMapper {
private List<?> records;
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

private int numRecords;

public RecordMapper(){
	records=new ArrayList<>();
}

public List<?> getRecords() {
	return records;
}

public void setRecords(List<?> records) {
	this.records = records;
}

public int getNumRecords() {
	return numRecords;
}

public void setNumRecords(int numRecords) {
	this.numRecords = numRecords;
}



}
