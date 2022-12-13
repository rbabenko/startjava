DROP DATABASE IF EXISTS jaegers;

CREATE DATABASE jaegers;
\c jaegers;

CREATE TABLE jaegers
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