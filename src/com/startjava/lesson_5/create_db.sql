DROP DATABASE IF EXISTS Jaegers;

CREATE DATABASE Jaegers;
\c Jaegers;

CREATE TABLE Jaegers
(
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      TEXT,
    height    NUMERIC(5, 2),
    weight    NUMERIC(5, 3),
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);