package ũ�Ѹ�;

import javax.lang.model.element.Element;
import javax.swing.text.Document;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class ���̹����� {

	public static void main(String[] args) throws Exception {
		//public string Connection connect(String url)
		//��Ʈ���� �������
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("���Ӽ���");
		Document doc = con.get();
		//System.out.println(doc);
		System.out.println(doc.select("a.nav").get.txt()); 
		//for (int i = 0; i < args.length; i++) {
		//	System.out.println(doc.select("a.nav").get.txt);
		//}
		Elements list =doc.select("a.nav");
		
	}

}
