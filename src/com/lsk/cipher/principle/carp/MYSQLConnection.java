package com.lsk.cipher.principle.carp;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 16:30
 * @PackageName:21hj com.lsk.principle.carp
 * @Description:
 */
public class MYSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "mysql数据库连接";
    }
}
