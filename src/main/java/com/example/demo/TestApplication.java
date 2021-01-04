package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.repo.AdminRepository;
import com.example.demo.repo.UserRepository;
//import com.example.demo.service.TreatmentService;
//import com.example.demo.service.TreatmentTypeService;
import com.example.demo.service.TreatmentDetailsService;
import com.example.demo.service.TreatmentService;
import com.example.demo.service.TreatmentTypeService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class TestApplication  {




	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx =
				SpringApplication.run(TestApplication.class, args);

//        User user= new User();
//		user.setUsername("A");
//		user.setEmail("A");
//		user.setPassword("A");
//
//		//create new admin
//		Admin admin = new Admin();
//		admin.setFirstName("A");
//		admin.setLastName("A");
//		admin.setUser(user);
////
////
//		UserService userservice = ctx.getBean ("userService", UserService.class);
//		userservice.createAdmin(admin);
//

		//TreatmentTypeService treatmentTypeService = ctx.getBean("treatmentTypeService", TreatmentTypeService.class);
		//treatmentTypeService.createTreatmentType(treatmentType1);







//		TreatmentType treatmentType3=new TreatmentType();
//		treatmentType3.setTreatmentType("Dentist");
//		TreatmentTypeService treatmentTypeServiceService = ctx.getBean("treatmentTypeServiceService3", TreatmentTypeService.class);
//
//		TreatmentType treatmentType4=new TreatmentType();
//		treatmentType4.setTreatmentType("Ophthalmologist");
//		TreatmentTypeService treatmentTypeServiceService4 = ctx.getBean("treatmentTypeServiceService4", TreatmentTypeService.class);
//



//         //Make at treatment
//		Treatment treatment1 = new Treatment();
//		treatment1.setName("Medicine");
//        //add a treatmentType
//		TreatmentType treatmentType1=new TreatmentType();
//		treatmentType1.setTreatmentType("Dentist");
//		treatmentType1.setTreatment(treatment1);
//
//		//Make Details
//		TreatmentDetails treatmentDetails1=new TreatmentDetails("Teeth whitening ", Time.valueOf("00:40:00"), "300 euro", " A bleaching gel is placed into a transparent, custom-made tray ");
//		treatmentDetails1.setTreatmentType(treatmentType1);
//
//		TreatmentDetails treatmentDetails2=new TreatmentDetails("DENTAL IMPLANT", Time.valueOf("00:40:00"), "1000 euro", "A dental implant is an artificial tooth root made of a titanium screw that is inserted into jawbone ");
//		treatmentDetails2.setTreatmentType(treatmentType1);
//		TreatmentDetails treatmentDetails3=new TreatmentDetails("GUMSHIELDS", Time.valueOf("00:00:00"), "60 euro", " we create a tailor made mouthguard, guardadapted exclusively to your jaw and customisable ");
//		treatmentDetails3.setTreatmentType(treatmentType1);
//
//
//		//make a list of different details of treatment
//		Set<TreatmentDetails>treatmentDetails=new HashSet<TreatmentDetails>();
//		treatmentDetails.add(treatmentDetails1);
//		treatmentDetails.add(treatmentDetails2);
//		treatmentDetails.add(treatmentDetails3);
//
//
//		User user3= new User();
//		user3.setUsername("S4");
//		user3.setEmail("specialist4@gmail.com");
//		user3.setPassword("S4");
//
//		Specialist specialist=new Specialist();
//		specialist.setFirstName("S4");
//		specialist.setLastName("S4");
//		specialist.setTelephoneNumber("s11111");
//		specialist.setPostcode("1750");
//		specialist.setCity("Lennik");
//		specialist.setStreet("SlagvijverStraat 35");
//		specialist.setHouseNumb(100);
//
//		specialist.setUser(user3);
//		specialist.setTreatmentDetails(treatmentDetails);
//		UserService userService = ctx.getBean ("userService", UserService.class);
//		userService.createSpecialist(specialist, treatmentDetails);
	}}

