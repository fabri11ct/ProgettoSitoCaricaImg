<!DOCTYPE html>
<html>
<head>
    <title>MemenDoc</title>
</head>
<body>
    <h1>Documenti dell'Utente: ${utente.nome} ${utente.cognome}</h1>
    <ul>
        <#list listaImmagine as immagine>   
           
           <#if utente.idutente==immagine.idutente>
      		<img src="/risultato/${immagine.id}">
        	</#if>
 
         </#list>
    </ul>
</body>
</html>