
-- US 01
select count(id) from users; --
-- 1855

select count(distinct id) from users;
-- 1855


-- RESULT --> MANUALLY IT IS PASSED


-- US 02
select * from users;



-- US 02
select count(*) from book_borrow
where is_returned=0;

-- US 03
SELECT * FROM book_categories;

-- US 04
SELECT * FROM books
where name like 'Clean Code';

-- US5
-- count the categories

