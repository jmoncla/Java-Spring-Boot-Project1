package com.d288.james;

import com.d288.james.dao.CustomerRepository;
import com.d288.james.dao.DivisionRepository;
import com.d288.james.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (customerRepository.count() == 1) {
            Customer stephen = new Customer();
            stephen.setFirstName("Stephen");
            stephen.setLastName("Curry");
            stephen.setAddress("30 Three-Point Avenue");
            stephen.setPhone("1112223333");
            stephen.setPostal_code("12345");
            stephen.setDivision(divisionRepository.getReferenceById(7L));
            customerRepository.save(stephen);

            Customer ray = new Customer();
            ray.setFirstName("Ray");
            ray.setLastName("Allen");
            ray.setAddress("34 Long Range Road");
            ray.setPhone("2223334444");
            ray.setPostal_code("54321");
            ray.setDivision(divisionRepository.getReferenceById(2L));
            customerRepository.save(ray);

            Customer reggie = new Customer();
            reggie.setFirstName("Reggie");
            reggie.setLastName("Miller");
            reggie.setAddress("31 Downtown Drive");
            reggie.setPhone("3334445555");
            reggie.setPostal_code("67890");
            reggie.setDivision(divisionRepository.getReferenceById(3L));
            customerRepository.save(reggie);

            Customer klay = new Customer();
            klay.setFirstName("Klay");
            klay.setLastName("Thompson");
            klay.setAddress("11 Splash Street");
            klay.setPhone("4445556666");
            klay.setPostal_code("09876");
            klay.setDivision(divisionRepository.getReferenceById(4L));
            customerRepository.save(klay);

            Customer damian = new Customer();
            damian.setFirstName("Damian");
            damian.setLastName("Lillard");
            damian.setAddress("0 Logo Lane");
            damian.setPhone("5556667777");
            damian.setPostal_code("56789");
            damian.setDivision(divisionRepository.getReferenceById(7L));
            customerRepository.save(damian);
        }
    }
}
