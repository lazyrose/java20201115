package 형변환;

import 상속.남자;
import 상속.사람;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 사람<--남자<--수퍼맨
		// 부모클래스(큰, 수퍼클래스)
		// 자식클래스(작, 서브클래스)
		// Car<--트럭, 택시(상속관계), 비행기(상속관계X)
		
		사람 p = new 사람();
		남자 m = new 남자();
		p = m;	//큰<--작, 자동형변환(업캐스팅)
		m = (남자)p;	//작<--큰, 강제형변환(다운캐스팅)
	}

}
