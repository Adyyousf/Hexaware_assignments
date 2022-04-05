public class DemoApp{
    public static void main(String ar[]){
        System.out.println("Hello World from Java....");
        DemoApp obj=new DemoApp();
        obj.sayHello();
        sayBye();
    }
    public void sayHello(){
        System.out.println("Hello All...");
    }
    public static void sayBye(){
        System.out.println("Bye Everybody..");
    }
}