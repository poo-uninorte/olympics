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
               
               
-- Selecionar Nome de Atletas com os total de medalhas

create view Podio_Atleta as
SELECT a.Nome as NomeAtleta,a.Genero as GeneroAtleta,
    (select count(ID_Medalha) from Premiacao premia where ID_Medalha = 1 and a.ID_Atleta=premia.ID_Atleta) as 'Medalha_de_Ouro',
        (select count(ID_Medalha) from Premiacao premia where ID_Medalha = 2 and a.ID_Atleta=premia.ID_Atleta) as 'Medalha_de_Prata',
            (select count(ID_Medalha) from Premiacao premia where ID_Medalha = 3 and a.ID_Atleta=premia.ID_Atleta) as 'Medalha_de_Bronze',
                (select count(ID_Medalha) from Premiacao premia where a.ID_Atleta=premia.ID_Atleta) as 'Total_de_Medalha'

    From Premiacao pre left join  Atleta a on a.ID_Atleta = pre.ID_Atleta 
         join Medalha me on pre.ID_Medalha = me.ID_Medalha
           join Modalidade mo on pre.ID_Modalidade = mo.ID_Modalidade
             group by a.ID_Atleta
                 order by 3 desc,4 desc,5 desc;
-- Selecionar Podio de Paises 

CREATE VIEW Podio_Pais as
SELECT pa.ID_Pais as IdPais, pa.Nome as NomePais,
  (select count(mo.ID_Modalidade)
    from Pais p join Atleta at on p.ID_Pais = at.ID_Pais 
         join Premiacao pr on at.ID_Atleta = pr.ID_Atleta 
          join Medalha me on pr.ID_Medalha = me.ID_Medalha
                join Modalidade mo on pr.ID_Modalidade = mo.ID_Modalidade
                     group by p.ID_Pais , pr.ID_Medalha HAVING pr.ID_Medalha = 1 and pa.ID_Pais = p.ID_Pais ) as Medalha_Ouro,
                     
     (select count(mo.ID_Modalidade)
    from Pais p join Atleta at on p.ID_Pais = at.ID_Pais 
         join Premiacao pr on at.ID_Atleta = pr.ID_Atleta 
          join Medalha me on pr.ID_Medalha = me.ID_Medalha
                join Modalidade mo on pr.ID_Modalidade = mo.ID_Modalidade
                     group by p.ID_Pais , pr.ID_Medalha HAVING pr.ID_Medalha = 2 and pa.ID_Pais = p.ID_Pais ) as Medalha_Prata,
                     
     (select count(mo.ID_Modalidade)
        from Pais p join Atleta at on p.ID_Pais = at.ID_Pais 
             join Premiacao pr on at.ID_Atleta = pr.ID_Atleta 
              join Medalha me on pr.ID_Medalha = me.ID_Medalha
                    join Modalidade mo on pr.ID_Modalidade = mo.ID_Modalidade
                         group by p.ID_Pais , pr.ID_Medalha HAVING pr.ID_Medalha = 3 and pa.ID_Pais = p.ID_Pais ) as Medalha_Broze,
                         
    (select count(pr.ID_Medalha)
        from Pais p join Atleta at on p.ID_Pais = at.ID_Pais 
             join Premiacao pr on at.ID_Atleta = pr.ID_Atleta 
              join Medalha me on pr.ID_Medalha = me.ID_Medalha
                    join Modalidade mo on pr.ID_Modalidade = mo.ID_Modalidade
                         group by p.ID_Pais HAVING pa.ID_Pais = p.ID_Pais ) as Medalha_Total
                     
from Pais pa 
           group by pa.ID_Pais 
           having Medalha_Ouro not null or Medalha_Prata not null or Medalha_Broze not null
           order by Medalha_Ouro desc, Medalha_Prata desc,  Medalha_Broze desc;
-- Atleta por pais

CREATE VIEW Atleta_Por_Pais as
SELECT pa.ID_Pais as IdPais,a.Nome as NomeAtleta,a.Genero as GeneroAtleta,
    (select count(ID_Medalha) from Premiacao premia where ID_Medalha = 1 and a.ID_Atleta=premia.ID_Atleta) as 'Medalha_de_Ouro',
        (select count(ID_Medalha) from Premiacao premia where ID_Medalha = 2 and a.ID_Atleta=premia.ID_Atleta) as 'Medalha_de_Prata',
            (select count(ID_Medalha) from Premiacao premia where ID_Medalha = 3 and a.ID_Atleta=premia.ID_Atleta) as 'Medalha_de_Bronze',
                (select count(ID_Medalha) from Premiacao premia where a.ID_Atleta=premia.ID_Atleta) as 'Total_de_Medalha'

FROM Pais pa left join Atleta a on pa.ID_Pais = a.ID_Pais
    left join Premiacao pr on a.ID_Atleta = pr.ID_Atleta
        join Medalha me on pr.ID_Medalha = me.ID_Medalha
           join Modalidade mo on pr.ID_Modalidade = mo.ID_Modalidade
             group by a.ID_Atleta
                order by 3 desc,4 desc,5 desc;
