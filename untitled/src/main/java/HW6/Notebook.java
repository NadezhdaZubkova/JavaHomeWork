package HW6;

public class Notebook {

    String brand;
    String model;
    int ram;
    int hardDisk;
    String operatingSystem;
    String color;


    public Notebook(String brand, String model, int ram, int hardDisk, String operSystem, String color){
        this.brand = brand.toUpperCase();
        this.model = model.toUpperCase();
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operatingSystem = operSystem.toUpperCase();
        this.color = color.toLowerCase();
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getRam() {
        return ram;
    }
    public int getHardDisk() {
        return hardDisk;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String getColor() {
        return color;
    }


    //Вывод в консоль
    public String showInfo(){
        System.out.printf("Производитель: %s\tМодель: %s\tОЗУ(Гб): %d\tОбъем жесткого диска(Гб): %d\t" +
                        "ОС:%s\tЦвет: %s\t",brand,model,ram,hardDisk,operatingSystem,color);
        return ".";
    }

    @Override
    public String toString() {
        return (String.format("Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\n" +
                        "ОС: %s\nЦвет: %s\n"+"\n",
                this.brand, this.model, this.ram, this.hardDisk, this.operatingSystem, this.color));
    }
}
