package br.com.estacio.carrinho;

import java.util.ArrayList;

public class AdicionaItensCarrinho {  
	  
    public ArrayList AdicionaItensCarrinho(Produto dado, ArrayList lista) {  
          
        if (lista == null){  
              
            lista = new ArrayList();  
        }  
          
        lista.add(dado.getLivro());  
          
        return lista;  
    }  
  
}  
