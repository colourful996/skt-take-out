package com.sky.mapper;

public class MyBatisStatementGenerator {
    public static void main(String[] args) {
        String[] fields = {"name", "username", "password","phone","sex","idNumber","updateTime","updateUser","status"};
        StringBuilder statementBuilder = new StringBuilder();

        for (String field : fields) {
            statementBuilder.append("<if test=\"").append(field).append(" != null\">")
                    .append(field).append(" = #{").append(field).append("},</if>\n");
        }

        System.out.println(statementBuilder.toString());
    }
}