package exercicioGO;



public class MainClass {
	
	
	public static void main(String[] args) {
		
		
		
				
		Pai pai = new Pai();
		pai.nome = "Jo�o";
		pai.idade = 50;	
		System.out.println(pai.dados());
		
		
		Filho filho = new Filho();
		filho.setNome("Carlos");
		filho.setIdade(20);
		filho.setEmail( "carlos@teste.com");
		System.out.println(filho.dados());
		
		
		
		
		

	}

}
