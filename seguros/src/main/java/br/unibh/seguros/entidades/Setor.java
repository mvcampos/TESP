package br.unibh.seguros.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="tb_setor", uniqueConstraints = @UniqueConstraint(columnNames = "nome"))
public class Setor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=150,nullable=false)
	private String nome;
	
	@Column(name="setor_superior",nullable=true)
	private Setor setorSuperior;
	
	private List<Usuario> membros;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Setor getSetorSuperior() {
		return setorSuperior;
	}
	public void setSetorSuperior(Setor setorSuperior) {
		this.setorSuperior = setorSuperior;
	}
	public List<Usuario> getMembros() {
		return membros;
	}
	public void setMembros(List<Usuario> membros) {
		this.membros = membros;
	}
	
	
	
}
