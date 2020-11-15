package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		//형: 타입(type)
		//변수 타입(데이터타입)
		//형변환(casting,캐스팅)
		byte age = 120;
		int b = age;	//큰<--작(int<--byte, 자동형변환)
		byte c = (byte)b;	//작<--큰(byte<--int, 강제형변환)
		
		int d = 1000;
		byte e = (byte) d;	//강제형변환은 값의 범위를 포함하고 있을때만 가능
	}

}
