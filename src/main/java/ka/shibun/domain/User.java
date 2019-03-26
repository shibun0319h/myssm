package ka.shibun.domain;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String password;

    private String name;

    private String identitycard;

    private Long departmentId;

    private Date jointime;

    private Long phonenum;

    private Long educationId;

    private String address;

    private Long sexId;

    private Date birthday;

    private String remark;

    private Boolean state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard == null ? null : identitycard.trim();
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Long phonenum) {
        this.phonenum = phonenum;
    }

    public Long getEducationId() {
        return educationId;
    }

    public void setEducationId(Long educationId) {
        this.educationId = educationId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getSexId() {
        return sexId;
    }

    public void setSexId(Long sexId) {
        this.sexId = sexId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}