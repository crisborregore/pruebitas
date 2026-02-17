import { Routes } from '@angular/router';

import ErrorComponent from './error.component';

export const errorRoute: Routes = [
  {
    path: 'error',
    component: ErrorComponent,
<<<<<<< Updated upstream
    title: '错误页面!',
=======
    title: 'त्रुटि पृष्ठ!',
>>>>>>> Stashed changes
  },
  {
    path: 'accessdenied',
    component: ErrorComponent,
    data: {
<<<<<<< Updated upstream
      errorMessage: '您没有权限访问此页面.',
    },
    title: '错误页面!',
=======
      errorMessage: 'आप पृष्ठ तक पहुँचने के लिए अधिकृत नहीं है।',
    },
    title: 'त्रुटि पृष्ठ!',
>>>>>>> Stashed changes
  },
  {
    path: '404',
    component: ErrorComponent,
    data: {
<<<<<<< Updated upstream
      errorMessage: '该页面不存在.',
    },
    title: '错误页面!',
=======
      errorMessage: 'पृष्ठ मौजूद नहीं है।',
    },
    title: 'त्रुटि पृष्ठ!',
>>>>>>> Stashed changes
  },
  {
    path: '**',
    redirectTo: '/404',
  },
];
