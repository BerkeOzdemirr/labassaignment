import org.w3c.dom.Node;

import java.util.*;
//Node class
public class patient {
    int id;
    String name;
    int severity; //severity means level of illness(1-10)
    int age;
    patient next;
    //constructor
    patient() {
        id = 0;
        name = "";
        severity = 0;
        age = 0;
        next = null;
    }
}
class patientList{
    patient head;

    /*
    Example:
    head → [10 | •] → null
    current → [10 | •]
    Adding new node:
    newNode = [20 | null]
    current.next = newNode; → 10 of next show 20 now.
    */

    //adding patients to the list
    public void addPatient(int id, String name, int severity, int age){
        patient pat = new patient();
        //that "if" is checking whether list is empty or not
        if (head ==null){
            head = pat;
        }else{
            patient temp = head;
            while (temp.next != null && temp.next.id < pat.id){
                temp = temp.next;
            }                      //to be honest that part was hard to understand
            pat.next = temp.next; // temp.next will show the next element of the next
            temp.next = pat;    //then current element.next will show temp (new element)
        }
    }
    //removing patients by id
    public void removePatient(int id) {
        if (head == null) {
            System.out.println("Patient list is empty!");
        }
        if (head.id == id) {
            System.out.println("Removing patient with id " +id + head.name);
            head = head.next;
        }
        patient temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        //if id does not exist
        if (temp.next != null) {
            System.out.println("Patient with id " + id + " has been not found!");
        }
    }
    //seeking elements
    public void findPatient(){
        if (head ==null){
            System.out.println("Patient list is empty!");
        }else {
             System.out.println("Patient name is: " + head.name + "Patient id is: "+ head.id);
        }
    }
    //printing all elements
    public void printList(){
        patient temp = head;
        while(temp == null && temp != null){
            System.out.println(temp.id + " " + temp.name + " " + temp.severity + " " + temp.age + " ");
            temp = temp.next;
        }
    }
}