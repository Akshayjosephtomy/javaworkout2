public class NoOfInstance {

    static int count = 0;
    {
        count += 1;
    }

    public static void main(String[] args) {
        
        NoOfInstance i1 = new NoOfInstance(); 
        NoOfInstance i2 = new NoOfInstance(); 
        NoOfInstance i3 = new NoOfInstance(); 
        System.out.println("No Of Instances="+count);
    }
    
}  
