CREATE TABLE IF NOT EXISTS persons
(
    name           varchar,
    surname        varchar,
    age            int,
    phone_number   varchar,
    city_of_living varchar,
    primary key (name, surname, age)
);

INSERT INTO persons
VALUES ('name 1', 'surname 1', 25, '8911', 'SPB'),
       ('name 2', 'surname 2', 22, '8911', 'SPB'),
       ('name 3', 'surname 3', 23, '8911', 'Moscow'),
       ('name 4', 'surname 4', 24, '8911', 'SPB'),
       ('name 5', 'surname 5', 77, '8911', 'SPB');
