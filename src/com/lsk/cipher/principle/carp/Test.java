package com.lsk.cipher.principle.carp;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 16:40
 * @PackageName:21hj com.lsk.principle.carp
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MYSQLConnection());
        productDao.addProduct();

    }
}
