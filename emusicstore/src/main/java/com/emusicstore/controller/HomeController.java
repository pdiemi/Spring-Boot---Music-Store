package com.emusicstore.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;


/**
 * Created by Le on 1/2/2016.
 */

@Controller
public class HomeController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/")
    public String home() {
        return "home";
    }


    @RequestMapping("/productList")
    public String getProducts(Model model) {
    	Iterable<Product> products = productDao.findAll();
    	List<Product> prodList = new ArrayList<Product>();
    	
    	for(Product sinProd : products){
    		prodList.add(sinProd);
    	}
        model.addAttribute("products", prodList);

        return "productList";
    }

    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model) throws IOException{

        Product product = productDao.findOne(Integer.parseInt(productId));
        model.addAttribute(product);

        return "viewProduct";
    }

   
}
