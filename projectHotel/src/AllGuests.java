import java.util.HashMap;
import java.util.Scanner;
public class AllGuests {
	HashMap<String,Guest> guests = new HashMap<String,Guest>();
	
    public void makeGuest() {
        System.out.println("\n------------------------------------------------\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("�̸��� �Է��� �ּ���.");
        String guestName = sc.next();
        System.out.println("��ȭ��ȣ�� �Է��� �ּ���.");
        String phoneNum = sc.next();
        
        // uid �κ� ���� ����, �켱 ������ �� ����
        String guestId = "1";
        
        //������ �Է� �ޱ�
        System.out.println("�������� �Է��� �ּ���.");
        int money = sc.nextInt();
        Guest guest = new Guest(guestName, phoneNum, money,guestId);
        
        // ��ü �Խ�Ʈ ��Ͽ� �߰�
        guests.put(guestId,guest);
    }
    
    // �α��� ��� �����غ���
    // ����ڰ� id �Է��ϸ� Guest ��ü�� return�Ͽ� �α����ϴ� �Լ� ���� �ۼ�
}