package Chapter15;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：E_15_04
*概要：浮動小数点数値xを指定した桁数で表示
*作成者：N.Kimoto
*作成日：2024/05/27
*/
public class E_15_04 {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：printDouble
	*概要：浮動小数点数値xを指定した桁数で表示
	*引数：浮動小数点数値(double型)、小数点以下の桁数(int型)、少なくとも表示する全体の桁数(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/27
	*/
	static void printDouble(double x, int p, int w) {
		// 浮動小数点数値xを小数点以下部分をp桁、全体を少なくともw桁で表示(教本準拠の引数名)
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：なし
	*戻り値：入力された値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	static int inputRange() {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		int inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;
	
	}

	/*
	*関数名：main
	*概要：浮動小数点数値xを指定した桁数で表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/27
	*/
	public static void main(String[] args) {
		// 浮動小数点数の入力を促す
		System.out.print("浮動小数点数：");
		// 入力された値を読み込む
		double doubleNumber = standardInput.nextDouble();
		// 小数点以下の桁数の入力を促す
		System.out.print("小数点以下の桁数(0以上)：");
		// 入力された値を読み込む
		int digitsNumberOfDecimal = standardInput.nextInt();
		// 0未満の値が入力された場合
		while (digitsNumberOfDecimal < 0) {
			// 0以上の値を入力させる
			digitsNumberOfDecimal = inputRange();
		}
		// 全体の桁数の入力を促す
		System.out.print("少なくとも表示する全体の桁数(0以上)：");
		// 入力された値を読み込む
		int digitsNumberOfWhole = standardInput.nextInt();
		// 0未満の値が入力された場合
		while (digitsNumberOfWhole < 0) {
			// 0以上の値を入力させる
			digitsNumberOfWhole = inputRange();
		}
		
		// 入力された桁数で浮動小数点数を表示
		printDouble(doubleNumber, digitsNumberOfDecimal, digitsNumberOfWhole);

	}

}
