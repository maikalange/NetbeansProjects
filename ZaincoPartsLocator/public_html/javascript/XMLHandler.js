var xhr = new XMLHttpRequest();
xhr.open("GET", "xml/provinces.xml", true);
xhr.send();
xhr.onreadystatechange = function () {
    if (this.readyState === 4 && this.status === 200) {
        loadContent(this.responseXML);
    }
};

function loadContent(xmlDoc) {
    txt = "";
    x = xmlDoc.getElementsByTagName("province");
    for (i = 0; i < x.length; i++) {
        txt += x[i].getAttribute('image') + "<br>";
        //txt += x[i].childNodes[0].nodeValue + "<br>";
    }
    document.getElementById("demo").innerHTML = txt;

}
function queryXML(){
    
}