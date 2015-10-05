package br.com.estacio.client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse("pessoas.xml");
		
		Element raiz = doc.getDocumentElement();
		
		System.out.println("Elemento raiz: " + raiz.getNodeName());		
		
		/*
		 *  CRUD - CREATE
		 */
		Element novaPessoa = doc.createElement("pessoa");
		novaPessoa.setAttribute("id", "3");
		Element novoNome = doc.createElement("nome");
		novoNome.setTextContent("Pedro");
		Element novoPeso = doc.createElement("peso");
		novoPeso.setTextContent("190");
		Element novaAltura = doc.createElement("altura");
		novaAltura.setTextContent("1.95");
		// adicionando as tags criadas
		novaPessoa.appendChild(novoNome);
		novaPessoa.appendChild(novoPeso);
		novaPessoa.appendChild(novaAltura);
		// Adicionando o novo elemento ao XML
		raiz.appendChild(novaPessoa);
		
		NodeList listaPessoas = raiz.getElementsByTagName("pessoa");
		
		System.out.println("Quantidade de Pessoas: " + listaPessoas.getLength());
		
		/*
		 * CRUD - READ
		 */
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
		Scanner s = new Scanner(System.in);

		/*
		 *  CRUD - UPDATE
		 */
		System.out.println("Deseja salvar?");
	    String salvar = s.next();
	    if (salvar.equalsIgnoreCase("s")){
	    	try {
		    	DOMSource source = new DOMSource(doc);
		    	StreamResult result = new StreamResult(new FileOutputStream("pessoas.xml"));
		    	TransformerFactory transFactory = TransformerFactory.newInstance();
		    	Transformer transformer = transFactory.newTransformer();
		    	transformer.transform(source, result);
		    	System.out.println("Arquivo salvo");				
			} catch (TransformerException e) {
				System.out.println("Erro: " + e.toString());
			}
	    } else {
	    	System.out.println("Não foi possível salvar");
	    }
	}

}
