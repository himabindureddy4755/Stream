package basic;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  



	public class Test {
		 public void main(String[] args)
		 {
			 //Student himani = new Student();
			 Resource resource = new ClassPathResource("applicationContext.xml");
			 BeanFactory beanFactory = new XmlBeanFactory(resource);
			 Student himani =(Student) beanFactory.getBean("studentbean");
			 himani.displayInfo();
		 }

}
