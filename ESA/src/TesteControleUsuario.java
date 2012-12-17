import static org.junit.Assert.*;

import org.junit.Test;


public class TesteControleUsuario {

	
	@Test	
	//ADICIONANDO UM USUARIO E VERIFICANDO SE O MESMO PERTENCE AO CADASTRO
	public void testAdicionarUsuario(){
		ControleUsuario contUsu = new ControleUsuario();
		Usuario usu1 = new Usuario("ezus", "ezus@gmail.com", "ezus0409");
		contUsu.adicionarUsuario(usu1);
		assertTrue(contUsu.existeUsuario(usu1));
		
		//USUARIO2 NÃO SERÁ ADICIONADO E VERIFICAREMOS SE ELE PERTECE AO CONTROLE
		Usuario usu2 = new Usuario("celia", "celia@gmail.com", "celia");
		assertFalse(contUsu.existeUsuario(usu2));
	}
	
	@Test
	//CENÁRIO : ADICIONAR UM USUARIO COM UM E-MAIL JÁ CADASTRADO
	public void testAdicionarUsuario1(){
		ControleUsuario contUsu = new ControleUsuario();
		Usuario usu1 = new Usuario("ezus", "ezus@gmail.com", "ezus0409");
		contUsu.adicionarUsuario(usu1);
		Usuario usu2 = new Usuario("celia", "ezus@gmail.com", "celia");
		contUsu.adicionarUsuario(usu2);
		
		
		assertTrue(contUsu.existeUsuario(usu1));	//VERDADE QUE EXISTE ESSE USUARIO
		assertFalse(contUsu.existeUsuario(usu2));	//FALSO QUE EXISTE ESSE USUARIO
	}
	
	@Test
	// CENÁRIO : ADICIONAR DEPOIS REMOVER
	public void testRemover(){
		ControleUsuario contUsu = new ControleUsuario();
		Usuario usu1 = new Usuario("ezus", "ezus@gmail.com", "ezus0409");
		contUsu.adicionarUsuario(usu1);
		assertTrue(contUsu.existeUsuario(usu1));
		
		contUsu.removerUsuario(usu1);
		assertFalse(contUsu.existeUsuario(usu1));
	}
	
	@Test
	// CENÁRIO : ADICIONAR, BUSCAR > GETUsuario > MODIFICA E EMAIL E VERIFICAR SE ALTEROU
	public void testeAlterarUsuario(){
		ControleUsuario contUsu = new ControleUsuario();
		Usuario usu1 = new Usuario("ezus", "ezus@gmail.com", "ezus0409");
		contUsu.adicionarUsuario(usu1);
		
		Usuario aux = contUsu.getUsuario("ezus@gmail.com", "ezus0409");
		assertEquals( aux, usu1);
		
		aux.setEmail("mudei");
		assertEquals(aux, usu1);
		assertEquals(aux.getEmail(), "mudei");
		assertEquals(usu1.getEmail(),"mudei");
		assertTrue(contUsu.existeUsuario(usu1));
		assertTrue(contUsu.existeUsuario(aux));
	}
	
}
