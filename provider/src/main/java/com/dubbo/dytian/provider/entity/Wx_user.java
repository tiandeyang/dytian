package com.dubbo.dytian.provider.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 微信用户
 * </p>
 *
 * @author dytian
 * @since 2018-11-12
 */
public class Wx_user extends Model<Wx_user> {

	private static final long serialVersionUID = 1L;

    /**
     * 自增用户id
     */
	@TableId(value="user_id", type= IdType.AUTO)
	private Integer user_id;
    /**
     * 商店id
     */
	private Integer store_id;
    /**
     * 商店名称
     */
	private String store_name;
    /**
     * 微信open_id
     */
	private String user_open_id;
    /**
     * 用户名
     */
	private String user_name;
    /**
     * 手机号
     */
	private String user_phone;
    /**
     * 钱包余额
     */
	private BigDecimal user_wallet;
    /**
     * 积分
     */
	private Integer user_score;
	private Integer user_vip;
    /**
     * 微信昵称
     */
	private String user_nick;
	private String user_country;
	private String user_province;
	private String user_city;
    /**
     * 1 男 2女
     */
	private Integer user_sex;
    /**
     * 支付码
     */
	private String pay_code;
    /**
     * 创建时间
     */
	private Date create_time;
	private String xv_id;
	private String pay_barcode;
    /**
     * 身份证号
     */
	private String user_idcard;
    /**
     * 新活动开始前的钱包剩余金额
     */
	private BigDecimal left_money;
    /**
     * 活动开始后的钱包余额
     */
	private BigDecimal user_new_wallet;
    /**
     * 是否重置新钱包 0 未 1 已经
     */
	private Integer reset_new_wallet;
    /**
     * 发红包标识
     */
	private Integer hb_flag;


	public Integer getUser_id() {
		return user_id;
	}

	public Wx_user setUser_id(Integer user_id) {
		this.user_id = user_id;
		return this;
	}

	public Integer getStore_id() {
		return store_id;
	}

	public Wx_user setStore_id(Integer store_id) {
		this.store_id = store_id;
		return this;
	}

	public String getStore_name() {
		return store_name;
	}

	public Wx_user setStore_name(String store_name) {
		this.store_name = store_name;
		return this;
	}

	public String getUser_open_id() {
		return user_open_id;
	}

	public Wx_user setUser_open_id(String user_open_id) {
		this.user_open_id = user_open_id;
		return this;
	}

	public String getUser_name() {
		return user_name;
	}

	public Wx_user setUser_name(String user_name) {
		this.user_name = user_name;
		return this;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public Wx_user setUser_phone(String user_phone) {
		this.user_phone = user_phone;
		return this;
	}

	public BigDecimal getUser_wallet() {
		return user_wallet;
	}

	public Wx_user setUser_wallet(BigDecimal user_wallet) {
		this.user_wallet = user_wallet;
		return this;
	}

	public Integer getUser_score() {
		return user_score;
	}

	public Wx_user setUser_score(Integer user_score) {
		this.user_score = user_score;
		return this;
	}

	public Integer getUser_vip() {
		return user_vip;
	}

	public Wx_user setUser_vip(Integer user_vip) {
		this.user_vip = user_vip;
		return this;
	}

	public String getUser_nick() {
		return user_nick;
	}

	public Wx_user setUser_nick(String user_nick) {
		this.user_nick = user_nick;
		return this;
	}

	public String getUser_country() {
		return user_country;
	}

	public Wx_user setUser_country(String user_country) {
		this.user_country = user_country;
		return this;
	}

	public String getUser_province() {
		return user_province;
	}

	public Wx_user setUser_province(String user_province) {
		this.user_province = user_province;
		return this;
	}

	public String getUser_city() {
		return user_city;
	}

	public Wx_user setUser_city(String user_city) {
		this.user_city = user_city;
		return this;
	}

	public Integer getUser_sex() {
		return user_sex;
	}

	public Wx_user setUser_sex(Integer user_sex) {
		this.user_sex = user_sex;
		return this;
	}

	public String getPay_code() {
		return pay_code;
	}

	public Wx_user setPay_code(String pay_code) {
		this.pay_code = pay_code;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public Wx_user setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	public String getXv_id() {
		return xv_id;
	}

	public Wx_user setXv_id(String xv_id) {
		this.xv_id = xv_id;
		return this;
	}

	public String getPay_barcode() {
		return pay_barcode;
	}

	public Wx_user setPay_barcode(String pay_barcode) {
		this.pay_barcode = pay_barcode;
		return this;
	}

	public String getUser_idcard() {
		return user_idcard;
	}

	public Wx_user setUser_idcard(String user_idcard) {
		this.user_idcard = user_idcard;
		return this;
	}

	public BigDecimal getLeft_money() {
		return left_money;
	}

	public Wx_user setLeft_money(BigDecimal left_money) {
		this.left_money = left_money;
		return this;
	}

	public BigDecimal getUser_new_wallet() {
		return user_new_wallet;
	}

	public Wx_user setUser_new_wallet(BigDecimal user_new_wallet) {
		this.user_new_wallet = user_new_wallet;
		return this;
	}

	public Integer getReset_new_wallet() {
		return reset_new_wallet;
	}

	public Wx_user setReset_new_wallet(Integer reset_new_wallet) {
		this.reset_new_wallet = reset_new_wallet;
		return this;
	}

	public Integer getHb_flag() {
		return hb_flag;
	}

	public Wx_user setHb_flag(Integer hb_flag) {
		this.hb_flag = hb_flag;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.user_id;
	}

	@Override
	public String toString() {
		return "Wx_user{" +
			"user_id=" + user_id +
			", store_id=" + store_id +
			", store_name=" + store_name +
			", user_open_id=" + user_open_id +
			", user_name=" + user_name +
			", user_phone=" + user_phone +
			", user_wallet=" + user_wallet +
			", user_score=" + user_score +
			", user_vip=" + user_vip +
			", user_nick=" + user_nick +
			", user_country=" + user_country +
			", user_province=" + user_province +
			", user_city=" + user_city +
			", user_sex=" + user_sex +
			", pay_code=" + pay_code +
			", create_time=" + create_time +
			", xv_id=" + xv_id +
			", pay_barcode=" + pay_barcode +
			", user_idcard=" + user_idcard +
			", left_money=" + left_money +
			", user_new_wallet=" + user_new_wallet +
			", reset_new_wallet=" + reset_new_wallet +
			", hb_flag=" + hb_flag +
			"}";
	}
}
