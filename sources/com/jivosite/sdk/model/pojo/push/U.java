package com.jivosite.sdk.model.pojo.push;

import defpackage.C1039Gc0;
import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/jivosite/sdk/model/pojo/push/U;", "", "", "pushId", "user", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/jivosite/sdk/model/pojo/push/U;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class U {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public U(@InterfaceC5477nG0(name = "push_id") @NotNull String pushId, @InterfaceC5477nG0(name = "user") @NotNull String user) {
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter(user, "user");
        this.a = pushId;
        this.b = user;
    }

    @NotNull
    public final U copy(@InterfaceC5477nG0(name = "push_id") @NotNull String pushId, @InterfaceC5477nG0(name = "user") @NotNull String user) {
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter(user, "user");
        return new U(pushId, user);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u = (U) obj;
        return Intrinsics.a(this.a, u.a) && Intrinsics.a(this.b, u.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("U(pushId=");
        sb.append(this.a);
        sb.append(", user=");
        return C1039Gc0.e(sb, this.b, ')');
    }
}
