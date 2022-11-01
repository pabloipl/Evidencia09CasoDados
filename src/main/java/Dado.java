public class Dado {

	int cara1;
	int cara2;
	int cara3;
	int cara4;
	int cara5;
	int cara6;


	public Dado(){
		cara1= (int) (Math.random() * 6) + 1;
		cara2= (int) (Math.random() * 6) + 1;
		cara3= (int) (Math.random() * 6) + 1;
		cara4= (int) (Math.random() * 6) + 1;
		cara5= (int) (Math.random() * 6) + 1;
		cara6= (int) (Math.random() * 6) + 1;
	}


	public int getCara1() {
		return cara1;
	}

	public int getCara2() {
		return cara2;
	}

	public int getCara3() {
		return cara3;
	}

	public int getCara4() {
		return cara4;
	}

	public int getCara5() {
		return cara5;
	}

	public int getCara6() {
		return cara6;
	}
}