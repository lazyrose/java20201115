package ũ�Ѹ�;

import java.io.FileWriter;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹��������� {

	public static void open(String code) throws Exception {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930" + code);
		System.out.println("���� ����");
		Document doc = con.get();
		String �ڵ� = doc.select("span.code").get(0).text();
		
		Elements list = doc.select("td.first span.blind");

		String ���� = list.get(0).text();
		String �ð� = list.get(1).text();
		System.out.println("����>> " + ����);
		System.out.println("�ð�>> " + �ð�);
		
		Elements list2 = doc.select("div.today span.blind");
		String ���� = list.get(0).text();
		
		FileWriter file = new FileWriter(�ڵ�);
		file.write(�ڵ� + "\n");
		file.write(���� + "\n");
		file.write(�ð� + "\n");
		file.write(���� + "\n");
		file.close();
	}

}
