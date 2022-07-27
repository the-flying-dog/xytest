package test_react;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获取实例
        Class testClass = Class.forName("test_react.TargetObject");
        //调用无参构造函数
        System.out.println("实例化");
        TargetObject testObject = (TargetObject) testClass.newInstance();
        //获取类方法
        System.out.println("获取类方法");
        Method[] methods = testClass.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }
        System.out.println("获取指定类方法");
        Method method = testClass.getDeclaredMethod("setValue",String.class);
        method.invoke(testObject,"love");
        //获取参数
        System.out.println("获取参数");
        Field[] fields = testClass.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }
        System.out.println("获取指定参数");
        Field field = testClass.getDeclaredField("name");
        System.out.println("取消安全检查，设置可访问");
        field.setAccessible(true);
        field.set(testObject,"zhuzhubao");
        System.out.println(testObject.getName());
        //无参函数的获取
        Method get = testClass.getDeclaredMethod("getName");
        System.out.println(get.invoke(testObject));




    }
}
