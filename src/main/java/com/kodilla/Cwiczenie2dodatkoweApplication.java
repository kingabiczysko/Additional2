package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;


@SpringBootApplication
public class Cwiczenie2dodatkoweApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cwiczenie2dodatkoweApplication.class, args);

		String pairLeft[] = new String [5];
		String pairRight[] = new String [5];
		String pair[] = new String [5];

		pairLeft[0] = "john";
		pairLeft[1] ="john";
		pairLeft[2] = "john";
		pairLeft[3] = "mary";
		pairLeft[4] = "mary";

		pairRight[0]= "tom";
		pairRight[1] = "mary";
		pairRight[2] = "tom";
		pairRight[3] = "anna";
		pairRight[4] = "anna";



		HashSet<String> names = new HashSet<String>();


		for(int i=0;i<pairLeft.length;i++)
		{

			pair[i] = pairLeft[i] +" "+ pairRight[i];

			System.out.print(pair[i] + " ");

			names.add(pair[i]);

			System.out.println(names.size());


		}

	}
}
