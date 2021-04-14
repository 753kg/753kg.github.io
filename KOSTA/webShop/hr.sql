select employee_id, first_name||last_name fullname
from EMPLOYEES
where employee_id in (select distinct manager_id from employees)