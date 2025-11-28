class SessionFactory{
    private static SessionFactory factory = null;
    private SessionFactory(){

    }
    public static SessionFactory getFactory(){
        if(factory == null)
         factory = new SessionFactory();
        return factory; 
    }
}
class TestMain{
    public static void main(String args[]){
        SessionFactory factory1 =  SessionFactory.getFactory();
        SessionFactory factory2 = SessionFactory.getFactory();
        
        System.out.println(factory1);
        System.out.println(factory2);
    }
}