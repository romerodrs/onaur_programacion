package onaur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lotes")
public class LotesEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column (name="idLote")
    private String idLote;
    @Column (name="referencia")
    private String referencia;
    @Column (name="lote")
    private String lote;
	public Long getId() {
		return id;
	}
	public String getIdLote() {
		return idLote;
	}
	public String getReferencia() {
		return referencia;
	}
	public String getLote() {
		return lote;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	@Override
	public String toString() {
		return "LotesEntity [id=" + id + ", idLote=" + idLote + ", referencia=" + referencia + ", lote=" + lote + "]";
	}
}
