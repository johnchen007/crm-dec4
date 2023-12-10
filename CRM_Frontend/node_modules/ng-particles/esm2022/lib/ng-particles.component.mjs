import { Component, EventEmitter, Inject, Input, Output, PLATFORM_ID } from '@angular/core';
import { isPlatformServer } from '@angular/common';
import { EMPTY, from, mergeMap, Subject, takeUntil } from 'rxjs';
import { tsParticles } from 'tsparticles-engine';
import * as i0 from "@angular/core";
export class NgParticlesComponent {
    platformId;
    options;
    url;
    id;
    particlesInit;
    particlesLoaded = new EventEmitter();
    destroy$ = new Subject();
    container;
    constructor(platformId) {
        this.platformId = platformId;
        this.id = 'tsparticles';
    }
    ngAfterViewInit() {
        if (isPlatformServer(this.platformId)) {
            return;
        }
        const cb = (container) => {
            this.container = container;
            this.particlesLoaded.emit(container);
        };
        from(this.particlesInit ? this.particlesInit(tsParticles) : Promise.resolve())
            .pipe(mergeMap(() => {
            if (this.url) {
                return tsParticles.loadJSON(this.id, this.url);
            }
            else if (this.options) {
                return tsParticles.load(this.id, this.options);
            }
            else {
                console.error('You must specify options or url to load tsParticles');
                return EMPTY;
            }
        }), takeUntil(this.destroy$))
            .subscribe(cb);
    }
    ngOnDestroy() {
        this.container?.destroy();
        this.destroy$.next();
    }
    static ɵfac = i0.ɵɵngDeclareFactory({ minVersion: "12.0.0", version: "16.1.8", ngImport: i0, type: NgParticlesComponent, deps: [{ token: PLATFORM_ID }], target: i0.ɵɵFactoryTarget.Component });
    static ɵcmp = i0.ɵɵngDeclareComponent({ minVersion: "14.0.0", version: "16.1.8", type: NgParticlesComponent, selector: "ng-particles", inputs: { options: "options", url: "url", id: "id", particlesInit: "particlesInit" }, outputs: { particlesLoaded: "particlesLoaded" }, ngImport: i0, template: '<div [id]="id"></div>', isInline: true });
}
i0.ɵɵngDeclareClassMetadata({ minVersion: "12.0.0", version: "16.1.8", ngImport: i0, type: NgParticlesComponent, decorators: [{
            type: Component,
            args: [{
                    selector: 'ng-particles',
                    template: '<div [id]="id"></div>',
                }]
        }], ctorParameters: function () { return [{ type: undefined, decorators: [{
                    type: Inject,
                    args: [PLATFORM_ID]
                }] }]; }, propDecorators: { options: [{
                type: Input
            }], url: [{
                type: Input
            }], id: [{
                type: Input
            }], particlesInit: [{
                type: Input
            }], particlesLoaded: [{
                type: Output
            }] } });
export class ParticlesComponent extends NgParticlesComponent {
    platformId;
    constructor(platformId) {
        super(platformId);
        this.platformId = platformId;
    }
    static ɵfac = i0.ɵɵngDeclareFactory({ minVersion: "12.0.0", version: "16.1.8", ngImport: i0, type: ParticlesComponent, deps: [{ token: PLATFORM_ID }], target: i0.ɵɵFactoryTarget.Component });
    static ɵcmp = i0.ɵɵngDeclareComponent({ minVersion: "14.0.0", version: "16.1.8", type: ParticlesComponent, selector: "Particles", usesInheritance: true, ngImport: i0, template: '<div [id]="id"></div>', isInline: true });
}
i0.ɵɵngDeclareClassMetadata({ minVersion: "12.0.0", version: "16.1.8", ngImport: i0, type: ParticlesComponent, decorators: [{
            type: Component,
            args: [{
                    selector: 'Particles',
                    template: '<div [id]="id"></div>',
                }]
        }], ctorParameters: function () { return [{ type: undefined, decorators: [{
                    type: Inject,
                    args: [PLATFORM_ID]
                }] }]; } });
