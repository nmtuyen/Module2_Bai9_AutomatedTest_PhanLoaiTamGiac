public class TriangleClassifier {
    public static String PhanLoaiTamGiac(int canh1, int canh2,int canh3){
        boolean isQualsCanh1Canh2 = canh1 == canh2;
        boolean isQualsCanh2Canh3 = canh2 == canh3;
        boolean isQualsCanh3canh1 = canh3 == canh1;
        if ((isQualsCanh1Canh2 && !isQualsCanh2Canh3) || (isQualsCanh2Canh3 && !isQualsCanh3canh1) || (isQualsCanh3canh1 && !isQualsCanh2Canh3)){
            return "là tam giác cân";
        }else if (isQualsCanh1Canh2 && isQualsCanh2Canh3){
            return "là tam giác đều";
        }else if (canh1+canh2>canh3 && canh2 +canh3 > canh1 && canh1+canh3>canh2){
            return "là tam giác thường";
        }else
            return "3 số đã nhập không phải là độ dài 3 cạnh của tam giác";
    }
}
