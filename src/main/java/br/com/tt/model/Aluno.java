package br.com.tt.model;

import static javax.persistence.TemporalType.DATE;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity
public class Aluno extends Cliente {

	private String matricula;
	private String curso;
	@Temporal(DATE)
	private Calendar data;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

}
