class RandomDifferent{
    public static void main(String[] args){
        int[] array=new int[6];
        boolean isFlag=false;

        array[0]= (int)(Math.random()*10+1);
        System.out.println(array[0]);

        for(int i=1; i<array.length;i++){
            do{
                array[i]=(int)(Math.random()*10+1);
                for(int j=0; j<i; j++){
                    if(array[i]==array[j]){
                        isFlag=true;
                        break;
                    } else{
                        isFlag=false;
                    }
                }
            } while(isFlag);
        
        System.out.println(array[i]);
        }
    }
}