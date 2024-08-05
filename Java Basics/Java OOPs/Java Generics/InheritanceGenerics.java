public class InheritanceGenerics {
    public static void main(String[] args) {
        // colorPrint  cs = new colorPrint();
        // cs.setValue("Sea Green Actually");


        // System.out.println(cs.getValue());



        Pair<String,Integer>  pair = new Pair<>("Awanish",1);
            pair.printPairs();
    }
}


// class Print<T>
// {
//     T value;

//     public void setValue(T value)
//     {
//         this.value  = value;
//     }

//     public void getValue()
//     {
//         System.out.println("Key = " + this.key + "Value = " + this.value);
//     }
    

// }


// class colorPrint extends Print<String> {



// }


//Generics with more than one Data type 


class Pair<k,v>
{
    private k key;
    private v value;


    Pair(k key, v value)
    {
        this.key = key;
        this.value = value;
    }

    public Object  getKey()
    {
        return this.key;
    }
    public Object  getValue()
    {
        return this.value;
    }


    public void  printPairs()
    {
    System.out.println("Key = " + this.getKey() + "  ,Value  = " + this.getValue());    
    
    }

}