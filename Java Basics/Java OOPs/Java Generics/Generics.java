public class Generics{
    public static void main(String... args)
    {

        // Print p = new Print();
        // p.setPrintValue(1);

        // if((int)p.getPrintValue() == 2)
        // {
        //     System.out.println("provided Value is 1");
        // }


        Print<Integer> p = new Print<>();
        p.setValue(12);
        System.out.println("Value set is " + p.getValue());

    

    }
}


// class Print{

//     Object value;

//     public Object getPrintValue()
//     {
//         return this.value;
//     }

//     public void setPrintValue(Object value)
//     {
//         this.value = value;
//     }
// }



class Print<T>
{
    T value;

    public void setValue(T value)
    {
        this.value  = value;
    }

    public T getValue()
    {
        return this.value;
    }
    

}