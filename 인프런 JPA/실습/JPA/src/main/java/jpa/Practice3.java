package jpa;

import DAO.Member;
import DAO.Member2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Practice3 {
    public static void main(String[] args) {
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("h2");
        EntityManager em= emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            System.out.println("===프로그램 시작===");
            Member2 member = new Member2();
            System.out.println("===Member2 객체 생성 후===");
            member.setName("A");
            System.out.println("===Member2 객체 이름 설정 후===");
            em.persist(member);
            System.out.println("===영속성 컨테이너 작업 후===");
            tx.commit();
            System.out.println("===Member2 커밋 후===");
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
