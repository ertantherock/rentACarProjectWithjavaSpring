package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
// Data = Getter+Setter
@Getter
@Setter
@AllArgsConstructor // Tüm parametrelerden oluşan constructor
@NoArgsConstructor // Hiç parametre olmayan constructor
@Entity 
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Veri tabanında bir bir arttır idleri demek
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	

}
