package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3358dQ1 implements JN1 {

    @NotNull
    public final EK1 a;

    public C3358dQ1(@NotNull EK1 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = storage;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        Unit unit;
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.b;
        if (str != null) {
            EK1 ek1 = this.a;
            ek1.getClass();
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            ek1.c.b(EK1.z[2], str);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            C6104qF0.b("There is message \"atom/me.url.path\" without data property");
        }
    }
}
