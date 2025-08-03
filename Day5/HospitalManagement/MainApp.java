/*Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed. */

package HospitalManagement;

import java.util.Scanner;

public class MainApp {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("============SAKTHI HOSPITAL======================");
        System.out.println("      ---------Billing------------- :");
        System.out.println("\nEnter the Patient Name : "); String pname = sc.nextLine();
        System.out.println("Record Id :"); int id = sc.nextInt(); sc.nextLine();
        System.out.println("Date of visit : "); String date = sc.nextLine();
        System.out.println("Diagnosis : "); String diag = sc.nextLine();
        

        MedicalRecord mr = new MedicalRecord();
        mr.inputRecordDetails(pname,id,date,diag);
        InPatientRecord ip = new InPatientRecord();
         OutPatientRecord op = new OutPatientRecord();
        System.out.println("Enter Type of Patient ");
        System.out.println("1. In Patient");
        System.out.println("2. Out Patient");
        int type = sc.nextInt();
        
        switch(type){
            case 1:
                ip.inputRecordDetails(pname, id, date, diag);
                System.out.println("Enter the Room Number : ");
                int roomno = sc.nextInt();
                System.out.println("Number of Day Admit : ");
                int totalDay = sc.nextInt();
                System.out.println("Room charges per Day : ");
                double amt = sc.nextDouble();
                sc.nextLine();
                 System.out.println("----------- In-Patitent Record------------");
                ip.calculateTotalCharges(roomno,totalDay,amt);
                break;
            case 2:
                op.inputRecordDetails(pname, id, date, diag);
                sc.nextLine();
                System.out.println("\nEnter the Doctor Name : "); String dname = sc.nextLine();
                System.out.println("Enter the Doctor Fees : "); double damt =sc.nextDouble();
                 System.out.println("-----------Out-Patitent Record------------");
                        op.doctorDetails(dname,damt);
                break;
            default:
                System.out.println("Invalid Type...");
                break;

        }
        
            
       

        sc.close();
   }
}

class MedicalRecord {
    int recordId; 
    String patientName;
    String dateOfVisit; 
    String diagnosis;

    public void inputRecordDetails(String name,int id,String date,String disease) {
            recordId = id;
            patientName =name;
            dateOfVisit = date;
            diagnosis =disease;
    }
    public void displayRecord() {
        System.out.println("Record Id     : "+recordId);
        System.out.println("Patient Name  : "+patientName);
        System.out.println("Date if visit : "+dateOfVisit);
        System.out.println("diagnosis     : "+diagnosis);
    }

}//class Medical Record

class InPatientRecord extends MedicalRecord{
    int roomNumber;
    int numberOfDaysAdmitted;
    double roomCharges;
    double totalCharges;
    public void  calculateTotalCharges(int roomno,int totalday,double roomcharge)  {
        roomNumber = roomno;
        numberOfDaysAdmitted = totalday;
        roomCharges = roomcharge;

        totalCharges = roomCharges * numberOfDaysAdmitted;
        displayRecord();

    }
    @Override
    public void  displayRecord()
    {
        super.displayRecord();
        System.out.println("Total Charges : "+totalCharges);
    }

}//class in

class OutPatientRecord extends MedicalRecord {
    String doctorName;
    double consultationFee;

    public void doctorDetails(String dname,double doctorFees) {
        doctorName = dname;
        consultationFee= doctorFees;
        displayRecord();
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
         System.out.println("Doctor Name     : "+doctorName);
        System.out.println("consulation fee : "+consultationFee);
    }
}