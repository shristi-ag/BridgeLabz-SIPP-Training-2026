package Scenariobased;

class AnsNotFoundException extends Exception{
    String ans[];
    public AnsNotFoundException(String ){
        this.ans=an;
    }
    @Override
    public String getMessage(){
        return ans;
    }
}