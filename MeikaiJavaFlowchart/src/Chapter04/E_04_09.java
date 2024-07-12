package Chapter04;

/*
*クラス名：E_04_09
*概要：正の整数値nを読み込み、1からnまでの積を求めるプログラム
*作成者：N.Kimoto
*作成日：2024/04/08
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_09 {
	
	/*
	*関数名：main
	*概要：正の整数値nを読み込み、1からnまでの積を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/08
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 最初にかける数の定数を宣言
		final int firstNumber = 1;
		// 求める積の値の最小値の定数を宣言
		final int minimumMultiplication = 1;
		
		// 入力される整数値を読み込むために宣言
		int integerVariable = 0;
		
		// 正の整数値の入力を促す
		System.out.print("整数値:");
		// 読み込んだ正の整数値を表示
		integerVariable = standardInput.nextInt();
		
		// 正の整数値が入力されるまで繰り返す
		while (integerVariable <= 0) {
		
			// 正の整数値の入力を促す
			System.out.print("正の整数値以外の値が入力されました。\nもう一度入力してください:");
			// 読み込んだ正の整数値を表示
			integerVariable = standardInput.nextInt();
			
		}
		
		// 求める積の値を初期化
		int multiplicationResult = minimumMultiplication;
		// 階乗の数を初期化
		int increaseValue = firstNumber;
		
		// かける値が入力された値と同じになるまで繰り返す
		while (increaseValue <= integerVariable) {
			
			// 求める積の値に1から順にかけていく
			multiplicationResult *= increaseValue;
			// かける値を1加える
			increaseValue++;
			
		}
		
		// 求めた積の値を表示
		System.out.println("1から" + integerVariable + "までの積は" + multiplicationResult + "です。");

	}

}
