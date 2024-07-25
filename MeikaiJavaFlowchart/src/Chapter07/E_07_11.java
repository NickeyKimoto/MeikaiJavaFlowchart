package Chapter07;

/*
*クラス名：E_07_11
*概要：整数を左右にシフトした値が2のべき乗での乗算や除算と等しくなることを確認するプログラム
*作成者：N.Kimoto
*作成日：2024/04/18
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_11 {

	// 引数で標準入力System.inを指定
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
	*関数名：main
	*概要：整数を左右にシフトした値が2のべき乗での乗算や除算と等しくなることを確認する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/18
	*/

	public static void main(String[] args) {

		// 値を初期化するための定数を宣言
		final int INITIALIZE_VALUE = 1;
		// べき乗の値の計算するための定数を宣言
		final int BINARY_NUMBER = 2;

		// 整数の入力を促す
		System.out.print("整数：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		// 正の整数値以外の値を受け付けないようにする
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();

		}
		// シフトさせる値の入力を促す
		System.out.print("シフトするビット数n：");
		// 入力された値を読み込む
		int shiftNumber = standardInput.nextInt();
		// 正の整数値以外の値を受け付けないようにする
		while (shiftNumber <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 入力された値を読み込む
			shiftNumber = standardInput.nextInt();

		}

		// 1行空ける
		System.out.println();

		// 整数を表示
		System.out.print("  整数    = " + integerVariable);
		// ビット構成を表示
		System.out.print("\n  整数    = ");
		// ビット構成を表示
		printBits(integerVariable);

		// 1行空ける
		System.out.println("\n");

		// 左にシフトした整数を表示
		System.out.print("x <<    n = " + (integerVariable << shiftNumber));
		// 左にシフトした整数のビット構成を表示
		System.out.print("\nx <<    n = ");
		// 左にシフトした整数のビット構成を表示
		printBits(integerVariable << shiftNumber);
		// 右にシフトした整数を表示
		System.out.print("\nx >>    n = " + (integerVariable >> shiftNumber));
		// 右にシフトした整数のビット構成を表示
		System.out.print("\nx >>    n = ");
		// 右にシフトした整数のビット構成を表示
		printBits(integerVariable >> shiftNumber);

		// 1行空ける
		System.out.println();

		// 2のべき乗を初期化
		int powerTwo = INITIALIZE_VALUE;

		// 2のべき乗を計算
		while (shiftNumber != 0) {

			// シフトする分だけ2を掛ける
			powerTwo *= BINARY_NUMBER;
			// 掛ける回数を0までカウントダウンする
			shiftNumber--;

		}

		// 2のべき乗を掛けた値の表示
		System.out.print("\nx * 2 ^ n = " + (integerVariable * powerTwo));
		// 2のべき乗を掛けた値のビット構成を表示
		System.out.print("\nx * 2 ^ n = ");
		// 2のべき乗を掛けた値のビット構成を表示
		printBits(integerVariable * powerTwo);
		// 2のべき乗を割った値の表示
		System.out.print("\nx / 2 ^ n = " + (integerVariable / powerTwo));
		// 2のべき乗を割った値のビット構成を表示
		System.out.print("\nx / 2 ^ n = ");
		// 2のべき乗を割った値のビット構成を表示
		printBits(integerVariable / powerTwo);

	}

}
