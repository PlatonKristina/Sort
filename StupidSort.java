package sortirovka;

public class StupidSort {

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
		int i = 0;
		int n = arr.length - 1;

		while (i < n)
		{
			if (arr[i+1] < arr[i])
			{
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;

				i = 0;
			} else 
			{
				i++;
			}
		}
		
		//Выводим отсортированный массив на консоль.
		for(int j = 0; j <  arr.length; j++) {
			System.out.print(arr[j] + "  ");
		}
	}
}

