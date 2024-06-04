package Banque;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Banque")
public class Banque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_banque;
	@Column(name="nom",length=50,nullable=false)
	private String nom;
	@Embedded
	private Adresse adresse;
}
