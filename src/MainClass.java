import java.util.PriorityQueue;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfEvents = scanner.nextInt();

        PriorityQueue<Student> queue = new PriorityQueue<>(noOfEvents,new StudentComparator());

        for(int i=0 ; i<= noOfEvents ; i++ ) {
            String inputString = scanner.nextLine();
            String[] parts = inputString.split(" ");

            Student s = new Student();
                  if(parts[0].equalsIgnoreCase("Enter")) {
                    s.setName(parts[1]);
                    s.setToken(Integer.parseInt(parts[3]));
                    s.setCGPA(Double.parseDouble(parts[2]));
                    queue.add(s);
                }else {
                    queue.poll();
                }
        }
        if(queue.isEmpty())
        {System.out.println("EMPTY");  return;}
        while(!queue.isEmpty())
        System.out.println(queue.poll().getName());
    }
}
