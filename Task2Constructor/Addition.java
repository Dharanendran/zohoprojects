package Task2Constructor;

//test
public class Addition {
	private String a;
	private String b;
	private String ans;

	Addition(int a, int b) {
		this.a = String.valueOf(a);
		this.b = String.valueOf(b);
		this.ans = String.valueOf(a + b);
	}

	Addition(double a, double b) {
		this.a = String.valueOf(a);
		this.b = String.valueOf(b);
		this.ans = String.valueOf(a + b);
	}

	Addition(int a, double b) {
		this.a = String.valueOf(a);
		this.b = String.valueOf(b);
		this.ans = String.valueOf(a + b);
	}

	Addition(char a, char b) {
		this.a = String.valueOf(a);
		this.b = String.valueOf(b);
		this.ans = String.valueOf(a + b);
	}

	Addition(boolean a, boolean b) {
		this.a = String.valueOf(a);
		this.b = String.valueOf(b);
		int e = a ? 1 : 0;
		int f = b ? 1 : 0;
		this.ans = String.valueOf((e + f) > 0 ? true : false);
	}

	public String getValuesa() {
		return a;
	}

	public String getValueb() {
		return b;
	}

	public String displayans() {
		return ans;
	}
}
