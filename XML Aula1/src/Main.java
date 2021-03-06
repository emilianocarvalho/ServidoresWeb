import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Main 
{

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("pessoas.xml"));

		Element raiz = doc.getDocumentElement();

		System.out.println("Elemento Raiz: " + raiz.getNodeName());

		NodeList listaPessoas = raiz.getElementsByTagName("pessoa");

		System.out.println("Quantidade de Pessoas: " + listaPessoas.getLength());

		for(int i = 0; i < listaPessoas.getLength(); i++)
		{
			Element tagPessoa = (Element) listaPessoas.item(i);

			Attr id = tagPessoa.getAttributeNode("id");
			System.out.println("O Id : " + id.getNodeValue());

			NodeList tagNome = tagPessoa.getElementsByTagName("nome");
			System.out.println("O nome da Pessoa : " + tagNome.item(0).getTextContent());
			NodeList tagPeso = tagPessoa.getElementsByTagName("peso");
			System.out.println("O Peso da Pessoa : " + tagPeso.item(0).getTextContent());
			NodeList tagAltura = tagPessoa.getElementsByTagName("altura");
			System.out.println("A altura da Pessoa : " + tagAltura.item(0).getTextContent());

		}

	}

}
