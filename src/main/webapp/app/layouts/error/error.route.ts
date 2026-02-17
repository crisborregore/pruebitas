import { Routes } from '@angular/router';

import ErrorComponent from './error.component';

export const errorRoute: Routes = [
  {
    path: 'error',
    component: ErrorComponent,
    title: '错误页面!',
  },
  {
    path: 'accessdenied',
    component: ErrorComponent,
    data: {
      errorMessage: '您没有权限访问此页面.',
    },
    title: '错误页面!',
  },
  {
    path: '404',
    component: ErrorComponent,
    data: {
      errorMessage: '该页面不存在.',
    },
    title: '错误页面!',
  },
  {
    path: '**',
    redirectTo: '/404',
  },
];
