package com.lanou3g.domain;

import java.util.List;

/**
 * Author: 武奇<p/>
 * Company: lanou3g.com<p/>
 * Date: 2017/10/27
 */
public class Area {

    private int id;
    private String aname;
    private List<Server> servers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    @Override
    public String toString() {
        return aname;
    }
}
