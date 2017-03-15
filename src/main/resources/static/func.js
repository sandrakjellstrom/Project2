var currentPage = "start";
function renderPage(){
  var page = adventure.pages[currentPage];
  $("#title").html(page.title);
  $("#subTitle").html(page.subTitle);
  $("#imageUrl").attr("src", page.imageUrl)
  $("#name").empty();
  $("#description").html(page.description);
  $("#options").empty();

  for(var l=0; l < page.options.length; l++){
    var option = page.options[l];
    var link = $("<li>");
    link.text(option.text);
    link.attr("data-number", l); // will be 0 or 1 or ...
    $("#options").append(link);
	}
  for(var l=0; l < page.name.length; l++){
    var name = page.name[l];
    $("#name").append(name.text);
    }

  for(var l=0; l < page.imageUrl.length; l++){
        var imageUrl = page.imageUrl[l];
        var link = $("<img src=''>");
        link.attr("src", imageUrl)
    }
}

	var clickHandler = function(){
	  var link = $(this); // the clicked element;
	  var linkNumber = link.attr("data-number");
	  var page = adventure.pages[currentPage];
	  var linkObject = page.options[linkNumber];
	  currentPage = linkObject.target;
	  renderPage();
  	}

$("#options").on("click","li",clickHandler);
renderPage(adventure.pages[currentPage]);