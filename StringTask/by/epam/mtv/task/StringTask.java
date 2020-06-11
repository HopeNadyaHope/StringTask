package by.epam.mtv.task;

import java.util.Scanner;

public class StringTask {
	
	//////////////////GetOdd/////////////////////////
	public static String GetOdd(String source) {
		String oddStr="";
		char currentChar;

		for(int i = 0 ; i < source.length() ; i++) {
			currentChar = source.charAt(i);
			if(currentChar % 2 == 1)
				oddStr += currentChar;
		}

		return oddStr;		
	}

	
	//////////////////GetEven////////////////////////
	public static String GetEven(String source) {
		String evenStr="";
		char currentChar;

		for(int i = 0; i < source.length(); i++) {
			currentChar = source.charAt(i);
			if(currentChar % 2 == 0)
				evenStr += currentChar;
		}
		return evenStr;
	}
	
	
	//////////////////GetUpperCasePercent////////////
	public static double GetUpperCasePercent(String source) {
		if(source.isEmpty())
			return 0;
		else {
			double count;
			count = 0.0;
			char currentChar;
		
			for(int i = 0 ; i < source.length() ; i++) {
				currentChar = source.charAt(i);
				if(Character.isUpperCase(currentChar))
					count++;
			}
		double percent = count / source.length();
		return percent ;
		}
	}
	
	
	//////////////////GetLowerCasePercent////////////
	public static double GetLowerCasePercent(String source) {
		if(source.isEmpty())
			return 0;
		else {
			double count;
			count = 0.0;
			char currentChar;
		
			for(int i = 0 ; i < source.length() ; i++) {
				currentChar = source.charAt(i);
				if(Character.isLowerCase(currentChar))
					count++;
			}
		double percent = count / source.length();
		return percent ;
		}
	}
	
	
	//////////////////DeleteSame/////////////////////
	public static String DeleteSame(String source) {
		StringBuilder resultStr = new StringBuilder("");
		String currentSymbol;
		
		for(int i = 0; i < source.length(); i++) {
			currentSymbol = source.substring(i,i+1);
			if(resultStr.indexOf(currentSymbol) == -1)
				resultStr.append(currentSymbol);
		}
		return resultStr.toString();		
	}
	
	
	//////////////////CountSymbol/////////////////////
	public static int CountSymbol(String source, char find) {
		int count;
		int fromIND;
		count = 0;
		fromIND = 0;
		
		while((fromIND=source.indexOf(find,fromIND))!=-1) {
			count++;
			fromIND++;
		}		
		return count;		
	}
	
	
	/////////////////ReverseString////////////////////
	public static String ReverseString(String source) {
		StringBuilder resultStr = new StringBuilder(source);		
		return resultStr.reverse().toString();
	}
	
	
	/////////////////InsertSubstring//////////////////
	public static String InsertSubstring(String source, int index, String sub) {
		if((index >= source.length()) || (index < 0))
			return source;
		StringBuilder resultStr = new StringBuilder(source);		
		return resultStr.insert(index,sub).toString();
	}
	
	
	/////////////////DeleteSubstring//////////////////
	public static String DeleteSubstring(String source, String sub) {
		if(source.indexOf(sub)==-1)
			return source;
		return source.replace(sub,"");
	}
	
	
	/////////////////CopySubstring////////////////////
	public static String CopySubstring(String source, int start, int end) {
		if((start < 0) || (start >= source.length()-1) || (end < 0) 
				|| (end >= source.length()) || (end - start < 1))
			return source;
		return source.substring(start, end);
	}
	
	
	/////////////////CountSubstring///////////////////
	public static int CountSubstring(String source, String find) {
		int count;
		int fromIND;
		count=0;
		fromIND=0;

		while((fromIND=source.indexOf(find,fromIND))!=-1) {
			count++;
			fromIND++;
		}		
		return count;		
	}
	
	
	////////////////PrintReverseOrderOfWords//////////
	public static void PrintReverseOrderOfWords(String source) {
		String[] words = source.split("[,.!?:; ]");
		
		for(int i=words.length -1 ;i > -1;i--) {
			if(words[i].length() != 0)
				System.out.println(words[i]);
		}
		return ;
	}
	
	
	///////////////ReplaceSpace///////////////////////
	public static String ReplaceSpace(String source) {
		String withoutSpace = "";
		String[] words = source.trim().split(" +");
		
		if(source.startsWith(" "))
			withoutSpace+="*";
		
		for(int i = 0; i < words.length-1; i++) {
			withoutSpace+=words[i];
			withoutSpace+="*";
		}
		
		withoutSpace+=words[words.length-1];
		
		if(source.endsWith(" "))
			withoutSpace+="*";
		
		return withoutSpace;
	}
	
	
	////////////////GetMaxWord////////////////////////
	public static String GetMaxtWord(String source) {
		String[] words = source.split("[,.!?:; ]");		
		if(words.length==0)
			return "";
		
		int maxLength;
		int indMaxWord;
		maxLength=words[0].length();
		indMaxWord=0;
		
		for(int i=1; i<words.length; i++) {
			if(words[i].length() > maxLength) {
				maxLength=words[i].length();
				indMaxWord=i;
			}
		}		
		return words[indMaxWord];
	}
	
	
	////////////////ReplaseABInMAX////////////////////
	public static String ReplaseABInMAX(String source) {
		String maxWord = GetMaxtWord(source);
		String newMaxWord = maxWord.replaceAll("a", "b");
		
		return source.replaceAll(maxWord, newMaxWord);
	}

	
	////////////////GetMinLenght//////////////////////
	public static int GetMinLength(String source) {
		String[] words = source.trim().split("[,.!?:; +]");		
		if(words.length==0)
			return 0;
		
		int minLength;
		minLength = 0;
		int j;
		for(j=0; j<words.length; j++) {
			if(words[j].length() != 0) {
				minLength = words[j].length();
				break;
			}	
		}

		for(int i = j; i<words.length; i++) {
			if((words[i].length() != 0) && (words[i].length() < minLength)) {
				minLength=words[i].length();
			}
		}		
		return minLength;
	}
	
	
	////////////////CountWords////////////////////////
	public static int CountWords(String source) {
		String[] words = source.trim().split("[,.!?:; +]");
		int countWords;
		countWords = 0;
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() != 0)
				countWords++;
		}
		return countWords;
	}
	
	
	////////////////ChangeLastFirst////////////////////////
	public static String ChangeFirstLast(String source) {			
		String[] words = source.trim().split("[,.!?:; ]");	
		String first;
		String last;
		first ="";
		last = "";
		
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() != 0) {
				first = words[i];
				break;
			}
		}
		
		for(int i = words.length - 1; i > -1 ; i--) {
			if(words[i].length() != 0) {
				last = words[i];
				break;
			}
		}
		
		if(first.equals(last))
			return source;
		
		String rez;
		int indLast;
		
		rez = source.replaceFirst(first, last);
		indLast = rez.lastIndexOf(last);
		rez = rez.substring(0, indLast) + first  + rez.substring((indLast+last.length()));
		
		return rez;
	}
	
	
	////////////////DeleteLast////////////////////////
	public static String DeleteLast(String source) {
		String[] words = source.split("[,.!?:; +]");		

		String lastWord = "";
		for(int i = words.length-1; i > 0; i-- ) {
			if(words[i].length() != 0) {
				lastWord += words[i];
				break;
			}
		}

		int indOfLast;
		int indOfEnd;
		indOfLast = source.lastIndexOf(lastWord);		
		indOfEnd = indOfLast + lastWord.length();

		String withoutLast;
		withoutLast = source.substring(0, indOfLast) + source.substring(indOfEnd);		

		return withoutLast;
	}

	////////////////AddSpace//////////////////////////
	public static String AddSpace(String source) {		
		return " " + source + " ";
	}
	
	
	///////////////IsPolindrom////////////////////////
	public static boolean IsPolindrom(String source) {
		for(int i = 0; i < (source.length()/2); i++) {
			if(source.charAt(i) != source.charAt(source.length() - i - 1))
				return false;
		}
		return true;
	}
	
	
	///////////////ChangeSubstring////////////////////
	public static String ChangeSubstring(String source, String oldSubstring, String newSubstring) {
		return source.replace(oldSubstring, newSubstring);
	}
		
	
	////////////////DeleteFixLength////////////////////////
	public static String DeleteFixLength(String source, int fixLength) {		
		String result = new String(source);		
		String[] words = source.split("[,.!?:; ]");
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() == fixLength) {
				result = result.replace(words[i],"");
			}				
		}
		return result;
	}
	
	
	////////////////DeleteExtraSpace////////////////////////
	public static String DeleteExtraSpace(String source) {		
		String result = "";		
		String[] words = source.trim().split(" ");

		for(int i = 0; i < words.length-1; i++) {
			if(words[i].length() != 0)
				result += words[i]+" ";
		}	
		result += words[words.length-1];
		return result;
	}
	
	
	////////////////PrintWords//////////////////////////////
	public static void PrintWords(String source) {			
		String[] words = source.trim().split("[,.!?:; ]");
		
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() != 0)
				System.out.println(words[i]);
		}	
		return;
	}
	
	
	////////////////Summa//////////////////////////////////
	public static String Summa(String num1, String num2) {
		if(num1.length() > num2.length()) {
			String n1Str;
			String n2Str;
			n1Str = new String(num1);
			n2Str = new String(num2);
			
			while(n2Str.length() != n1Str.length()) {
				n2Str = "0" + n2Str;
			}
			
			n1Str = (new StringBuilder(n1Str).reverse()).toString();
			n2Str = (new StringBuilder(n2Str).reverse()).toString();
			
			String answer;
			answer = "";
			int add;
			add = 0;
			int n1;
			int n2;
			int sum;
			
			for(int i = 0; i < n1Str.length(); i++) {
				n1=Integer.parseInt(n1Str.substring(i,i+1));
				n2=Integer.parseInt(n2Str.substring(i,i+1));
				sum = n1 + n2 + add;
				
				answer += (sum % 10);
				if(sum / 10 == 1)
					add = 1;
				else
					add=0;
			}
			return (new StringBuilder(answer)).reverse().toString();
		}
		else 
			return Summa(num2, num1);
	}
	
	
