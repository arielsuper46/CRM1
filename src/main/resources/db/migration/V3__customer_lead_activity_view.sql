CREATE VIEW customer_lead_activity_view AS
SELECT
    c.id AS customer_id,
    c.name AS customer_name,
    c.email AS customer_email,
    c.created_at AS customer_created_at,
    l.id AS lead_id,
    l.name AS lead_name,
    l.status AS lead_status,
    l.source AS lead_source,
    l.created_at AS lead_created_at,
    a.id AS activity_id,
    a.description AS activity_description,
    a.date AS activity_date
FROM
    customer c
        LEFT JOIN
    leads l ON c.id = l.customer_id
        LEFT JOIN
    activity a ON l.id = a.lead_id;
