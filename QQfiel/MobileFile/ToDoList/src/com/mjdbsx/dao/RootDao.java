package com.mjdbsx.dao;

import com.mjdbsx.domain.DBSX2;
import com.mjdbsx.domain.User;

import java.util.List;

public interface RootDao {
    List<User> selectUsers(String type,int page,int limit);
    List<DBSX2> selecctDbsx(String type,int page,int limit);
    boolean deletUser(String phonenumber,String username);
    boolean deletDbsx(String dbsxid);
    int total();
    int count();
}