//////////////////////////////////////////////////////////////////////////////
//////////////////MAIN////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println ("Input source string :");
		String sourceStr;
		//sourceStr = "Mogilev ;Nadushka naden, f jifl jf aahf";
		sourceStr = in.nextLine();
		
		System.out.println("Main String : "+ sourceStr);
		System.out.println();
		
		
		//////////////EVEN AND ODD//////////////////////////////	
		String oddStr; 
		String evenStr;
		oddStr= GetOdd(sourceStr);
		evenStr = GetEven(sourceStr);
		
		System.out.println("Only odd :" + oddStr);
		System.out.println("Only even :" + evenStr);
		System.out.println();
		
		
		///////////////PERCENT OF LOW AND UPPER CASE////////////
		double upperCasePercent; 
		double lowerCasePercent;
		upperCasePercent = GetUpperCasePercent(sourceStr);
		lowerCasePercent = GetLowerCasePercent(sourceStr);
		
		System.out.println("Persent of UpperCase : " + upperCasePercent);
		System.out.println("Persent of LowerCase : " + lowerCasePercent);
		System.out.println();
		
		
		///////////////DELITE SAME/////////////////////////////
		String deleteSame;
		deleteSame = DeleteSame(sourceStr);
		
		System.out.println("Delete same : " + deleteSame);
		System.out.println();
		
		
		///////////////COUNT SYMBOL////////////////////////////
		System.out.print("Input symbol for counting: ");
		char symbol;
		symbol = in.next().charAt(0);
		int countSybmol;
		countSybmol = CountSymbol(sourceStr,symbol);
		
		System.out.println("countOfSymbol : "+ countSybmol);
		System.out.println();
		
		
		///////////////REVERSE STRING//////////////////////////
		String reverse;
		reverse = ReverseString(sourceStr);
		
		System.out.println("Reverse String : "+ reverse);
		System.out.println();
		
		
		///////////////INSERT Substring////////////////////////
		System.out.print("Input substring to insert: ");
		String insertSubstring;
		insertSubstring = in.next();
		
		System.out.print("Input index to insert : ");
		int indexInsert;
		indexInsert = in.nextInt();
				
		String insertStr;
		insertStr = InsertSubstring(sourceStr, indexInsert, insertSubstring);
		
		System.out.println("Insert String : " + insertStr);
		System.out.println();
		
		
		///////////////DELETE Substring////////////////////////
		System.out.print("Input substring to delete : ");
		String deleteSubstring;
		deleteSubstring = in.next();
		
		String deleteStr;
		deleteStr = DeleteSubstring(sourceStr, deleteSubstring);
		
		System.out.println("Delete Substring : " + deleteStr);
		System.out.println();
		
		
		///////////////COPY Substring////////////////////////
		System.out.print("Input start index to copy : ");		
		int startInd;		
		startInd = in.nextInt();
		
		System.out.print("Input end index to copy : ");
		int endInd;
		endInd = in.nextInt();
		
		String copyStr;
		copyStr = CopySubstring(sourceStr, startInd, endInd);
		
		System.out.println("Copy Substring : " + copyStr);
		System.out.println();
		
		
		///////////////LENGTH////////////////////////////////
		int len;
		len= sourceStr.length();
		System.out.println("Length of String : " + len);
		System.out.println();
		
		
		///////////////COUNT Substring////////////////////////
		System.out.print("Input substring for counting : ");
		String countedSubstring;
		countedSubstring = in.next();
		
		int countSubstring;
		countSubstring= CountSubstring(sourceStr,countedSubstring);
		
		System.out.println("countOfSubstring : "+ countSubstring);
		System.out.println();
		

		///////////////REVERSE WORDS///////////////////////////
		System.out.println("ReverseOrderOFWords : ");
		PrintReverseOrderOfWords(sourceStr);
		System.out.println();

		
		///////////////REPLASE a-b///////////////////////////
		String replaseAtoB = ReplaseABInMAX(sourceStr);
		System.out.println("Replase a to b : " + replaseAtoB);
		System.out.println();

		
		///////////////MIN LENGTH///////////////////////////
		int minLength = GetMinLength(sourceStr);
		System.out.println("Min length : " + minLength);
		System.out.println();
		
		
		/////////////COUNTING WORDS/////////////////////////
		int countWords = CountWords(sourceStr);
		System.out.println("countOfWords : "+ countWords);
		System.out.println();
		
		
		////////////////CHANGE FIRST AND LAST////////////////////////	
		String changeFirstAndLast;
		changeFirstAndLast = ChangeFirstLast(sourceStr);
		System.out.println("Change First and Last : " + changeFirstAndLast);
		
		
		///////////////DELETE LAST//////////////////////////////		
		String withoutLast = DeleteLast(sourceStr);
		System.out.println("Delete Last : "+ withoutLast);
		System.out.println();
		
		
		///////////////REPLACE SPACE///////////////////////////
		String replaceSpace = ReplaceSpace(sourceStr);
		System.out.println("Replase Spase : " + replaceSpace);
		System.out.println();
		
		
		///////////////IS POLINDROM//////////////////////////////
		boolean isPolindrom = IsPolindrom(sourceStr);
		System.out.println("Is Polindrom : "+ isPolindrom);
		System.out.println();
		

		///////////////CHANGE Substring//////////////////////////////
		System.out.print("Input old substring : ");		
		String oldSubstring;
		oldSubstring = in.next();
		
		System.out.print("Input new substring : ");
		String newSubstring;
		newSubstring = in.next();		
		
		String changedSubstring = ChangeSubstring(sourceStr,oldSubstring, newSubstring);
		
		System.out.println("Change Substring : "+ changedSubstring);
		System.out.println();


		///////////////DELETE FIX LENGTH//////////////////////////////	
		System.out.print("Input length to delete : ");
		int fixLength;
		fixLength = in.nextInt();
		
		String withoutFixLength = DeleteFixLength(sourceStr, fixLength);
		
		System.out.println("Delete with length "+fixLength+" : "+ withoutFixLength );
		System.out.println();
		
		
		
		////////////////DELETE EXTRA SPACE////////////////////////	
		String withoutExtraSpace;
		withoutExtraSpace= DeleteExtraSpace(sourceStr);
		
		System.out.println("Delete extra space : "+ withoutExtraSpace );
		System.out.println();

		
		////////////////PRINT WORDS////////////////////////	
		System.out.println("Print words : ");
		PrintWords(sourceStr);		
		System.out.println();
		
		
		////////////////SUMMA////////////////////////	
		System.out.print("Insert num1 : ");
		String num1;
		num1 = in.next();
		
		System.out.print("Insert num2 : ");
		String num2;
		num2 = in.next();
		
		String sum;
		sum = Summa(num1,num2);
		System.out.println("Summa : "+ sum);
		
		
		in.close();
	}

}
