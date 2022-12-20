-- select
-- ANSII
select ContactName, CompanyName, City from Customers

select * from Customers where City = 'Madrid'

-- Case insensitive
select * from Products where CategoryID = 1 or CategoryID = 3 

select * from Products where CategoryID = 1 and UnitPrice >= 10  

select * from Products order by UnitPrice asc --(order by == sıralamak)--(ascending(asc)== artan/----/descending(desc)== düşen,azalan)

select count(*) Adet from Products

select CategoryID,count(*) Adet from Products group by CategoryID having count(*) < 10


select Products.ProductID, Products.Productname, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice > 10 

select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o 
on o.OrderID = od.OrderID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null 



