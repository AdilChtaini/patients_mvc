package ma.enset.patients_mvc;

import ma.enset.patients_mvc.entities.Patient;
import ma.enset.patients_mvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args->{
            patientRepository.save(new Patient(null,"Hassan",new Date(),false,12));
            patientRepository.save(new Patient(null,"Adil",new Date(),true,72));
            patientRepository.save(new Patient(null,"Samir",new Date(),false,84));
            patientRepository.save(new Patient(null,"Farid",new Date(),true,87));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
