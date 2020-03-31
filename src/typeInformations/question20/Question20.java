//Найдите описание класса java.lang.CLass в документации JDK. Напишите программу
//которая получает имя класса в параметре командной строки, а затем использует
//методы класса Class для вывода всей доступной иснформации о классе. Протестируйте
//программу на одном из классов стандартной библиотеки Java и на своем собственном классе.

package typeInformations.question20;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Question20 {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("typeInformations.ShowMethods");

        //getSimpleName()
        System.out.println("Class: "+c.getSimpleName());

        //getAnnotation()
        System.out.println("c.getAnnotations(): ");
        if (c.getAnnotations().length==0){
            System.out.println("none");
        }
        for (Annotation a:c.getAnnotations()) {
            System.out.println(a);
        }

        //getCanonicalName()
        System.out.println("c.getCanonicalName(): "+c.getCanonicalName());
        if (c.getClasses().length==0){
            System.out.println("none");
        }
        for (Class cl:c.getClasses()) {
            System.out.println(cl);
        }

        //getClassLoader()
        System.out.println("c.getClassLoader(): "+c.getClassLoader());

        //getConstructor()
        System.out.println("c.getConstructor(): ");
        if (c.getConstructors().length==0){
            System.out.println("none");
        }
        for (Constructor con:c.getConstructors()) {
            System.out.println(con);
        }

        //getDeclaredAnnotations()
        //declared - обяъявленный
        System.out.println("c.getDeclaredAnnotations(): ");
        if (c.getDeclaredAnnotations().length == 0) {
            System.out.println("none");
        }
        for (Annotation an:c.getDeclaredAnnotations()) {
            System.out.println(an);
        }

        //getDeclaredClasses()
        System.out.println("c.getDeclaredClasses(): ");
        if (c.getDeclaredClasses().length==0){
            System.out.println("none");
        }
        for (Class cl:c.getDeclaredClasses()) {
            System.out.println(cl);
        }

        //getDeclaredConstructors()
        System.out.println("c.getDeclaredConstructors(): ");
        if (c.getDeclaredConstructors().length==0){
            System.out.println("none");
        }
        for (Constructor con:c.getDeclaredConstructors()) {
            System.out.println(con);
        }

        //getDeclaredFields()
        System.out.println("c.getDeclaredFields(): ");
        if (c.getDeclaredFields().length==0){
            System.out.println("none");
        }
        for (Field f:c.getDeclaredFields()) {
            System.out.println(f);
        }

        //getDeclaredMethods()
        System.out.println("c.getDeclaredMethods(): ");
        if (c.getDeclaredMethods().length==0){
            System.out.println("none");
        }
        for (Method meth:c.getDeclaredMethods()) {
            System.out.println(meth);
        }

        //getDeclaringClass
        System.out.println("c.getDeclaringClass(): "+c.getDeclaringClass());

        //getEnclosingConstructor
        //enclosing - вшита
        System.out.println("c.getEnclosingConstructor(): "+c.getEnclosingConstructor());

        //getEnclosingMethods()
        System.out.println("c.getEnclosingMethods(): "+c.getEnclosingMethod());

        //getEnumConstans()
        System.out.println("c.getEnumsConstans(): "+c.getEnumConstants());

        //getDeclaredFields
        if (c.getFields().length==0){
            System.out.println("none");
        }
        for (Field fl:c.getFields()) {
            System.out.println(fl);
        }

        //getGenericInterfaces
        System.out.println("C.getGenericInterfaces(): ");
        if (c.getGenericInterfaces().length==0){
            System.out.println("none");
        }
        for (Type type:c.getGenericInterfaces()) {
            System.out.println(type);
        }

        //getGenericSuperclass
        System.out.println("c.getGenericSuperclass(): "+c.getGenericInterfaces());

        //getInterfaces
        System.out.println("c.getInterfaces(): ");
        if (c.getInterfaces().length==0){
            System.out.println("none");
        }
        for (Class i:c.getInterfaces()) {
            System.out.println(i);
        }

        //getMethods
        System.out.println("c.getMethods(): ");
        if (c.getMethods().length==0){
            System.out.println("none");
        }
        for (Method meth:c.getMethods()) {
            System.out.println(meth);
        }

        //getModifiers
        System.out.println("c.getModifiers(): "+c.getModifiers());

        //getName
        System.out.println("c.getName(): "+c.getName());

        //getPackage
        System.out.println("c.getPackage(): "+c.getPackage());

        //getProtectionDomain
        System.out.println("c.getProtectionDomain(): "+c.getProtectionDomain());

        //getSigners
        //sigmers - подписанты
        System.out.println("c.getSigners(): ");
        if (c.getSigners()==null){
            System.out.println(c.getSigners());
        }
        if (c.getSigners()!=null){
            System.out.println();
            if (c.getSigners().length==0){
                System.out.println("none");
            }
            if(c.getSigners().length>0){
                for (Object obj:c.getSigners()) {
                    System.out.println(obj);
                }
            }
        }

        //getSimpleName
        System.out.println("c.getSimpleName(): "+c.getSimpleName());

        //getSuperClass
        System.out.println("c.getSuperClass(): "+c.getSuperclass());

        //getTypeParameters
        System.out.println("c.getTypeParameters(): "+c.getTypeParameters());

        //isAnnotation
        System.out.println("c.isAnnotation(): "+c.isAnnotation());

        //isAnnotationPresent
        System.out.println("c.isAnnotationPresent(Documented.class): "+c.isAnnotationPresent(Documented.class));

        //isAnonymousClass
        System.out.println("c.isAnonymousClass(): "+c.isAnonymousClass());

        //isArray
        System.out.println("c.isArray(): "+c.isArray());

        //isAssignableFrom(Question20)
        //assignable - назначаемый
        System.out.println("c.isAssignableFrom(Question20.class): "+c.isAssignableFrom(Question20.class));

        //isAssignableFrom(Object)
        System.out.println("c.isAssignableFrom(Object.class): "+c.isAssignableFrom(Object.class));

        //isEnum
        System.out.println("c.isEnum(): "+c.isEnum());

        //isInstance
        System.out.println("c.isInstance(Object.class): "+c.isInstance(Object.class));

        //isInterface
        System.out.println("c.isInterface(): "+c.isInterface());

        //isLocalClass
        System.out.println("c.isLocalClass(): "+c.isLocalClass());

        //isMemberClass
        System.out.println("c.isMemberClass(): "+c.isMemberClass());

        //isPrimitive
        System.out.println("c.isPrimitive(): "+c.isPrimitive());

        //isSynthetic
        System.out.println("c.isSynthetic(): "+c.isSynthetic());
    }
}
