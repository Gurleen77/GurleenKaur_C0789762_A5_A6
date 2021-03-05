package GurleenKaur_C0789762_A5_A6;

import javax.swing.*;

public class Assignment_A5_A6 {

    double serviceCostPackageA;
    double serviceCostPackageB;
    double opCostStorageSmall;
    double opCostStorageLarge;
    double itemBoxesSmall;
    double itemBoxesLarge;

    public Assignment_A5_A6(double serviceCostPackageA, double serviceCostPackageB,
                            double opCostStorageSmall, double opCostStorageLarge,
                            double itemBoxesSmall, double itemBoxesLarge) {
        this.serviceCostPackageA = serviceCostPackageA;
        this.serviceCostPackageB = serviceCostPackageB;
        this.opCostStorageSmall = opCostStorageSmall;
        this.opCostStorageLarge = opCostStorageLarge;
        this.itemBoxesSmall = itemBoxesSmall;
        this.itemBoxesLarge = itemBoxesLarge;
    }

    public static void main(String[] args) {
        Assignment_A5_A6 cost = new Assignment_A5_A6(100.0, 150.0,
                                                    8.0, 20.11,
                                                    2.50,4.50);
        int j = 0;
        JOptionPane.showMessageDialog(null,"The username and password is: \n" +
                "GurleenKaur and Bal");
        while (true){
            String userName = JOptionPane.showInputDialog(
                    null,"Enter your username ");
            String userPass = JOptionPane.showInputDialog(
                    null,"Enter the password ");
            if(userName.equals("GurleenKaur") && userPass.equals("Bal")){
                JOptionPane.showMessageDialog(null,
                        "You have successfully logged in!!");
                double servicePackage = getServicePackage(100.0, 150.0);
                System.out.println(servicePackage);
                double storageOption = getStorageOption(8.0, 20.11);
                System.out.println(storageOption);
                double boxOption = getBoxOption(2.50,4.50);
                System.out.println(boxOption);
                JOptionPane.showMessageDialog(null,
                        "The total Service cost of package is $"+ servicePackage );
                JOptionPane.showMessageDialog(null,
                        "The storage total cost is $"+ storageOption );
                JOptionPane.showMessageDialog(null,
                        "The total cost of per box is $"+ boxOption );
                JOptionPane.showMessageDialog(null,
                        "The final total cost is $"+ (servicePackage + storageOption + boxOption) );
                break;
            }else{
                JOptionPane.showMessageDialog(null,
                        "Kindly, enter the correct username and password");
            }
            j+=1;
            if(j == 3){
                break;
            }
        }
    }

    private static double getBoxOption(double itemBoxesSmall, double itemBoxesLarge) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Enter the type of storage box you want (Small/Large)" +
                        "\n$" + itemBoxesSmall + " for small Storage or $" +
                        itemBoxesLarge + " for large storage");
        if(servicePackage.equalsIgnoreCase("Small")){
            return itemBoxesSmall;
        }else if(servicePackage.equalsIgnoreCase("Large")){
            return itemBoxesLarge;
        }else  {
            return 0.0;
        }
    }

    private static double getStorageOption(double opCostStorageSmall, double opCostStorageLarge) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Enter the type of storage you want (Small/Large)" +
                        "\n$" + opCostStorageSmall + " for small Storage or $" +
                        opCostStorageLarge + " for large storage");
        if(servicePackage.equalsIgnoreCase("Small")){
            return opCostStorageSmall;
        }else if(servicePackage.equalsIgnoreCase("Large")){
            return opCostStorageLarge;
        }else  {
            return 0.0;
        }
    }

    private static double getServicePackage(double costServiceA, double costServiceB) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Enter type of service you want (A/B)" +
                        "\n$" + costServiceA + " for package A or $" + costServiceB + " for package B");
        if(servicePackage.equalsIgnoreCase("A")){
            return costServiceA;
        }else if(servicePackage.equalsIgnoreCase("B")){
            return costServiceB;
        }else  {
            return 0.0;
        }
    }

}
