import java.util.Map;
public class MapOf1 {
  public static void main(String[] args) {
	Map<Integer, String> map = Map.of(101, "PP", 102, "QQ", 103, "RR");
    if(map.get("PP")=="101" )
        System.out.println("It works");
	map.forEach((k, v) -> System.out.println(k + " - " + v));
    String s="-42";
    if(s.charAt(0)!='-')
        System.out.println(s.charAt(0));
  }
} 