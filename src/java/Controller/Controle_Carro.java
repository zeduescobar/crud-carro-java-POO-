/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CarroDAO;
import Model.Carro;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alunos
 */
@WebServlet(name = "Controle_Carro", urlPatterns = {"/Controle_Carro"})
public class Controle_Carro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String op = request.getParameter("op");
            CarroDAO cdao = new CarroDAO();
            Carro c = new Carro();

            if (op.equals("CADASTRAR")) {
                int idcarro = Integer.parseInt(request.getParameter("txtidcarro"));
                String modelo = request.getParameter("txtmodelo");
                String placa = request.getParameter("txtplaca");
                String cor = request.getParameter("txtcor");
                String km = request.getParameter("txtkm");
                double preco = Double.parseDouble(request.getParameter("txtpreco"));
                String fabricante = request.getParameter("txtfabricante");
                String categoria = request.getParameter("txtcategoria");
                String cambio = request.getParameter("txtcambio");
                String ano = request.getParameter("txtano");
                String motor = request.getParameter("txtmotor");
                String msg = "Cadastrar";
                c.setIdcarro(idcarro);
                c.setModelo(modelo);
                c.setPlaca(placa);
                c.setCor(cor);
                c.setKm(km);
                c.setPreco(preco);
                c.setFabricante(fabricante);
                c.setCategoria(categoria);
                c.setCambio(cambio);
                c.setAno(ano);
                c.setMotor(motor);
                try {
                    cdao.CadastrarCarro(c);
                    System.out.println("Cadastrado com sucesso!!");
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("Cadastrado.jsp").forward(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("erro.jsp").forward(request, response);

                }
                } else if (op.equals("CONSULTAR_BY_ID")) {
                int id = Integer.parseInt(request.getParameter("txtidcarro"));
                c.setIdcarro(id);
                try {
                    c = cdao.ConsultarById(c);
                    request.setAttribute("c", c);
                    request.getRequestDispatcher("resultadoconsultarbyid.jsp").forward(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                }
                } else if (op.equals("LISTAR")) {
                //NÃO IMPLEMENTADO
                try {
                    List<Carro> carro1 = cdao.consultarTodos();
                    request.setAttribute("carro1", carro1);
                    request.getRequestDispatcher("resultadoconsultartodos.jsp").forward(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                }
                } else if (op.equals("ATUALIZAR")) {
                int id = Integer.parseInt(request.getParameter("txtid"));
                c.setIdcarro(id);
                try {
                    c = cdao.ConsultarById(c);
                    request.setAttribute("c", c);
                    request.getRequestDispatcher("resultadocosultaratualizar.jsp").forward(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                }
                } else if (op.equals("EFETIVAR ATUALIZAÇÃO")) {
                int idcarro = Integer.parseInt(request.getParameter("txtid"));
                String modelo = request.getParameter("txtmodelo");
                String placa = request.getParameter("txtplaca");
                String cor = request.getParameter("txtcor");
                String km = request.getParameter("txtkm");
                double preco = Double.parseDouble(request.getParameter("txtpreco"));
                String fabricante = request.getParameter("txtfabricante");
                String categoria = request.getParameter("txtcategoria");
                String cambio = request.getParameter("txtcambio");
                String ano = request.getParameter("txtano");
                String motor = request.getParameter("txtmotor");
                c.setIdcarro(idcarro);
                c.setModelo(modelo);
                c.setPlaca(placa);
                c.setKm(km);
                c.setPreco(preco);
                c.setFabricante(fabricante);
                c.setCategoria(categoria);
                c.setCambio(cambio);
                c.setAno(ano);
                c.setMotor(motor);
                String msg = "Atualizar";
                try {
                    cdao.AtualizarCarro(c);
                    System.out.println("Atuaizado com sucesso!!");
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("resultado.jsp").forward(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("erro.jsp").forward(request, response);

                }

                

                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Controle_Carro</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet Controle_Carro at " + request.getContextPath() + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }

