package com.jivosite.sdk.model.pojo.push;

import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/jivosite/sdk/model/pojo/push/Notification;", "", "", "key", "", "args", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/jivosite/sdk/model/pojo/push/Notification;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Notification {

    @NotNull
    public final String a;

    @NotNull
    public final List<String> b;

    public Notification(@InterfaceC5477nG0(name = "body_loc_key") @NotNull String key, @InterfaceC5477nG0(name = "body_loc_args") @NotNull List<String> args) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(args, "args");
        this.a = key;
        this.b = args;
    }

    @NotNull
    public final Notification copy(@InterfaceC5477nG0(name = "body_loc_key") @NotNull String key, @InterfaceC5477nG0(name = "body_loc_args") @NotNull List<String> args) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(args, "args");
        return new Notification(key, args);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) obj;
        return Intrinsics.a(this.a, notification.a) && Intrinsics.a(this.b, notification.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Notification(key=" + this.a + ", args=" + this.b + ')';
    }
}
