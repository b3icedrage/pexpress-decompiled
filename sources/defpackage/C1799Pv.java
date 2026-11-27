package defpackage;

/* JADX INFO: renamed from: Pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1799Pv implements InterfaceC5362mj<byte[]> {
    @Override // defpackage.InterfaceC5362mj
    public final String a() {
        return "ByteArrayPool";
    }

    @Override // defpackage.InterfaceC5362mj
    public final int b() {
        return 1;
    }

    @Override // defpackage.InterfaceC5362mj
    public final int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // defpackage.InterfaceC5362mj
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
