(function (angular) {
    'use strict';

    var module = angular.module(
        '@@moduleName@@',
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
