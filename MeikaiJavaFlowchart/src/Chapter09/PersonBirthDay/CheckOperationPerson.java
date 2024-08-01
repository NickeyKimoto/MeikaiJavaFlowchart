package Chapter09.PersonBirthDay;

/*
*クラス名：CheckOperationPerson
*概要：人間の情報を入力し表示する
*作成者：N.Kimoto
*作成日：2024/05/07
*/

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class CheckOperationPerson {
	
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
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値(double型)
	*戻り値：読み込んだ値(double型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static double inputRange(double inputValue) {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		inputValue = standardInput.nextDouble();
		// 読み込んだ値を返却する
		return inputValue;

	}
	
	/*
	*関数名：main
	*概要：人間の情報を入力し表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/

	public static void main(String[] args) {
		
		// 月の値の最大値の定数を宣言
		final int MAXIMUM_MONTH = 12;
		// 日の値の最大値の定数を宣言
		final int MAXIMUM_DATE = 31;
		
		// 人間の情報の入力を促す
		System.out.println("人間のデータを入力せよ。");
		
		// 名前の入力を促す
		System.out.print("名前は：");
		// 入力された値を読み込む
		String personName = standardInput.next();
		// 身長の入力を促す
		System.out.print("身長は：");
		// 入力された値を読み込む
		double personHeight = standardInput.nextDouble();
		// 入力された値が0以下の場合
		while (personHeight <= 0) {
			
			// 0以上の実数を入力させる
			personHeight = inputRange(personHeight);
			
		}
		// 体重の入力を促す
		System.out.print("体重は：");
		// 入力された値を読み込む
		double personWeight = standardInput.nextDouble();
		// 入力された値が0以下の場合
		while (personWeight <= 0) {
			
			// 0以上の実数を入力させる
			personWeight = inputRange(personWeight);
			
		}
		// 誕生日の年の値の入力を促す
		System.out.print("誕生日の年：");
		// 入力された値を読み込む
		int personBirthdayYear = standardInput.nextInt();
		// 入力された値が0未満の場合
		while (personBirthdayYear < 0) {
			
			// 0以上の整数を入力させる
			personBirthdayYear = inputRange(personBirthdayYear);
			
		}
		// 誕生日の月の値の入力を促す
		System.out.print("誕生日の月：");
		// 入力された値を読み込む
		int personBirthdayMonth = standardInput.nextInt();
		// 入力された値が有効範囲(1から12)外の場合
		while (personBirthdayMonth <= 0 || personBirthdayMonth > MAXIMUM_MONTH) {
			
			// 有効範囲内の整数値を入力させる
			personBirthdayMonth = inputRange(personBirthdayMonth);
			
		}
		// 誕生日の日の値の入力を促す
		System.out.print("誕生日の日：");
		// 入力された値を読み込む
		int personBirthdayDate = standardInput.nextInt();
		// 入力された値が有効範囲(1から31)外の場合
		while (personBirthdayDate <= 0 || personBirthdayDate > MAXIMUM_DATE) {
			
			// 有効範囲内の整数値を入力させる
			personBirthdayDate = inputRange(personBirthdayDate);
			
		}
		
		// 読み込んだ値で情報を初期化
		Person personInformation = new Person(personName, personHeight, personWeight, new Day(personBirthdayYear,
				personBirthdayMonth, personBirthdayDate));
		
		// 読み込んだ人間の情報を表示
		System.out.println(personInformation.toString());
		

	}

}
