class SwapValue {
    int a,b;
    SwapValue(){
    }
    SwapValue(int x,int y){
        a=x;
        b=y;
    }
    void swap(int a,int b){
        System.out.println("Before Swapping: a ="+a+ " and b ="+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After Swapping: a ="+a+ " and b ="+b);
    }
    void swapref(SwapValue val){
        System.out.println("Before Swapping: a ="+a+ " and b ="+b);
        int c;
        c=val.a;
        val.a=val.b;
        val.b=c;
        System.out.println("After Swapping: a ="+val.a+ " and b ="+val.b);
    }
    public static void main(String args[]){
        SwapValue sw1=new SwapValue();
        sw1.swap(30,40);
        SwapValue sw2=new SwapValue(7,8);
        sw2.swapref(sw2);
    }
}
