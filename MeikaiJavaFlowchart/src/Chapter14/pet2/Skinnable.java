package Chapter14.pet2;

/*
*インタフェース名：Skinnable
*概要：スキンを変更する
*作成者：N.Kimoto
*作成日：2024/05/24
*/
public interface Skinnable {
	// 黒を表す定数を宣言
	int BLACK	 = 0;
	// 赤を表す定数を宣言
	int RED		 = 1;
	// 緑を表す定数を宣言
	int GREEN	 = 2;
	// 青を表す定数を宣言
	int BLUE	 = 3;
	// 黒を表す定数を宣言
	int LEOPARD = 4 ;
	
	/*
	*関数名：changeSkin
	*概要：スキンを変更する
	*引数：スキンの色を表す数値(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	void changeSkin(int skin);
}
