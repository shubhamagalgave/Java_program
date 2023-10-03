package Preparation1;
public class RemoveTheSpecialCharFromString {

	public static void main(String[] args) {
		String str="Y^%^&*(&*Shubham";
		str=str.replaceAll("[^a-z,0-9,A-Z]", "");
		System.out.println(str);
	}
}
   /********
    * //other then [a-z,0-9,A-Z] if any special character is present then char( ^ ) operator  will be replace by nothing
    * //if anything other then a-z,A-Z,0-9 replace by  nothing  with help of( ^ )char operator
    * To print only special character just remove char operator(^)  <==  very imp
    * */
