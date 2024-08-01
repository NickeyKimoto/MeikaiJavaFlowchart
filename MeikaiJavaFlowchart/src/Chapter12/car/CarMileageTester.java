package Chapter12.car;

/*
*クラス名：CarMileageTester
*概要：CarMileageTesterクラスのテスト
*作成者：N.Kimoto
*作成日：2024/05/
*/


// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class CarMileageTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値(int型)
	*戻り値：再入力された値(int型)
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
	*戻り値：再入力された値(double型)
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
	*概要：車のデータを管理し表示させ、必要に応じて移動する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	public static void main(String[] args) {

		// 車の各種データの入力を促す
		System.out.println("車のデータを入力せよ。");
		
		// 車の名前の入力を促す
		System.out.print("名前は：");
		// 入力された値を読み込む
		String carName = standardInput.next();
		// 車幅の入力を促す
		System.out.print("車幅は：");
		// 入力された値を読み込む
		int carWidth = standardInput.nextInt();
		// 0以下の値が入力された場合
		while (carWidth <= 0) {
			
			// 正の整数値で入力させる
			carWidth = inputRange(carWidth);
			
		}
		// 車高の入力を促す
		System.out.print("高さは：");
		// 入力された値を読み込む
		int carHeight = standardInput.nextInt();
		// 0以下の値が入力された場合
		while (carHeight <= 0) {
			
			// 正の整数値で入力させる
			carHeight = inputRange(carHeight);
			
		}
		// 車長の入力を促す
		System.out.print("長さは：");
		// 入力された値を読み込む
		int carLength = standardInput.nextInt();
		// 0以下の値が入力された場合
		while (carLength <= 0) {
			
			// 正の整数値で入力させる
			carLength = inputRange(carLength);
			
		}
		// ガソリン量の入力を促す
		System.out.print("ガソリン量は：");
		// 入力された値を読み込む
		double remainingFuel = standardInput.nextDouble();
		// 0以下の値が入力された場合
		while (remainingFuel <= 0) {
			
			// 正の実数値で入力させる
			remainingFuel = inputRange(remainingFuel);
			
		}
		// 購入日の日付の年の値の入力を促す
		System.out.print("購入日の年：");
		// 入力された値を読み込む
		int purchaseDayYear = standardInput.nextInt();
		// 購入日の日付の月の値の入力を促す
		System.out.print("購入日の月：");
		// 入力された値を読み込む
		int purchaseDayMonth = standardInput.nextInt();
		// 購入日の日付の日の値の入力を促す
		System.out.print("購入日の日：");
		// 入力された値を読み込む
		int purchaseDayDate = standardInput.nextInt();
		// 入力された値で購入日を初期化
		Day purchaseDay = new Day(purchaseDayYear, purchaseDayMonth, purchaseDayDate);
		
		// 入力された情報で車のデータを初期化
		CarMileage myCar = new CarMileage(carName, carWidth, carHeight, carLength, remainingFuel, purchaseDay);
		// 車のデータを表示
		System.out.println(myCar.toString());
		
		// 移動できる燃料が残っている場合
		while (true) {
			
			// 現在地・残り燃料・総走行距離を表示
			System.out.println("現在地(" + myCar.getX() + "km, " + myCar.getY() 
			+ "km)・残り燃料 "+ myCar.getFuel() + "L・総走行距離：" + myCar.getTotalMileage());
			// 移動するかどうかの入力を促す
			System.out.print("移動しますか[0…No / 1…Yes]：");
			// 移動しない意思を表す定数を宣言
			final int CHOOSE_STOPING = 0;
			// 移動する意思を表す定数を宣言
			final int CHOOSE_MOVING = 1;
			// 入力された値を読み込む
			int inputJudgment = standardInput.nextInt();
			// 0と1以外の値が入力された場合
			if (inputJudgment != CHOOSE_STOPING && inputJudgment != CHOOSE_MOVING) {
				
				// 0か1を入力させる
				inputJudgment = inputRange(inputJudgment);
				
			}
			
			// 0を入力した場合
			if (inputJudgment == CHOOSE_STOPING) {
				
				// 移動を終了する
				break;
				
			}
			
			// X方向の移動距離の入力を促す
			System.out.print("X方向の移動距離：");
			// 入力された値を読み込む
			double horizontalDistance = standardInput.nextDouble();
			// Y方向の移動距離の入力を促す
			System.out.print("Y方向の移動距離：");
			// 入力された値を読み込む
			double verticalDistance = standardInput.nextDouble();
			// 総走行距離を計算する
			CarMileage.addTotalMileage(horizontalDistance, verticalDistance);
			
			// 移動するのに燃料が不足している場合
			if (!myCar.move(horizontalDistance, verticalDistance)) {
				
				// 燃料が不足しており移動できないことを表示
				System.out.println("燃料が足りません！");
				
			}
			
			
			
		}

	}

}
