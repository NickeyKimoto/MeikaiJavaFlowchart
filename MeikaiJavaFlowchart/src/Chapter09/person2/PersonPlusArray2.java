package Chapter09.person2;

/*
*クラス名：PersonPlusArray2
*概要：配列を生成し、人の名前・身長・体重の情報を代入してから表示する
*作成者：N.Kimoto
*作成日：2024/05/02
*/

public class PersonPlusArray2 {
	
	/*
	*関数名：main
	*概要：配列を生成し、人の名前・身長・体重の情報を代入してから表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/

	public static void main(String[] args) {
		
		// 配列を生成する
		PersonPlus[] personArray = new PersonPlus[0];
		
		// 配列の要素にメンバの情報を代入する
		personArray = new PersonPlus[] {
				
			// 1番目の要素に1人目のインスタンスを代入
			new PersonPlus("山田", 160.0, 50.5),
			// 2番目の要素に2人目のインスタンスを代入
			new PersonPlus("松本", 175.8, 55.2),
			// 3番目の要素に3人目のインスタンスを代入
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
