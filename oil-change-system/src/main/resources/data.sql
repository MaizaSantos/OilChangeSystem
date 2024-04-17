INSERT INTO customer (name, email, phone) VALUES ('Maíza', 'maiza@gmail.com', '11912345678');
INSERT INTO customer (name, email, phone) VALUES ('Erick', 'erick@gmail.com', '11989430216');
INSERT INTO customer (name, email, phone) VALUES ('Francisco', 'francisco@gmail.com', '11903126458');
INSERT INTO customer (name, email, phone) VALUES ('Tonin', 'toninho@gmail.com', '11952104789');
INSERT INTO customer (name, email, phone) VALUES ('Wesley', 'wesley@gmail.com', '11963205489');

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km) VALUES (1, 'Toyota', 'Corolla', 'Black', 2020,
'2.0 16V', 'ABC-1235', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 4, true, 'Total 5W-30', 30257);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km) VALUES (2, 'Ford', 'Ka', 'Black', 2008, '1.0 8V',
'ABC-1234', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 4, false, 'Total 5W-30', 161811);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km) VALUES (3, 'Audi', 'A3 Sportback', 'White', 2012,
'2.0 TFSI Stronic', 'ABC-1236', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 5, true, 'Total 5W-30', 123852);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km) VALUES (3, 'Chevrolet', 'Sonic', 'Silver', 2009,
'1.0 8V', 'SNC-5481', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 5, false, '0W-30', 162584);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km) VALUES (4, 'BMW', 'X1', 'White', 2010,
'2.0 16V', 'CDC-0234', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 6, true, 'Total 5W-30', 98257);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km) VALUES (5, 'Honda', 'Civic', 'Black', 2013,
'2.0 16V', 'JKS-0348', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 4, false, '6J-12', 110548);

INSERT INTO service (name) VALUES ('Troca de óleo do motor');
INSERT INTO service (name) VALUES ('Troca de filtro de ar');
INSERT INTO service (name) VALUES ('Troca de filtro de óleo');
INSERT INTO service (name) VALUES ('Troca de filtro de combustível');
INSERT INTO service (name) VALUES ('Troca de filtro de cabine');

INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (1, 1, 1, '2023-08-25');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (2, 2, 3, '2024-02-28');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (3, 3, 4, '2022-09-15');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (4, 5, 2, '2024-01-31');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (5, 6, 5, '2023-06-14');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (3, 4, 2, '2021-11-13');
