<jsp:include page ="cabeçalho2.jsp" />
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Css/estiloslider.css">
        <link rel="stylesheet" href="Css/g.css">
        <link rel="stylesheet" href="Css/cabeçalho2.css">

    </head>
    <body>

        <div class="slideshow-container">

            <div class="mySlides fade">
                <div class="numbertext">1 / 3</div>
                <img src="imagen/img_nature_wide.jpg" style="width:100%">
                <div class="text">Caption Text</div>
            </div>

            <div class="mySlides fade">
                <div class="numbertext">2 / 3</div>
                <img src="imagen/img_nature_wide.jpg" style="width:100%">
                <div class="text">Caption Two</div>
            </div>

            <div class="mySlides fade">
                <div class="numbertext">3 / 3</div>
                <img src="imagen/img_nature_wide.jpg" style="width:100%">
                <div class="text">Caption Three</div>
            </div>

            <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
            <a class="next" onclick="plusSlides(1)">&#10095;</a>

        </div>
        <br>

        <div style="text-align:center">
            <span class="dot" onclick="currentSlide(1)"></span> 
            <span class="dot" onclick="currentSlide(2)"></span> 
            <span class="dot" onclick="currentSlide(3)"></span> 
        </div>

        <script>
            var slideIndex = 1;
            showSlides(slideIndex);

            function plusSlides(n) {
                showSlides(slideIndex += n);
            }

            function currentSlide(n) {
                showSlides(slideIndex = n);
            }

            function showSlides(n) {
                var i;
                var slides = document.getElementsByClassName("mySlides");
                var dots = document.getElementsByClassName("dot");
                if (n > slides.length) {
                    slideIndex = 1
                }
                if (n < 1) {
                    slideIndex = slides.length
                }
                for (i = 0; i < slides.length; i++) {
                    slides[i].style.display = "none";
                }
                for (i = 0; i < dots.length; i++) {
                    dots[i].className = dots[i].className.replace(" active", "");
                }
                slides[slideIndex - 1].style.display = "block";
                dots[slideIndex - 1].className += " active";
            }
        </script>

        <div class="box-01-total">

            <a class="entrar" href="empresa.jsp" title="" data-icon="empresa">
                <div class="box-01">

                    <div class="conteudo">
                        <div class="titulo">BEM-VINDO AO<br />NOSSO SITE</div> <!-- Titulo -->
                        <div class="linha">
                            <div class="barra"></div>
                        </div> <!-- Linha -->
                        <div class="texto">
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi porta imperdiet arcu, at suscipit augue egestas sollicitudin. Aliquam et elit erat. Quisque aliquet placerat nisl, a semper sapien gravida in. Nunc non felis aliquet, luctus lacus nec, gravida ipsum. Mauris interdum pulvinar diam, sit amet ultricies ligula condimentum pharetra.
                        </div> <!-- Texto -->
                        <div class="entrar" href="empresa.jsp">Saiba mais</div> <!-- Entrar -->
                    </div> <!-- Conteudo -->
                    <div class="img">
                        <img src="https://www.projetoweb.com.br:443/sites-padrao-prontos-simples-baratos-lancamentos/padrao1-programado/template/pw-images/box-01.jpg" alt="" title="" />
                        <div class="info"><i class="far fa-thumbs-up"></i><br />"Atender Bem Para Atender Sempre"</div> <!-- Info -->
                    </div> <!-- Img -->

                </div> <!-- Box 01 -->

                </body>
                </html> 
