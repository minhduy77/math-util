/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptsoftware.minz.mathutil.core;
//Quy tắc đặt tên package trong Java
//- chữ thường toàn tập
//- ghi theo tên miền công ty đảo ngược 
//com.tên-cty.tên-dự-án.tên-module-nhóm-chức-năng
//com.microsoft.sqlserver.jdbc. Tên Class import vào để dùng
//đây là kĩ thuật giúp code của nhiều dự án trong 1 cty có thể 
//ở chung folder mà ko bị lẫn lộn
//giúp thư viện của các cty khác nhau ở chung với nhau dù trùng tên
//KMS (kâtlon) com.kms.

//C#        Giaolang.MathUtil.
//          Microsoft.MathUtil.
public class MathUtility {
    
    // Hàm tính n! = 1, 2, 3, 4,... n
    // Hàm là static vì tính xong trả về, ko nhớ nhung gì cả
    // Thường các thư viện dùng chung có tính toán số liệu ta hay dùng 
    
    //0! = 1! = 1
    // n = 0...20! vì n = 21! vì n = 21! vượt số 0, 18 số 0 là vừa đủ long
    public static long getFactorial(int n) {
        long product = 1; //tính kết quả phép nhân
        //sửa lại từ 10 thành 1 để có màu xanh trở lại
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20 ");
        
        if(n == 0)
            return 1;
        
        for (int i = 1; i <= n; i++)          
            product *= i;//thuật toán nhân dồn, con heo đất
                         // ốc bu nhồi thịt 
        
        return product;
    }
}
