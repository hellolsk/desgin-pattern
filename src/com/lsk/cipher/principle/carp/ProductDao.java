package com.lsk.cipher.principle.carp;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 16:31
 * @PackageName:21hj com.lsk.principle.carp
 * @Description:
 */
public class ProductDao {
//    DBConnection为ProductDao类的引用，是他的一部分他们之间为组合关系
    private DBConnection dbConnection;
    public void setDbConnection(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }
    public void addProduct(){
        String connection = dbConnection.getConnection();
        System.out.println(connection+"入库成功");
    }
}
