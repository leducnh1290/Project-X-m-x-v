import java.util.*;
public class Main
{
	public static void main(String[] args) {
	boolean c = true;
	String a = "";
	String b = "";
	int xx = 3;
	Random rd;
	 rd = new Random();
	    System.out.println("    -------------------------------------------------");
	    System.out.println("                  HACK NASA WITH JAVA");
	    System.out.println("    -------------------------------------------------");
	    Delay(1000);
	    System.out.println("             Đang khởi động chương trình !");
	    Delay(1000);
	    for(int bc=1;bc<=3;bc++){
	    System.out.println("           Server started pls wait "+bc+" step...");
	        Delay(1000);
	    }
	hn1:while(c){
	  System.out.print("  Nhập 1 để chuẩn bị hack nhập 2 để xem hướng dẫn nhập bất kì kí tự nào khác để thoát !\n  Mời bạn nhập : ");
	  Scanner scanner = new Scanner(System.in);
	  a = scanner.nextLine();
	  
	  hn2:if(a.equals("1")){
	  System.out.print("  Bạn có chắc chắc muốn hack ? Nhấn 1 để xác nhận và bất kì kí tự nào khác để thoát\n  Mời bạn nhập : ");
	      b = scanner.nextLine();
	      if(b.equals("1")){
	          Delay(500);
	   System.out.println("    -------- CHUẨN BỊ TIẾN HÀNH --------");
	          Delay(500);
	   System.out.println("    --------       LOADING      --------");
	          Delay(500);
	          System.out.println("  Bắt đầu Hack ! Vui lòng chờ !");
	        for(int i=0;i<=100;i++){
	            if(i<=95){
	                i = i+rd.nextInt(4);
	                
	            }
	            System.out.println("  Nasa current hacking : "+i+"%...");
	            Delay(400);
	            if(i==100){
	                xx = rd.nextInt(2);
	                if(xx==1){
	                    System.out.println("    -------------------------------------------------");
	                    System.out.println("                 Hack thành công !");
	                    System.out.println(" Chúc Mừng Bạn Đã Nắm Quyền Kiểm Soát, Giờ Tỉnh Dậy Thôi !");
	                    System.out.println("    -------------------------------------------------");
	                }else if(xx==0){
	                    System.out.println("  Lỗi !.Hack thất bại hãy thắp vài nén hương cho ông bà rồi thử lại !");
	                }
	            }
	        }
	        continue hn1;
	    }else{
	        System.out.println("  Đang thoát ! Chờ 2 giây");
	        Delay(1000);
	        break hn2;
	    }
	  
	  }else if(a.equals("2")){
	      System.out.println("    ---------------------------------");
	      System.out.println("      Có cc hướng dẫn đâu mà xem 🙂");
	      System.out.println("    ---------------------------------");
	      continue;
	  }else{
	  System.out.println("  Đang thoát ! Chờ 2 giây");
	        Delay(1000);
	  return;
	  }
	  }
	}
		public static void Delay(int ns){
	    try
     {
    Thread.sleep(ns);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
	}
}
