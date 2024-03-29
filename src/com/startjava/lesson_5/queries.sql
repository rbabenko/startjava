\c jaegers;

SELECT * FROM jaegers;

SELECT * FROM jaegers WHERE status != 'Destroyed';

SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-4');

SELECT * FROM jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4');

SELECT * FROM jaegers ORDER BY mark DESC;

SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);

SELECT AVG(weight) FROM jaegers;

UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status != 'Destroyed';

DELETE FROM jaegers WHERE status = 'Destroyed';