--test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50),  birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım
CREATE TABLE employee (
	id INT NOT NULL, 
	name VARCHAR(50) NOT NULL,
	birthday DATE NOT NULL,
	email VARCHAR(100) NOT NULL
);

-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Ardyce', '1985-04-27', 'acolvine0@upenn.edu');
insert into employee (id, name, birthday, email) values (2, 'Bethany', '1988-01-12', 'bbrounsell1@g.co');
insert into employee (id, name, birthday, email) values (3, 'Reynold', '1971-10-07', 'rellis2@google.com.hk');
insert into employee (id, name, birthday, email) values (4, 'Frayda', '2008-06-22', 'fcoke3@accuweather.com');
insert into employee (id, name, birthday, email) values (5, 'Ivett', '1968-04-10', 'idorre4@so-net.ne.jp');
insert into employee (id, name, birthday, email) values (6, 'Ania', '1922-02-23', 'ayeandel5@icq.com');
insert into employee (id, name, birthday, email) values (7, 'Van', '2017-02-05', 'vpankettman6@state.gov');
insert into employee (id, name, birthday, email) values (8, 'Cece', '1964-07-25', 'cosesnane7@reverbnation.com');
insert into employee (id, name, birthday, email) values (9, 'Hugues', '1930-03-02', 'hmolohan8@ezinearticles.com');
insert into employee (id, name, birthday, email) values (10, 'Drucie', '2001-02-03', 'dthompson9@imageshack.us');
insert into employee (id, name, birthday, email) values (11, 'Filia', '1976-07-29', 'flambolea@bbb.org');
insert into employee (id, name, birthday, email) values (12, 'Lloyd', '1978-11-16', 'lraimanb@usnews.com');
insert into employee (id, name, birthday, email) values (13, 'Roseann', '1926-02-24', 'rmccroriec@paginegialle.it');
insert into employee (id, name, birthday, email) values (14, 'Imelda', '2021-10-19', 'ivasyutochkind@i2i.jp');
insert into employee (id, name, birthday, email) values (15, 'Stefania', '1979-12-18', 'srickaerte@qq.com');
insert into employee (id, name, birthday, email) values (16, 'Rhoda', '1938-06-22', 'rshropsheirf@linkedin.com');
insert into employee (id, name, birthday, email) values (17, 'Elaine', '1979-12-02', 'edarraghg@businessweek.com');
insert into employee (id, name, birthday, email) values (18, 'Charmane', '1994-03-26', 'colomanh@china.com.cn');
insert into employee (id, name, birthday, email) values (19, 'Tana', '1982-04-29', 'tenticknapi@stumbleupon.com');
insert into employee (id, name, birthday, email) values (20, 'Doe', '1981-12-02', 'dwitherupj@youtu.be');
insert into employee (id, name, birthday, email) values (21, 'Delcina', '1934-08-30', 'djanusk@wikipedia.org');
insert into employee (id, name, birthday, email) values (22, 'Nicolai', '1926-06-18', 'nraspl@acquirethisname.com');
insert into employee (id, name, birthday, email) values (23, 'Cherie', '1932-12-09', 'cspeechleym@theglobeandmail.com');
insert into employee (id, name, birthday, email) values (24, 'Cairistiona', '1975-07-04', 'cmeaghn@webs.com');
insert into employee (id, name, birthday, email) values (25, 'Rhianna', '2014-11-13', 'rchomiczo@nymag.com');
insert into employee (id, name, birthday, email) values (26, 'Guinevere', '2001-11-30', 'gberanp@sfgate.com');
insert into employee (id, name, birthday, email) values (27, 'Natale', '2012-12-21', 'nmcallasterq@rambler.ru');
insert into employee (id, name, birthday, email) values (28, 'Venus', '2005-06-12', 'vcockshutr@bloomberg.com');
insert into employee (id, name, birthday, email) values (29, 'Hartwell', '1963-10-11', 'hesmeads@mediafire.com');
insert into employee (id, name, birthday, email) values (30, 'Bryan', '1925-01-13', 'bhargeyt@flavors.me');
insert into employee (id, name, birthday, email) values (31, 'Ainslie', '1996-04-04', 'abahikeu@samsung.com');
insert into employee (id, name, birthday, email) values (32, 'Dominga', '1964-11-05', 'dkieferv@nps.gov');
insert into employee (id, name, birthday, email) values (33, 'Adan', '1992-07-17', 'adrysdellw@instagram.com');
insert into employee (id, name, birthday, email) values (34, 'Ailene', '1987-07-23', 'asearbyx@bravesites.com');
insert into employee (id, name, birthday, email) values (35, 'Jackie', '1932-11-08', 'jlockery@dailymotion.com');
insert into employee (id, name, birthday, email) values (36, 'Angelia', '1999-01-21', 'aadlemz@sogou.com');
insert into employee (id, name, birthday, email) values (37, 'Say', '2014-07-20', 'schidgey10@ucla.edu');
insert into employee (id, name, birthday, email) values (38, 'Jacquelyn', '1976-03-10', 'jkorba11@123-reg.co.uk');
insert into employee (id, name, birthday, email) values (39, 'Konstanze', '1996-01-18', 'kadrain12@taobao.com');
insert into employee (id, name, birthday, email) values (40, 'Edgar', '1930-11-01', 'estrutley13@guardian.co.uk');
insert into employee (id, name, birthday, email) values (41, 'Kingsly', '1983-07-28', 'ktrunkfield14@weather.com');
insert into employee (id, name, birthday, email) values (42, 'Millie', '2006-12-30', 'mruppert15@yelp.com');
insert into employee (id, name, birthday, email) values (43, 'Andras', '1995-11-23', 'aleist16@alexa.com');
insert into employee (id, name, birthday, email) values (44, 'Lark', '1978-09-02', 'lheinssen17@parallels.com');
insert into employee (id, name, birthday, email) values (45, 'Avrit', '1985-06-01', 'aingrem18@jigsy.com');
insert into employee (id, name, birthday, email) values (46, 'Tanitansy', '1995-01-16', 'tvalentinuzzi19@psu.edu');
insert into employee (id, name, birthday, email) values (47, 'Jorry', '1941-07-13', 'jloosemore1a@furl.net');
insert into employee (id, name, birthday, email) values (48, 'Ariel', '2008-05-09', 'afrugier1b@yolasite.com');
insert into employee (id, name, birthday, email) values (49, 'Morgan', '1945-06-21', 'mscanes1c@123-reg.co.uk');
insert into employee (id, name, birthday, email) values (50, 'Elston', '1948-06-24', 'elast1d@taobao.com');

--  Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET 
    name = 'Patika',
    email = 'java@patika.dev'
WHERE id = 17;	

UPDATE employee
SET name = 'Dummy'
WHERE id = 49;

UPDATE employee
SET name = 'Dummy2'
WHERE name ILIKE 'A%' AND birthday < '1990-01-01'
RETURNING *;

UPDATE employee
SET name = 'Employee',
    email = 'employee@gmaik.com'
WHERE email LIKE '%comsenz.com';

UPDATE employee
SET name = 'SmallIds'
WHERE id BETWEEN 1 AND 5;

-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id = 21;  

DELETE FROM employee
WHERE id BETWEEN 17 AND 23;

DELETE FROM employee
WHERE email ILIKE '%google%';

DELETE FROM employee
WHERE name LIKE '%t';

DELETE FROM employee
WHERE birthday < '01-01-1925';

SELECT * FROM employee;
