package org.example.exo2;

import java.io.*;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "personneServlet", value = "/personneServlet")
public class PersonneServlet extends HttpServlet {
    private String message;
    private List<Personne> personneList;

    public void init() {
        Personne personne = new Personne(1, "Lefebvre", "Marie", 20 );
        Personne personne1 = new Personne(1, "toto", "toto", 20 );
        Personne personne2 = new Personne(1, "tata", "tata", 20 );
        personneList.add(personne);
        personneList.add(personne1);
        personneList.add(personne2);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("personnes", personneList);
    }


}