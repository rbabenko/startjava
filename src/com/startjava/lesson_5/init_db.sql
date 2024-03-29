\c jaegers;

INSERT INTO jaegers(modelName, mark, height, weight, status, origin, launch, kaijuKill)
VALUES ('Gipsy Danger', 'Mark-3', 79.25, 1.98, 'Destroyed', 'United States of America',
        TO_DATE('10-07-2017', 'DD-MM-YYYY'), 9),
       ('Cherno Alpha', 'Mark-1', 85.34, 2.412, 'Destroyed', 'Russia', TO_DATE('2015', 'YYYY'), 6),
       ('Coyote Tango', 'Mark-1', 85.34, 2.312, 'Destroyed', 'Japan', TO_DATE('30-12-2015', 'DD-MM-YYYY'), 2),
       ('Crimson Typhoon', 'Mark-4', 76.2, 1.722, 'Destroyed', 'China', TO_DATE('22-08-2018', 'DD-MM-YYYY'), 7),
       ('Striker Eureka', 'Mark-5', 76.2, 1.85, 'Destroyed', 'Australia', TO_DATE('02-11-2019', 'DD-MM-YYYY'), 11),
       ('Saber Athena', 'Mark-7', 76.91, 1.628, 'Destroyed', 'United States of America',
        TO_DATE('20-12-2033', 'DD-MM-YYYY'), 1),
       ('Guardian Bravo', 'Mark-6', 73.21, 1.975, 'Active', 'Australia', TO_DATE('15-12-2033', 'DD-MM-YYYY'), 1),
       ('Bracer Phoenix', 'Mark-5', 70.91, 2.128, 'Destroyed', 'United States of America',
        TO_DATE('01-11-2025', 'DD-MM-YYYY'), 1),
       ('Romeo Blue', 'Mark-1', 77.72, 7.775, 'Destroyed', 'United States of America',
        TO_DATE('15-12-2015', 'DD-MM-YYYY'), 2),
       ('Tacit Ronin', 'Mark-1', 74.37, 7.450, 'Destroyed', 'Japan', TO_DATE('06-12-2015', 'DD-MM-YYYY'), 2);