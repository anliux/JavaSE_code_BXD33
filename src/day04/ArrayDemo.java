class ArrayDemo 
{
	public static void main(String[] args) 
	{
		//数组定义，return，void，加法，误区，重载
		
		/*
		
		数组的定义方式：
		元素类型[] 数组名 = new 元素类型[元素个数或数组长度];
		好处：数组可以存储多个数据，而且可以对数据进行编号。
			  从0开始。操作元素完成可以通过编号(索引)完成。
		
		*/
		
		int [] arr = new int[3];
		//通过new关键字创建一个长度为3，数组元素类型为int的数组实体。
		
		/*
		java对内存空间的划分：栈，堆，方法区，本地方法区，寄存器

		栈内存：存储的都是局部变量（只要在方法中定义的变量都是局部变量）
			特点：一旦变量的生命周期结束，该变量就被释放。

		堆内存：存储的都是实体(对象)-凡是new创建的都在堆里。
			特点：每一个实体都有一个首地址值
				  堆内存中的变量都有默认初始化值，不同类型不一样
					int-0 double-0 boolean-false char-'\u0000'
				  当实体不再使用时，就会被垃圾回收机制回收。
				    (java中非常优秀的垃圾管理机制-忘记清，则内存溢出，程序死掉)
		
		
		
		*/
		
		System.out.println(arr[0]);
	}
}
