package Chapter14.pet2;

// ペットクラスの利用例(多相性の検証)

public class PetTester1 {

	public static void main(String[] args) {

		Pet kurt = new Pet("Kurt", "アイ");
		kurt.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "ルーク");
		r2d2.introduce();
		System.out.println();
		
		Pet p = r2d2;
		p.introduce();

	}

}
