(function (angular) {
    'use strict';

    var module = angular.module(
        '@@moduleName@@.controller',
        [
            '@@moduleName@@.directive',
            '@@moduleName@@.resource',
            '@@moduleName@@.service'
        ]
    );

    module.controller(
        '@@name@@Controller',
        [
            '$scope',
            '@@name@@Service',
            '@@name@@',
            function (
                $scope,
                @@name@@Service,
                @@name@@
            ) {
                $scope.controllerTest = 'the controller works';
                $scope.domainModel = @@name@@.query();
                $scope.serviceTest = @@name@@Service.testIt();
            }
        ]
    );

}(angular));
