package common;

public class Clase1 {

	private String variable1;
	protected String variable2;
	public String variable3;
	
	public Clase1() {
		super();
	}

	public Clase1(String variable1, String variable2, String variable3) {
		super();
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
	}

	public String getVariable1() {
		return variable1;
	}

	public void setVariable1(String variable1) {
		this.variable1 = variable1;
	}

	public String getVariable2() {
		return variable2;
	}

	public void setVariable2(String variable2) {
		this.variable2 = variable2;
	}

	public String getVariable3() {
		return variable3;
	}

	public void setVariable3(String variable3) {
		this.variable3 = variable3;
	}
}
