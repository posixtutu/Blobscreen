<!---Remove this comment. This is the main index file. This file determines wether you are on an iPhone / iPod or iPad. It also promts you to another html page if you are not on an iDevice.--->

<!doctype html><head><meta charset="utf-8"><style>
    -webkit-border-radius: 13px;
}


}

#unlock_text {
    position: absolute;

    text-align: center;
    left: 90px;
    top: 12px;

    color: #ffffff;

    font-size: 22px;
    font-family: Helvetica;

    -webkit-animation-name: slide;
    -webkit-animation-duration: 0.5s;
    -webkit-animation-iteration-count: infinite;
    -webkit-mask-image: -webkit-gradient(linear, left bottom, right bottom, from(rgba(0,0,0,0.5)), to(rgba(0,0,0,0.5)));
}

#arrow {
    margin-top: 2px;
    margin-left: 0px;
    position: absolute;
}

body {
	margin: 0;
	padding: 0;
	
	background: #000;
	background-repeat: no-repeat;
	
	font-family: "Helvetica", sans-serif;
	-webkit-user-select: none;
}

/* iphone portrait */
@media screen and (min-width: 320px) and (max-width: 320px) {
	body {
		height: 416px;
		background-image: url('wallpaper-iphone.jpg');
	}
}

/* iphone landscape */
@media screen and (min-width: 480px) and (max-width: 480px){
    body {
        height: 269px;
		background-image: url('wallpaper-iphone.jpg');
    }
}

/* ipad landscape */
@media screen and (min-width: 1024px) and (max-width: 1024px) {
	body {
		height: 691px;
		background-image: url('wallpaper-ipad.jpg');
	}
}

/* ipad portrait */
@media screen and (min-width: 768px) and (max-width: 768px) {
    body {
        height: 947px;
		background-image: url('wallpaper-ipad.jpg');
    }
}

/* retina! */
@media screen and (-webkit-min-device-pixel-ratio: 2) {
	body {
		font-family: "Helvetica Neue", sans-serif;
		background-image: url('wallpaper-retina.jpg');
        background-size: 480px 480px;
	}
}
 
