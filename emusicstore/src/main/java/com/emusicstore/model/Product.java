package com.emusicstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;
/**
 * Created by Le on 1/2/2016.
 */

@Entity
public class Product {

	@Id
	@Column(name="PRODUCTID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;
	
	@Column(name="PRODUCTNAME")
    @NotEmpty (message = "The product name must not be null.")
    private String productName;
	
    @Column(name="PRODUCTCATEGORY")
    private String productCategory;
    
    @Column(name="PRODUCTDESCRIPTION")
    private String productDescription;
    
    @Column(name="PRODUCTPRICE") 
   @Min(value = 0, message = "The product price must no be less then zero.")
    private double productPrice;
    
    @Column(name="PRODUCTCONDITION")
    private String productCondition;
    
    @Column(name="PRODUCTSTATUS")
    private String productStatus;
    
    
    @Column(name="UNITINSTOCK")
    @Min(value = 0, message = "The product unit must not be less than zero.")
    private int unitInStock;
    
    @Column(name="PRODUCTMANUFACTURER") 
    private String productManufacturer;

    @Transient
    private MultipartFile productImage;

    public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }
}
