package hspm.controller;

import hspm.model.Pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



@ManagedBean
@ViewScoped

public class PessoaMB implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Pessoa pessoa = new Pessoa();
	    private List<Pessoa> pessoaLista = new ArrayList<Pessoa>();
	 
	    /** Creates a new instance of PessoaMB */
	    public PessoaMB() {
	    }
	 
	    /**Getters e Setters */
	    public Pessoa getPessoa() {
	        return pessoa;
	    }
	 
	    public void setPessoa(Pessoa pessoa) {
	        this.pessoa = pessoa;
	    }
	 
	    public List<Pessoa> getPessoaLista() {
	        return pessoaLista;
	    }
	 
	    public void setPessoaLista(List<Pessoa> pessoaLista) {
	        this.pessoaLista = pessoaLista;
	    }
	    
	    
	    /**Métodos */
	    
	    public void salvarPessoa() {
	     
	    //adicionando pessoas a lista
	    pessoaLista.add(pessoa);
	    //instanciado uma nova para ser cadastrada
	    pessoa = new Pessoa();
	    }
	    
		
}
