package com.javalec.base;

import java.util.Scanner;



import com.javalec.function.Add;
import com.javalec.multdiv.MultDiv;
//<<<<<<< HEAD


//=======
//>>>>>>> branch 'master' of https://github.com/wookhyunKim/2023-04-18-project

public class Main {

	public static void main(String[] args) {
//<<<<<<< HEAD
		// TODO Auto-generated method stub
//=======
		// 
		Scanner scanner = new Scanner(System.in);
		int first = 0;
		int second = 0;
		int pick = 0;
		int value=0;
		
		
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		first = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		second = scanner.nextInt();
		
		System.out.println("*** 원하는 결과를 선택하세요 ***");
		System.out.println("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n5. 몫과 나머지\n6. 종료");
		
		System.out.print("=======> 선택 : ");
		pick = scanner.nextInt();
		
		Add add = new Add(first,second);
		value = add.Add();
		
		System.out.println(first +  " + " + second + " = " + value);
		

		value = add.Sub();
		
		System.out.println(first +  " - " + second + " = " + value);
		
		MultDiv multDiv = new MultDiv(first,second);
		
		value = multDiv.mult();
		System.out.println(first +  " * " + second + " = " + value);
		
		value = multDiv.div();
		System.out.println(first +  " / " + second + " = " + value);
		
		
		
		

//>>>>>>> branch 'master' of https://github.com/wookhyunKim/2023-04-18-project

		
	}

}
