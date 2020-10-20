package louis.springframework.sfgdi;

import louis.springframework.sfgdi.controllers.ConstructorInjectedController;
import louis.springframework.sfgdi.controllers.MyController;
import louis.springframework.sfgdi.controllers.PropertyInjectedController;
import louis.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//Before Implementing service, serviceImpl, autowired
//		MyController myController = (MyController) ctx.getBean("myController");

//		String greeting = myController.sayHello();
//		String sayBye = myController.sayBye();

		//try out my array function
//		int array[] = myController.genSortedRandomArrayWithLen(5);
//		Arrays.sort(array);
//		for(int arr : array) System.out.print(arr + "\t");
//
//		System.out.println();
//		System.out.println(greeting);
//		System.out.println(sayBye);

		//utilizing Service, serviceImpl, controller, autowired, this whole process = dependency injection
		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController =  (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		int array[] = propertyInjectedController.genSortedRandomArrayWithLen(5);
		Arrays.sort(array);
		for(int arr : array) System.out.print(arr + "\t");
		System.out.println();

		System.out.println("------ Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		int array1[] = propertyInjectedController.genSortedRandomArrayWithLen(5);
		Arrays.sort(array1);
		for(int arr : array1) System.out.print(arr + "\t");
		System.out.println();

		System.out.println("------ Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		int array2[] = propertyInjectedController.genSortedRandomArrayWithLen(5);
		Arrays.sort(array2);
		for(int arr : array2) System.out.print(arr + "\t");
		System.out.println();

	}

}
