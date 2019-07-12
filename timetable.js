function gettrainer(){
    let subs= document.getElementById('searchBy').value;
    let y= document.getElementById('tn1').value;
    localStorage.setItem('nam',subs);
    localStorage.setItem('nm',y);
    if(subs=='eng'){
        document.getElementById("T4").value=y;
     }
     if(subs=='math'){
        document.getElementById("T1").value=y;
      }
      if(subs=='hin'){
        document.getElementById("T3").value=y;
    }
    if(subs=='sci'){
        document.getElementById("T2").value=y;
       }

}

