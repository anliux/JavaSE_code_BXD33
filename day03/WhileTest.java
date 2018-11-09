class WhileTest 
{
	public static void main(String[] args) 
	{
		//While语句练习：
		/*
		
		需求1：显示1-10
		
		*/
		int x = 10;
		while(x>0){
			System.out.println(x);
			x--;		
		}
		
		/*
		需求2：求1-100的和

		思路：1+2+3+4
			   3+3
			    6+4..
			  每次重复的都是和+下一个数

			  和是确定的吗？不确定，需要变量。
			  下一个数是确定的吗？不确定，需要变量。

			  和+下一个数在重复，说明需要执行多次，用循环。

			  下一个数是有规律的，用自增。

		步骤：1、定义变量。一个记录和，一个记录下一个数。
			  2、需要循环结构。
			  3、循环中需要进行和+下一个数的运算。并让下一个数自增。
		
		代码：

		测试：无误。


		*/
		
		//1、定义变量。一个记录和，一个记录下一个数。
		int i = 1;
		int sum = 0;

		//2、需要循环结构。
		while (i<=100)
		{
			//3、循环中需要进行和+下一个数的运算。并让下一个数自增。
			sum = sum + i;
			i++;

		}
		System.out.println("1+2+...+100="+sum);
	}
}
