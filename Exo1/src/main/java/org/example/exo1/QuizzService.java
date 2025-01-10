package org.example.exo1;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class QuizzService {
    private List<Quizz> quizzes = new ArrayList<>();
    private Question question;

    // Questions pour le premier quizz
    Question q1 = new Question(1, "Quelle est la capitale de la France ?", "Paris", "Londres", "Berlin", "Madrid", 1);
    Question q2 = new Question(2, "Combien de continents y a-t-il ?", "5", "6", "7", "8", 3);
    Question q3 = new Question(3, "Quel est le plus grand océan ?", "Atlantique", "Pacifique", "Arctique", "Indien", 2);

    // Création du premier quizz
    Quizz quizz1 = new Quizz(1, "Quizz Géographie", Arrays.asList(q1, q2, q3));

    // Questions pour le deuxième quizz
    Question q4 = new Question(4, "Qui a écrit 'Les Misérables' ?", "Victor Hugo", "Charles Dickens", "Emile Zola", "Jules Verne", 1);
    Question q5 = new Question(5, "Quelle est la formule chimique de l'eau ?", "CO2", "H2O", "O2", "NaCl", 2);
    Question q6 = new Question(6, "Quelle planète est la plus proche du Soleil ?", "Venus", "Mars", "Mercure", "Jupiter", 3);

    // Création du deuxième quizz
    Quizz quizz2 = new Quizz(2, "Quizz Général", Arrays.asList(q4, q5, q6));

    // Ajout des quizz à la liste

    public QuizzService(){
        quizzes.add(quizz1);
        quizzes.add(quizz2);
    }

    //savquizz
    public Quizz save (int id, String name, List<Question> questions){
        Quizz quizz = new Quizz(id, name, questions);
        quizzes.add(quizz);
        return quizz;
    }

    //savquestion
    public Question save (int id, String question, String answerA, String answerB, String answerC, String answerD, int trueAnswer){
        return new Question(id, question, answerA, answerB, answerC, answerD, trueAnswer);
    }

    //readquizz
    public List<Quizz> readAllQuizz(){
        return quizzes;
    }

    public Quizz readOneQuizz(int id) {
        for (Quizz quizz : quizzes) {
            if (quizz.getId() == id) {
                return quizz;
            }
        }
        return null;
    }


    //readquestionOfQuizz
    public Question readOneQuestion(int quizzId, int questionId) {
        Quizz quizz = readOneQuizz(quizzId);
        if (quizz != null) {
            for (Question q : quizz.getQuestions()) {
                if (q.getId() == questionId) {
                    return q;
                }
            }
        }
        return null;
    }

    //deleteQuizz
}
