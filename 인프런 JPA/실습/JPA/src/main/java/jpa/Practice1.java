package jpa;

import DAO.Member;

import javax.persistence.*;


/**
 * 값을 넣어보는 실습
 */
public class Practice1 {
    public static void main(String[] args) {
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("h2");
        EntityManager em= emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Member member = new Member();
        member.setId(1L);
        member.setName("hello");
        em.persist(member);

        tx.commit();

        em.close();
        emf.close();
    }
}
