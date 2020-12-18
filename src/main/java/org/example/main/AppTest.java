package org.example.main;
import org.example.beans.repository.EmployeeRepository;
import org.example.model1.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class AppTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext("org.example");
        String beansNames[] = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beansNames));

        EmployeeRepository repository = context.getBean(EmployeeRepository.class);
        // insert
        Employee e1 = new Employee();
        e1.setUid(UUID.randomUUID().toString());
        e1.setFirstname("f1");
        e1.setLastname("l1");
        repository.insert(e1);

    // update
    Employee e2 = new Employee();
        e2.setUid("uid-123456");
        e2.setFirstname("f1");
        repository.update(e2);
        // select by UID
        Employee e = repository.selectByUid("uid-123456");
        System.out.println(e.getFirstname());

        // select all
        List<Employee> employees = repository.selectAll();
        System.out.println(employees);
        // delete
        repository.delete("uid-123456");
}}