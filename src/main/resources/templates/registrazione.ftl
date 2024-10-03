<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/registrazione.css">
        <title>MemenDoc</title>
    </head>
    <body>
        <!-- Header -->
    
    <header class="header">
        <div class="header__content">
  
          <!-- Logo -->
          <a class="" href="">
            <img class="logo" src="immagini/logo__projectwork.png" alt="logo" />
          </a>
  
          <!-- Menu -->
          <ul class="header__menu">
          <li><a href="/home">Home</a></li>			         
          <li><a href="/supporto">Support</a></li>
          <li><a href="/login">Accedi</a></li>
          <li><a href="/registrazione">Registrati</a></li>
        </ul>
  
          <!-- Hamburger -->
          <div class="header__icons">
              <div class="icon-hamburger" id="hamburger">
                  <span></span>
                  <span></span>
              </div>
          </div>
        </div>
      </header>

      <!-- Main -->
        <div class="main">
        <div class="form">
            <form action="/registrati" method="post">
        <p class="title">Registrati </p>
        <p class="message">Registrati ora e ottieni l'accesso all'app. </p>
            <label>
            <input required="" name="nome" placeholder="" type="text" class="input">
            <span>Nome</span>
            </label>
    
            <label>
             <input required="" name="cognome" placeholder="" type="text" class="input">
            <span>Cognome</span>
            </label>
    <label>
    <input required="" name="email" placeholder="" type="email" class="input">
    <span>Email</span>
    </label> 
    
    <label>
        <input required="" name="telefono" placeholder="" type="text" class="input">
        <span>Numero di telefono</span>
        </label> 
    
    <label>
    <input required="" name="password" placeholder="" type="password" class="input">
    <span>Password</span>
    </label>
    <label>
    <input required="" placeholder="" type="password" class="input">
    <span>Conferma password</span>
     </label>
    <h3>Hai già un account? <a href="/login" method="post">Accedi</a> </h3>
     <div class="bottone">
        <button class="submit">Conferma</button>
    </div>
    </form>
    </div>
    </div>
    <!-- Footer-->
    <footer class="footer__content">
        <div class="powered">
          <h1>Powered by Generation</h1>
        </div>
        <div class="terms">
          <a href="#"><p>Termini e Condizioni</p></a>
          <a href="#"><p>Informazioni Aziendali</p></a>
          <a href="#"><p>Copyright e Note Legali</p></a>
          <a href="#"><p>Informativa sulle Cookie</p></a>
          <a href="#"><p>Informativa sulla privacy</p></a>
        </div>
        <div class="gene">
        <p>© 2021 - All rights reserved</p>
        </div>
      </footer>
  
        <!-- Script-->
      <script src="javascript/script.js"></script>
    </body>
</html>