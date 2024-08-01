package Chapter14.pet2;

// ペットクラスの利用例(メソッドの引数で多相性の検証)

public class PetTester2 {
	
	// pが参照するインスタンスに自己紹介させる
	static void intro(Pet p) {
		
		p.introduce();
		
	}

	public static void main(String[] args) {

		Pet[] a = {
				
			new Pet("Kurt", "アイ"),
			new RobotPet("R2D2", "ルーク"),
			new Pet("マイケル", "英男")
				
		};
		
		for (Pet p : a) {
			
			intro(p);
			System.out.println();
			
		}

	}

}
