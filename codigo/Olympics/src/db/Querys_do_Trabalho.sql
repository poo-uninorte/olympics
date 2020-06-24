-- Query's Usadas no trabalho

-- Selecionar o esporte com a modalidade
SELECT * FROM Modalidade m, Esporte e where m.ID_Esporte = e.ID_Esporte;

-- Seleciona todas as informações filtradas do sistema
SELECT 
a.Nome as "Nome Atleta",a.Genero as "Genero",p.Nome as "Pais",e.Nome as "Esporte",mo.Nome as "Modalidade",me.Nome as "Medalha"
FROM  
Medalha me join Atleta a on me.ID_Medalha = a.ID_Medalha 
    join Pais p  on a.ID_Pais = p.ID_Pais 
        join  Modalidade_Atleta ma on ma.ID_Atleta = a.ID_Atleta 
            join Modalidade mo on ma.ID_Modalidade = mo.ID_Modalidade 
                join Esporte e on mo.ID_Esporte = e.ID_Esporte;
                
-- Seleciona todas as informações filtradas do sistema Modificada

SELECT 
at.Nome as "Nome Atleta",at.Genero as "Genero",pa.Nome as "Pais",es.Nome as "Esporte",mo.Nome as "Modalidade",me.Nome as "Medalha"
FROM  
Pais pa join Atleta at on pa.ID_Pais = at.ID_Pais 
    left join Premiacao pr on at.ID_Atleta = pr.ID_Atleta
       left join Medalha me on pr.ID_Medalha = me.ID_Medalha
          left join Modalidade mo on pr.ID_Modalidade = mo.ID_Modalidade
               left join Esporte es on mo.ID_Esporte = es.ID_Esporte;