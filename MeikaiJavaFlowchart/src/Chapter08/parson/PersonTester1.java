package Chapter08.parson;

/*
*クラス名：PersonTester1
*概要：クラスPersonを実行し、指定した人の名前・身長・体重を表示する
*作成者：N.Kimoto
*作成日：2024/04/30
*/

public class PersonTester1 {
	
	/*
	*関数名：main
	*概要：指定した人の名前・身長・体重を表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/

	public static void main(String[] args) {
		
		// インスタンス化
		// 山田さんの名前・身長・体重を代入する
		Person firstPerson = new Person("山田", 160.0, 50.5);
		// 松本さんの名前・身長・体重を代入する
		Person secondPerson = new Person("松本", 175.8, 55.2);
		// 高橋さんの名前・身長・体重を代入する
		Person thirdPerson = new Person("高橋", 180.0, 70.8);
		
		// 山田さんの名前・身長・体重を表示
		firstPerson.putSpec();
		// 改行
		System.out.println();
		// 松本さんの名前・身長・体重を
		secondPerson.putSpec();
		// 改行
		System.out.println();
		// 高橋さんの名前・身長・体重を
		thirdPerson.putSpec();
		// 改行
		System.out.println();

	}

}
