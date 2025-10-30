# Write your MySQL query statement below
SELECT per.firstName, per.lastName, ad.city, ad.state FROM PERSON AS PER
left JOIN ADDRESS AS AD ON per.PERSONID=ad.PERSONID;