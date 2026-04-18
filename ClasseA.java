public class ClasseA {
    
    private int a1;
    private float a2;

    public ClasseA(){
        a1 = 0;
        a2 = 0;
    }

    public int getA1(){

        return a1;

    }

    public float getA2(){

        return a2;

    }

    public void setA1(int valor){

        a1 = valor;

    }

    public void setA2(float valor){

        a2 = valor;

    }

    public void MA1(){


        System.out.println("MA1");

    }

     public void MA2(){


        System.out.println("MA2");

    }

    public int getSoma (int a, int b) {

        return a + b;
        
    }

}
