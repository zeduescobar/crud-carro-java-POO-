/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import util.ConexaoDAO;
import Model.Carro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunos
 */
public class CarroDAO {

    public void CadastrarCarro(Carro carro) throws ClassNotFoundException, SQLException {

        Connection con = ConexaoDAO.getConexão();
        PreparedStatement comando = con.prepareStatement("insert into carro (modelo, placa, cor, km, preco, fabricante, categoria, cambio, ano, motor) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        comando.setString(1, carro.getModelo());
        comando.setString(2, carro.getPlaca());
        comando.setString(3, carro.getCor());
        comando.setString(4, carro.getKm());
        comando.setDouble(5, carro.getPreco());
        comando.setString(6, carro.getFabricante());
        comando.setString(7, carro.getCategoria());
        comando.setString(8, carro.getCambio());
        comando.setString(9, carro.getAno());
        comando.setString(10, carro.getMotor());
        comando.execute();
        con.close();

    }

    public void DeletarCarro(Carro carro) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDAO.getConexão();
        PreparedStatement comando = con.prepareStatement("delete *from carro where id=?");
        comando.setInt(1, carro.getIdcarro());
        comando.execute();
        con.close();
    }

    public void AtualizarCarro(Carro carro) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDAO.getConexão();
        PreparedStatement comando = con.prepareStatement("update carro set modelo = ?, placa = ?, cor = ?, km = ?, preco = ?, frabricante = ?, categoria = ?, cambio = ?, ano = ?, motor = ?, where = ?");
        comando.setInt(1, carro.getIdcarro());
        comando.setString(2, carro.getModelo());
        comando.setString(3, carro.getPlaca());
        comando.setString(4, carro.getCor());
        comando.setString(5, carro.getKm());
        comando.setDouble(6, carro.getPreco());
        comando.setString(7, carro.getFabricante());
        comando.setString(8, carro.getCategoria());
        comando.setString(9, carro.getCambio());
        comando.setString(10, carro.getAno());
        comando.setString(11, carro.getMotor());
        comando.execute();
        con.close();
    }
     public Carro ConsultarById(Carro carro) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDAO.getConexão();
        PreparedStatement comando = con.prepareStatement("select *from carro where idcarro =?");
        comando.setInt(1, carro.getIdcarro());
        ResultSet rs = comando.executeQuery();
        Carro carro1 = new Carro();
        if (rs.next()) {

            carro1.setIdcarro(rs.getInt("idcarro"));
            carro1.setModelo(rs.getString("modelo"));
            carro1.setPlaca(rs.getString("placa"));
            carro1.setCor(rs.getString("cor"));
            carro1.setKm(rs.getString("km"));
            carro1.setPreco(rs.getDouble("preco"));
            carro1.setFabricante(rs.getString("fabricante"));
            carro1.setCategoria(rs.getString("categoria"));
            carro1.setCambio(rs.getString("cambio"));
            carro1.setAno(rs.getString("ano"));
            carro1.setMotor(rs.getString("motor"));
        }
        return carro1;
    }
 public List<Carro> consultarTodos() throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDAO.getConexão();
        PreparedStatement comando = con.prepareStatement("select * from carro");
        ResultSet rs = comando.executeQuery();
        ArrayList<Carro> carros = new ArrayList<Carro>();
        int cont = 0;
        while (rs.next()) {
            Carro carro = new Carro();
                    
            carro.setIdcarro(rs.getInt("idcarro"));
            carro.setModelo(rs.getString("modelo"));
            carro.setPlaca(rs.getString("placa"));
            carro.setCor(rs.getString("cor"));
            carro.setKm(rs.getString("km"));
            carro.setPreco(rs.getDouble("preco"));
            carro.setFabricante(rs.getString("fabricante"));
            carro.setCategoria(rs.getString("categoria"));
            carro.setCambio(rs.getString("cambio"));
            carro.setAno(rs.getString("ano"));
            carro.setMotor(rs.getString("motor"));
            carros.add(carro);
            cont++;

        }
        System.out.println("Contagem" + cont);
        con.close();
        return carros;
    }
}
