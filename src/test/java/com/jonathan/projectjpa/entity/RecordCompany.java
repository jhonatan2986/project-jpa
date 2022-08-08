/**
 * 
 */
package com.jonathan.projectjpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jhonatan adames
 * Clase que mapea con la tabla de disquera desde la base de datos
 */
@Entity
@Table(name = "disquera")
public class RecordCompany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDisquera")//opcional siempre y cuando se llame igual al campo que este en la base de datos
	private Long idRecordCompany;
	
	@Column(name="descripcion", length= 100)
	private String description;
	
	@Column(name="fechaCreacion")
	private LocalDateTime creationDate;
	
	@Column(name="fechaModificacion")
	private LocalDateTime modificationDate;
	
	@Column(name="estatus")
	private boolean status;

	/**
	 * @return the idRecordCompany
	 */
	public Long getIdRecordCompany() {
		return idRecordCompany;
	}

	/**
	 * @param idRecordCompany the idRecordCompany to set
	 */
	public void setIdRecordCompany(Long idRecordCompany) {
		this.idRecordCompany = idRecordCompany;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the creationDate
	 */
	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the modificationDate
	 */
	public LocalDateTime getModificationDate() {
		return modificationDate;
	}

	/**
	 * @param modificationDate the modificationDate to set
	 */
	public void setModificationDate(LocalDateTime modificationDate) {
		this.modificationDate = modificationDate;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
}
