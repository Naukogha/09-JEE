package org.example.exo2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "personneServlet", value = "/personneServlet")
public class PersonneServlet extends HttpServlet {
    private String message;
    private List<Personne> personneList;

    public void init() {
        personneList=new ArrayList<>();
        personneList.add(new Personne(1, "Lefebvre", "Marie", 20 ));
        personneList.add(new Personne(1, "toto", "toto", 20 ));
        personneList.add(new Personne(1, "tata", "tata", 20 ));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("personnes", personneList);
        request.getRequestDispatcher("person.jsp").forward(request,response);
    }


}