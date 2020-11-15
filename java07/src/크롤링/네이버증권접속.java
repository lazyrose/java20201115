package 크롤링;

import java.io.FileWriter;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권접속 {

	public static void open(String code) throws Exception {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930" + code);
		System.out.println("접속 성공");
		Document doc = con.get();
		String 코드 = doc.select("span.code").get(0).text();
		
		Elements list = doc.select("td.first span.blind");

		String 전일 = list.get(0).text();
		String 시가 = list.get(1).text();
		System.out.println("전일>> " + 전일);
		System.out.println("시가>> " + 시가);
		
		Elements list2 = doc.select("div.today span.blind");
		String 마감 = list.get(0).text();
		
		FileWriter file = new FileWriter(코드);
		file.write(코드 + "\n");
		file.write(전일 + "\n");
		file.write(시가 + "\n");
		file.write(마감 + "\n");
		file.close();
	}

}
