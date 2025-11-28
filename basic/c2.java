class Address implements Cloneable{
    private int houseNo;
    private String city;
    public Address(int houseNo, String city){
        this.houseNo = houseNo;
        this.city = city;
    }
    public int getHouseNo(){
        return houseNo;
    }
    public String getCity(){
      return city;
    }
    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Student implements Cloneable{
    private int id;
    private int age;
    private String name;
    private Address addr;
    public Student(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public void setAddr(Address addr){
        this.addr = addr;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public Address getAddr(){
       return addr;
    }
    public Object clone() throws CloneNotSupportedException{
        Student student = (Student)super.clone();
        Address address = student.getAddr();
        Address newAddress = new Address(address.getHouseNo(),address.getCity());
        student.addr = newAddress;
        return student;
    }
}
class TestMain{
    public static void main(String args[]) throws Exception{
        Address address = new Address(300,"Indore");
        Student s1 = new Student(100,23,"Atul");
        s1.setAddr(address);

        Student s2 = (Student) s1.clone();
        System.out.println(s2.getId()+"  "+s2.getName());
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        System.out.println("s1 ka address : "+s1.getAddr());
        System.out.println("s2 ka address : "+s2.getAddr());
    }
}