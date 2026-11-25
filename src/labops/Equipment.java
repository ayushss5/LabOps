package labops;
public class Equipment{
     final int equipmentId;
     String equipmentName;
     String category;
     static int totalEquipment;
     
     Equipment(int equipmentId, String equipmentName, String category){
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.category = category;
        totalEquipment++;
     }
     void displayDetails(){
        System.out.println("Equipment ID:"+ equipmentId);
        System.out.println("Equipment Name:"+equipmentName);
        System.out.println("Category:"+category);
     }
}
