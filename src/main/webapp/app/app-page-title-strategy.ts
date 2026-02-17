import { Injectable } from "@angular/core";
import { RouterStateSnapshot, TitleStrategy } from "@angular/router";

@Injectable()
export class AppPageTitleStrategy extends TitleStrategy {

  constructor() {
    super();
  }

  override updateTitle(routerState: RouterStateSnapshot): void {
    let pageTitle = this.buildTitle(routerState);
    if (!pageTitle) {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
      pageTitle = 'Asdad';
=======
      pageTitle = 'Dsadadad';
>>>>>>> Stashed changes
=======
      pageTitle = 'Dasasdads';
>>>>>>> Stashed changes
    }
    document.title = pageTitle;
  }
}
