import { Component } from '@angular/core';

@Component({
  selector: 'app-pickup-request',
  templateUrl: './pickup-request.component.html',
  styleUrls: ['./pickup-request.component.css']
})
export class PickupRequestComponent {
  senderName: string = ''; // Initialize senderName with an empty string
  senderAddress: string = ''; // Initialize senderAddress with an empty string
  receiverName: string = ''; // Initialize receiverName with an empty string
  receiverAddress: string = ''; // Initialize receiverAddress with an empty string
  productWeight: number = 0; // Initialize productWeight with 0
  productQuantity: number = 0; // Initialize productQuantity with 0
  productType: string = ''; // Initialize productType with an empty string

  constructor() {}

  submitForm() {
    const pickupRequestData = {
      sender: {
        name: this.senderName,
        address: this.senderAddress
      },
      receiver: {
        name: this.receiverName,
        address: this.receiverAddress
      },
      product: {
        weight: this.productWeight,
        quantity: this.productQuantity,
        type: this.productType
      }
    };

    console.log('Submitting form...');
    console.log('Pickup Request Data:', pickupRequestData);
    // Here, you can implement the logic to send pickupRequestData to your backend API
  }
}

