
public class Leet {

	static String[] regxs = new String[]{"elite","cool","!","ck","ers","er","en","e","t","o","a"};
	static String[] replacements = new String[]{"1337","k3wl","!!!11","xx","0rz","0rz","n","3","7","0","@"};
	
	public static String toLeet(String normal){
		for(int i=0; i<regxs.length; i++){
			normal=normal.replace(regxs[i], replacements[i]);
		}
		
		return normal;
	}
	
	public static String[] allToLeet(String[] normals){
		for(int i=0; i<normals.length; i++){
			normals[i] = Leet.toLeet(normals[i]);
		}
		return normals;
	}
	
}
