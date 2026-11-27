package com.onesignal.notifications.services;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import defpackage.D91;
import defpackage.NS0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/onesignal/notifications/services/HmsMessageServiceOneSignal;", "Lcom/huawei/hms/push/HmsMessageService;", "()V", "onMessageReceived", "", "message", "Lcom/huawei/hms/push/RemoteMessage;", "onNewToken", "token", "", "bundle", "Landroid/os/Bundle;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HmsMessageServiceOneSignal extends HmsMessageService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(@NotNull RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        D91.INSTANCE.onMessageReceived((Context) this, message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(@NotNull String token, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        NS0.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:" + token, null, 2, null);
        D91.INSTANCE.onNewToken((Context) this, token, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        NS0.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:" + token, null, 2, null);
        D91.INSTANCE.onNewToken((Context) this, token);
    }
}
