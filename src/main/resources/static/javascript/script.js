let item = document.querySelector('.icon-hamburger');
          item.addEventListener("click", function(){
            document.body.classList.toggle('menu-open');
        })
  
        document.getElementById("hamburger").addEventListener("click", function() {
          var menu = document.querySelector(".header__menu");
            menu.classList.toggle("menu-open");
        })

        /*function handleFileUpload(inputId) {
            const input = document.getElementById(inputId);
            const file = input.files[0];
            
            if (file) {
                const reader = new FileReader();
                reader.onload = function (e) {
                    const preview = document.createElement('img');
                    preview.src = e.target.result;
                    
                    const icon = input.closest('.doc__container').querySelector('.icon');
                    icon.innerHTML = '';
                    icon.appendChild(preview);
                };
                reader.readAsDataURL(file);
            }
        }*/
        
        function modi() {
          var elemento = document.getElementById('container-mod');
          if (elemento.classList.contains('mostra')) {
              elemento.classList.remove('mostra');
              elemento.classList.add('nascondi');
          } else {
              elemento.classList.remove('nascondi');
              elemento.classList.add('mostra');
          }
      }