import java.time.LocalDate;

public class Person {
    //trong 1 class có 2 cái gì chính bao gồm: thuộc tính(properties/attributes) và phương thức(method/function)
    //public/private là phạm vi truy cập 
    //String/int/LocalDate là kiểu dữ liệu
    //Name/Age/DateOfBirth là tên thuộc tính
    public String Name;
    public int Age;
    private LocalDate  DateOfBirth;
    //hàm khởi tạo
    //tên hàm khởi tạo == trùng với tên lớp
    //truyền(đổ) tham số tương ứng với thuộc tính vào
    public Person(String name, int age, LocalDate  dateOfBirth){
        Name = name;
        Age = age;
        DateOfBirth = dateOfBirth;
    }
    public String getName(){
        return this.Name;
    }    
    public int getAge(){
        return this.Age;
    }
    public LocalDate  getDateOfBirth(){
        return this.DateOfBirth;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void setAge(int age){
        this.Age = age;
    }
    public void setDateOfBirth(LocalDate  dateOfBirth){
        this.DateOfBirth = dateOfBirth;
    }
    @Override
    public String toString(){
        return this.Name + " is " + this.Age + " because he/she was born in " + this.DateOfBirth;
    }
}
