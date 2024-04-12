package school5;

public class Boiler {
	private int temp;
	public void setTemp(int temp) {this.temp=temp;}
	public int getTemp() {return temp;}
	/*temp5에 사용되는 소스
	int temp;
	*/
	public Boiler() {
		this.temp=0;
		System.out.println("현재온도="+temp+"도");
	};
	public Boiler(int t) {
		this.temp=t;
		System.out.println("현재온도="+temp+"도");
	};
	public int tempUp() {
		temp++;
		System.out.println("현재온도="+temp+"도");
		return temp;
	}
	public int tempDown() {
		temp--;
		System.out.println(temp);
		return temp;
	}
	public int tempUpDown(int t) {
		temp+=t;
		System.out.println("현재온도="+temp+"도");
		return temp;
	}
}
