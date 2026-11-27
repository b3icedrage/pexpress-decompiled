package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.onesignal.core.activities.PermissionsActivity;
import defpackage.C1974Sb0;
import defpackage.UZ0;
import io.sentry.android.core.b0;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int onMessageReceive(@NonNull Context context, @NonNull CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new C1974Sb0(context).c(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            b0.d("FirebaseMessaging", "Failed to send message to service.", e);
            return PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void onNotificationDismissed(@NonNull Context context, @NonNull Bundle bundle) {
        Intent intentPutExtras = new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(bundle);
        if (UZ0.b(intentPutExtras)) {
            UZ0.a("_nd", intentPutExtras.getExtras());
        }
    }
}
