package Chapter11.id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class DateId {
	
	private static int counter; // 何番までの識別番号を与えたか
	
	private int id;              // 識別番号
	
	// クラス(静的)初期化子
	static {
		
		// プログラム実行時の日付を取得
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);      // 年
		int m = today.get(MONTH) + 1; // 月
		int d = today.get(DATE);      // 日
		
		// 取得した日付を表示
		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);
		// 日付をもとにcounterの初期値を決定
		counter = y * 1000000 + m * 10000 + d * 100;
		
	}
	
	//-- コンストラクタ --//
	public DateId() {
		
		id = ++counter; // 識別番号
		
	}
	
	//--- 識別番号を取得 ---//
	public int getId() {
		
		return id;
		
	}
	
}