package Banque;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Operation")
public class Operation {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id_operation;
		@Column(name="motif",length=50,nullable=false)
		private String motif;
		@Column(name="montant",length=10,nullable=false)
		private double montant;
		@Column(name="Date",length=50,nullable=false)
		private Date date_operation;
		
		
}
