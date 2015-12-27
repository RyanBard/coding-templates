(function (angular) {
    'use strict';

    var module = angular.module(
        '@@moduleName@@',
        []
    );

    module.factory(
        '@@name@@',
        [
            function () {
                var service = {};
                service.test = function () {
                    return 'it works';
                };
                return service;
            }
        ]
    );

}(angular));
