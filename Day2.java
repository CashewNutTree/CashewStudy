public class Day2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startNum = scan.nextInt();
		int lastNum = scan.nextInt();
		int count = 0;
		
		for(int i=startNum; i<=lastNum; i++) {
			if(Integer.toString(i).contains("5")) {
				
			} else{
				count++;
			}
		}
		System.out.println(count);
	}
}
