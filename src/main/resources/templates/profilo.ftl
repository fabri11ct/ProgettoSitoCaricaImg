<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MemenDoc</title>
    <link rel="stylesheet" href="css/profile.css">
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
            <li><a href="/supporto">Supporto</a></li>
            <li><a href="/profilo">Profilo</a></li>
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


        <!-- Main  Content -->
      <main class="main__container">
        <div class="profile__container">
          
          <!-- Profile Image -->
            <div class="profile__pic">
              <img src="immagini/img-profile.jpg" alt="profile-pic"/>
            </div>

            <!-- User Information -->
            <div class="profile__info">
              <div class="card">
                <div class="card-header">
                  <div class="text-header">Profilo</div>
                </div>
                <div class="card-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="nome">Nome</label>
                      <input readonly value="${session.getAttribute("nome")}" required="" class="form-control" name="nome" id="nome" type="text">
                    </div>
                    <div class="form-group">
                      <label for="cognome">Cognome</label>
                      <input readonly value="${session.getAttribute("cognome")}" required="" class="form-control" name="cognome" id="cognome" type="text">
                    </div>
                    <div class="form-group">
                      <label for="cognome">Cellulare</label>
                      <input readonly value="" required="" class="form-control" name="tel" id="tel" type="tel">
                    </div>
                    <div class="form-group">
                      <label for="email">Email</label>
                      <input readonly value="${session.getAttribute("email")}" required="" class="form-control" name="email" id="email" type="email">
                    </div>
                  </form>
                </div>
              </div>
              
            <!-- Preference Button -->  
            </div>
            <div class="buttone">
              <button >
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-gear" viewBox="0 0 16 16">
                <path d="M8 4.754a3.246 3.246 0 1 0 0 6.492 3.246 3.246 0 0 0 0-6.492M5.754 8a2.246 2.246 0 1 1 4.492 0 2.246 2.246 0 0 1-4.492 0"/>
                <path d="M9.796 1.343c-.527-1.79-3.065-1.79-3.592 0l-.094.319a.873.873 0 0 1-1.255.52l-.292-.16c-1.64-.892-3.433.902-2.54 2.541l.159.292a.873.873 0 0 1-.52 1.255l-.319.094c-1.79.527-1.79 3.065 0 3.592l.319.094a.873.873 0 0 1 .52 1.255l-.16.292c-.892 1.64.901 3.434 2.541 2.54l.292-.159a.873.873 0 0 1 1.255.52l.094.319c.527 1.79 3.065 1.79 3.592 0l.094-.319a.873.873 0 0 1 1.255-.52l.292.16c1.64.893 3.434-.902 2.54-2.541l-.159-.292a.873.873 0 0 1 .52-1.255l.319-.094c1.79-.527 1.79-3.065 0-3.592l-.319-.094a.873.873 0 0 1-.52-1.255l.16-.292c.893-1.64-.902-3.433-2.541-2.54l-.292.159a.873.873 0 0 1-1.255-.52zm-2.633.283c.246-.835 1.428-.835 1.674 0l.094.319a1.873 1.873 0 0 0 2.693 1.115l.291-.16c.764-.415 1.6.42 1.184 1.185l-.159.292a1.873 1.873 0 0 0 1.116 2.692l.318.094c.835.246.835 1.428 0 1.674l-.319.094a1.873 1.873 0 0 0-1.115 2.693l.16.291c.415.764-.42 1.6-1.185 1.184l-.291-.159a1.873 1.873 0 0 0-2.693 1.116l-.094.318c-.246.835-1.428.835-1.674 0l-.094-.319a1.873 1.873 0 0 0-2.692-1.115l-.292.16c-.764.415-1.6-.42-1.184-1.185l.159-.291A1.873 1.873 0 0 0 1.945 8.93l-.319-.094c-.835-.246-.835-1.428 0-1.674l.319-.094A1.873 1.873 0 0 0 3.06 4.377l-.16-.292c-.415-.764.42-1.6 1.185-1.184l.292.159a1.873 1.873 0 0 0 2.692-1.115z"/>
                </svg>
              </button></a>
            </div>
        </div>

        <!-- Documents Collect -->

        <!-- First Document -->
        <div class="doc__container">
          
            <form action="/inserisciImmagine" method="post" enctype="multipart/form-data">
   			 <input type="file" name="immagine">
    			<input type="submit" value="Carica">
   	            </form>
   
            </label>
            <div class="bottoncini">
             <a href="/qrgenerator"> <button>
              <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-qr-code" viewBox="0 0 16 16">
                <path d="M2 2h2v2H2z"/>
                <path d="M6 0v6H0V0zM5 1H1v4h4zM4 12H2v2h2z"/>
                <path d="M6 10v6H0v-6zm-5 1v4h4v-4zm11-9h2v2h-2z"/>
                <path d="M10 0v6h6V0zm5 1v4h-4V1zM8 1V0h1v2H8v2H7V1zm0 5V4h1v2zM6 8V7h1V6h1v2h1V7h5v1h-4v1H7V8zm0 0v1H2V8H1v1H0V7h3v1zm10 1h-1V7h1zm-1 0h-1v2h2v-1h-1zm-4 0h2v1h-1v1h-1zm2 3v-1h-1v1h-1v1H9v1h3v-2zm0 0h3v1h-2v1h-1zm-4-1v1h1v-2H7v1z"/>
                <path d="M7 12h1v3h4v1H7zm9 2v2h-3v-1h2v-1z"/>
              </svg></button></a>
              <a href=/listaImmagini><button><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-file-earmark" viewBox="0 0 16 16">
                <path d="M14 4.5V14a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V2a2 2 0 0 1 2-2h5.5zm-3 0A1.5 1.5 0 0 1 9.5 3V1H4a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h8a1 1 0 0 0 1-1V4.5z" />
              </svg></button></a>
              <button><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
                <path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5M11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47M8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5"/>
              </svg></button>
            </div>
        </div>
       
      </main>








      
      
      
      
      
      
      
      <!-- Footer -->
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
        <p class="reserved">© 2021 All rights reserved</p>
        </div>
      </footer>

      <!-- Script-->
    <script src="script.js"></script>
    
</body>
</html>