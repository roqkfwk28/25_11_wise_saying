import java.util.Scanner;

class App {
  void run() {
    System.out.println("== 명언 앱 ==");
    while(true){
      System.out.println("명령) ");

      Scanner scanner = new Scanner(System.in);

      String cmd = scanner.nextLine();
      if (cmd.equals("종료")){
        break;
      }
      else if(cmd.equals("등록")){
        System.out.println("명언: ");
        String content = scanner.nextLine();
        System.out.println("작가: ");
        String authorName = scanner.nextLine();

        System.out.printf("명언 : %s\n", content);
        System.out.printf("작가 : %s\n", authorName);
      }
    }
  }
}
