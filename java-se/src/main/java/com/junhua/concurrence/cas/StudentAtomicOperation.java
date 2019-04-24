package com.junhua.concurrence.cas;

import com.junhua.concurrence.model.Student;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public class StudentAtomicOperation {
    private AtomicReference<Student> reference = new AtomicReference<>();

    public void updateName(Student student, String name) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        reference.set(student);
        for (;;) {
            Student student1 = new Student();
            student1.setId(student.getId());
            student1.setName(name);
            if (reference.compareAndSet(student,student1)) {
                break;
            }
        }
    }
}
