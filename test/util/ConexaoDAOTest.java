/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alunos
 */
public class ConexaoDAOTest {
    
    public ConexaoDAOTest() {
    }

    /**
     * Test of getConexão method, of class ConexaoDAO.
     */
    @Test
    public void testGetConexão() throws Exception {
        java.sql.Connection con = util.ConexaoDAO.getConexão();
        assertNotNull(con);
    }
    
}
