package org.example.exo1;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/quizzes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuizzRessource {

    private final QuizzService quizzService;

    @Inject
    public QuizzRessource(QuizzService quizzService){
        this.quizzService = quizzService;
    }

    @GET
    public List<Quizz> getQuizz(){
        return quizzService.readAllQuizz();
    }
}
