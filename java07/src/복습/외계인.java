package 복습;

public class 외계인 {
	public String name;
	public int move;
	
	//public 외계인() 만들어지지 않음
	public 외계인(String name, int move) {
		super();
		this.name = name;
		this.move = move;
	}

	public String toString() {
		return "외계인 [name=" + name + ", move=" + move + "]";
	}
}

