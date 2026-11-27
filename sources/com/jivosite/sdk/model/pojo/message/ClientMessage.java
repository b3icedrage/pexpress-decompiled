package com.jivosite.sdk.model.pojo.message;

import defpackage.C1039Gc0;
import defpackage.C5491nL;
import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import defpackage.TZ0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/jivosite/sdk/model/pojo/message/ClientMessage;", "", "", "context", "", "timestamp", "type", "data", "LTZ0;", "status", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;LTZ0;)V", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;LTZ0;)Lcom/jivosite/sdk/model/pojo/message/ClientMessage;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ClientMessage {

    @NotNull
    public final String a;
    public final long b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final TZ0 e;

    public ClientMessage(@NotNull String context, long j, @NotNull String type, @NotNull String data, @InterfaceC5477nG0(name = "status") @NotNull TZ0 status) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(status, "status");
        this.a = context;
        this.b = j;
        this.c = type;
        this.d = data;
        this.e = status;
    }

    @NotNull
    public final ClientMessage copy(@NotNull String context, long timestamp, @NotNull String type, @NotNull String data, @InterfaceC5477nG0(name = "status") @NotNull TZ0 status) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(status, "status");
        return new ClientMessage(context, timestamp, type, data, status);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientMessage)) {
            return false;
        }
        ClientMessage clientMessage = (ClientMessage) obj;
        return Intrinsics.a(this.a, clientMessage.a) && this.b == clientMessage.b && Intrinsics.a(this.c, clientMessage.c) && Intrinsics.a(this.d, clientMessage.d) && Intrinsics.a(this.e, clientMessage.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + C1039Gc0.b(C1039Gc0.b(C5491nL.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @NotNull
    public final String toString() {
        return "ClientMessage(context=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", data=" + this.d + ", status=" + this.e + ')';
    }
}
