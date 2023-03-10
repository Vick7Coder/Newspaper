package com.example.newspaper.service;

import com.example.newspaper.beans.Articles;
import com.example.newspaper.utils.DbUtils;
import org.sql2o.Connection;

import java.util.List;

public class ArticleService {
    public static List<Articles> getAll() {
        String sql = "select * from articles";
        try (Connection con = DbUtils.getConnection()) {
            return con.createQuery(sql).executeAndFetch(Articles.class);
        }
    }
    public static Articles get(int id) {
        String sql = "select * from articles where articles_id = :articles_id";
        try (Connection con = DbUtils.getConnection()) {
            List<Articles> list = con.createQuery(sql)
                    .addParameter("articles_id", id)
                    .executeAndFetch(Articles.class);

            if (list.size() == 0)
                return null;

            return list.get(0);
        }
    }


}
