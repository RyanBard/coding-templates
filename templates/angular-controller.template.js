(function (angular) {
    'use strict';

    var module = angular.module(
        '@@moduleName@@',
        []
    );

    module.controller(
        '@@name@@',
        [
            '$scope',
            function (
                $scope
            ) {
                $scope.test = 'it works';
            }
        ]
    );

}(angular));
