package Chapter07;

/*
*クラス名：E_07_13
*概要：整数xのposビット目を0,1,反転した値に変換する
*作成者：N.Kimoto
*作成日：2024/04/19
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_13 {

	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);

	/*
	*関数名：printBits
	*概要：int型の整数のビット構成を表示
	*引数：整数
	*戻り値：ビット構成
	*作成者：N.Kimoto
	*作成日：2024/04/18
	*/

	static void printBits(int x) {

		// ビット構成の最上位ビットの定数を宣言
		final int MAXIMUM_BITS = 31;
		// 指定された値の定数を宣言
		final int SPECIFIED_ONE = 1;

		// その位の値を調査し、1であれば1を表示する
		for (int i = MAXIMUM_BITS; i >= 0; i--) {

			// その位の値が1か0か調べ結果を表示する
			System.out.print(((x >>> i & SPECIFIED_ONE) == SPECIFIED_ONE) ? '1' : '0');

		}

	}

	/*
	*関数名：powerVariable
	*概要：整数のべき乗を計算する
	*引数：整数(int型)
	*戻り値：整数のべき乗
	*作成者：N.Kimoto
	*作成日：2024/04/19
	*/

	static int powerVariable(int integerVariable, int powerNumber) {

		// 整数の0乗を初期化する
		int firstNumber = 1;

		// 整数のべき乗を計算
		while (powerNumber != 0) {

			// 1に整数を掛ける
			firstNumber *= integerVariable;
			// 掛ける回数を0までカウントダウンする
			powerNumber--;

		}

		// 整数のべき乗を返却する
		return firstNumber;

	}

	/*
	*関数名：set
	*概要：整数xのposビット目を1に変換する
	*引数：整数、位の値(int型)
	*戻り値：変換後の整数
	*作成者：N.Kimoto
	*作成日：2024/04/19
	*/

	static int set(int x, int pos) {

		// べき乗の値の計算するための定数を宣言
		final int BINARY_NUMBER = 2;

		// 変換する位の値のみが1の変数を宣言する
		int changedConfiguration = powerVariable(BINARY_NUMBER, pos);

		// 値を変換し返却する
		return (x | changedConfiguration);

	}

	/*
	*関数名：reset
	*概要：整数xのposビット目を0に変換する
	*引数：整数、位の値(int型)
	*戻り値：変換後の整数
	*作成者：N.Kimoto
	*作成日：2024/04/19
	*/

	static int reset(int x, int pos) {

		// べき乗の値の計算するための定数を宣言
		final int BINARY_NUMBER = 2;

		// 変換する位の値のみが0の変数を宣言する
		int changedConfiguration = ~powerVariable(BINARY_NUMBER, pos);

		// 値を変換し返却する
		return x & changedConfiguration;

	}

	/*
	*関数名：inverse
	*概要：整数xのposビット目を反転した値に変換する
	*引数：整数、位の値(int型)
	*戻り値：変換後の整数
	*作成者：N.Kimoto
	*作成日：2024/04/19
	*/

	static int inverse(int x, int pos) {

		// べき乗の値の計算するための定数を宣言
		final int BINARY_NUMBER = 2;

		// 変換する位の値のみが1の変数を宣言する
		int changedConfiguration = powerVariable(BINARY_NUMBER, pos);

		// 値を変換し返却する
		return x ^ changedConfiguration;

	}

	/*
	*関数名：main
	*概要：整数xのposビット目を0,1,反転した値に変換し表示する
	*引数：整数(int型)
	*戻り値：整数のべき乗
	*作成者：N.Kimoto
	*作成日：2024/04/19
	*/

	public static void main(String[] args) {

		// posの値の入力できる範囲を設定するための定数を宣言
		final int MAXIMUM_BITS = 31;

		// 整数値の入力を促す
		System.out.print("x：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		// 整数値の指定する桁数の入力を促す
		System.out.print("pos：");
		// 入力された値を読み込む
		int posNumber = standardInput.nextInt();

		// 桁数の範囲外の値を入力された場合
		while (posNumber < 0 || posNumber > MAXIMUM_BITS) {

			// 範囲内での入力を促す
			System.out.println("0～31の範囲で入力してください：");

		}

		// 入力された値のビット構成を表示
		printBits(integerVariable);
		// 1行空ける
		System.out.println("\n");
		// posビット目を1に変換した値を表示させることを表示
		System.out.print("posビット目を1にした値：");
		// posビット目を1に変換した値を表示
		System.out.println(set(integerVariable, posNumber));
		// posビット目を1に変換した値のビット構成を表示
		printBits(set(integerVariable, posNumber));
		// 1行空ける
		System.out.println("\n");
		// posビット目を0に変換した値を表示させることを表示
		System.out.print("posビット目を0にした値：");
		// posビット目を0に変換した値のビット構成を表示
		System.out.println(reset(integerVariable, posNumber));
		// posビット目を0に変換した値のビット構成を表示
		printBits(reset(integerVariable, posNumber));
		// 1行空ける
		System.out.println("\n");
		// posビット目を反転した値に変換した値を表示させることを表示
		System.out.print("posビット目を反転した値：");
		// posビット目を反転した値に変換した値を表示
		System.out.println(inverse(integerVariable, posNumber));
		// posビット目を反転した値に変換した値のビット構成を表示
		printBits(inverse(integerVariable, posNumber));
		
	}

}
