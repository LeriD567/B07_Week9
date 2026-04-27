public class Main {
  // Lỗi 1: Không thụt lề (indentation) đúng chuẩn
  public static void main(String[] args){
// Lỗi 2: Thiếu khoảng trắng xung quanh toán tử
    int X=10;
// Lỗi 3: Đặt tên biến (X) viết hoa chữ cái đầu (sai quy tắc naming convention)
    int y = 20;

// Lỗi 4: Viết dính liền if và ngoặc nhọn
    if(X>y){System.out.println("X lớn hơn y");}
    else{
      System.out.println("y lớn hơn hoặc bằng X");
    }
  }
}
