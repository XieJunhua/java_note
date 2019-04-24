package com.junhua.concurrence.cas;

import com.junhua.concurrence.model.Student;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ReferenceTest {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        StudentAtomicOperation studentAtomicOperation = new StudentAtomicOperation();
        Student student = new Student();
        student.setId(1);
        student.setName("s1");
        System.out.println(student);
        studentAtomicOperation.updateName(student, "s2");
        System.out.println(student);

    }

}