::selection { background: transparent; }
::-moz-selection { background: transparent; }
.top_bar {
	width: 100%;
	position: absolute;
	top: 0;
	height: 96px;
	
	text-align: center;
	background: -webkit-gradient(linear, left top, left bottom, from(#222222), to(#000), color-stop(0.5, rgba(21, 21, 21, 0.7)), color-stop(0.5, rgba(0, 0, 0, 0.7)));
	border-bottom: 1px solid #343434;
}

.top_bar h1 {
	margin-top: 5px;
	font-size: 52px;
	
	font-weight: lighter;

	color: #f0f0f0;
	text-shadow: #000 0px -2px 0px;
}

.top_bar h2 {
	opacity: 1; 
	margin-top: -2.20em;
	font-weight: normal;
	color: #fff;
	font-size: 16px;
	text-shadow: #000 0px -2px 0px;
}

.middle_wrapper {
	position: absolute;
	top: 96px;
	width: 100%;
}

.bubble {
	margin-top: 27px;
	margin-right: auto;
	margin-left: auto;
    
    /*background-color: rgba(0, 20, 70, 0.796875);*/
    background-color: rgba(55, 55, 55, 0.815624);
    border: 3px solid rgba(190, 196, 208, 0.937500);
    border-radius: 11px;

    /* fix apple's stupid ipad bug */
    -webkit-border-top-left-radius: 11px;
    -webkit-border-top-right-radius: 11px;
    -webkit-border-bottom-left-radius: 11px;
    -webkit-border-bottom-right-radius: 11px;

    -webkit-box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.4);
    text-shadow: #000 0px -1px 0px;
    width: 262px;
    height: 170px;
    
    font-size: 16px;
    text-align: center;
    color: white;
    position: relative;
    
    padding: 0 5px;

}

.slider {
    width: 59px;
    height: 44px;
    border-radius: 10px;
	-webkit-border-radius: 10px;
	-webkit-border-top-left-radius: 10px;
	-webkit-border-top-right-radius: 10px;
	-webkit-border-bottom-left-radius: 10px;
	-webkit-border-bottom-right-radius: 10px;
    margin-top: 2px;
    margin-left: 2px;
    border: 1px solid #ccc;
    -webkit-box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.4);
    background: -webkit-gradient(linear, left top, left bottom, from(#f8f8f8), to(#919191)); 
    position: relative;
    /*-webkit-transform: scale(10);*/
}
.arrow {
    position: absolute;
    left: 16px;
    top: 12px;
}
.shadow {
    -webkit-border-radius: 0px;
    -webkit-border-bottom-right-radius: 10px;
    -webkit-border-bottom-left-radius: 10px;
    -moz-border-radius-bottomright: 10px;
    -moz-border-radius-bottomleft: 10px;
    background-color: rgba(255, 255, 255, 0.4);
    position: absolute;
    left: 50%;
    margin-left: -10px;
    width: 20px;
    height: 25px;
    -webkit-transform: scaleX(13.6) /* 272/20 */
}
.ttext {
    margin-top: 5px;
}
.ttitle {
    font-weight: bold;
    margin-top: 7px;
    margin-bottom: 5px;
}

.tbottom {
    font-weight: bold; 
    position: absolute;
    bottom: 14px;
}

.ttop {
	padding-top: 5px;
}

.bubble a {
	display: block;
	width: 100%;
	
	text-decoration: none;
	color: white;
}

.tool_bar {
	position: absolute;
	top: 325px;
	height: 96px;
	width: 100%;
 
	background: -webkit-gradient(linear, left top, left bottom, from(rgba(34, 34, 34, 0.7)), to(rgba(0, 0, 0, 0.7)), color-stop(0.5, rgba(21, 21, 21, 0.7)), color-stop(0.5, rgba(0, 0, 0, 0.7)));
	border-top: 1px solid #343434;
}

/*#pod {
    position: fixed;
    top: 416px;
    display: none;
    height: 60px;
    width: 100%;
    background: -webkit-gradient(linear, left top, left bottom, from(#777), to(#777), color-stop(0.5, #444));
}
#podtext {
    margin: 5px;
    color: #eee;
	text-shadow: #000 0px -1px 0px;
} */


/* landscape iphone */
@media screen and (min-width: 480px) and (max-width: 480px) {
    .tool_bar {
        top: 195px;  
        /*height: 20px;*/
    }
    #by {
        padding-left: 5px;
    }
    /*#pod {
        top: 269px;
    }*/
    #unlock1 {
        margin-top: 10px !important;
    }
    .top_bar {
        height: 20px;
        padding-top: 10px;
        padding-bottom: 10px;
    }
    .top_bar h1 {
        display: inline;
        font-size: 18px;
    }
    .top_bar h2 {
        display: inline;
        font-size: 12px;
    }
	
	.ttop {
		display: none;
        margin-bottom: -12px;
	}
    .middle {
        width: 430px;
        height: 140px;
        margin-top: -51px;
    }
    .tbutton {
        width: 212px;
    }
    .trightbutton {
        left: 222px;
    }
    .tbuttonhighlight {
        width: 203px;
    }
    .shadow {
        -webkit-transform: scaleX(22) /* 440/20 */
    }
    .ttext {
        padding-left: 20px;
        padding-right: 20px;
	margin-top: 15px;
    }
}
 
/* iPad portrait */
@media screen and (min-width: 768px) and (max-width: 768px) {
    .tool_bar {
        top: 817px;
    }
	.middle {
		margin-top: 260px;
	}
}

/* iPad landscape */
@media screen and (min-width: 1024px) and (max-width: 1024px) {
    .tool_bar {
        top: 595px;
    }
	.middle {
		margin-top: 140px;
	}
</style><title>ScreenMe</title><meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"></head><body><div class="top_bar"><h1>ScreenMe</h1><h2 id="by">by posixtutu</h2></div><div class="middle_wrapper"><div class="bubble middle"><div class="shadow"></div><div id="texts"><div class="ttitle ttop">ScreenMe</div><div class="ttext">Use 'starscreen' to enhance your iPod touch, iPhone's and iPad's Lockscreen! Open this on your iPod/iPhone/iPad's Safari app to start.</div><div class="ttext"></div></div><a href="http://www.screenme.com.nu/star.html" id="faqlink" class="tbottom">Start &raquo;</a></div></div>div></div></div>
