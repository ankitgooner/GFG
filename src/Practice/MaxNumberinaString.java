package practice;

import java.util.Scanner;

public class MaxNumberinaString {


	public static void main(String a[]){

		Scanner in= new Scanner(System.in);
		int num=Integer.parseInt(in.nextLine().trim());

		for(int i=0;i<num;i++){
			int max=Integer.MIN_VALUE;
			String word=in.nextLine();
			String tempo="";
			for(int j=0;j<word.length();j++){
				char temp=word.charAt(j);

				if(temp >='0'&& temp <='9' ){
					tempo+=temp;
					if((tempo.length())!=0){
						if(Integer.parseInt(tempo)>max){
							max=Integer.parseInt(tempo);

						}

					}
				}
				else{

					tempo="";	

				}

			}
			System.out.println(max);
		}

	}
}
