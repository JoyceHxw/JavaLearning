package Abstract;

public class TemplateTest {
    public static void main(String[] args){
        Template t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template{
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为"+(end-start));
    }
    public abstract void code();
}

class SubTemplate extends Template{
    @Override
    public void code() {
        long s=0;
        for(int i=0; i<=1000019; i++){
            s+=i;
        }
        System.out.print(s);
    }
}