package com.example.wabisabi;

public class HelperClass {
    String name;
    String phone_number;
    String create_pass;

    String re_enter_pa ;

    public HelperClass() {
    }
    public HelperClass(String name, String phone_number, String create_pass, String re_enter_pa) {
        this.name = name;
        this.phone_number = phone_number;
        this.create_pass = create_pass;
        this.re_enter_pa = re_enter_pa;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCreate_pass() {
        return create_pass;
    }

    public void setCreate_pass(String create_pass) {
        this.create_pass = create_pass;
    }

    public String getRe_enter_pa() {
        return re_enter_pa;
    }

    public void setRe_enter_pa(String re_enter_pa) {
        this.re_enter_pa = re_enter_pa;
    }


}
