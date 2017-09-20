package com.mazbah.Service;

import com.mazbah.Entity.Doctor;
import com.mazbah.Dao.DoctorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DoctorService {

    @Autowired
    private DoctorDao doctorDao;
    public Collection<Doctor> getAllDoctors(){
        return doctorDao.getAllDoctors();
    }
}
