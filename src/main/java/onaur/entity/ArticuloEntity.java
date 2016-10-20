package onaur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articulos")
public class ArticuloEntity {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name="referencia")
    private String referencia;
	@Column(name="articulo")
	private String articulo;
	
	public ArticuloEntity(){}

	public ArticuloEntity(String referencia, String articulo) {
		this.referencia = referencia;
		this.articulo = articulo;
	}

	public String getReferencia() {
		return referencia;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "Articulos [referencia=" + referencia + ", articulo=" + articulo + "]";
	}

}
