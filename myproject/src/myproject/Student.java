package myproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
@NoArgsConstructor	
@AllArgsConstructor
public class Student {
	private int studentId;
	private String studentName;
	private String studentCourse;
	private double studentCourseFee;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
