// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import {Component, ElementRef, ViewChild, ViewChildren} from '@angular/core';

@Component({
    selector: 'app-test',
    templateUrl: "./viewChildrenDecoratorHtml.html"
})
export class TestComponent {

  @ViewChild('area2') area1: ElementRef;
  @ViewChildren('area2') area2: ElementRef;

}
