import java.util.Scanner;

public class happyHolidays
	{
		static Scanner userStringInput = new Scanner(System.in);
		private static String input;
		static String stringLowerCase = new String();
		static String letter;
		
		public static void main(String[] args)
			{
				System.out.println("Insert text below:");
				input = userStringInput.nextLine();
				for (int i = 0; i < input.length(); i++)
					{
						int t = i+1;
						 letter = input.substring(i, t);

				switch(letter) {
				  case "a":
					  System.out.println("         *");
					  System.out.println("        * *");
					  System.out.println("       *   *");
					  System.out.println("      *     *");
					  System.out.println("     *********");
					  System.out.println("    *         *");
					  System.out.println("   *           *");
					  
					  break;

				  case "b":
					  System.out.println("   *******");
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   *******");
					  System.out.println("   *      *");
					  System.out.println("   *       *");
					  System.out.println("   ********");
					  break;

				  case "c":
					  System.out.println("       *******");
					  System.out.println("      *");
					  System.out.println("     *");
					  System.out.println("     *");
					  System.out.println("     *");
					  System.out.println("      *");
					  System.out.println("       *******");
					  break;

				  case "d":
					  System.out.println("   *******");
					  System.out.println("   *       *");
					  System.out.println("   *        *");
					  System.out.println("   *         *");
					  System.out.println("   *        *");
					  System.out.println("   *       *");
					  System.out.println("   ********");
					  break;

				  case "e":
					  System.out.println("   *******");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   *******");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   ********");
					  break;

				  case "f":
					  System.out.println("   *******");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   *******");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   *");
					  break;
					  
				  case "g":
					  System.out.println("       *******");
					  System.out.println("      *");
					  System.out.println("     *");
					  System.out.println("     *");
					  System.out.println("     *     ****");
					  System.out.println("      *       *");
					  System.out.println("       *******");
				  break;
				  case "h":
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   ********");
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  break;
					  
				  case "i":
					  System.out.println("   *******");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("   *******");
					  break;

				  case "j":
					  System.out.println("   *******");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("  *   *");
					  System.out.println("   ****");
					  break;

				  case "k":
					  System.out.println("   *      *");
					  System.out.println("   *    *");
					  System.out.println("   *  *");
					  System.out.println("   **");
					  System.out.println("   *  *");
					  System.out.println("   *   *");
					  System.out.println("   *    *");
					  break;
					  
				  case "l":
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   *******");
					  break;
					  
				  case "m":
					  System.out.println("   *             *");
					  System.out.println("   * *         * *");
					  System.out.println("   *  *       *  *");
					  System.out.println("   *   *     *   *");
					  System.out.println("   *    *   *    *");
					  System.out.println("   *     * *     *");
					  System.out.println("   *      *      *");
					  break;
				  case "n":
					  System.out.println("   *      *");
					  System.out.println("   * *    *");
					  System.out.println("   *  *   *");
					  System.out.println("   *   *  *");
					  System.out.println("   *    * *");
					  System.out.println("   *     **");
					  System.out.println("   *      *");
					  break;
					  
				  case "o":
					  System.out.println("   ********");
					  System.out.println("  *        *");
					  System.out.println(" *          *");
					  System.out.println("*            *");
					  System.out.println(" *          *");
					  System.out.println("  *        *");
					  System.out.println("   ********");
					  break;
					  
				  case "p":
					  System.out.println("   *******");
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   *******");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   *");
					  break;
					  
				  case "q":
					  System.out.println("   ********");
					  System.out.println("  *        *");
					  System.out.println(" *          *");
					  System.out.println("*            *");
					  System.out.println(" *       *  *");
					  System.out.println("  *        *");
					  System.out.println("   ********  *");
					  break;
					  

				  case "r":
					  System.out.println("   *****");
					  System.out.println("   *    *");
					  System.out.println("   *   *");
					  System.out.println("   ***");
					  System.out.println("   *  *");
					  System.out.println("   *   *");
					  System.out.println("   *    *");
					  break;
					  
				  case "s":
					  System.out.println("   ********");
					  System.out.println("   *");
					  System.out.println("   *");
					  System.out.println("   ********");
					  System.out.println("          *");
					  System.out.println("          *");
					  System.out.println("   ********");
					  break;
					  
				  case "t":
					  System.out.println("   *******");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("      *");
					  System.out.println("      *");
					  break;
					
				  case "u":
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   *      *");
					  System.out.println("   ********");
					  break;
					  
				  case "v":
					  System.out.println("   *     *");
					  System.out.println("   *     *");
					  System.out.println("   *     *");
					  System.out.println("   *     *");
					  System.out.println("   *     *");
					  System.out.println("    *  *");
					  System.out.println("     **");
					  break;
					  
				  case "w":
					  System.out.println("   *     *     *");
					  System.out.println("   *     *     *");
					  System.out.println("   *     *     *");
					  System.out.println("   *     *     *");
					  System.out.println("   *     *     *");
					  System.out.println("    *  *   *  *");
					  System.out.println("     **     **");
					  break;
				  case "x":
					  System.out.println("   *     *     *");
					  System.out.println("   *     *     *");
					  System.out.println("   *     *     *");
					  System.out.println("    *         * ");
					  System.out.println("   *           *");
					  System.out.println("");
					  System.out.println("");
					  break;
				}
					}
			}
	}

