import java.util.Scanner;

class App {
  void run() {
    System.out.println("== 명언 앱 ==");

    int lastWiseSayingId = 0;

    while(true){
      System.out.printf("명령) ");

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

        lastWiseSayingId++;

        System.out.printf("%d번 명언이 등록되었습니다.\n", lastWiseSayingId);
      }
    }
  }
}
