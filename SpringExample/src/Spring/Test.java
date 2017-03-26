
package Spring;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;

import emp.Employee;  
  
public class Test {

	public static void main(String[] args){
		 Resource r=new ClassPathResource("resource/spring.xml");
		 BeanFactory factory=new XmlBeanFactory(r);
		 Employee s=(Employee)factory.getBean("g");
		  
		s.show();
	}
}
