
public class Statue {

    //ông chủ bảo mặc định tạo cho tao tượng hình con thỏ màu trắng 15cm bằng thạch cao
    public String Material = "thach cao";
    public String Shape = "con tho";
    public String Color = "mau trang";
    public int Height = 15;
    public int Quantity;
    public Statue() {
    }
    
    public Statue(int quantity) {
        Quantity = quantity;
    }

    public Statue(String material, String shape, String color, int height, int quantity){
        Material = material;
        Shape = shape;
        Color = color;
        Height = height;
        Quantity = quantity;
    }
    public String getMaterial() {
        return Material;
    }
    public void setMaterial(String material) {
        Material = material;
    }
    public String getShape() {
        return Shape;
    }
    public void setShape(String shape) {
        Shape = shape;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public int getHeight() {
        return Height;
    }
    public void setHeight(int height) {
        Height = height;
    }
    
    @Override
    public String toString() {
        return "Produce statue: " + Quantity + " cai ' " +  "bang` " + Material + " hinh` " + Shape  + " mau` " + Color + " cao " + Height + " cm";
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
