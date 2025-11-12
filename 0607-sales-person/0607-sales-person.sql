# Write your MySQL query statement below


select SalesPerson.name from SalesPerson where SalesPerson.sales_id  not in (
    select Orders.sales_id from Orders
    left join Company on Company.com_id = Orders.com_id
    where Company.name = "RED"
) order by SalesPerson.name asc;