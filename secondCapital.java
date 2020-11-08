
public class secondCapital {
	
	// Using the convert() in this example we are making sure first letter in new word is capitalized. this could be used for when inputed forms people are lazy and just put lower case for all and you need both first and last name capital for professionalism
	static String convert(String fullName)
    {
 
               char ctc[] = fullName.toCharArray();
        for (int i = 0; i < fullName.length(); i++) {           
 if (i == 0 && ctc[i] != ' ' || ctc[i] != ' ' && ctc[i - 1] == ' ')
 {
 if (ctc[i] >= 'a' && ctc[i] <= 'z') {
 
    ctc[i] = (char)(ctc[i] - 'a' + 'A');
 } }
 }
String changetoCapital = new String(ctc);
return changetoCapital;
}
 public static void main(String[] args)
{
        String fullName = "firstname lastname";
        System.out.println(convert(fullName));
    }
}

// I run into older forms that get submitted with only line for full name. Most of time all lower case, so the convert method helps capitalize the first letter in each word.