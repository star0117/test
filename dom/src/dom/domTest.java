/**
 * dom����
 */
package dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class domTest {
	static String path = "user.xml";
	public static void main(String[] args) throws Exception {
		//������������
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		//ʹ�ý�����������������
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		//�����ĵ�
		Document document = documentBuilder.parse(new File(path));
		//��ȡ���ڵ�
		Element root = document.getDocumentElement();
		NodeList nodeList_user = root.getChildNodes();
		for(int i = 0;i<nodeList_user.getLength();i++){
			Node node_list = nodeList_user.item(i);
			NodeList nodelist = node_list.getChildNodes();
		for(int j = 0;j<nodelist.getLength();j++){
			Node node_content = nodelist.item(j);
			if(node_content.getNodeType() == Node.ELEMENT_NODE){
				System.out.println(node_content.getChildNodes().item(0).getNodeValue());
			}
		}
			
		}
		
		}
	}

