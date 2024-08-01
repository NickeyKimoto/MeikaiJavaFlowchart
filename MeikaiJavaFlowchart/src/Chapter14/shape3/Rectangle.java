package Chapter14.shape3;

/*
*クラス名：Rectangle
*概要：クラスShapeから派生しインタフェースPlane2Dを実装した長方形を表すクラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public class Rectangle extends Shape implements Plane2D {
	
	// 長方形の幅を表すフィールドを宣言
	private int width;
	// 長方形の高さを表すフィールドを宣言
	private int height;
	
	/*
	*コンストラクタ名：Rectangle
	*概要：長方形を生成する
	*引数：生成する長方形の幅、長さ(int)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public Rectangle(int width, int heigth) {
		
		// 長方形の幅を初期化
		this.width = width;
		// 長方形の高さを初期化
		this.height = heigth;
		
	}
	
	/*
	*関数名：toString
	*概要：長方形に関する図形情報を表す文字列を返却
	*引数：なし
	*戻り値：長方形に関する図形情報を表す文字列(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public String toString() {
		
		// 長方形に関する図形情報を表す文字列を返却
		return "Rectangle(width:" + width + ", heigth:" + height + ")";
		
	}
	
	/*
	*関数名：draw
	*概要：長方形を描画する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void draw() {
		
		// width回アステリスク記号'*'を並べる
		for (int i = MINIMUM_SIZE_OF_SHAPE; i <= height; i++) {
			
			// 幅の個数だけ'*'を連続表示
			for (int j = MINIMUM_SIZE_OF_SHAPE; j <= width; j++) {
			
				// '*'を表示
				System.out.print('*');
			
			}
			
			// 改行する
			System.out.println();
			
		}
		
	}
	
	/*
	*関数名：getArea
	*概要：面積を求めその値を返却する
	*引数：なし
	*戻り値：求めた面積
	*作成者：N.Kimoto
	*作成日：2024/05/
	*/
	public int getArea() { 
		// 面積を求めその値を返却する
		return width * height;
	}

}
