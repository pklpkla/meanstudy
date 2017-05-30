![alt tag](https://scotch.io/wp-content/uploads/2015/01/getting-started-materialize-css-framework.png)

Complete (17-4-10)
========

>Material template

feature
==========
1. Material Framework
2. Parallax
3. semantic layout


```html
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!-- Compiled and minified CSS -->
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css'>

    <!-- Compiled and minified JavaScript -->
    <script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js'></script>
</head>
```
> Default setting
```html
<body>
    <!-- navigation -->
    <nav>
        <div class="nav-wrapper blue accent-3">
            <a href="#" class="brand-logo">Logo</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <!-- <li><a href="sass.html">Sass</a></li> -->
                <li>
                    <div class="input-field col s12">
                        <input id="email" type="email" class="validate">
                        <label for="email" data-error="wrong" data-success="right">Search</label>
                    </div>
                </li>

                <!-- dropdown -->

                <li class="in-dropdown ">
                    <!-- Dropdown Trigger -->
                    <a class='dropdown-button btn light-blue accent-2' href='#' data-activates='dropdown1'>Drop Me!</a>

                    <!-- Dropdown Structure -->
                    <ul id='dropdown1' class='dropdown-content'>
                        <li><a href="#!">one</a></li>
                        <li><a href="#!">two</a></li>
                        <li class="divider"></li>
                        <li><a href="#!">three</a></li>
                        <li><a href="#!"><i class="material-icons">view_module</i>four</a></li>
                        <li><a href="#!"><i class="material-icons">cloud</i>five</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
```
> Navition and Dropdown
```html
  <div class="button-group center align">
```
>Button align
```html
    <div class="parallax-container valign-wrapper">
```
>parallax comment
```html
    <div class="container">
            <div class="section">
```
>default setting

``` html

    <!-- banner-blue pattern-->

    <div class="parallax-container valign-wrapper">
        <div class="container">
            <div class="section">
                <div class="button-group center align">
                    <button type="button" class="waves-effect waves-light btn-large blue accent-3"><i class="material-icons left"></i>Log in</button>
                    <button type="button" class="waves-effect waves-light btn-large blue accent-3"><i class="material-icons left"></i>button</button>
                </div>
            </div>
        </div>
        <div class="parallax"> <img src="http://www.uniwallpaper.com/static/images/HD-Wallpapers-89_FxDoTt7.jpg" /></div>
    </div>
```
> via parallax
```html
   <!-- new-section -->

    <div class="section">
        <div class="row">
            <div class="col s12 center">
                <h3><i class="mdi-content-send brown-text"></i></h3>
                <h4>Contact Us</h4>
                <p class="left-align light">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam scelerisque id nunc nec volutpat. Etiam pellentesque tristique arcu, non consequat magna fermentum ac. Cras ut ultricies eros. Maecenas eros justo, ullamcorper a sapien id,
                    viverra ultrices eros. Morbi sem neque, posuere et pretium eget, bibendum sollicitudin lacus. Aliquam eleifend sollicitudin diam, eu mattis nisl maximus sed. Nulla imperdiet semper molestie. Morbi massa odio, condimentum sed ipsum
                    ac, gravida ultrices erat. Nullam eget dignissim mauris, non tristique erat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;</p>
            </div>
        </div>
  <!-- bannder -sea-->
        <div class="parallax-container valign-wrapper">
            <div class="container">
                <div class="section">
                </div>
            </div>
            <div class="parallax"> <img src="Sky-blue-beach-hd-wallpaper.jpg" /></div>
        </div>


        <!-- new-section -2-->

        <div class="section">
          <div class="row">
            <div class="col s12 center">
              <h3><i class="mdi-content-send brown-text"></i></h3>
              <h4>Contact Us</h4>
              <p class="left-align light">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam scelerisque id nunc nec volutpat. Etiam pellentesque tristique arcu, non consequat magna fermentum ac. Cras ut ultricies eros. Maecenas eros justo, ullamcorper a sapien id,
                viverra ultrices eros. Morbi sem neque, posuere et pretium eget, bibendum sollicitudin lacus. Aliquam eleifend sollicitudin diam, eu mattis nisl maximus sed. Nulla imperdiet semper molestie. Morbi massa odio, condimentum sed ipsum
                ac, gravida ultrices erat. Nullam eget dignissim mauris, non tristique erat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;</p>
              </div>
            </div>

        <!-- page-footer -->

        <footer class="page-footer blue accent-3">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Footer Content</h5>
                        <p class="grey-text text-lighten-4">You can use rows and columns here to organize your footer content.</p>
                    </div>
                    <div class="col l4 offset-l2 s12">
                        <h5 class="white-text">Links</h5>
                        <ul>
                            <li><a class="grey-text text-lighten-3" href="#!">Link 1</a></li>
                            <li><a class="grey-text text-lighten-3" href="#!">Link 2</a></li>
                            <li><a class="grey-text text-lighten-3" href="#!">Link 3</a></li>
                            <li><a class="grey-text text-lighten-3" href="#!">Link 4</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    © 2014 Copyright Text
                    <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
                </div>
            </div>
        </footer>


    </div>
    </div>
    <!--  Scripts-->
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="js/materialize.js"></script>
    <script src="js/init.js"></script>
    <script>
        $('.dropdown-button').dropdown({
            inDuration: 300,
            outDuration: 225,
            constrainWidth: false, // Does not change width of dropdown to that of the activator
            hover: true, // Activate on hover
            gutter: 0, // Spacing from edge
            belowOrigin: false, // Displays dropdown below the button
            alignment: 'left', // Displays dropdown with edge aligned to the left of button
            stopPropagation: false // Stops event propagation
        });
    </script>
</body>

</html>
```

resources used
================
:https://peexaweb.com/materialize-css-tutorial/
