(function (angular) {
    'use strict';

    var module = angular.module(
        '@@moduleName@@.resource',
        [
            'ngResource'
        ]
    );

    module.factory(
        '@@name@@',
        [
            '$resource',
            function ($resource) {
                return $resource(
                    'api/todo/:id',
                    {
                        id: '@id'
                    }
                );
            }
        ]
    );

}(angular));
