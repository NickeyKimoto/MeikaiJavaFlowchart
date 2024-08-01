package Chapter12.car;

/*
*クラス名：CarMileage
*概要：Carクラスに総走行距離を表すフィールドとその値を調べるメソッドを追加する
*作成者：N.Kimoto
*作成日：2024/05/20
*/

public class CarMileage extends Car {
	
	// 総走行距離を表すフィールドを宣言
	private static double totalMileage;
	
	/*
	*コンストラクタ名：CarMileage
	*概要：車のデータを初期化
	*引数：名前(String型)、車幅(int型)、車高(int型)、車長(int型)、残り燃料(double型)、購入日(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	CarMileage(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		
		// Carクラスのインスタンス変数を初期化
		super(name, width, height, length, fuel, purchaseDay);
		// 総走行距離を表すインスタンス変数を初期化
		totalMileage = 0.0;
		
	}
	
	/*
	*関数名：getTotalMileage
	*概要：総走行距離の値を返却
	*引数：なし
	*戻り値：総走行距離の値(double型)
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	double getTotalMileage() {
		
		// 総走行距離の値を返却
		return totalMileage;
		
	}
	
	/*
	*関数名：getTotalMileage
	*概要：総走行距離を計算
	*引数：横方向の移動距離(double型)、縦方向の移動距離(double型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	static void addTotalMileage (double horizontalDistance, double verticalDistance) {
		
		// 総走行距離に計算した移動距離を加算
		totalMileage += Math.sqrt(horizontalDistance * horizontalDistance + verticalDistance * verticalDistance);
		
	}

}
