import javax.persistence.Persistence;

import com.eversontcc.model.Cliente;



public class CriaTabela {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("PetLandia");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Everson");
		cliente.setTelefone("44");
		
		
		
		
	}

}
