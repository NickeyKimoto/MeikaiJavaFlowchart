package Chapter07;

/*
*クラス名：E_07_32
*概要：入力された値のビット構成を表示
*作成者：N.Kimoto
*作成日：2024/04/25
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_32 {

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
	*関数名：printBits
	*概要：byte型の整数のビット構成を表示
	*引数：整数(byte型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static void printBits(byte x) {

		// ビット構成の最上位ビットの定数を宣言
		final int MAXIMUM_BITS = 7;
		// 指定された値の定数を宣言
		final int SPECIFIED_ONE = 1;

		// その位の値を調査し、1であれば1を表示する
		for (int i = MAXIMUM_BITS; i >= 0; i--) {

			// その位の値が1か0か調べ結果を表示する
			System.out.print(((x >>> i & SPECIFIED_ONE) == SPECIFIED_ONE) ? '1' : '0');

		}

	}

	/*
	*関数名：printBits
	*概要：short型の整数のビット構成を表示
	*引数：整数(short型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static void printBits(short x) {

		// ビット構成の最上位ビットの定数を宣言
		final int MAXIMUM_BITS = 15;
		// 指定された値の定数を宣言
		final int SPECIFIED_ONE = 1;

		// その位の値を調査し、1であれば1を表示する
		for (int i = MAXIMUM_BITS; i >= 0; i--) {

			// その位の値が1か0か調べ結果を表示する
			System.out.print(((x >>> i & SPECIFIED_ONE) == SPECIFIED_ONE) ? '1' : '0');

		}

	}

	/*
	*関数名：printBits
	*概要：int型の整数のビット構成を表示
	*引数：整数(int型)
	*戻り値：なし
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
	*関数名：printBits
	*概要：long型の整数のビット構成を表示
	*引数：整数(long型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static void printBits(long x) {

		// ビット構成の最上位ビットの定数を宣言
		final int MAXIMUM_BITS = 63;
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
	*概要：入力されたそれぞれの値のビット構成を表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// byte型の整数値の入力を促す
		System.out.print("byte型の整数値：");
		// 入力された値を読み込む
		byte firstInput = standardInput.nextByte();
		// 入力された値のビット構成を表示
		printBits(firstInput);
		//改行する
		System.out.println();

		// short型の整数値の入力を促す
		System.out.print("short型の整数値：");
		// 入力された値を読み込む
		short secondVariable = standardInput.nextShort();
		// 入力された値のビット構成を表示
		printBits(secondVariable);
		//改行する
		System.out.println();
		
		// int型の整数値の入力を促す
		System.out.print("int型の整数値：");
		// 入力された値を読み込む
		int thirdVariable = standardInput.nextInt();
		// 入力された値のビット構成を表示
		printBits(thirdVariable);
		//改行する
		System.out.println();
		
		// long型の整数値の入力を促す
		System.out.print("long型の整数値：");
		// 入力された値を読み込む
		long fourthVariable = standardInput.nextLong();
		// 入力された値のビット構成を表示
		printBits(fourthVariable);

	}

}
