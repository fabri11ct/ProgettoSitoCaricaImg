<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <title>MemenDoc</title>
    
</head>

<body>
     <!-- Header -->
    
    <header class="header">
      <div class="header__content">

        <!-- Logo -->
        <a class="" href="/home">
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
    <div class="main">
    
       
        <div class="form">
            <form action="/selezionautenti" method="post">
            <p class="title"> Login </p>
            
      <label>
          <input required="" placeholder="" type="email" name="email" class="input">
          <span>Email</span>
      </label> 
          
      <label>
          <input required="" placeholder="" name="password" type="password" class="input">
          <span>Password</span>
      </label>
      <h3>Non sei ancora registrato? <a href="/registrazione" method="post">Registrati</a> </h3>
      <div class="bottone">
        <button class="submit">Accedi</button>
    </div>
        </div>
    </form>
    </div>
    <!-- Footer-->
    
    
    <footer class="footer__content">

      <div class="terms">
        <a href="#"><p>Termini e Condizioni</p></a>
        <a href="#"><p>Informazioni Aziendali</p></a>
        <a href="#"><p>Copyright e Note Legali</p></a>
        <a href="#"><p>Informativa sulle Cookie</p></a>
        <a href="#"><p>Informativa sulla privacy</p></a>
      </div>
      <div class="powered">
        <h1>Powered by Generation</h1>
      </div>
      <div class="gene">
      <p class="reserved">© 2021 - All rights reserved</p>
      </div>
    </footer>


    <!-- Script-->
    <script>
      let item = document.querySelector('.icon-hamburger');
        item.addEventListener("click", function(){
          document.body.classList.toggle('menu-open');
      })

      document.getElementById("hamburger").addEventListener("click", function() {
        var menu = document.querySelector(".header__menu");
          menu.classList.toggle("menu-open");
      })
    </script>
</body>
</html>