package banco_de_dados.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import banco_de_dados.CidadeService;
import banco_de_dados.Conexao;
import banco_de_dados.model.Cidade;

public class bancoDeDados_Test {
    
    @Test
    public void conexaoTest() {
        assertNotNull(Conexao.conectaMySql());
    }

    /*  @Test
    public void insereCidadeTest(){
        cidade c = new cidade(0, "Laguna", "SC");
        assertEquals(1, cidadeService.insereCidade(c));
    }
    */

    @Test
    public void alteraCidadeExistente(){
        Cidade c = new Cidade(5, "Brasilia", "DF");
        assertEquals(1, CidadeService.alteraCidade(c));
    }

    @Test
    public void alteraCidadeInexistente(){
        Cidade c = new Cidade(25, "Brasilia", "DF");
        assertEquals(0, CidadeService.alteraCidade(c));
    }

    @Test
    public void excluiCidadeExistente(){
        Cidade c = new Cidade(1,"","");
        assertEquals(1, CidadeService.excluiCidade(c));
    }

    @Test
    public void excluiCidadeInexistente(){
        Cidade c = new Cidade(1,"","");
        assertEquals(0, CidadeService.excluiCidade(c));
    }

    @Test
    public void listaCidadeTest(){
        ArrayList<Cidade> lista = CidadeService.listAll();
        for(Cidade c: lista){
            System.out.println(c);
        }
    }
}