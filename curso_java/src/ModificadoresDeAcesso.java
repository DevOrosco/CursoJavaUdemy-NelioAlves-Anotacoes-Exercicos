
public class ModificadoresDeAcesso {
	
		private String test; //o membro só pode ser acessado na própria classe
		
		String teste; //o membro só pode ser acessado nas classes do mesmo pacote
		
		protected String testes; /*o membro só pode ser acessado no mesmo pacote, bem como em
								subclasses de pacotes diferentes **Depende do conceito de Herança para entender*/
		
		public String testando; /*o membro é acessado por todas classes (ao menos que ele resida em
								um módulo diferente que não exporte o pacote onde ele está)*/
		
		/*https://i.stack.imgur.com/SVk2a.png - Imagem Ilustrativa do Conceito de Modificadores de Acesso*/
}
