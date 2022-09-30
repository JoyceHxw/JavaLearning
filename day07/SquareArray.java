import java.util.Scanner;

class SquareArray{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int number = scan.nextInt();
        int[][] arr= new int[number][number];

        int count=0;
        int maxX = number - 1; // x轴的最大下标
		int maxY = number - 1; // Y轴的最大下标
		int minX = 0; // x轴的最小下标
		int minY = 0; // Y轴的最小下标
        
        //先赋值
        while (minX <= maxX) {
			for (int x = minX; x <= maxX; x++) {
				arr[minY][x] = ++count;
			}
			minY++;
			for (int y = minY; y <= maxY; y++) {
				arr[y][maxX] = ++count;
            }
			maxX--;
			for (int x = maxX; x >= minX; x--) {
				arr[maxY][x] = ++count;
			}
			maxY--;
			for (int y = maxY; y >= minY; y--) {
				arr[y][minX] = ++count;
			}
			minX++;
		}
        //最后遍历
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				String space = (arr[i][j] + "").length() == 1 ? "0" : "";
				System.out.print(space+ arr[i][j] + " ");
			}
			System.out.println();
        }

        
    }
}