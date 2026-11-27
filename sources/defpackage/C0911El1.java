package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: El1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0911El1 implements C0833Dl1.d {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int[] b;

    public C0911El1(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }

    @Override // defpackage.C0833Dl1.d
    public final void a(C0833Dl1.c cVar, int i) throws IOException {
        int[] iArr = this.b;
        try {
            cVar.read(this.a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            cVar.close();
        }
    }
}
