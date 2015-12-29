(function (angular) {
    'use strict';

    var module = angular.module(
        '@@moduleName@@.service',
        []
    );

    module.factory(
        '@@name@@Service',
        [
            function () {
                var service = {};

                service.testIt = function () {
                    return 'the service works';
                };

                return service;
            }
        ]
    );

}(angular));
