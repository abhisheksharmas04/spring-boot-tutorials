package com.example.realtimedi;

import java.util.List;
import java.util.Scanner;

import com.example.realtimedi.controller.MainController;
import com.example.realtimedi.vo.EmployeeVo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
		JdbcTemplateAutoConfiguration.class}) /*To exclude the AutoConfiguration*/
public class BootProj04RealTimeDiAutoConfigurationApplication {

	public static void main(String[] args) {
		// read imputs from end users:
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Desgs Count::");
		int count = sc.nextInt();
		String desgs[] = null;
		if(count > 0){
			desgs = new String[count];
		}else{
			System.out.println("Invalid desgs count");
			System.exit(0);
		}

		for(int i=0; i<count; i++){
			System.out.println("Enter Desg: " );
			String desg = sc.next();
			desgs[i] = desg;
		}

		ApplicationContext ctx =  SpringApplication.run(BootProj04RealTimeDiAutoConfigurationApplication.class, args);

		//get control class object
		MainController controller = ctx.getBean("controller", MainController.class);
		// invoke business method:
		try {
			List<EmployeeVo> listVos = controller.showEmpsByDes(desgs);
			listVos.forEach(vo ->{
				System.out.println(vo);
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Some Internall Problem: " + e.getMessage());
		}

		((ConfigurableApplicationContext) ctx).close();
	}

}
