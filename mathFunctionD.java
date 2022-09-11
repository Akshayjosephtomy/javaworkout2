class mathFunction {
    float c;
    void multiply(int a,int b){
        c=a*b;
        System.out.println(a+" * "+b+" = "+c);
    }
    void multiply(float a,float b){
        c=a*b;
        System.out.println(a+" * "+b+" = "+c);
    }
    void multiply(float a,int b){
        c=a*b;
        System.out.println(a+" * "+b+" = "+c);
    }
}
class mathFunctionD{
    public static void main(String args[]){
        mathFunction f=new mathFunction();
        f.multiply(3,9);
        f.multiply((float)3.5,(float)8.5);
        f.multiply((float)3.5,9);
    }
}