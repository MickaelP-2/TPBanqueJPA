package Banque;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Commpte")
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_compte;
	@Column(name="numero-compte",length=50,nullable=false)
	private String numero_compte;
	@Column(name="solde",length=10,nullable=false)
	private double solde;
	
}
