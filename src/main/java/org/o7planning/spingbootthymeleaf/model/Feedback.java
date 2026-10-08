package org.o7planning.spingbootthymeleaf.model;

public class Feedback {

    private String name;
    private String email;
    private int rating;
    private String service;
    private String message;
    private int productRating = 5;
    private String comment;
    private boolean showUsername;
    private int sellerRating = 5;
    private int deliveryRating = 5;

    public Feedback() {}

    public Feedback(String name, String email, int rating, String service, String message) {
        this.name = name;
        this.email = email;
        this.rating = rating;
        this.service = service;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getProductRating() {
        return productRating;
    }

    public void setProductRating(int productRating) {
        this.productRating = productRating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isShowUsername() {
        return showUsername;
    }

    public void setShowUsername(boolean showUsername) {
        this.showUsername = showUsername;
    }

    public int getSellerRating() {
        return sellerRating;
    }

    public void setSellerRating(int sellerRating) {
        this.sellerRating = sellerRating;
    }

    public int getDeliveryRating() {
        return deliveryRating;
    }

    public void setDeliveryRating(int deliveryRating) {
        this.deliveryRating = deliveryRating;
    }
}
