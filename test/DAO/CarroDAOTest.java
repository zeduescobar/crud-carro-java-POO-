/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alunos
 */
public class CarroDAOTest {
    
    public CarroDAOTest() {
    }

    /**
     * Test of CadastrarCarro method, of class CarroDAO.
     */
    @Test
    public void testCadastrarCarro() throws Exception {
    }

    /**
     * Test of DeletarCarro method, of class CarroDAO.
     */
    @Test
    public void testDeletarCarro() throws Exception {
    }

    /**
     * Test of AtualizarCarro method, of class CarroDAO.
     */
    @Test
    public void testAtualizarCarro() throws Exception {
    }

    /**
     * Test of ConsultarById method, of class CarroDAO.
     */
    @Test
    public void testConsultarById() throws Exception {
        int id = 1;
        Model.Carro c = new Model.Carro();
        c.setIdcarro(id);
        DAO.CarroDAO cDAO = new DAO.CarroDAO ();
        c = cDAO.ConsultarById(c);
        if(c!=null) System.out.println(c.getFabricante());
    }

    /**
     * Test of consultarTodos method, of class CarroDAO.
     */
    @Test
    public void testConsultarTodos() throws Exception {
    }
    
}
