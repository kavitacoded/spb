package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Student;
import com.nt.beans.WishMessageGenerator;

public class ConstuctorInjectionTest
{
    public static void main( String[] args )
    {
      //hold the name and location of spring bean cfg file in resourse object
    	
    	//Set file location
    	
    	FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
    	//create bean factory spring container(IOC container)
    	XmlBeanFactory factory=new XmlBeanFactory(res);
    	System.out.println("__________________________");
    	//get target spring bean class obj injected with dependent spring bean class obj
    	Object object=factory.getBean("wmg");
    	//type casting
    	WishMessageGenerator generator=(WishMessageGenerator) object;
    	System.out.println("___________________________");
    	//invoke b method
    	String msg=generator.generateMessage("Raja");
    	System.out.println("wish message is "+msg);
    	
    	System.out.println("_____________________________");
    	System.out.println("==========================");
    	Student stud=(Student)factory.getBean("st");
    	System.out.println("stud obj data"+stud);
    	
    	
    }
}
