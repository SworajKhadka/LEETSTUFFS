select x,y,z,
case 
when x+y<=z then 'No'  
when x-y>=z or y-x>=z then 'No' 
when x<=0 or y<=0 or z<=0 then 'No' 
else 'Yes'
end as triangle 
from Triangle;