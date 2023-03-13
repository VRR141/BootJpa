package com.example.bootjpa.repo;

import com.example.bootjpa.domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class HibernateRepository {

    @PersistenceContext
    private final EntityManager manager;

    @Transactional(readOnly = true)
    public List<Person> getPersonsByCity(String city){
        TypedQuery<Person> query = manager
                .createQuery("select p from Person p where p.cityOfLiving = :city", Person.class);
        query.setParameter("city", city);
        return query.getResultList();
    }

}
