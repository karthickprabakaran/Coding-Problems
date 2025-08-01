# Write your MySQL query statement below


select Employee.name, Bonus.Bonus from Employee 

left join Bonus on Employee.empId = Bonus.empID

where Bonus.bonus < 1000 or Bonus.bonus is null;