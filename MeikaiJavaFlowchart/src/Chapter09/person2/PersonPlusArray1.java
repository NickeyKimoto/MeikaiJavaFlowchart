package Chapter09.person2;

/*
*クラス名：PersonPlusArray1
*概要：人の名前・身長・体重の情報を持つ配列を生成し、表示する
*作成者：N.Kimoto
*作成日：2024/05/02
*/

public class PersonPlusArray1 {
	
	/*
	*関数名：main
	*概要：人の名前・身長・体重の情報を持つ配列を生成し、表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/

	public static void main(String[] args) {
		
		// 配列を生成すると同時に要素を初期化
		PersonPlus[] personArray = {
				
			// 1番目の要素を1人目のインスタンスで初期化
			new PersonPlus("山田", 160.0, 50.5),
			// 2番目の要素を2人目のインスタンスで初期化
			new PersonPlus("松本", 175.8, 55.2),
			// 3番目の要素を3人目のインスタンスで初期化
			new PersonPlus("高橋", 180.0, 70.8),
				
		};
		
		// 配列の各要素を順に表示
		for (int i = 0; i < personArray.length; i++) {
			
			// メンバの名前・身長・体重を表示
			System.out.println("personArray[" + i + "] = " + personArray[i].getPersonName() + "様、" + 
			personArray[i].getPersonHeight() + "cm、" + personArray[i].getPersonWeigh() + "kg");
			
		}

	}

}
