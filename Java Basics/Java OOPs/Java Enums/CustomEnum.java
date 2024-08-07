public class CustomEnum{

    public static void main(String[] args) {
        

      Object a = CustomEnum1.getEnumFromValue(101);
        System.out.println(a);
    }

    
}


enum CustomEnum1{

     MONDAY(101,"Awanish");
      //TUESDAY(102,"Mansih");

    private int val;
    private String comment;

     CustomEnum1(int val, String comment) {

        this.val = val;
        this.comment = comment;
    }


        public int getValue()
        {
            return val;
        }
        public String getComment()
        {
            return comment;
        }
    
        public static CustomEnum1 getEnumFromValue(int val)
        {
            CustomEnum1 data[] = CustomEnum1.values();
            for(CustomEnum1 sample : data)
            {
                if(sample.getValue() == val){
                    return sample;
                }   
            }
            return null;
        }

}