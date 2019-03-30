package com.fengjx.hello.vertx.config;

/**
 * @author fengjianxin
 * @version 2019-03-30
 */
public class Sqls {
    public static final String SQL_CREATE_PAGES_TABLE = "create table if not exists Pages (Id integer identity primary key, Name varchar(255) unique, Content clob)";
	public static final String SQL_GET_PAGE = "select Id, Content from Pages where Name = ?";
	public static final String SQL_CREATE_PAGE = "insert into Pages values (NULL, ?, ?)";
	public static final String SQL_SAVE_PAGE = "update Pages set Content = ? where Id = ?";
	public static final String SQL_ALL_PAGES = "select Name from Pages";
	public static final String SQL_DELETE_PAGE = "delete from Pages where Id = ?";
}
