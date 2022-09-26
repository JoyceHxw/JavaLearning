package project02;

public class Customer {
    private String name;
    private String gender;
    private int age;
    private String phone;
    private String email;

    public Customer(){
    }

    public void setName(String name){
        this.name=name;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
}
