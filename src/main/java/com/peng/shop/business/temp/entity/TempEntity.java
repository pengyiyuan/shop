package com.peng.shop.business.temp.entity;

import java.io.Serializable;
import java.util.Date;

public class TempEntity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column temp.id
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column temp.name
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column temp.time
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column temp.small_name
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    private String smallName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table temp
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column temp.id
     *
     * @return the value of temp.id
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column temp.id
     *
     * @param id the value for temp.id
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column temp.name
     *
     * @return the value of temp.name
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column temp.name
     *
     * @param name the value for temp.name
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column temp.time
     *
     * @return the value of temp.time
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column temp.time
     *
     * @param time the value for temp.time
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column temp.small_name
     *
     * @return the value of temp.small_name
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    public String getSmallName() {
        return smallName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column temp.small_name
     *
     * @param smallName the value for temp.small_name
     *
     * @mbg.generated Sat Nov 14 12:31:29 CST 2020
     */
    public void setSmallName(String smallName) {
        this.smallName = smallName == null ? null : smallName.trim();
    }
}