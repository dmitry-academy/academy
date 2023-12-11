package by.academy.lesson8.a;

public class ClassInAWithoutInheritance {


    public void someMethod() {

        ClassInA a = new ClassInA();
        System.out.println(a.variable);
        System.out.println(a.publicVariable);
//        System.out.println(a.privateVariable);
        System.out.println(a.protectedVariable);
    }
}
