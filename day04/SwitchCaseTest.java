class SwitchCaseTest{
    public static void main(String[] args) {
        int number = 2;
        switch(number){
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("others");
        }
    }
}
//switchcase 找到入口后一直执行下去，直到遇到break
//switch结构中的表达式的形式只能是byte,short,char,int,string,枚举类型
//case之后只能声明常量，不能申明范围
//如果多个case的执行语句相同，则可以合并