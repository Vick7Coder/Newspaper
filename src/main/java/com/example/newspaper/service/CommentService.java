package com.example.newspaper.service;

import com.example.newspaper.beans.Cmt;
import com.example.newspaper.utils.DbUtils;
import org.sql2o.Connection;

import java.util.List;

public class CommentService {
    public static List<Cmt> getAll() {
        String sql = "select * from comments";
        try (Connection con = DbUtils.getConnection()) {
            return con.createQuery(sql).executeAndFetch(Cmt.class);
        }
    }

    public static Cmt findById(int id) {
        String sql = "select * from comments where comment_id =  :comment_id";
        try (Connection con = DbUtils.getConnection()) {
            List<Cmt> list = con.createQuery(sql)
                    .addParameter("comment_id", id)
                    .executeAndFetch(Cmt.class);

            if (list.size() == 0)
                return null;

            return list.get(0);
        }
    }
    public static List<Cmt> findByCmtId(int id) {
        final String query = "select * from comments where comment_id = :comment_id";
        try (Connection con = DbUtils.getConnection()) {
            return con.createQuery(query)
                    .addParameter("comment_id", id)
                    .executeAndFetch(Cmt.class);
        }
    }
}
