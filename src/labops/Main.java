package labops;

public class Main {
    public static void main(String[]args){
        Equipment e1 = new Equipment(101,"Transformer","Electrical");
        Equipment e2 = new Equipment(155,"Hydraulic Press", "Mechanical");
        Equipment e3 = new Equipment(178,"Concrete Mixer","Civil");
        LabUser l1 = new LabUser(7069,"Ayush","CSE DATA SCIENCE");
        LabUser l2 = new LabUser(7065,"Priyanshu","CSE DATA SCIENCE");
        l1.displayDetails();
        l2.displayDetails();
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
        System.out.println(Equipment.totalEquipment);

    }

}
