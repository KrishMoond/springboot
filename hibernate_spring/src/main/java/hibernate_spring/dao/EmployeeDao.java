package hibernate_spring.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hibernate_spring.JpaUtil;
import hibernate_spring.dto.Employee;

@Repository
public class EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    JpaUtil jpa;

    EntityManager em;   

    @PostConstruct
    public void init() {
        em = jpa.getEntityManager();   
    }

    // INSERT
    public void insertEmp(Employee e) {

        em.getTransaction().begin();
        Employee existing = find(e.getId());
        em.getTransaction().commit();
    }

    // FIND
    public Employee find(int id) {
        return entityManager.find(Employee.class, id);
    }

    // DELETE
    public void del(int id) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Employee e = find(id);

        if (e != null) {
            entityManager.remove(e);
            System.out.println("Employee deleted");
        } else {
            System.out.println("Employee not found");
        }

        tx.commit();
    }

    // UPDATE
    public void update(Employee updatedEmp) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Employee existing = find(updatedEmp.getId());

        if (existing != null) {
            existing.setName(updatedEmp.getName());
            existing.setSal(updatedEmp.getSal());

            entityManager.merge(existing);
            System.out.println("Employee updated");
        } else {
            System.out.println("Employee not found");
        }

        tx.commit();
    }
}