package Triangle;

public class TriangleInterfaceImpl implements   TriangleInterface{

    @Override
    public String Triangle(int a, int b, int c) {
        // 检查输入的边长是否满足三角形条件
        if (a <= 0 || b <= 0 || c <= 0 || a > 100 || b > 100 || c > 100) {
            return ("无效输入");
        }

        // 检查是否能构成三角形
        if (a + b > c && a + c > b && b + c > a) {
            // 判断三角形的类型
            if (a == b && b == c) {
                return ("等边三角形");
            } else if (a == b || a == c || b == c) {
                return ("等腰三角形");
            } else {
                return ("一般三角形");
            }
        } else {
            return ("不能构成三角形");
        }
    }
}
