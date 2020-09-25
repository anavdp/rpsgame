$( document ).ready(function() {
   $('#btnPlayRound').click(function(){
   
	$.ajax({
  		url: "playRound", success: function(data){
	     let table = $('#gameTable').DataTable();
	     
	     let p1Choice = data.player1.choice;
	     let p2Choice = data.player2.choice;
	     let winner = data.winner == null ? "Draw": data.winner.name + " wins";
	     
	     table.row.add([p1Choice, p2Choice, winner]).draw( false );
		let count = parseInt($('#totalRounds').html());
   		count += 1;
   		$('#totalRounds').html(count);
   		}
	});
   		
   });
   
      $('#btnReset').click(function(){
      let table = $('#gameTable').DataTable();
      table.clear().draw(false);
      $('#totalRounds').html(0);
   	
   });
   
   	$('#gameTable').DataTable( {
        "paging":   false,
        "ordering": false,
        "info":     false,
        "searching": false,
        "language": {
      "emptyTable": "Let's Play!"
    }
    } );
});