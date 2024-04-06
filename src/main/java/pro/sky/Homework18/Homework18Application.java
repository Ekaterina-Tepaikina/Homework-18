package pro.sky.Homework18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

@SpringBootApplication
public class Homework18Application {
	public static int countTotalSalary (){
		int totalSalary = 0;
		for (Employee employee : employees) {
			totalSalary += employee.getSalary();
		}
		return totalSalary;
	}
	public static Employee findMinSal () {
		int minSal = employees[0].getSalary();
		byte n = 0;
		for (byte i = 0; i < employees.length; i++)
			if (minSal>employees[i].getSalary()) {
				minSal = employees[i].getSalary();
				n = i;
			}
		return employees[n];
	}

	public static Employee findMaxSal () {
		int maxSal = employees[0].getSalary();
		byte n = 0;
		for (byte i = 0; i < employees.length; i++)
			if (maxSal<employees[i].getSalary()) {
				maxSal = employees[i].getSalary();
				n = i;
			}
		return employees[n];
	}

	public static double countAverageSalary () {
		return (double) countTotalSalary() / employees.length;
	}

	public static void FIO () {
		for (Employee employee : employees) {
			System.out.println(employee.getFIO());
		}
	}

	private static final Employee[] employees = new Employee [10];

	public static void main(String[] args) {
		SpringApplication.run(Homework18Application.class, args);
		employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 35_000);
		employees[1] = new Employee("Huxley Oldos Johny", 2, 115_000);
		employees[2] = new Employee("Roth Veronica Alexandrovna", 5, 110_000);
		employees[3] = new Employee("Petrov Petr Petrovich", 4, 48_600);
		employees[4] = new Employee("Alexandrov Alexandr Alexandrovich", 5, 120_400);
		employees[5] = new Employee("Tolstikh Nikita Jonovich", 3, 80_234);
		employees[6] = new Employee("Tolstoy Alexandr Germanovich", 2, 98_900);
		employees[7] = new Employee("Tepaykina Ekaterina Andreevna", 5, 135_700);
		employees[8] = new Employee("Vasilchuck Kseniya Vladimirovna", 4, 115_600);
		employees[9] = new Employee("Stadnikova Ol'ga Alekseevna", 1, 110_111);
		System.out.println(Arrays.toString(employees));
		employees[4].setSalary(122_400);
		System.out.println(employees[4]);
		System.out.println(countTotalSalary());
		System.out.println(findMinSal());
		System.out.println(findMaxSal());
		System.out.println(countAverageSalary());
		FIO();
	}

}
