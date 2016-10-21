package onaur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "semanas")
public class SemanasEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "num_semana")
	private String num_semana;
	@Column(name = "fecha_inicio_semana")
	private String fecha_inicio_semana;
	@Column(name = "fecha_final_semana")
	private String fecha_final_semana;
	@Column(name = "horas_laborables")
	private String horas;
	@Column(name = "year")
	private String year;
	
	public SemanasEntity() {}
	
	public SemanasEntity(Long id, String num_semana, String fecha_inicio_semana, String fecha_final_semana,
			String horas, String year) {
		this.id = id;
		this.num_semana = num_semana;
		this.fecha_inicio_semana = fecha_inicio_semana;
		this.fecha_final_semana = fecha_final_semana;
		this.horas = horas;
		this.year = year;
	}

	public Long getId() {
		return id;
	}
	public String getNum_semana() {
		return num_semana;
	}
	public String getFecha_inicio_semana() {
		return fecha_inicio_semana;
	}
	public String getFecha_final_semana() {
		return fecha_final_semana;
	}
	public String getHoras() {
		return horas;
	}
	public String getYear() {
		return year;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNum_semana(String num_semana) {
		this.num_semana = num_semana;
	}
	public void setFecha_inicio_semana(String fecha_inicio_semana) {
		this.fecha_inicio_semana = fecha_inicio_semana;
	}
	public void setFecha_final_semana(String fecha_final_semana) {
		this.fecha_final_semana = fecha_final_semana;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "SemanasEntity [id=" + id + ", num_semana=" + num_semana + ", fecha_inicio_semana=" + fecha_inicio_semana
				+ ", fecha_final_semana=" + fecha_final_semana + ", horas=" + horas + ", year=" + year + "]";
	}


}
