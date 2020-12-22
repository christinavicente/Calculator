package calculator.operations;

public class DivideOperation {

	int a=0;
	int b=0;
	public void setA(int input) {
		a=input;
	}
	public void setB(int input) {
		b=input;
	}
	public int getResult() {
		return checkForZero();
	}
	
	private int checkForZero() {
		int answer;
		if(this.b==0) {
			System.out.println("CANNOT DIVIDE BY ZERO");
			answer=this.a;
		}else {
			answer=(int)(this.a/this.b);
		}
		return answer;
	}
}
