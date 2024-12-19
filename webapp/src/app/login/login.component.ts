import { Component, Input } from '@angular/core';
import { InputTextModule } from 'primeng/inputtext';

@Component({
    selector: 'app-login',
    imports: [InputTextModule],
    templateUrl: './login.component.html',
    styleUrl: './login.component.scss'
})
export class LoginComponent {
    @Input() email: string = '';
    @Input() password: string = '';

    login() {
        console.log('email: ' + this.email);
        console.log('Password   ' + this.password);
    }
}
