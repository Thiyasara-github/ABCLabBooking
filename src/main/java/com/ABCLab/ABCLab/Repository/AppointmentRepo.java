package com.ABCLab.ABCLab.Repository;

import com.ABCLab.ABCLab.Model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigInteger;
import java.util.Optional;

public interface AppointmentRepo extends MongoRepository<Appointment, Integer> {



}
