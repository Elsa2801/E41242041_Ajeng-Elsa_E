
package person.java;

public class ManagingPeople {
    public static void main(String[] args) {
        PersonJava p1 = new PersonJava("Arial", 37);
        PersonJava p2 = new PersonJava("Joseph", 15);
        
        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
}
