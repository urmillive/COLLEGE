USE KSC_5038DW
GO

/*	
	Let Smit(1) Order is Something Like This
	Table Name : TBL-2 (2)
	Waiter Name : Amit (1)
	Food Items is As Follows
	Sr.	Name		Qty	Price	Total
	1	Vada Pav(1)	4	80		360	
	2	Thepla(3)	2	2		  4
	3	Dhokla		1	50		 50
						Total - 414		

	Date is 2021-02-24
*/

-- Let Enter First Order Header
INSERT INTO dim_Order_Headers(Order_Header_Date, Order_Header_Total, Order_Header_Payment) VALUES('2021-02-24', 414, 'Done'); -- ID = 1
GO

-- Let Register Order
INSERT INTO fact_Sales_Orders(Sales_Order_Header, Sales_Order_Customer, Sales_Order_Table, Sales_Order_Waiter) VALUES(1, 1, 2, 1);

-- Let Add Product Sales, 
-- Let Assuem Order id is = 1
INSERT INTO dim_Product_Sales (Product_Sale_Order, Product_Sale_Product, Product_Sale_Quantity, Product_Sale_Price, Product_Sale_Total) VALUES(1, 1, 4, 80, 360);
GO

INSERT INTO dim_Product_Sales (Product_Sale_Order, Product_Sale_Product, Product_Sale_Quantity, Product_Sale_Price, Product_Sale_Total) VALUES(1, 3, 2, 2, 4);
GO

INSERT INTO dim_Product_Sales (Product_Sale_Order, Product_Sale_Product, Product_Sale_Quantity, Product_Sale_Price, Product_Sale_Total) VALUES(1, 2, 1, 50, 50);
GO