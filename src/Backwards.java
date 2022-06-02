public class Backwards {

    String str;



    Backwards(String s){
        str =s;
    }

    void backward(int idx){
        if(idx != str.length()){
            backward(idx+1);
            System.out.println(str.charAt(idx));
        }

    }

}
