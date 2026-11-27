package com.onesignal.notifications;

import android.content.Context;
import defpackage.InterfaceC7704xs0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0003\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/onesignal/notifications/INotificationReceivedEvent;", "", "", "preventDefault", "()V", "", "discard", "(Z)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lxs0;", "getNotification", "()Lxs0;", "notification", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface INotificationReceivedEvent {
    @NotNull
    Context getContext();

    @NotNull
    InterfaceC7704xs0 getNotification();

    void preventDefault();

    void preventDefault(boolean discard);
}
