import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void phanLoaiTamGiac() {
        int canh1 = 2;
        int canh2 = 2;
        int canh3 = 2;
        String hope = "là tam giác đều";
        String expect = TriangleClassifier.PhanLoaiTamGiac(canh1, canh2, canh3);
        assertEquals(hope, expect);
    }
    @Test
    void phanLoaiTamGiac2() {
        int canh1 = 2;
        int canh2 = 2;
        int canh3 = 3;
        String hope = "là tam giác cân";
        String expect = TriangleClassifier.PhanLoaiTamGiac(canh1, canh2, canh3);
        assertEquals(hope, expect);
    }
    @Test
    void phanLoaiTamGiac3() {
        int canh1 = 8;
        int canh2 = 2;
        int canh3 = 3;
        String hope = "3 số đã nhập không phải là độ dài 3 cạnh của tam giác";
        String expect = TriangleClassifier.PhanLoaiTamGiac(canh1, canh2, canh3);
        assertEquals(hope, expect);
    }
}