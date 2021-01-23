package S14;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
//		現在の日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		
//		取得した日時をCalendarにセット
		c.setTime(now);
		
//		「日」の情報を取得して100をプラス
		int day = c.get(Calendar.DAY_OF_MONTH);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		
//		CalenarをDate型に変換し、指定の方で表示
		Date future = c.getTime();
		
		

	}

}
