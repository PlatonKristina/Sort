package sortirovka;

public class BubbleSort {

	public static void main(String[] args) {
		
		//Создаем массив случайных чисел
		
		int arr[] = new int[10];
		System.out.print("\nМассив до сортировки: \n");
		
		for(int i = 0; i <  arr.length; i++) 
		{
			arr[i] =  (int)(Math.random() * 50);
			
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\nМассив после сортировки: \n");

		//Сортируем массив
		for(int i = arr.length-1 ; i > 0 ; i--)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if( arr[j] > arr[j+1] )
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		//Выводим отсортированный массив на консоль.
		for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
