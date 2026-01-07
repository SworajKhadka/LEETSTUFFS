CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
DETERMINISTIC
BEGIN
  -- Correct DECLARE and SET with semicolons
  DECLARE m INT;
  SET m = N - 1;

  RETURN (
      # Correct LIMIT syntax (1 row, starting at offset m)
      SELECT DISTINCT salary 
      FROM Employee
      ORDER BY salary DESC
      LIMIT 1 OFFSET m
  );
END
