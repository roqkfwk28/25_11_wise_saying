import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {
  Scanner scanner;
  int lastWiseSayingId;
  List<Quotation> quotations;

  App() {
    scanner = new Scanner(System.in);
    lastWiseSayingId = 0;
    quotations = new ArrayList<>();
  }

  void run() {
    System.out.println("== 명언 앱 ==");

    while (true) {
      System.out.print("명령) ");
      String cmd = scanner.nextLine();

      Rq rq = new Rq(cmd);
      switch (rq.getAction()) {
        case "종료":
          return;
        case "등록":
          actionWrite();
          break;
        case "목록":
          actionList();
          break;
        case "삭제":
          actionRemove(rq);
          break;
      }
    }
  }

  void actionWrite() {
    System.out.print("명언 : ");
    String content = scanner.nextLine();

    System.out.print("작가 : ");
    String authorName = scanner.nextLine();

    lastWiseSayingId++;

    int id = lastWiseSayingId;

    Quotation quotation = new Quotation(id, content, authorName);

    quotations.add(quotation);
  }

  void actionList() {
    System.out.println("번호 / 명언 / 작가");
    System.out.println("--------------------");

    if (quotations.isEmpty()) {
      System.out.println("등록된 명언이 없습니다.");
    }
    for (int i = quotations.size() - 1; i >= 0; i--) {
      Quotation quotation = quotations.get(i);
      System.out.printf("%d / %s / %s\n", quotation.id, quotation.content, quotation.authorName);
    }
  }

  void actionRemove(Rq rq) {
    int id = rq.getParamAsInt("id", 0);
    if (id == 0) {
      System.out.println("id를 정확히 입력해주세요.");
      return;
    }

    System.out.printf("%d번 명언을 삭제합니다.\n", id);
  }
}