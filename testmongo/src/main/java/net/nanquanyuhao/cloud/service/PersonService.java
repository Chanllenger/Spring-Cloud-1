package net.nanquanyuhao.cloud.service;

import net.nanquanyuhao.cloud.dao.PersonDao;
import net.nanquanyuhao.cloud.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nanquanyuhao on 2017/11/26.
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> findAll() {
        return personDao.findAll();
    }

    public List<Person> myQuery() {
        return personDao.myQuery();
    }

    public List<Person> findByNameAndAge(String name, int age) {
        return personDao.findByNameAndAge(name, age);
    }
}
