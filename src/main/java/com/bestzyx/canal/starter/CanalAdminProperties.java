package com.bestzyx.canal.starter;

import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zhangyongxiang on 2024/4/1 5:39 PM
 **/
@ConfigurationProperties(prefix = "canal.sdk")
@SuppressWarnings({ "LombokGetterMayBeUsed", "LombokSetterMayBeUsed" })
public class CanalAdminProperties {
    
    private String host;
    
    private short port;
    
    private String username;
    
    private String password;
    
    private String token;
    
    public String getHost() {
        return host;
    }
    
    public void setHost(final String host) {
        this.host = host;
    }
    
    public short getPort() {
        return port;
    }
    
    public void setPort(final short port) {
        this.port = port;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public String getToken() {
        return token;
    }
    
    public void setToken(final String token) {
        this.token = token;
    }
    
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof final CanalAdminProperties that)) {
            return false;
        }
        return getPort() == that.getPort()
                && Objects.equals(getHost(), that.getHost())
                && Objects.equals(getUsername(), that.getUsername())
                && Objects.equals(getPassword(), that.getPassword())
                && Objects.equals(getToken(), that.getToken());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getHost(), getPort(), getUsername(), getPassword(),
                getToken());
    }
    
    @Override
    public String toString() {
        return "CanalAdminProperties{" + "host='" + host + '\'' + ", port="
                + port + ", username='" + username + '\'' + ", password='"
                + password + '\'' + ", token='" + token + '\'' + '}';
    }
}
