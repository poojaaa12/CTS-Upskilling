import java.lang.reflect.*;

class Student {

    public void display() {
        System.out.println("Student");
    }
}

public class ReflectionExample {

    public static void main(String[] args)
            throws Exception {

        Class<?> studentClass =
                Class.forName("Student");

        Method[] declaredMethods =
                studentClass.getDeclaredMethods();

        for(Method declaredMethod : declaredMethods) {
            System.out.println(
                    declaredMethod.getName());
        }

        Object studentObject =
                studentClass.getDeclaredConstructor()
                        .newInstance();

        Method displayMethod =
                studentClass.getMethod("display");

        displayMethod.invoke(studentObject);
    }
}
