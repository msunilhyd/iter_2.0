package com.dailycodebuffer.spring.data.jpa.tutorial2.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial2.entity.Guardian;
import com.dailycodebuffer.spring.data.jpa.tutorial2.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("sunmocha64@gmail.com")
                .firstName("sunil")
                .lastName("mocharla")
//                .guardianName("Nikhil")
//                .guardianEmail("nikhil@gmail.com")
//                .guardianMobile("9797978979")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .email("nikhil@gmail.com")
                .name("Nikhil")
                .mobile("909028301")
                .build();

        Student student = Student.builder()
                .firstName("Shivam")
                .emailId("shivam@gmail.com")
                .lastName("Kumar")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstName() {
        List<Student> students =
                studentRepository.findByFirstName("shivam");
        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining() {
        List<Student> students =
                studentRepository.findByFirstNameContaining("shivam");
        System.out.println("students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName() {
        List<Student> students =
                studentRepository.findByGuardianName("Nikhil");
        System.out.println(students);
    }

    @Test
    public void printgetStudentByEmailAddress() {
        Student student =
                studentRepository.getStudentByEmailAddress("sunmocha64@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentFirstNameByEmailAddress() {
        String firstName = studentRepository.getStudentFirstNameByEmailAddress("sunmocha64@gmail.com");
        System.out.println("student firstName = " + firstName);
    }

    @Test
    public void getgetStudentByEmailAddressNative() {
        Student student =
                studentRepository.getStudentByEmailAddressNative("shivam@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentByEmailAddressNativeNamedParam() {
        Student student =
                studentRepository.getStudentByEmailAddressNativeNamedParam("shivam@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void updateStudentNameByEmailIdTest() {
        studentRepository.updateStudentNameByEmailId(
                "pradeep macherla",
                "sunmocha64@gmail.com"
        );
    }
}