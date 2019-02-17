import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(200);

        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            CommandLine line = new CommandLine(sc.nextLine());
            switch (line.command) {
                case push:
                    stack.push(line.value);
                    break;
                case pop:
                    System.out.println(stack.pop());
                    break;
                case top:
                    System.out.println(stack.top());
                    break;
                case size:
                    System.out.println(stack.size());
                    break;
                case empty:
                    if (stack.empty()) {
                        System.out.println(1);
                    }
                    else {
                        System.out.println(0);
                    }
                    break;
            }
        }
    }

//
//    private static List<Integer> Stack=new ArrayList<>();
//
//    public static void main(String[] args) {
//        String select;
//        int selec_num;
//        String selec_char;
//        Scanner sc = new Scanner(System.in);
//        selec_char=sc.nextLine();
//        System.out.println(selec_char);
//
//
////        int a=0;
////        while(a<1) {
////
////            int re = sc.nextInt();
////            if (re > 0) {
////                for (int i = 0; i < re; i++) {
////                    push(i);
////                }
////                Scanner scan = new Scanner(System.in);
////
////                select = scan.nextLine();
////                String[] words = select.split("\\s", 2);
////
////                if (words[0].equals("pop")) {
////                    pop();
////                } else if (words[0].equals("size")) {
////                    System.out.println(Stack.size());
////
////                } else if (words[0].equals("empty")) {
////                    if (Stack.size() == 0) {
////                        System.out.println(0);
////                    } else {
////                        System.out.println(1);
////                    }
////
////                } else if (words[0].equals("top")) {
////                    if (Stack.size() == 0) {
////                        System.out.println(-1);
////                    } else {
////                        System.out.println(Stack.get(Stack.size() - 1));
////                    }
////
////                } else if ((words[0].equals("push") && words[1] != null)) {
////
////
////                    int num = Integer.parseInt(words[1]);
////                    push(num);
////
////
////                }
////            }
////        }
//
//
//    }
/////push pop size emty top
//
//    public static void push(int num) {
//
//        Stack.add(Stack.size(), num);
//    }
//
//    public static void pop(){
//       int a= Stack.remove(Stack.size()-1);
//        System.out.println(a);
//    }

}
