/**
 * 
 */
currentPage = 1;

//댓글 리스트 가져오기 - 제목클릭했을때 , 등록버튼 클릭했을때 
replyListServer = function(target){
	$.ajax({
		url : '/boardpro/ReplyList.do',
		type : 'get',
		data : {'bonum' : num },
		success : function(res){
			
			rcode = "";
			$.each(res, function(i, v){
				cont = v.cont; // \기호가 포함 - <br>테그로 변경  
				
				cont = cont.replace(/\r/g, "").replace(/\n/g,"<br>")
				
			   rcode += '  <div class="rep-body">';
			   rcode += '        <p class="p1">';
			   rcode += '           작성자 <span class="sw">' +   v.name + '</span> &nbsp;&nbsp;&nbsp;';
			   rcode += '           날짜 <span class="sd">' + v.redate + '</span>&nbsp;&nbsp;&nbsp;';
			   rcode += '        </p>';
			   rcode += '        <p class="p2">';
			   rcode += '           <input idx="' + v.renum + '" type="button"  value="댓글수정" class="action" name="r_modify"> ';
			   rcode += '           <input idx="' + v.renum + '" type="button"  value="댓글삭제" class="action" name="r_delete"> ';
			   rcode += '        </p>';
			   rcode += '        <p class="p3">';
			   rcode +=    cont;
			   rcode += '        </p>';
			   rcode += '</div>'
			})
			
			$(target).parents('.panel').find('.rep-body').remove();
			$(target).parents('.panel').find('.panel-body').append(rcode);
		},
		error : function(xhr){
			alert("상태 : " + xhr.status);
		},
		dataType :'json'
	})
}
//댓글 등록
replySaveServer = function(target){
	$.ajax({
		url : '/boardpro/ReplySave.do',
		type : 'post',
		data : reply,  // reply객체- bonum, name, cont 
		success : function(res){
			//댓글 리스트 출력 
			replyListServer(target);
			//alert(res.flag);
		},
		error : function(xhr){
			
		},
		dataType : 'json'
		
	})
}


listPageServer = function(cpage){
	
	$.ajax({
		url : '/boardpro/BoardList.do',
		type : 'post',
		data  : { "stype" : "" , "sword" : "" , "page" : cpage},
		success : function(res){
			code= '<div class="container">	';
			code += ' <div class="panel-group" id="accordion">';
			
			$.each(res.lists, function(i,v){                                                              
			
			   code += ' <div class="panel panel-default">';
			   code += '   <div class="panel-heading">';
			   code += '     <h4 class="panel-title">';
			   code += '       <a idx="'+ v.num  + '"  name="title"  class="action" data-toggle="collapse" data-parent="#accordion" href="#collapse' + v.num + '">' + v.subject + '</a>';
			   code += '     </h4>';
			   code += '   </div>';
			   code += '   <div id="collapse' + v.num + '" class="panel-collapse collapse">';
			   code += '     <div class="panel-body">';
			   code += '        <p class="p1">';
			   code += '           작성자 <span class="sw">' +   v.writer + '</span> &nbsp;&nbsp;&nbsp;';
			   code += '           메일 <span class="sm">' +  v.mail + '</span>&nbsp;&nbsp;&nbsp;';
			   code += '           조회수 <span class="sh">' +  v.hit  + '</span> &nbsp;&nbsp;&nbsp;';
			   code += '           날짜 <span class="sd">' + v.wdate + '</span>&nbsp;&nbsp;&nbsp;';
			   code += '        </p>';
			   code += '        <p class="p2">';
			   code += '           <input idx="' + v.num + '" type="button"  value="수정" class="action" name="modify"> ';
			   code += '           <input idx="' + v.num + '" type="button"  value="삭제" class="action" name="delete"> ';
			   code += '        </p>';
			   code += '        <p class="p3">';
			   code +=     v.content;
			   code += '        </p>';
			   code += '        <p class="p4">';
			   code += '          <textarea rows="" cols="60"></textarea>';
			   code += '          <input idx="' + v.num + '"  type="button" value="등록" name="reply" class="action">';
			   code += '       </p>';
			   code += '    </div>';
			   code += '   </div>';
			   code += ' </div>';
			  
			})
			
			code += '</div>' ;
			code += '</div>';
			
			$('.box').html(code);
			
	
			//이전 버튼 
			pager = "";
			if(res.spage > 1){
				pager += '<ul class="pagination">';
		        pager += ' <li class="page-item"><a  class="page-link prev" href="#">Previous</a></li>'
		        pager += ' </ul>';
			}
			
			//페이지번호
			pager += '<ul class="pagination plist">'; 
			for(i=res.spage ; i<= res.epage; i++){
				
				if(currentPage == i){
					 pager += '<li class="page-item active"><a class="page-link pnum" href="#">' + i + '</a></li>';
				}else {
					 pager += '<li class="page-item"><a class="page-link pnum" href="#">' + i + '</a></li>';
				}
			}
			pager += '</ul>'
			
			//다음버튼 
			if(res.tpage > res.epage ){
				pager += '<ul class="pagination">';
		        pager += ' <li class="page-item"><a class="page-link next" href="#">Next</a></li>'
		        pager += ' </ul>';
			}
		5
			$('#pagelist').html(pager);
			
		},
		error : function(xhr){
			alert("상태 : " + xhr.status);
		},
		dataType : 'json'
	})
	
}














