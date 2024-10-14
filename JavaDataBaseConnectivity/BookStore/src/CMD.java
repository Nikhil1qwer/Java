public enum CMD {
    ADDUSER("INSERT INTO `Customers` (`first_name`, `last_name`, `email`, `phone`, `address`) VALUES (?, ?, ?, ?, ?);"),
    GETUSER("SELECT * FROM `Customers` WHERE `email` = ?;"),
    PLACEORDER("INSERT INTO `OrderDetails` (`order_id`, `book_id`, `quantity`, `price`) VALUES (?, ?, ?, ?);");
    
    private String value;
    CMD(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
