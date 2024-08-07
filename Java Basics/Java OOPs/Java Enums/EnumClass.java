public class EnumClass{

    public static void main(String[] args) {
        

        System.out.println("Helllo");

        for(EnumSample sample : EnumSample.values())
        {
            //Ordinal return the Indexes of the variables like an array Indexing
            System.out.println(sample.ordinal());
            //.values() provide the values of the class 
            System.out.println(sample);
        }
    }
}


enum EnumSample{

MONDAY,
TUESDAY,
WEDNESDAY;

}