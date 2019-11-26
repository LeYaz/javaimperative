package projet01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programme op = new Programme();
		op.atelier11();
	}
	
	public void atelier2() {
		int a = 12;
		double b = -25;
		float c = 1.256f;
		String d = "125";
		System.out.println("int : " + a + " ,double : "+ b + " ,float : " + c + " ,String : " + d);
	}
	
	public void atelier3() {
		Scanner sc = new Scanner(System.in);
		String nom, prenom;
		int age;
		System.out.println("Veuillez renseigner votre nom et valider par entrer");
		nom = sc.next();
		System.out.println("Veuillez renseigner votre prénom et valider par entrer");
		prenom = sc.next();
		System.out.println("Veuillez renseigner votre age et valider par entrer");
		age = sc.nextInt();
		System.out.println("Nom: "+ nom+" Prenom: "+ prenom+ " Age: "+age);
	}
	
	public void atelier4() {
		int a, b , result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un entier a et valider par entrer");
		a = sc.nextInt();
		System.out.println("Veuillez entrer un entier b et valider par entrer");
		b = sc.nextInt();
		result = a+b;
		System.out.println("a+b = "+ result);
		result = a-b;
		System.out.println("a-b = "+ result);
		result = a*b;
		System.out.println("a*b = "+ result);
		if(b!=0) {
			result = a/b;
			System.out.println("a/b = "+ result);
			result = a%b;
			System.out.println("a%b = "+ result);
			result = a+b-(a/b);
			System.out.println("a+b-(a/b) = "+ result);
			result = a+(b-a)/b;
			System.out.println("a+(b-a)/b = "+ result);
		}else {
			System.out.println("b=0 il es impossible de diviser par 0");
		}
		boolean comp= a==b;
		System.out.println("a==b : "+ comp);
		comp = a!=b;
		System.out.println("a!=b : "+ comp);
		comp = a>b;
		System.out.println("a>b : "+ comp);
		comp = a>=b;
		System.out.println("a>=b : "+ comp);
		comp = a<b;
		System.out.println("a<b : "+ comp);
		comp = a<=b;
		System.out.println("a<=b : "+ comp);
		
		boolean c, d;
		c= true;
		d= false;
		comp=c&&d;
		System.out.println("c&&d = " + comp);
		comp = c||d;
		System.out.println("c||d = "+ comp);
		comp=!c;
		System.out.println("!c = " + comp);
		
	}
	
	public void atelier5() {
		byte a = 127;
		short b = 32767;
		
//		a=b;
		
		System.out.println(a);
	}
	
	public void atelier6() {
		
		String s = "Chaîne de caractère";
		String s2 = new String("Une autre chaîne de caractère");
		String s3 = new String("Une chaîne de caractère");
		String s4 = "Chaîne de caractère";
		boolean comp = s==s2;
		System.out.println("s==s2 :"+ comp);
		comp= s==s3;
		System.out.println("s==s3 :"+comp);
		comp = s==s4;
		System.out.println("s==s4 :" + comp);
		System.out.println("s==s2 :" + s.equals(s2));
		System.out.println("s==s3 :"+ s.equals(s3));
		System.out.println("s==s4 :" + s.equals(s4));
		System.out.println(s.length() + s.toUpperCase() + s.indexOf("a") + s.charAt(8));
	}
	
	public void atelier7() {
		
		int a=10, b=12;
		float c = -15.253f;
		System.out.println(Math.min(a, b));
//		Math.min(a, b);
		System.out.println(Math.max(a, b));
		System.out.println(Math.abs(c));
		System.out.println(Math.random());
	}
	
	public void atelier8() {
		boolean a=true, b=false;
		byte c=1, d=2;
		
		if(a) {
			System.out.println("message bloc if test de a");
		}
		if(b) {
			System.out.println("message bloc if test de b");
		}
		if(c==d) {
			System.out.println("c==d est vrai");
		}else {
			if(c==1) {
				System.out.println("c==1 est vrai");
			}
			
			if(d==2) {
				System.out.println("d==2 est vrai");
			}
			
			System.out.println("c!=d est vrai");
		}
		
		if(c>d) {
			System.out.println("c>d");
		}else {
			System.out.println("c<d");
		}
		
		int x=5;
		
		switch(x) {
		case 1: System.out.println("x vaut 1");
		break;
		case 2: System.out.println("x vaut 2");
		break;
		case 3: System.out.println("x vaut 3");
		break;
		case 4: System.out.println("x vaut 4");
		break;
		case 5: System.out.println("x vaut 5");
		break;
		case 6: System.out.println("x vaut 6");
		break;
		
		}
	}
	
	public void atelier9() {
		int i= 0;
		while( i <6) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println("affciher se message");
		}while(false);
		
		for(int j=0;j<6;j++) {
			System.out.println(j);
		}
	}

	public void atelier10() {
		String[] tab = {"Pikachu","Salamèche","Bulbizarre","Carapuce","Racaillou"};
		Arrays.sort(tab);
		
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
		
		int index=0;
		do {
			
			System.out.println(tab[index]);
			index++;
		}while(tab.length>index);
		
		System.out.println(Arrays.binarySearch(tab, "Carapuce"));
		
		String [][] tab2 = {{"Pikachu", "Raichu"},{"Salamèche"},{"Bulbizarre"},{"Carapuce", "Tortank"}, {"Racaillou","Onyx"}};
		
		for(int i=0;i<tab2.length;i++) {
			System.out.println("tableau des évolution" +i);
			for(int j=0; j<tab2[i].length;j++) {
				System.out.println(tab2[i][j]);
			}
			System.out.println("-------");
		}
	}

	public void atelier11() {
		String pseudo;
		int rand =(int) (Math.random()*10);
		int test, essai =5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre pseudonyme");
		pseudo = sc.next();
		do {
			System.out.println("Entrer un nombre entre 1 et 10");
			test = sc.nextInt();
			
			if(rand == test) {
				System.out.println("Vous avez trouvé le nombre");
				return;
			}else {
				essai--;
				System.out.println("il vous reste "+essai+" essai");
			}
		} while(essai>0);
			System.out.println("Vous n'avez plus d'essai");
		}
		
		
		
	}


