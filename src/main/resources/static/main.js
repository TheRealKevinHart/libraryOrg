function myFunction() {
  
  var src, input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase().trim().split(' ');
  table = document.getElementById("searchTable");
  
  for (j = 0; j < filter.length; j++) {
    tr = table.getElementsByTagName("tr");
    src = filter[j].trim();
    for (i = 0; i < tr.length; i++) {
      td = tr[i].getElementsByTagName("td")[0];
      td2 = tr[i].getElementsByTagName("td")[1];
      if (src!='' && td && td2) {
        txtValue = td.textContent || td.innerText;
        txtValue2 = td2.textContent || td2.innerText;
        if (txtValue.toUpperCase().indexOf(src) > -1 || txtValue2.toUpperCase().indexOf(src) > -1) {
          tr[i].style.display = "";
        } 
        else {
          tr[i].style.display = "none";
        }
      }       
    }
  }
}