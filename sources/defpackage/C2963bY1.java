package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2963bY1 implements InterfaceC6793tZ0<String> {
    @Override // defpackage.InterfaceC6793tZ0
    public final AbstractC6583sZ0 a(String str) {
        String data = str;
        Intrinsics.checkNotNullParameter(data, "data");
        return new AbstractC6583sZ0.b(data);
    }

    @Override // defpackage.InterfaceC6793tZ0
    public final String b(AbstractC6583sZ0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof AbstractC6583sZ0.b) {
            return ((AbstractC6583sZ0.b) message).a;
        }
        throw new IllegalArgumentException("This Message Adapter only supports text Messages");
    }
}
