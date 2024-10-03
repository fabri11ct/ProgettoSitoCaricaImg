<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>MemenDoc</title>
    <link rel="stylesheet" href="css/home.css"/>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Rowdies:wght@300;400;700&display=swap" rel="stylesheet">
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

    <!-- Main Content -->
    <main class="main__content">
      <div class="back">

      <!-- First Video & Text -->
        <div class="video__container">
          <video class="video-bg" src="video/video (2160p).mp4" alt="videosfondo" loop autoplay muted></video>
            <div class="video-content">
              <div class="text-video">
                <b>TUTTI I TUOI DOCUMENTI A PORTATA DI MANO.</b>
              </div>
              <div class="bottone">
                <button class="bottoncino">Download</button>
              </div>
           </div>
        </div>

      <!-- Middle Cards -->
        <div class="middle__container">
          <div class="cardmid">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-check" viewBox="0 0 16 16">
              <path d="M12.5 16a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7m1.679-4.493-1.335 2.226a.75.75 0 0 1-1.174.144l-.774-.773a.5.5 0 0 1 .708-.708l.547.548 1.17-1.951a.5.5 0 1 1 .858.514M11 5a3 3 0 1 1-6 0 3 3 0 0 1 6 0M8 7a2 2 0 1 0 0-4 2 2 0 0 0 0 4"/>
              <path d="M8.256 14a4.5 4.5 0 0 1-.229-1.004H3c.001-.246.154-.986.832-1.664C4.484 10.68 5.711 10 8 10q.39 0 .74.025c.226-.341.496-.65.804-.918Q8.844 9.002 8 9c-5 0-6 3-6 4s1 1 1 1z"/>
            </svg>            
            <div class="card__content">
              <p class="card__title">Facile
              </p><p class="card__description">Intuitiva e facile da usare, progettata per offrire un'esperienza senza complicazioni.</p>
            </div>
          </div>
          <div class="cardmid">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-fast-forward" viewBox="0 0 16 16">
              <path d="M6.804 8 1 4.633v6.734zm.792-.696a.802.802 0 0 1 0 1.392l-6.363 3.692C.713 12.69 0 12.345 0 11.692V4.308c0-.653.713-.998 1.233-.696z"/>
              <path d="M14.804 8 9 4.633v6.734zm.792-.696a.802.802 0 0 1 0 1.392l-6.363 3.692C8.713 12.69 8 12.345 8 11.692V4.308c0-.653.713-.998 1.233-.696z"/>
            </svg>            
            <div class="card__content">
              <p class="card__title">Veloce
              </p><p class="card__description">Assicura una veloce e fluida esperienza utente, garantendo la massima sicurezza.</p>
            </div>
          </div>
          <div class="cardmid">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-shield-lock" viewBox="0 0 16 16">
              <path d="M5.338 1.59a61 61 0 0 0-2.837.856.48.48 0 0 0-.328.39c-.554 4.157.726 7.19 2.253 9.188a10.7 10.7 0 0 0 2.287 2.233c.346.244.652.42.893.533q.18.085.293.118a1 1 0 0 0 .101.025 1 1 0 0 0 .1-.025q.114-.034.294-.118c.24-.113.547-.29.893-.533a10.7 10.7 0 0 0 2.287-2.233c1.527-1.997 2.807-5.031 2.253-9.188a.48.48 0 0 0-.328-.39c-.651-.213-1.75-.56-2.837-.855C9.552 1.29 8.531 1.067 8 1.067c-.53 0-1.552.223-2.662.524zM5.072.56C6.157.265 7.31 0 8 0s1.843.265 2.928.56c1.11.3 2.229.655 2.887.87a1.54 1.54 0 0 1 1.044 1.262c.596 4.477-.787 7.795-2.465 9.99a11.8 11.8 0 0 1-2.517 2.453 7 7 0 0 1-1.048.625c-.28.132-.581.24-.829.24s-.548-.108-.829-.24a7 7 0 0 1-1.048-.625 11.8 11.8 0 0 1-2.517-2.453C1.928 10.487.545 7.169 1.141 2.692A1.54 1.54 0 0 1 2.185 1.43 63 63 0 0 1 5.072.56"/>
              <path d="M9.5 6.5a1.5 1.5 0 0 1-1 1.415l.385 1.99a.5.5 0 0 1-.491.595h-.788a.5.5 0 0 1-.49-.595l.384-1.99a1.5 1.5 0 1 1 2-1.415"/>
            </svg>            
            <div class="card__content">
              <p class="card__title">Sicura
              </p><p class="card__description">Massima sicurezza dei tuoi dati grazie alla crittografia end-to-end.</p>
            </div>
          </div>        
         </div>

      <!-- Arrow Down -->
        <div class="arrow__container">
          <div class="sinistra">
            <p><span>Applicazione sicura a 360°</span></p>
            <p>Grazie a un mix di tecnologie avanzate e pratiche di sviluppo.</p>
            <p>Sistemi robusti, crittografia dei dati e monitoraggio costante.</p>
            <p>Regolari audit sulla sicurezza e forniamo aggiornamenti tempestivi.</p>
          </div>
          <div class="arrow">
            <img src="immagini/arrow__img.png" alt="arrow">
          </div>
          <div class="destra">
            <p><span>Praticità e velocità</span></p>
            <p>Gestisci i documenti a tuo piacimento con la nostra applicazione.</p>
            <p>Organizza, modifica e condividi i tuoi documenti con facilità.</p>
            <p>Inoltre, garantiamo la protezione dei tuoi dati con una crittografia robusta.</p>
          </div>
        </div>

      <!-- Bottom Card -->
      <div class="card__container">
        <div class="card">
          <p><span>Come  funziona?</span></p>
          <p>Per usare un QR code con lo smartphone, fai così:</p>
          <p>1. Scarica un'app che legge i QR code, come QR Code Reader.</p>
          <p>2. Apri l'app e inquadra il QR code con la fotocamera.</p>
          <p>3. L'app ti mostrerà le informazioni del QR code, che puoi aprire, salvare o condividere.</p>
            <div class="img__download">
              <a href="https://play.google.com/store/apps/"><img class="downloads" src="immagini/img__google.png" alt="Google Play"/></a>
              <a href="https://apps.apple.com/it/app/"><img class="downloads" src="immagini/img__apple.png" alt="App Store"/></a>
            </div>
        </div>
        <div class="img__telefono">
          <img src="immagini/img__telefono.png" alt="Smartphone"/>
        </div>    
      </div>
    </main>

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
