/**
 * 
 */

var app = angular.module('compras', [ "ngResource" ]);

app.controller('ComprasController', [ '$scope', '$http', function($scope, $http) {
	$scope.getCompras = function() {
		$http.get('/loadCompras').success(function(data) {
			$scope.compras = data;
		});
	}

} ]);