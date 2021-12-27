package Implementation;

public class AppendAndDelete {
  public static void main(String args[]){
    System.out.println(appendAndDelete("abc", "def", 6));               // YES
    System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));// YES
    System.out.println(appendAndDelete("aba", "aba", 7));               // YES
    System.out.println(appendAndDelete("ashley", "ash", 2));            // NO
    System.out.println(appendAndDelete("y", "yu", 2));                  // NO
    System.out.println(appendAndDelete("abcd", "abcdert", 10));         // NO
    System.out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));     // NO
    System.out.println(appendAndDelete("asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv",
    "bsdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", 100));  // No
    System.out.println(appendAndDelete("zzzzz", "zzzzzzz", 4));         // YES
    System.out.println(appendAndDelete("aaaaaaaaaa", "aaaaa", 7));         // YES
  }

  public static String appendAndDelete(String s, String t, int k){
    int matches = 0;
    while(matches < Math.min(s.length(), t.length()) && s.charAt(matches) == t.charAt(matches)){matches++;}
    if(s.length() + t.length() - (matches * 2) > k){return "No";}
    else if((s.length() + t.length() - (matches * 2)) % 2 == k % 2){return "Yes";}
    else if(s.length() + t.length() - k < 0){return "Yes";}
    return "No";
  }

}
