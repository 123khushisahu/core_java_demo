package oops;

public class Collection1 {
	private Object[] obja=new Object[10];
	private int index=0;
	
	public void add(Object obj) {
		if(size()==capacity()) {
			increaseCapacity();
		}
	}

	private Object size() {
		// TODO Auto-generated method stub
		return null;
	}

	private void increaseCapacity() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {

	}

}
