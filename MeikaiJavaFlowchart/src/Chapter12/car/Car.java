package Chapter12.car;

/*
*クラス名：Car
*概要：車のデータを管理する
*作成者：N.Kimoto
*作成日：2024/05/20
*/

public class Car {
	
	// 名前を表すインスタンス変数を宣言(教本準拠の変数)
	private String name;
	// 車幅を表すインスタンス変数を宣言(教本準拠の変数)
	private int width;
	// 車高を表すインスタンス変数を宣言(教本準拠の変数)
	private int height;
	// 車長を表すインスタンス変数を宣言(教本準拠の変数)
	private int length;
	// 現在位置X座標を表すインスタンス変数を宣言(教本準拠の変数)
	private double x;
	// 現在位置Y座標を表すインスタンス変数を宣言(教本準拠の変数)
	private double y;
	// 残り燃料を表すインスタンス変数を宣言(教本準拠の変数)
	private double fuel;
	// 購入日を表すインスタンス変数を宣言
	private Day purchaseDay;

	/*
	*コンストラクタ名：Car
	*概要：車のデータを初期化
	*引数：名前(String型)、車幅(int型)、車高(int型)、車長(int型)、残り燃料(double型)、購入日(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		
		// 名前を表すインスタンス変数を初期化
		this.name = name;
		// 車幅を表すインスタンス変数を初期化
		this.width = width;
		// 車高を表すインスタンス変数を初期化
		this.height = height;
		// 車長を表すインスタンス変数を初期化
		this.length = length;
		// 残り燃料を表すインスタンス変数を初期化
		this.fuel = fuel;
		// 現在位置X,Y座標を表すインスタンス変数を初期化
		x = y = 0.0;
		// 購入日を表すインスタンス変数を初期化
		this.purchaseDay = new Day(purchaseDay);
		
	}
	
	/*
	*関数名：getX
	*概要：現在位置のX座標を返却
	*引数：なし
	*戻り値：現在位置のX座標(double型)
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	double getX() {
		
		// 現在位置のX座標を返却
		return x;
		
	}
	
	/*
	*関数名：getY
	*概要：現在位置のY座標を返却
	*引数：なし
	*戻り値：現在位置のY座標(double型)
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	double getY() {
		
		// 現在位置のY座標を返却
		return y;
		
	}
	
	/*
	*関数名：getFuel
	*概要：現在の残り燃料を返却
	*引数：なし
	*戻り値：現在の残り燃料(double型)
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	double getFuel() {
		
		// 現在の残り燃料を返却
		return fuel;
		
	}
	
	/*
	*関数名：getPurchaseDay
	*概要：購入日を返却
	*引数：なし
	*戻り値：購入日(Day型)
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	public Day getPurchaseDay() {
		
		// 購入日を返却
		return new Day(purchaseDay);
		
	}
	
	/*
	*関数名：putSpec
	*概要：車のデータの文字列表現を返却
	*引数：なし
	*戻り値：購入日(Day型)
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	public String toString() {
		
		// 車のデータの文字列表現を返却
		return String.format("名前：%s\n車幅：%dmm\n車高：%dmm\n車長：%dmm\n購入日：%s", name, width, height, length, purchaseDay);
		
		
	}
	
	/*
	*関数名：move
	*概要：移動可能な場合、車を移動させる
	*引数：横方向の移動距離(double型)、縦方向の移動距離(double型)
	*戻り値：移動の可否(boolean型)
	*作成者：N.Kimoto
	*作成日：2024/05/20
	*/
	
	boolean move(double dx, double dy) {
		
		// それぞれの方向の移動距離から走行距離を計算
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		// 移動するのに燃料が足りない場合
		if (dist > fuel) {
			
			// 移動不可であることを返却
			return false;
			
		// 移動するのに燃料が足りる場合
		} else {
			
			// 移動距離に応じて燃料を消費する
			fuel -= dist;
			// 現在地の横方向を反映させる
			x += dx;
			// 現在地の縦方向を反映させる
			y += dy;
			
			// 移動を完了させたことを返却
			return true;
			
		}
		
	}
	
}
