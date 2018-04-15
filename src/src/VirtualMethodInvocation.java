package src;

class VirtualSuperClass {
    
    String supString = "supString";
    
    public void showString() {
        System.out.println("SuperClass" + " " + supString);
    } 
    
    public void callToMethod() {
        showString();
    }
}

public class VirtualMethodInvocation extends VirtualSuperClass{
    
    String subString = "subString";

    @Override
    public void showString() {
        System.out.println("SubClass" + " " + subString);
    }
    
    public static void main(String[] args) {
        VirtualSuperClass instance = new VirtualMethodInvocation();
        instance.showString(); //Elige el método sobrescrito, en tiempo de ejecución
        System.out.println(instance.supString); //Desconoce la variable de la subclase
        instance.callToMethod(); //Ejecuta el método de la subclase
    }
}
