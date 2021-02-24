import java.util.Date;
import java.text.SimpleDateFormat;
public class ParkDaemin{
	public static void main(String[] args){
		//오늘 날짜 출력하기
		Date day = new Date(); 	//java.util.Date 패키지안에 있다.
		//2021-02-24 16:40:45 형식으로 출력
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String today = dateFormat.format(day);	
		System.out.println(today);
}

}
