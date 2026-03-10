import java.util.HashMap;

public class Fibonacci{
 
 public static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 public static int fibonacci(int num){
  if(num == 0) return 0;
  if(num == 1) return 1;
  if(map.containsKey(num)) return map.get(num);
  int result = fibonacci(num-2)+fibonacci(num-1);
  map.put(num, result);
return result;
}
 public static void main(String [] args){
  for(int i = 0; i < 10; i++){
    System.out.print(fibonacci(i)+" ");
  }
 }
}
