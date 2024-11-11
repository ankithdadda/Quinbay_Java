import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;

class Student{
    int id;
    String name;
    double cgpa;
    
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCGPA(){
        return cgpa;
    }
}

class Priorities{
    public List<Student> getStudents(List<String> events){
        LinkedList<Student> pq = new LinkedList<Student>(); 
  
        for(int i=0;i<events.size();i++){
            String[] entry = events.get(i).split("\\s+");
            
            if(entry[0].equals("ENTER")){

                Student s = new Student(Integer.parseInt(entry[3]), entry[1], Double.parseDouble(entry[2]));
                pq.add(s);
            }
            
            else if(entry[0].equals("SERVED")){
                Collections.sort(pq, new CompareStudents());
                try{pq.removeFirst();}catch(Exception e){};
            }
        }
        return pq;
    }
}

class CompareStudents implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.cgpa<s2.cgpa){
            return 1;
        }
        if(s1.cgpa>s2.cgpa){
            return -1;
        }
        if(s1.name.compareTo(s2.name)!=0){
            return s1.name.compareTo(s2.name);
        }
       
        if(s1.id<s2.id){
            return -1;
        }
        if(s1.id>s2.id){
            return 1;
        }
        return 0;
    }
}

public class priorityQueue{ {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}