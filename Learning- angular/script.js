// /<reference path ="angular.js" />

// double line register the module and controller

// var myapp = angular.module("myModule", []);

// var myController1 = function($scope){
// 	$scope.message = "Angular JS";
// };
// myapp.controller("myController1", myController1);

// single line 
var app = angular
				.module("myModule", [])
				.controller("myController" , function($scope){
					var technologies = [
							{name:"C#", likes: 0, dislikes: 0},
							{name:"Java", likes: 0, dislikes: 0},
							{name:"Angular", likes: 0, dislikes: 0},
							{name:"React", likes: 0, dislikes: 0}							
					];
					$scope.technologies=technologies;

					$scope.incrementLike = function(technology){
						technology.likes++;
					}
					$scope.incrementDisLike = function(technology){
						technology.dislikes++;
					}
				});