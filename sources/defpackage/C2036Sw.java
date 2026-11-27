package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2036Sw implements InterfaceC3667et1<byte[]> {
    public final byte[] d;

    public C2036Sw(byte[] bArr) {
        UE.e(bArr, "Argument must not be null");
        this.d = bArr;
    }

    @Override // defpackage.InterfaceC3667et1
    public final int c() {
        return this.d.length;
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Class<byte[]> d() {
        return byte[].class;
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final byte[] get() {
        return this.d;
    }

    @Override // defpackage.InterfaceC3667et1
    public final void b() {
    }
}
