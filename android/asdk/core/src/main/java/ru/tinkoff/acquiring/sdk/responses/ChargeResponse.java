/*
 * Copyright © 2016 Tinkoff Bank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.tinkoff.acquiring.sdk.responses;

import com.google.gson.annotations.SerializedName;

import ru.tinkoff.acquiring.sdk.PaymentInfo;
import ru.tinkoff.acquiring.sdk.PaymentStatus;

/**
 * @author Mikhail Artemyev
 */
final public class ChargeResponse extends AcquiringResponse {

    @SerializedName("OrderId")
    private String orderId;

    @SerializedName("PaymentId")
    private Long paymentId;

    @SerializedName("Amount")
    private Long amount;

    @SerializedName("Status")
    private PaymentStatus status;

    @SerializedName("CardId")
    private String cardId;

    private transient PaymentInfo paymentInfo;

    public PaymentInfo getPaymentInfo() {
        if (paymentInfo == null) {
            paymentInfo = new PaymentInfo(orderId, paymentId, amount, cardId, getErrorCode());
        }

        return paymentInfo;
    }

    public String getOrderId() {
        return orderId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public Long getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public String getCardId() {
        return cardId;
    }
}

