package com.hand.spring.bean;

/**
 * @author Peter
 * @ClassName: SetupCustomerDO
 * @Description: TODO
 * @date 2019/1/14 15:31
 * @Version 1.0
 */
public class SetupCustomerDO {
    private int type;
    private String action;
    private String Country;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
