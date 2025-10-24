import java.util.*;
public static void main (String[] args){
    //The name of the class and the name of the object must be the same.
    patientList patient = new patientList();
    patient.addPatient(1, "Ali", 5, 30);
    patient.addPatient(2, "Veli", 7, 40);
    patient.addPatient(3, "Mari", 8, 40);
    patient.addPatient(4,"Ayşe",3,23);
    patient.addPatient(5,"Fatma",6,60);

    patient.removePatient(3);
//    that is not an obligation but i want to try to remove someone randomly
//    patient.removePatient((int) Math.random()*5);

    //printing results
    patient.printList();

}

// For this Use this Shortcut -> CTRL + K + C
// For Undo this, Use -> CTRL + K + U