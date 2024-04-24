INSERT INTO customer (name, email, phone, is_active) VALUES ('Maíza', 'maiza@gmail.com', '11912345678', true);
INSERT INTO customer (name, email, phone, is_active) VALUES ('Erick', 'erick@gmail.com', '11989430216', true);
INSERT INTO customer (name, email, phone, is_active) VALUES ('Francisco', 'francisco@gmail.com', '11903126458', true);
INSERT INTO customer (name, email, phone, is_active) VALUES ('Tonin', 'toninho@gmail.com', '11952104789', true);
INSERT INTO customer (name, email, phone, is_active) VALUES ('Wesley', 'wesley@gmail.com', '11963205489', false);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km, is_active) VALUES (1, 'Toyota', 'Corolla', 'Black',
2020, '2.0 16V', 'ABC-1235', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 4, true, 'Total 5W-30', 30257, true);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km, is_active) VALUES (2, 'Ford', 'Ka', 'Black', 2008,
'1.0 8V', 'ABC-1234', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 4, false, 'Total 5W-30', 161811, true);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km, is_active) VALUES (3, 'Audi', 'A3 Sportback', 'White',
2012, '2.0 TFSI Stronic', 'ABC-1236', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 5, true, 'Total 5W-30', 123852, true);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km, is_active) VALUES (3, 'Chevrolet', 'Sonic', 'Silver',
2009, '1.0 8V', 'SNC-5481', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 5, false, '0W-30', 162584, true);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km, is_active) VALUES (4, 'BMW', 'X1', 'White', 2010,
'2.0 16V', 'CDC-0234', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 6, true, 'Total 5W-30', 98257, true);

INSERT INTO vehicle (customer_id, brand, model, color, production_year, motor, plate, fuel_filter, motor_filter,
oil_filter, cabin_filter, sump_capacity, sump_protector, oil, km, is_active) VALUES (5, 'Honda', 'Civic', 'Black', 2013,
'2.0 16V', 'JKS-0348', 'PSC411', 'ART 9614', 'TM 1', 'ACP 205', 4, false, '6J-12', 110548, false);

INSERT INTO service (name, is_active) VALUES ('Troca de óleo do motor', true);
INSERT INTO service (name, is_active) VALUES ('Troca de filtro de ar', true);
INSERT INTO service (name, is_active) VALUES ('Troca de filtro de óleo', true);
INSERT INTO service (name, is_active) VALUES ('Troca de filtro de combustível', true);
INSERT INTO service (name, is_active) VALUES ('Troca de filtro de cabine', false);

INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (1, 1, 1, '2024-04-23T18:35:30.581247100');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (2, 2, 3, '2024-03-20T17:15:20.581247100');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (3, 3, 4, '2022-01-12T16:45:21.581247100');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (4, 5, 2, '2021-07-09T14:02:23.581247100');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (5, 6, 5, '2021-12-15T11:59:59.581247100');
INSERT INTO service_record (customer_id, vehicle_id, service_id, date) VALUES (3, 4, 2, '2023-11-30T01:32:25.581247100');
