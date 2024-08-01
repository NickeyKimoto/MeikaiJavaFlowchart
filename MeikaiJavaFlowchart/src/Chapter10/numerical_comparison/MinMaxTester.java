package Chapter10.numerical_comparison;

/*
*クラス名：MinMaxTester
*概要：ユーティリティクラスMinMaxのテスト
*作成者：N.Kimoto
*作成日：2024/05/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class MinMaxTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値(int型)
	*戻り値：読み込んだ値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static int inputRange(int inputValue) {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;

	}
	
	/*
	*関数名：main
	*概要：ユーティリティクラスMinMaxのテスト
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/

	public static void main(String[] args) {

		// 入力された値の最大値・最小値を求めることを表示
		System.out.println("入力された値の最大値・最小値を求めます。");
		
		// 一つ目の整数の入力を促す
		System.out.print("整数a：");
		// 入力された値を読み込む
		int firstVariable = standardInput.nextInt();
		// 二つ目の整数の入力を促す
		System.out.print("整数b：");
		// 入力された値を読み込む
		int secondVariable = standardInput.nextInt();
		// 三つ目の整数の入力を促す
		System.out.print("整数c：");
		// 入力された値を読み込む
		int thirdVariable = standardInput.nextInt();
		
		// 入力された整数a,bの2値の最大値を表示
		System.out.println("整数a,bの2値の最大値は" + MinMax.chooseMaximum(firstVariable, secondVariable) + "です。");
		// 入力された整数b,cの2値の最大値を表示
		System.out.println("整数b,cの2値の最小値は" + MinMax.chooseMinimum(secondVariable, thirdVariable) + "です。");

		// 改行する
		System.out.println();
		
		// 入力された整数a,b,cの3値の最大値を表示
		System.out.println("整数a,b,cの3値の最大値は" + MinMax.chooseMaximum(firstVariable, secondVariable, thirdVariable) + "です。");
		// 入力された整数a,b,cの3値の最小値を表示
		System.out.println("整数a,b,cの3値の最小値は" + MinMax.chooseMinimum(firstVariable, secondVariable, thirdVariable) + "です。");
		
		// 改行する
		System.out.println();
		
		// 入力された値の要素数を持つ配列hの、要素の最大値・最小値を求めることを表示
		System.out.println("入力された値の要素数を持つ配列hの、要素の最大値・最小値を求めます。");
		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された値を読み込む
		int elementCount = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (elementCount <= 0) {
			
			// 正の整数値を入力させる
			elementCount = inputRange(elementCount);
			
		}
		
		// 改行する
		System.out.println();
		
		// 入力された値の要素数を持つ配列hを宣言
		int[] integerArray = new int[elementCount];
		
		// 入力された値の要素数を持つ配列のそれぞれの要素に値を代入
		for (int i = 0; i < integerArray.length; i++) {
			
			// その要素に代入する値の入力を促す
			System.out.print("配列h[" + i + "] = ");
			// 入力された値を読み込む
			integerArray[i] = standardInput.nextInt();
			
		}
		
		// 改行する
		System.out.println();
		
		// 配列hの要素の最大値を表示
		System.out.println("配列hの要素の最大値は" + MinMax.chooseMaximum(integerArray) + "です。");
		// 配列hの要素の最小値を表示
		System.out.println("配列hの要素の最小値は" + MinMax.chooseMinimum(integerArray) + "です。");
		
	}

}
