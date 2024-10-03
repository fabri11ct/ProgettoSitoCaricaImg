<html>
<head></head>
<body>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
<form action="/aggiorna/${utente.idutente}" method="get">

	<caption>
		<h2></h2>
	</caption>


	<fieldset class="form-group">
		<label>Nome</label> <input type="text"
			value="${utente.nome}" class="form-control"
			name="nome">
	</fieldset>

	<fieldset class="form-group">
		<label>Cognome</label> <input type="text"
			value="${utente.cognome}" class="form-control"
			name="cognome">
	</fieldset>
<fieldset class="form-group">
		<label>Email</label> <input type="text"
			value="${utente.email}" class="form-control"
			name="email">
	</fieldset>
	<fieldset class="form-group">
		<label>Password</label> <input type="text"
			value="${utente.password}" class="form-control"
			name="password">
	</fieldset>

	<button type="submit" class="btn btn-success">Save</button>
</form>
</div>
		</div>
	</div>
</form> 
</body>
<html>