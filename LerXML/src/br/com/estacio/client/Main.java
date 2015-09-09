package br.com.estacio.client;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse("pessoas.xml");
		
		Element raiz = doc.getDocumentElement();
		
		System.out.println("Elemento raiz: " + raiz.getNodeName());
		
		NodeList listaPessoas = raiz.getElementsByTagName("pessoa");
		
		System.out.println("Quantidade de Pessoas: " + listaPessoas.getLength());
		
		for (int i = 0; i < listaPessoas.getLength(); i++) {
			Element tagPessoa = (Element) listaPessoas.item(i);
			
			Attr id = tagPessoa.getAttributeNode("id");
			System.out.println("O Id é: " + id.getNodeValue());
			
			NodeList tagNome = tagPessoa.getElementsByTagName("nome");
			System.out.println("O nome da Pessoa é: " + tagNome.item(0).getTextContent());
			
			NodeList tagPeso = tagPessoa.getElementsByTagName("peso");
			System.out.println("O peso da Pessoa é: " + tagPeso.item(0).getTextContent());

			NodeList tagAltura = tagPessoa.getElementsByTagName("altura");
			System.out.println("O altura da Pessoa é: " + tagAltura.item(0).getTextContent());
		}
	}

}
