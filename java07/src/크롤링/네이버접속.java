package 크롤링;

import javax.lang.model.element.Element;
import javax.swing.text.Document;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class 네이버접속 {

	public static void main(String[] args) throws Exception {
		//public string Connection connect(String url)
		//스트림을 만들었음
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("접속성공");
		Document doc = con.get();
		//System.out.println(doc);
		System.out.println(doc.select("a.nav").get.txt()); 
		//for (int i = 0; i < args.length; i++) {
		//	System.out.println(doc.select("a.nav").get.txt);
		//}
		Elements list =doc.select("a.nav");
		
	}

}
