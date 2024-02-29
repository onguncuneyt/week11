package business.concretes;

import business.abstracts.ICustomerManager;
import dao.concretes.CustomerDao;
import entities.Customer;

import java.util.List;

public class CustomerManager implements ICustomerManager {

    private final CustomerDao customerDao;

    //dependency injection
    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        Customer customerCheckMail = this.customerDao.findByMail(customer.getMail());
        if(customerCheckMail!=null){
             throw new RuntimeException(customer.getMail() + " bu mail adresi daha önce kayıt olmuş");
        }
        this.customerDao.save(customer );

    }

    @Override
    public Customer findById(int id) {
        return this.customerDao.findById(id);
    }

    @Override
    public void update(Customer customer) {
        this.customerDao.update(customer  );
    }

    @Override
    public void deleteById(int id) {
        Customer customer = this.findById(id);
        this.customerDao.delete(customer);
    }

    @Override
    public List<Customer> findAll() {
        return this.customerDao.findAll();
    }
}
