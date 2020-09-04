package be.spacedandy.service;

import be.spacedandy.model.Exam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExamService {

    public void outputExam(Long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();
        Exam exam = em.find(Exam.class, id);
        System.out.println(exam.toString());

        em.close();
        emf.close();
    }
}
