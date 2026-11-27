package com.jivosite.sdk.di.modules;

import defpackage.InterfaceC2628a02;
import defpackage.InterfaceC4262hj0;
import defpackage.TZ0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/jivosite/sdk/di/modules/MessageStatusJsonAdapter;", "", "<init>", "()V", "LTZ0;", "status", "", "toJson", "(LTZ0;)Ljava/lang/String;", "fromJson", "(Ljava/lang/String;)LTZ0;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MessageStatusJsonAdapter {
    @InterfaceC4262hj0
    @NotNull
    public final TZ0 fromJson(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return TZ0.c.a;
    }

    @InterfaceC2628a02
    @NotNull
    public final String toJson(@NotNull TZ0 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return "SENDING";
    }
}
