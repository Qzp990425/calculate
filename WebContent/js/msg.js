$(document).ready(function(){
        //jQuery代码
       var msg = $("#msg").val();
       if(!isEmpty(msg)){
             alert(msg);
       }
});

function isEmpty(value){
    if(value == null || value == "" || value == "undefined" || value ==  undefined || value == "null"){
        return true;
    }
    else{
        value = value.replace(/\s/g,"");
        if(value == ""){
            return true;
        }
        return false;
    }
}