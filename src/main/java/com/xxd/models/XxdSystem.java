package com.xxd.models;

public class XxdSystem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_system.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_system.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_system.value
     *
     * @mbggenerated
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_system.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_system.id
     *
     * @return the value of xxd_system.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_system.id
     *
     * @param id the value for xxd_system.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_system.name
     *
     * @return the value of xxd_system.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_system.name
     *
     * @param name the value for xxd_system.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_system.value
     *
     * @return the value of xxd_system.value
     *
     * @mbggenerated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_system.value
     *
     * @param value the value for xxd_system.value
     *
     * @mbggenerated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_system.description
     *
     * @return the value of xxd_system.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_system.description
     *
     * @param description the value for xxd_system.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}