USE KSC_5038DW
GO

-- Inserting Data in Customers
INSERT INTO dim_Customers(Customer_Name, Customer_Mobile, Customer_Email) VALUES('Smit', '8128389164', 'smtbos@gmail.com');
GO

INSERT INTO dim_Customers(Customer_Name, Customer_Mobile, Customer_Email) VALUES('Urmil', '6354634577', 'urmil@gmail.com');
GO

INSERT INTO dim_Customers(Customer_Name, Customer_Mobile, Customer_Email) VALUES('Jay', '4455889966', 'jay@gmail.com');
GO

-- Inserting Data in Tables
INSERT INTO dim_Tables(Table_Title) VALUES('TBL-1');
GO

INSERT INTO dim_Tables(Table_Title) VALUES('TBL-2');
GO

-- Inserting Data in Waietrs
INSERT INTO dim_Waiters(Waiter_Name, Waiter_Mobile) VALUES('Amit', '4455998866');
GO


INSERT INTO dim_Waiters(Waiter_Name, Waiter_Mobile) VALUES('Keshav', '8877996655');
GO

-- Inserting Data in Products
INSERT INTO dim_Products(Product_Name, Product_Price) VALUES('Vada Pav', 80);
GO

INSERT INTO dim_Products(Product_Name, Product_Price) VALUES('Dhokla', 50);
GO

INSERT INTO dim_Products(Product_Name, Product_Price) VALUES('Thepla', 2);
GO