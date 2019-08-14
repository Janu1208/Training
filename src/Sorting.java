import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		String[] dNames = {"MECH", "CSE","IT","ECE"};
		System.out.println("Before sorting");
		for(String d : dNames)
		{
			System.out.println(d);
		}
        System.out.println("After sorting");
        Arrays.sort(dNames);
        for(String d: dNames)
        {
        	System.out.println(d);
        }
	}

}
