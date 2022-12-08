/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         System.out.println("world");
//     }
// }

// public class program {
//         public static void main(String[] args) {
//             int[][] arr = new int[3][5];
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = 0; j < arr[i].length; j++) {
//                     System.out.printf("%d", arr[i][j]);
//                 }
//                 System.out.println();
//             }
//             // System.out.println(s);
//         }
//     }
    
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!\n", name);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f, x, y, x + y");
//         iScanner.close();
//     }
// }


// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }


// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }


// public class program {
//     public static void main(String[] args) {
//       float pi = 3.1415f;
//       System.out.printf("%f\n", pi); // 3,141500
//       System.out.printf("%2f\n", pi); // 3,14
//       System.out.printf("%3f\n", pi); // 3,141
//       System.out.printf("%e\n", pi); // 3,141500e+00
//       System.out.printf("%2e\n", pi); // 3,14e+00
//       System.out.printf("%3e\n", pi); // 3,141e+00
//     }
// }


// public class program {
//     public static void main(String[] args) {

//         {
//             int a = 222;
//             System.out.println(a); // область видимости значения "а" - только внутри этих скобок {}, за их пределами это значение уже не видно
        
//         }
//         int a  = 123;
//         System.out.println(a);
//     }
// }

// условный оператор

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }

//         System.out.println(c);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b) c = a;
//         if (a < b) c = b;

//         System.out.println(c);
                
//     }
// }


// тернарный оператор

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b; // если верно, то ВЕРНЕТСЯ значение до знака :

//         System.out.println(min);
                
//     }
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             //...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
                
//     }
// }


// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value !=0) {
//             value  /= 10;
//             count++;
//         }

//         System.out.println(count);
                
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do{
//             value /= 10;
//             count++;
//         } while (value !=0);
//         System.out.println(count);   
//     }
// }



// public class program {
//     public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//         if(i%2==0)  
//         continue;
//             System.out.println(i);
//        }       
//     }
// }

// перебор элементов общей коллекции(массива)
// public class program {
//     public static void main(String[] args) {
//        int [] arr = new int[] {1, 2, 3, 4, 5, 77};
//         for (int item : arr) {
//             System.out.println(item);
//        }       
//     }
// }

//  работа с файлами
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());  // покажет ошибку, если возникнет при работе
//         }   
//        }       
//     }


// // чтение файла посимвольно

// import java.io.*;
// public class program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
        
//         }   
//     }       


// чтение файла построчно

import java.io.*;
public class program {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader ("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
                System.out.printf("== %s == \n", str);
            }
            br.close();
        }
    }   

