package 인터페이스;

//추상메서드가 하나라도 있으면, 그 클래스는 객체 생성 불가
//추상메서드가 하나라도 포함되어 있는 클래스를 추상 메서드
public abstract class 애플잭 implements 휴대폰잭 {

	//추상메서드
	public abstract void 레벨을나누어서만들다();
	
	@Override
	public void 납작하게만들다() {
		System.out.println("회색으로 납작하게 만들다");
	}

	@Override
	public void 핀8로만들다() {
		System.out.println("신소재 핀8로 만들다");
	}

}