//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoibmctcGFydGljbGVzLmNvbXBvbmVudC5qcyIsInNvdXJjZVJvb3QiOiIiLCJzb3VyY2VzIjpbIi4uLy4uLy4uLy4uL3Byb2plY3RzL25nLXBhcnRpY2xlcy9zcmMvbGliL25nLXBhcnRpY2xlcy5jb21wb25lbnQudHMiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUEsT0FBTyxFQUFpQixTQUFTLEVBQUUsWUFBWSxFQUFFLE1BQU0sRUFBRSxLQUFLLEVBQWEsTUFBTSxFQUFFLFdBQVcsRUFBRSxNQUFNLGVBQWUsQ0FBQztBQUN0SCxPQUFPLEVBQUUsZ0JBQWdCLEVBQUUsTUFBTSxpQkFBaUIsQ0FBQztBQUNuRCxPQUFPLEVBQUUsS0FBSyxFQUFFLElBQUksRUFBRSxRQUFRLEVBQUUsT0FBTyxFQUFFLFNBQVMsRUFBRSxNQUFNLE1BQU0sQ0FBQztBQUNqRSxPQUFPLEVBQUUsV0FBVyxFQUFFLE1BQU0sb0JBQW9CLENBQUM7O0FBUWpELE1BQU0sT0FBTyxvQkFBb0I7SUFVYztJQVRsQyxPQUFPLENBQW1CO0lBQzFCLEdBQUcsQ0FBVTtJQUNiLEVBQUUsQ0FBUztJQUNYLGFBQWEsQ0FBcUM7SUFDakQsZUFBZSxHQUE0QixJQUFJLFlBQVksRUFBYSxDQUFDO0lBRTNFLFFBQVEsR0FBRyxJQUFJLE9BQU8sRUFBUSxDQUFDO0lBQy9CLFNBQVMsQ0FBYTtJQUU5QixZQUEyQyxVQUFrQjtRQUFsQixlQUFVLEdBQVYsVUFBVSxDQUFRO1FBQ3pELElBQUksQ0FBQyxFQUFFLEdBQUcsYUFBYSxDQUFDO0lBQzVCLENBQUM7SUFFTSxlQUFlO1FBQ2xCLElBQUksZ0JBQWdCLENBQUMsSUFBSSxDQUFDLFVBQVUsQ0FBQyxFQUFFO1lBQ25DLE9BQU87U0FDVjtRQUVELE1BQU0sRUFBRSxHQUFHLENBQUMsU0FBcUIsRUFBRSxFQUFFO1lBQ2pDLElBQUksQ0FBQyxTQUFTLEdBQUcsU0FBUyxDQUFDO1lBQzNCLElBQUksQ0FBQyxlQUFlLENBQUMsSUFBSSxDQUFDLFNBQVMsQ0FBQyxDQUFDO1FBQ3pDLENBQUMsQ0FBQztRQUVGLElBQUksQ0FBQyxJQUFJLENBQUMsYUFBYSxDQUFDLENBQUMsQ0FBQyxJQUFJLENBQUMsYUFBYSxDQUFDLFdBQVcsQ0FBQyxDQUFDLENBQUMsQ0FBQyxPQUFPLENBQUMsT0FBTyxFQUFFLENBQUM7YUFDekUsSUFBSSxDQUNELFFBQVEsQ0FBQyxHQUFHLEVBQUU7WUFDVixJQUFJLElBQUksQ0FBQyxHQUFHLEVBQUU7Z0JBQ1YsT0FBTyxXQUFXLENBQUMsUUFBUSxDQUFDLElBQUksQ0FBQyxFQUFFLEVBQUUsSUFBSSxDQUFDLEdBQUcsQ0FBQyxDQUFDO2FBQ2xEO2lCQUFNLElBQUksSUFBSSxDQUFDLE9BQU8sRUFBRTtnQkFDckIsT0FBTyxXQUFXLENBQUMsSUFBSSxDQUFDLElBQUksQ0FBQyxFQUFFLEVBQUUsSUFBSSxDQUFDLE9BQU8sQ0FBQyxDQUFDO2FBQ2xEO2lCQUFNO2dCQUNILE9BQU8sQ0FBQyxLQUFLLENBQUMscURBQXFELENBQUMsQ0FBQztnQkFDckUsT0FBTyxLQUFLLENBQUM7YUFDaEI7UUFDTCxDQUFDLENBQUMsRUFDRixTQUFTLENBQUMsSUFBSSxDQUFDLFFBQVEsQ0FBQyxDQUMzQjthQUNBLFNBQVMsQ0FBQyxFQUFFLENBQUMsQ0FBQztJQUN2QixDQUFDO0lBRU0sV0FBVztRQUNkLElBQUksQ0FBQyxTQUFTLEVBQUUsT0FBTyxFQUFFLENBQUM7UUFDMUIsSUFBSSxDQUFDLFFBQVEsQ0FBQyxJQUFJLEVBQUUsQ0FBQztJQUN6QixDQUFDO3VHQTVDUSxvQkFBb0Isa0JBVVQsV0FBVzsyRkFWdEIsb0JBQW9CLDJMQUZuQix1QkFBdUI7OzJGQUV4QixvQkFBb0I7a0JBSmhDLFNBQVM7bUJBQUM7b0JBQ1AsUUFBUSxFQUFFLGNBQWM7b0JBQ3hCLFFBQVEsRUFBRSx1QkFBdUI7aUJBQ3BDOzswQkFXZ0IsTUFBTTsyQkFBQyxXQUFXOzRDQVR0QixPQUFPO3NCQUFmLEtBQUs7Z0JBQ0csR0FBRztzQkFBWCxLQUFLO2dCQUNHLEVBQUU7c0JBQVYsS0FBSztnQkFDRyxhQUFhO3NCQUFyQixLQUFLO2dCQUNJLGVBQWU7c0JBQXhCLE1BQU07O0FBOENYLE1BQU0sT0FBTyxrQkFBbUIsU0FBUSxvQkFBb0I7SUFDSjtJQUFwRCxZQUFvRCxVQUFrQjtRQUNsRSxLQUFLLENBQUMsVUFBVSxDQUFDLENBQUM7UUFEOEIsZUFBVSxHQUFWLFVBQVUsQ0FBUTtJQUV0RSxDQUFDO3VHQUhRLGtCQUFrQixrQkFDUCxXQUFXOzJGQUR0QixrQkFBa0Isd0VBRmpCLHVCQUF1Qjs7MkZBRXhCLGtCQUFrQjtrQkFKOUIsU0FBUzttQkFBQztvQkFDUCxRQUFRLEVBQUUsV0FBVztvQkFDckIsUUFBUSxFQUFFLHVCQUF1QjtpQkFDcEM7OzBCQUVnQixNQUFNOzJCQUFDLFdBQVciLCJzb3VyY2VzQ29udGVudCI6WyJpbXBvcnQgeyBBZnRlclZpZXdJbml0LCBDb21wb25lbnQsIEV2ZW50RW1pdHRlciwgSW5qZWN0LCBJbnB1dCwgT25EZXN0cm95LCBPdXRwdXQsIFBMQVRGT1JNX0lEIH0gZnJvbSAnQGFuZ3VsYXIvY29yZSc7XG5pbXBvcnQgeyBpc1BsYXRmb3JtU2VydmVyIH0gZnJvbSAnQGFuZ3VsYXIvY29tbW9uJztcbmltcG9ydCB7IEVNUFRZLCBmcm9tLCBtZXJnZU1hcCwgU3ViamVjdCwgdGFrZVVudGlsIH0gZnJvbSAncnhqcyc7XG5pbXBvcnQgeyB0c1BhcnRpY2xlcyB9IGZyb20gJ3RzcGFydGljbGVzLWVuZ2luZSc7XG5pbXBvcnQgdHlwZSB7IENvbnRhaW5lciwgRW5naW5lIH0gZnJvbSAndHNwYXJ0aWNsZXMtZW5naW5lJztcbmltcG9ydCB7IElQYXJ0aWNsZXNQcm9wcyB9IGZyb20gJy4vbmctcGFydGljbGVzLm1vZHVsZSc7XG5cbkBDb21wb25lbnQoe1xuICAgIHNlbGVjdG9yOiAnbmctcGFydGljbGVzJyxcbiAgICB0ZW1wbGF0ZTogJzxkaXYgW2lkXT1cImlkXCI+PC9kaXY+Jyxcbn0pXG5leHBvcnQgY2xhc3MgTmdQYXJ0aWNsZXNDb21wb25lbnQgaW1wbGVtZW50cyBBZnRlclZpZXdJbml0LCBPbkRlc3Ryb3kge1xuICAgIEBJbnB1dCgpIG9wdGlvbnM/OiBJUGFydGljbGVzUHJvcHM7XG4gICAgQElucHV0KCkgdXJsPzogc3RyaW5nO1xuICAgIEBJbnB1dCgpIGlkOiBzdHJpbmc7XG4gICAgQElucHV0KCkgcGFydGljbGVzSW5pdD86IChlbmdpbmU6IEVuZ2luZSkgPT4gUHJvbWlzZTx2b2lkPjtcbiAgICBAT3V0cHV0KCkgcGFydGljbGVzTG9hZGVkOiBFdmVudEVtaXR0ZXI8Q29udGFpbmVyPiA9IG5ldyBFdmVudEVtaXR0ZXI8Q29udGFpbmVyPigpO1xuXG4gICAgcHJpdmF0ZSBkZXN0cm95JCA9IG5ldyBTdWJqZWN0PHZvaWQ+KCk7XG4gICAgcHJpdmF0ZSBjb250YWluZXI/OiBDb250YWluZXI7XG5cbiAgICBjb25zdHJ1Y3RvcihASW5qZWN0KFBMQVRGT1JNX0lEKSBwcm90ZWN0ZWQgcGxhdGZvcm1JZDogc3RyaW5nKSB7XG4gICAgICAgIHRoaXMuaWQgPSAndHNwYXJ0aWNsZXMnO1xuICAgIH1cblxuICAgIHB1YmxpYyBuZ0FmdGVyVmlld0luaXQoKTogdm9pZCB7XG4gICAgICAgIGlmIChpc1BsYXRmb3JtU2VydmVyKHRoaXMucGxhdGZvcm1JZCkpIHtcbiAgICAgICAgICAgIHJldHVybjtcbiAgICAgICAgfVxuXG4gICAgICAgIGNvbnN0IGNiID0gKGNvbnRhaW5lcj86IENvbnRhaW5lcikgPT4ge1xuICAgICAgICAgICAgdGhpcy5jb250YWluZXIgPSBjb250YWluZXI7XG4gICAgICAgICAgICB0aGlzLnBhcnRpY2xlc0xvYWRlZC5lbWl0KGNvbnRhaW5lcik7XG4gICAgICAgIH07XG5cbiAgICAgICAgZnJvbSh0aGlzLnBhcnRpY2xlc0luaXQgPyB0aGlzLnBhcnRpY2xlc0luaXQodHNQYXJ0aWNsZXMpIDogUHJvbWlzZS5yZXNvbHZlKCkpXG4gICAgICAgICAgICAucGlwZShcbiAgICAgICAgICAgICAgICBtZXJnZU1hcCgoKSA9PiB7XG4gICAgICAgICAgICAgICAgICAgIGlmICh0aGlzLnVybCkge1xuICAgICAgICAgICAgICAgICAgICAgICAgcmV0dXJuIHRzUGFydGljbGVzLmxvYWRKU09OKHRoaXMuaWQsIHRoaXMudXJsKTtcbiAgICAgICAgICAgICAgICAgICAgfSBlbHNlIGlmICh0aGlzLm9wdGlvbnMpIHtcbiAgICAgICAgICAgICAgICAgICAgICAgIHJldHVybiB0c1BhcnRpY2xlcy5sb2FkKHRoaXMuaWQsIHRoaXMub3B0aW9ucyk7XG4gICAgICAgICAgICAgICAgICAgIH0gZWxzZSB7XG4gICAgICAgICAgICAgICAgICAgICAgICBjb25zb2xlLmVycm9yKCdZb3UgbXVzdCBzcGVjaWZ5IG9wdGlvbnMgb3IgdXJsIHRvIGxvYWQgdHNQYXJ0aWNsZXMnKTtcbiAgICAgICAgICAgICAgICAgICAgICAgIHJldHVybiBFTVBUWTtcbiAgICAgICAgICAgICAgICAgICAgfVxuICAgICAgICAgICAgICAgIH0pLFxuICAgICAgICAgICAgICAgIHRha2VVbnRpbCh0aGlzLmRlc3Ryb3kkKSxcbiAgICAgICAgICAgIClcbiAgICAgICAgICAgIC5zdWJzY3JpYmUoY2IpO1xuICAgIH1cblxuICAgIHB1YmxpYyBuZ09uRGVzdHJveSgpOiB2b2lkIHtcbiAgICAgICAgdGhpcy5jb250YWluZXI/LmRlc3Ryb3koKTtcbiAgICAgICAgdGhpcy5kZXN0cm95JC5uZXh0KCk7XG4gICAgfVxufVxuXG5AQ29tcG9uZW50KHtcbiAgICBzZWxlY3RvcjogJ1BhcnRpY2xlcycsXG4gICAgdGVtcGxhdGU6ICc8ZGl2IFtpZF09XCJpZFwiPjwvZGl2PicsXG59KVxuZXhwb3J0IGNsYXNzIFBhcnRpY2xlc0NvbXBvbmVudCBleHRlbmRzIE5nUGFydGljbGVzQ29tcG9uZW50IHtcbiAgICBjb25zdHJ1Y3RvcihASW5qZWN0KFBMQVRGT1JNX0lEKSBwcm90ZWN0ZWQgb3ZlcnJpZGUgcGxhdGZvcm1JZDogc3RyaW5nKSB7XG4gICAgICAgIHN1cGVyKHBsYXRmb3JtSWQpO1xuICAgIH1cbn1cbiJdfQ==