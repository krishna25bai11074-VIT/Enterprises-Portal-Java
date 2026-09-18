import java.util.ArrayList;
import java.util.List;

public class Data {
    public static class Record {
        private String name;
        private String prod;
        private double price;
        private double gstP; // GST Percentage
        private double gstR; // GST Rate

        public Record(String name, String prod, double price, double gstP, double gstR) {
            this.name = name;
            this.prod = prod;
            this.price = price;
            this.gstP = gstP;
            this.gstR = gstR;
        }

        public String getName() { return name; }
        public String getProd() { return prod; }
        public double getPrice() { return price; }
        public double getGstP() { return gstP; }
        public double getGstR() { return gstR; }
    }

    public static List<Record> Info = new ArrayList<>();

    static {
        Info.add(new Record("Krishna", "Lenovo LOQ", 180000, 18, 32400));
        Info.add(new Record("Aashutosh", "HP Omnibook", 105000, 18, 18900));
        Info.add(new Record("Ravi", "Gaming Keyboard", 35000, 12, 4200));
        Info.add(new Record("Bhavya", "RC BMW", 50000, 32, 16000));
        Info.add(new Record("Ishant", "Barbie Doll", 65000, 18, 11700));
    }
}
