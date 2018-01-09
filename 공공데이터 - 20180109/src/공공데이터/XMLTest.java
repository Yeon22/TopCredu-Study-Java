package 공공데이터;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLTest {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://openAPI.seoul.go.kr:8088/644a4c44566f766533344f714f6770/xml/ListCulturalAssetsInfo/1/10");
			InputStream stream = url.openStream();
			InputStreamReader reader = new InputStreamReader(stream);
			char ch=0;
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(stream);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root Element : "+doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("row");
			System.out.println("------------------------------------------------");
			
			for(int temp=0; temp<nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element)nNode;
					
					System.out.println("문화재 번호 : "+getTagValue("MANAGE_NUM", eElement));
					System.out.println("문화재 이름 : "+getTagValue("NAME_KOR", eElement));
					System.out.println("문화재 한자명 : "+getTagValue("NAME_CNI", eElement));
					System.out.println("문화재 크기 : "+getTagValue("SCALE", eElement));
					System.out.println();
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static String getTagValue(String string, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(string).item(0).getChildNodes();
		Node nValue = (Node)nlList.item(0);
		
		return nValue.getNodeValue();
	}

}
