
public class Chapter08_2 {

	public static void main(String[] args) {
		String weekDay = "mond";
		switch (weekDay.toUpperCase()) {
		case "MON":
			System.out.println("月曜");
			break;
		case "TUE":
			System.out.println("火曜");
			break;
		case "WED":
			System.out.println("水曜");
			break;
		case "THU":
			System.out.println("木曜");
			break;
		case "FRI":
			System.out.println("金曜");
			break;
		case "SAT":
			System.out.println("土曜");
			break;
		case "SUN":
			System.out.println("日曜");
			break;
        default:		
			System.out.println("曜日ではありません");
			break;
		
		
		}

	}

}
