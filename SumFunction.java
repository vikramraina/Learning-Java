
public class SumFunction {
	public int add(int x, int y) {
		return x+y;
	}
	
	public int add(int x, int y,int z) {
		return x+y+z;
	}
	
	public int add(int x, double y) {
		return x+(int)y;
	}
	
	public int add(double x, int y) {
		return (int)x+y;
	}
}
