import java.util.*;
class Student{
    private int id;
    private String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return id+"  "+name;
    }
}
class TestMain{
    public static void main(String args[]){
        LinkedHashMap<String,ArrayList<Student>> lhm = new LinkedHashMap<String,ArrayList<Student>>();
        Student s1 = new Student(1,"Atul");
        Student s2 = new Student(2,"Ankita");
        Student s3 = new Student(3,"Nikita");
        Student s4 = new Student(4,"Ishu");
        Student s5 = new Student(5,"Shree");

        ArrayList<Student> list1 = new ArrayList<Student>();
        list1.add(s1);
        list1.add(s2);

        ArrayList<Student> list2 = new ArrayList<Student>();
        list2.add(s3);
        list2.add(s4);

        ArrayList<Student> list3 = new ArrayList<Student>();
        list3.add(s3);

        lhm.put("Java",list1);
        lhm.put("MERN",list2);
        lhm.put("Android",list3);
        for(Map.Entry<String,ArrayList<Student>> entry : lhm.entrySet()){
           System.out.println(entry.getKey());
            ArrayList<Student> al =  entry.getValue();
            for(Student ss :  al)
              System.out.println(ss);
            System.out.println("===========================");
        }
        /*
        Set<Map.Entry<String,ArrayList<Student>>> s = lhm.entrySet(); 
        Iterator<Map.Entry<String,ArrayList<Student>>> itr =  s.iterator();

        while(itr.hasNext()){
            Map.Entry<String,ArrayList<Student>> entry =  itr.next();
            System.out.println(entry.getKey());
            ArrayList<Student> al =  entry.getValue();
            for(Student ss :  al)
              System.out.println(ss);
            System.out.println("===========================");  
        }
        */
    }
}




















