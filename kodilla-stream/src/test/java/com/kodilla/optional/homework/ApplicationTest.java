package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    public void testStudentWithTeacher() {
        Teacher teacher = new Teacher("Walter White senior");
        Student student = new Student("Jesse Pinkman", teacher);

        assertEquals("Jesse Pinkman", student.getName());
        assertNotNull(student.getTeacher());
        assertEquals("Walter White senior", student.getTeacher().getName());
    }

    @Test
    public void testStudentWithoutTeacher() {
        Student student = new Student("Marie Schrader", null);

        assertEquals("Marie Schrader", student.getName());
        assertNull(student.getTeacher());
    }

    @Test
    public void testOptionalTeacherPresent() {
        Teacher teacher = new Teacher("Skyler White");
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);

        assertTrue(optionalTeacher.isPresent());
        assertEquals("Skyler White", optionalTeacher.get().getName());
    }

    @Test
    public void testOptionalTeacherEmpty() {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(null);

        assertFalse(optionalTeacher.isPresent());
        String name = optionalTeacher.map(Teacher::getName).orElse("<undefined>");
        assertEquals("<undefined>", name);
    }

    @Test
    void testMain() {
        Application.main(new String[]{});
    }
}
