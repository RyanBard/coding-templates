(function (angular) {
    'use strict';

    var module = angular.module(
        '@@moduleName@@',
        []
    );

    module.directive(
        '@@name@@',
        [
            function () {
                return {
                    restrict: 'AE',
                    scope: {},
                    transclude: false,
                    replace: false,
                    template: '<div ng-bind="test"></div>',
                    link: function (scope, element, attributes) {
                        scope.test = 'it works';
                    }
                };
            }
        ]
    );

}(angular));
