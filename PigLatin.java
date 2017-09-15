class PigLatin{
  static String string1 = "apple";
  static String string2 = "code";
  static String string3 = "hippo";

  public PigLatin(){}

  public static void convert(String input){
    String suffix = "", prefix = "";

    if(isVowel(input.charAt(0))){
      suffix = "way";
      prefix = input;
    }
    else{
      suffix = input.charAt(0) + "ay";
      prefix = input.substring(1);
    }
    System.out.println(input + " becomes " + prefix + suffix);
  }

  public static boolean isVowel(char a){
    char A = Character.toUpperCase(a);
    if(A == 'A' || A == 'E' || A == 'I' || A == 'O' || A == 'U'){
      return true;
    }
    else{
      return false;
    }
  }

  public static void main(String args[]){
    PigLatin pig = new PigLatin();
    pig.convert(string1);
    pig.convert(string2);
    pig.convert(string3);
  }
}
