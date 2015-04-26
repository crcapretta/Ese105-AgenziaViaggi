package gestionealbergo;

public class Cliente {
	
	private String nome;
	private String cognome;
	private String cellulare;
	private String email;
	public Cliente(String nome, String cognome, String cellulare) {
		if(nome != null){
		       this.nome = nome;
		    
		}
		else{
    
			throw new IllegalArgumentException("nome non può essere null");
		
		}
			
		if(cognome != null){
		       this.cognome = cognome;
		}
		else{
			throw new IllegalArgumentException("cognome non può essere null");
		}
		if(cellulare != null){	
			if(cellulare.length()!=10){
		        this.cellulare = cellulare;
			}
			else{
				throw new IllegalArgumentException("il numero di cellulare deve avere 10 caratteri");
			}
		}
		else{
			throw new IllegalArgumentException("cellulare non può essere null");
		}
	}
	public String getNome() {
		return nome;
	}
		public String getCognome() {
		return cognome;
	}
	
	public String getCellulare() {
		return cellulare;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email !=null){
		        this.email = email;
			
		}
		else{
			throw new IllegalArgumentException("email non può essere null");
		}
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome
				+ ", cellulare=" + cellulare + ", email=" + email + "]";
	}
	public Cliente(String nome, String cognome, String cellulare, String email) {
		if(nome != null){
		       this.nome = nome;
		    
		}
		else{
    
			throw new IllegalArgumentException("nome non può essere null");
		
		}
			
		if(cognome != null){
		       this.cognome = cognome;
			
		}
		else{
			throw new IllegalArgumentException("cognome non può essere null");
		}
		if(cellulare != null){	
			if(cellulare.length() != 10){
		        this.cellulare = cellulare;
			}
			else{
				throw new IllegalArgumentException("il numero di cellulare deve avere 10 caratteri");
			}
		}
		else{
			throw new IllegalArgumentException("cellulare non può essere null");
		
	    }
		
		if(email !=null){
		        this.email = email;
			
		}
		else{
			throw new IllegalArgumentException("email non può essere null");
		}
	
		
	}
	
	

}
