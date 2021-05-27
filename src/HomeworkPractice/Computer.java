package HomeworkPractice;

public class Computer {

    public static void main(String[] args){
        String brand        = "LENOVO";
        String processor    = "ADM Ryzen 3 3200GE Radeon Vega Graphics 3.30 GHz";
        String ram          = "8 GB (7.68 GB usable)";
        String storage      =  "237GB";
        boolean hasMonitor  = true;
        boolean hasWifiCard = true;
        String description  = "A 24 inch FHD touchscreen display boasts thin, narrow bezels for a dominant viewing experience\n" +
                "Video calls and recording are made easy using a hybrid FHD RGB IR camera with physical privacy shutter\n" +
                "Certified JBL® speakers by Harman®, integrated graphics & efficient array of ports\n" +
                "Makes a great work from home or learn from home desktop PC.";
        double price          = 799.00;
        String cpu            = "1.6 GHz AMD Fusion E dual core.";
        String color          = "black";
        byte numberOfMonitors = 1;
        byte numberOfUSBSlots = 2;
        boolean hasUsb3       = true;

        System.out.println("Computer Brand : \t\t\t " + brand);
        System.out.println("Processor :\t\t\t\t\t " + processor);
        System.out.println("RAM :\t\t\t \t\t\t " + ram);
        System.out.println("Storage : \t\t\t\t\t " + storage);
        System.out.println("Has monitor?: \t\t\t\t " + hasMonitor);
        System.out.println("Has WIFI card?: \t\t\t " + hasWifiCard);
        System.out.println("Descriptions: \t\t \t\t " + description);
        System.out.println("Price:\t\t\t \t\t\t$" + price);
        System.out.println("CPU: \t\t \t\t\t\t" + cpu);
        System.out.println("color:  \t\t\t\t\t" + color);
        System.out.println("Number of monitors:\t\t\t" + numberOfMonitors);
        System.out.println("Number of USB lots: \t\t" + numberOfUSBSlots);
        System.out.println("Has USB 3.0?:\t \t\t\t" + hasUsb3);


    }
}
