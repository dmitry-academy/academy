package by.academy.lesson8.a;

public class InheritedClassInA extends ClassInA {


    @Override
    public void someMethod() {
        System.out.println(super.protectedVariable);
        System.out.println(super.publicVariable);
        System.out.println(super.variable);
        //  System.out.println(super.privateVariable); not possible
    }
}
