package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	
	private String email;
	private String senha;
	private String endereco;
	
	
	public Usuario()
	{
		super();
	}
	
	public Usuario(String email, String senha, String endereco) {
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	
   
}
