package december;

public class Cricketer {
	
	String name;
	int runs;
	
	public Cricketer(String name,int runs) {
		this.name=name;
		this.runs=runs;
	}
	

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", runs=" + runs + "]";
	}	
	
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}*/
	
	public static void main(String[] args) {
	Cricketer c1 = new Cricketer("ShubmanGill",101);
	System.out.println(c1);
	
	}


}
