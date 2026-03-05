package sealedExample;

interface S5{
    void s5();
    //functional interface 
    public static void main(String [] args){
        S5 s=new S5(){
            @Override
            public void s5(){
                System.out.println("called");
            }
        };
        s.s5();
    }
    
}