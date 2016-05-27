package model;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_usuario")

public class Usuario 
{
	@Id
	private String usua;
	
	private String pass;
	
	@Temporal(TemporalType.DATE)
	@Column(name="freg")
	private Date freg;
	
	private Integer esta;
	
	@OneToMany(mappedBy="tUsuario")
	private List<Docente>tDocentes;

	public String getUsua() {
		return usua;
	}

	public void setUsua(String usua) {
		this.usua = usua;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Date getFreg() {
		return freg;
	}

	public void setFreg(Date freg) {
		this.freg = freg;
	}

	public Integer getEsta() {
		return esta;
	}

	public void setEsta(Integer esta) {
		this.esta = esta;
	}

	public List<Docente> gettDocentes() {
		return tDocentes;
	}

	public void settDocentes(List<Docente> tDocentes) {
		this.tDocentes = tDocentes;
	}


	
}

