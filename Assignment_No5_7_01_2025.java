import java.util.HashMap;

public class Assignment_No5_7_01_2025 {

  // public static int integers(int num){
  //   int count = 0;
  //   while(num != 0){
  //     num = num/10;
  //     count++;
  //   }
  //   return count;
  // }

  // public static String mapOne(int num){
  //   HashMap<Integer, String> map = new HashMap<>();
  //   map.put(1, "One");
  //   map.put(2, "Two");
  //   map.put(3, "Three");
  //   map.put(4, "Four");
  //   map.put(5, "Five");
  //   map.put(6, "Six");
  //   map.put(7, "Seven");
  //   map.put(8, "Eight");
  //   map.put(9, "Nine");
  //   map.put(10, "Ten");

  //   map.put(11, "Eleven");
  //   map.put(12, "Twelve");
  //   map.put(13,"Thirtyteen");
  //   map.put(14, "Fourteen");
  //   map.put(15, "Fifteen");
  //   map.put(16, "Sixteen");
  //   map.put(17, "Seventeen");
  //   map.put(18, "Eighteen");
  //   map.put(19, "Nineteen");
  //   map.put(20, "Twenty");
  //   map.put(30, "Thirty");
  //   map.put(40, "Forty");
  //   map.put(50, "Fifty");
  //   map.put(60, "Sixty");
  //   map.put(70, "Seventy");
  //   map.put(80, "Eighty");
  //   map.put(90, "Ninety");
  //   map.put(100, "One Hundred");
  //   return map.get(num);
  // }

  // public static String mapKeywords(int num){
  //   HashMap<Integer,String> keyMap = new HashMap<>();
  //   keyMap.put(100,"Hundred");
  //   keyMap.put(1000,"Thousand");
  //   keyMap.put(10000,"Thousands");
  //   keyMap.put(100000 ,"Lakh");
  //   keyMap.put(1000000,"Lakhs");
  //   keyMap.put(10000000, "croer");
  //   keyMap.put(100000000,"croers");
  //   return keyMap.get(num);
  // }

  public static String numberToWord(int n){

    String[] units = {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Eighteen","Nineteen"};

    String[] tens ={" "," ","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};

    String[] multiplier = 
                    {"", "Thousand", "Lakh", "Croer"};


    String result = " ";
    int group = 0;
    if(n == 0){
      return "Zero";
    }
    
    while (n > 0) {
      if (n % 1000 != 0) {
          
          int value = n % 1000;
          String temp = "";
          
          if (value >= 100) {
              temp = units[value / 100] + " Hundred ";
              value = value % 100;
          }

          if (value >= 20) {
              temp += tens[value / 10] + " ";
              value = value % 10;
          }

          if (value > 0) {
              temp += units[value] + " ";
          }

          temp += multiplier[group] + " ";
          
          result = temp + result;
      }
      n /= 1000;
      group++;
  }
  
  
  return result.trim();
}
  public static void main(String[] args) {
    int number = 100000;
    String result = numberToWord(number);
    System.out.println(result);
    // int integers = integers(number);
    // int counter = 0;
    
    // if(integers == 9){
    //   counter = 100000000;
    // }else if(integers == 8){
    //   counter = 10000000;
    // }else if(integers == 7){
    //   counter = 1000000;
    // }else if(integers == 6){
    //   counter = 100000;
    // }else if(integers == 5){
    //   counter = 10000;
    // }else if(integers == 4){
    //   counter = 1000;
    // }else if(integers == 3){
    //   counter = 100;
    // }

    // String word = " ";
    // while (number > 0) {
      
    //   int quet = number/counter;
    //   if(counter < 100  && counter > 9){
    //     quet *= 10;
    //   }
    //   String wordNumber = mapOne(quet);
      
    //   word += " "+wordNumber;
    //   number = number%counter;
    //   String keyword = "";
    //   if(counter > 99){
    //      keyword = mapKeywords(counter);
    //   }
    //   word += " "+keyword;
    //   counter = counter/10;
    // }

      // System.out.println(word);
  }
}
