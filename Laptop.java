public class Laptop {
    private int Ram; // ОЗУ
    private int Hdd; // Размер жесткого диска
    private String OS; // Операционная система
    private String Color; // Цвет

    public Laptop(int Ram, int Hdd, String OS, String Color) {
        this.Ram = Ram;
        this.Hdd = Hdd;
        this.OS = OS;
        this.Color = Color;

    }

    // Геттеры
    public int getRam() {
        return Ram;
    }

    public int getHdd() {
        return Hdd;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return Color;
    }

    // Сеттеры
    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public void setHdd(int Hdd) {
        this.Hdd = Hdd;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "ОЗУ: " + Ram + 
        " Размер жесткого диска: " + Hdd + 
        " Операционная система: " + OS + 
        " Цвет: " + Color;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) {
    //         return true;
    //     }
    //     if (obj == null || getClass() != obj.getClass()) {
    //         return false;
    //     }
    //     Laptop laptop = (Laptop) obj;
    //     return (Ram == laptop.Ram)
    //     && (Hdd == laptop.Hdd)
    //     && (OS.equals(laptop.OS))
    //     && (Color.equals(laptop.Color));
    // }

    // @Override
    // public int hashCode() {

    //     return Object.hash(Ram, Hdd, OS, Color);
    // }

}