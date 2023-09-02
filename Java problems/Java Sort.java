import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution
{
    static class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }


    public static List<Student> sortStudents(List<Student> studentList){
        for(int i = 0; i < studentList.size(); i++){
            for(int j = i + 1; j < studentList.size(); j++){
                if(studentList.get(j).getCgpa() > studentList.get(i).getCgpa()){
                    Collections.swap(studentList, i, j);
                }
            }  
        }
        return studentList;
    }
    
    public static void streamSortStudents(List<Student> studentList){
        /*return studentList.stream()
                .sorted(Comparator.comparing(Student::getCgpa)
                    .reversed()
                    .thenComparing(Student::getFname)
                    .thenComparing(Student::getId))
                .collect(Collectors.toList());*/
                
        Collections.sort(studentList,  
                        Comparator.comparing(Student :: getCgpa)
                        .reversed()
                        .thenComparing(Student :: getFname)
                        .thenComparing(Student :: getId));
                        
    }

//Complete the code

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
        streamSortStudents(studentList);
        
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}




