USE KSC_5038DW
GO

CREATE TABLE dim_Order_Headers(
	Order_Header_Id int PRIMARY KEY IDENTITY NOT NULL,
	Order_Header_Date date NOT NULL,
	Order_Header_Total int NOT NULL,
	Order_Header_Payment nchar(20) NOT NULL
);

CREATE TABLE dim_Customers(
	Customer_Id int PRIMARY KEY IDENTITY NOT NULL,
	Customer_Name nchar(40) NOT NULL,
	Customer_Mobile nchar(10) NOT NULL,
	Customer_Email nchar(100) NOT NULL
);

CREATE TABLE dim_Tables(
	Table_Id int PRIMARY KEY IDENTITY NOT NULL,
	Table_Title nchar(20) NOT NULL
);

CREATE TABLE dim_Waiters(
	Waiter_Id int PRIMARY KEY IDENTITY NOT NULL,
	Waiter_Name nchar(30) NOT NULL,
	Waiter_Mobile nchar(10) NOT NULL
);

CREATE TABLE fact_Sales_Orders(
	Sales_Order_Id int PRIMARY KEY IDENTITY NOT NULL,
	Sales_Order_Header int FOREIGN KEY REFERENCES dim_Order_Headers(Order_Header_Id) NOT NULL,
	Sales_Order_Customer int FOREIGN KEY REFERENCES dim_Customers(Customer_Id) NOT NULL,
	Sales_Order_Table int FOREIGN KEY REFERENCES dim_Tables(Table_Id) NOT NULL,
	Sales_Order_Waiter int FOREIGN KEY REFERENCES dim_Waiters(Waiter_Id) NOT NULL,
);

CREATE TABLE dim_Products(
	Product_Id int PRIMARY KEY IDENTITY NOT NULL,
	Product_Name nchar(30) NOT NULL,
	Product_Price int NOT NULL
);

CREATE TABLE dim_Product_Sales(
	Product_Sale_Id int PRIMARY KEY IDENTITY NOT NULL,
	Product_Sale_Order int FOREIGN KEY REFERENCES fact_Sales_Orders(Sales_Order_Id) NOT NULL,
	Product_Sale_Product int FOREIGN KEY REFERENCES dim_Products(Product_Id) NOT NULL,
	Product_Sale_Quantity int NOT NULL,
	Product_Sale_Price int NOT NULL,
	Product_Sale_Total int NOT NULL
);