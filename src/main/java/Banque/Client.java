package Banque;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_client;
	@Column(name="nom",length=50,nullable=false)
	private String nom;
	@Column(name="prenom",length=50,nullable=false)
	private String prenom;
	@Column(name="Naissance",length=50,nullable=false)
	private Date date_naissance;
	@Embedded
	@Column(name="adresse",length=255,nullable=false)
	private Adresse adresse;
	
}
