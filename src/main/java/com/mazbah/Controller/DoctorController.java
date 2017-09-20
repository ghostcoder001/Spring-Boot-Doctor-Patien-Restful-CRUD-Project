package com.mazbah.Controller;

import com.mazbah.Entity.Doctor;
import  com.mazbah.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }
}
