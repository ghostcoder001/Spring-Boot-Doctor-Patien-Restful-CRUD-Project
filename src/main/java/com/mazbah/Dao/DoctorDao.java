package com.mazbah.Dao;

import com.mazbah.Entity.Doctor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DoctorDao {
    private static Map<Integer, Doctor> doctors;
    static{
        doctors= new HashMap<Integer, Doctor>(){
            {
                put(1, new Doctor(1,"Dr. Kamal","kamal@gmail.com","Medicine"));
                put(2,new Doctor(2,"Dr. Azad","azad@gmail.com","Dentist"));

            }
        };

    }

    public  Collection<Doctor> getAllDoctors(){
        return this.doctors.values();
    }
}
