public class GenericMethod {


    public static <T,V> Object getValue(T value, V val)
    {
        return value;
    }
    public static void main(String[] args) {
        System.out.println(getValue("Hello ","Bhai"));
    }
}


//What if there is need to make a method generic insted of a class 