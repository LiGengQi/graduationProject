package com.ligq.graduate.pojo;

import com.ligq.graduate.util.ProgramID;

import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/14 21:51
 * @title 菜品
 */
public class Dishes {
    private String saasId = ProgramID.programId;
    /** 档口编号 */
    private int storeId;
    private int dishNo;
    private String spuId;
    /** 价格 */
    private int price;
    /** 实物图片 */
    public String primaryImage;
    /** 轮播图片 */
    private List<String> dishImage;
    /** 菜名 */
    private String dishName;
    /** 原料 */
    private String rawMaterials;
    /** 详细图片 */
    public List<String> desc;
    /** 详细介绍 */
    private String detailedDescription;
    /** 销量 */
    private int soldNum;

    /** 库存 */
    private int spuStockQuantity;

    public String getSaasId() {
        return this.saasId;
    }

    public String getStoreId() {
        return Integer.toString(this.storeId);
    }

    public String getDishNo() {
        return Integer.toString(this.dishNo);
    }

    public String getSpuId() {
        return this.spuId;
    }

    public int getPrice() {
        return this.price;
    }

    public String getPrimaryImage() {
        return this.primaryImage;
    }

    public List<String> getDishImage() {
        return this.dishImage;
    }

    public String getDishName() {
        return this.dishName;
    }

    public String getRawMaterials() {
        return this.rawMaterials;
    }

    public List<String> getDesc() {
        return this.desc;
    }

    public String getDetailedDescription() {
        return this.detailedDescription;
    }

    public int getSoldNum() {
        return this.soldNum;
    }

    public void setSaasId(String saasId) {
        this.saasId = saasId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public void setDishNo(int dishNo) {
        this.dishNo = dishNo;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPrimaryImage(String primaryImage) {
        this.primaryImage = primaryImage;
    }

    public void setDishImage(List<String> dishImage) {
        this.dishImage = dishImage;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setRawMaterials(String rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    public void setDesc(List<String> desc) {
        this.desc = desc;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public void setSoldNum(int soldNum) {
        this.soldNum = soldNum;
    }

    public int getSpuStockQuantity() {
        return spuStockQuantity;
    }

    public void setSpuStockQuantity(int spuStockQuantity) {
        this.spuStockQuantity = spuStockQuantity;
    }
}
