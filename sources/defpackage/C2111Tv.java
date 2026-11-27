package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2111Tv implements InterfaceC6793tZ0<byte[]> {
    @Override // defpackage.InterfaceC6793tZ0
    public final AbstractC6583sZ0 a(byte[] bArr) {
        byte[] data = bArr;
        Intrinsics.checkNotNullParameter(data, "data");
        return new AbstractC6583sZ0.a(data);
    }

    @Override // defpackage.InterfaceC6793tZ0
    public final byte[] b(AbstractC6583sZ0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof AbstractC6583sZ0.a) {
            return ((AbstractC6583sZ0.a) message).a;
        }
        throw new IllegalArgumentException("This Message Adapter only supports bytes Messages");
    }
}
