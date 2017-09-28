package br.com.tt.model;

import static javax.persistence.InheritanceType.JOINED;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance(strategy = JOINED)
public class Cliente extends Pessoa {

	private String cnpj;
	private String razaoSocial;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
