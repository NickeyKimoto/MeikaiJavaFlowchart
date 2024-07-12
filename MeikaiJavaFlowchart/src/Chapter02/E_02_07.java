package Chapter02;

/*
*クラス名：E_02_07
*概要：1桁の正の整数値、1桁の負の整数値、2桁の正の整数値を
       それぞれランダムに生成して表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/04
*/

//ランダム関数を利用できるようにする
import java.util.Random;

public class E_02_07 {
	
	/*
	*関数名：main
	*概要：1桁の正の整数値、1桁の負の整数値、2桁の正の整数値を
	       それぞれランダムに生成して表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();
		
		// 必要な乱数を生成するために宣言
		final int RANDOM_TEN = 10, RANDOM_NINETY = 90;
		
		// 0から9の正の整数値をランダムに生成
		int firstRandom = randomVariable.nextInt(RANDOM_TEN);
		// 1桁の負の整数値を生成するために0から9の正の整数値をランダムに生成
		int secondRandom = randomVariable.nextInt(RANDOM_TEN);
		// 0から89の正の整数値をランダムに生成
		int thirdRandom = randomVariable.nextInt(RANDOM_NINETY);
		
		// 1桁の正の整数値を表示
		System.out.println(firstRandom);
		// 1桁の負の整数値に計算しを表示
		System.out.println(secondRandom * -1);
		// 2桁の正の整数値に計算しを表示
		System.out.println(thirdRandom + 10);
		
	}

}
