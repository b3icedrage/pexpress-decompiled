package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2453Xv extends AbstractC5143lh1<Byte, byte[], C1877Qv> {

    @NotNull
    public static final C2453Xv c;

    static {
        Intrinsics.checkNotNullParameter(C0786Cw.a, "<this>");
        c = new C2453Xv(C1176Hw.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        C1877Qv builder = (C1877Qv) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte bM = decoder.m(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        bArr[i2] = bM;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        byte[] bufferWithData = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1877Qv c1877Qv = new C1877Qv();
        c1877Qv.a = bufferWithData;
        c1877Qv.b = bufferWithData.length;
        c1877Qv.b(10);
        return c1877Qv;
    }

    @Override // defpackage.AbstractC5143lh1
    public final byte[] n() {
        return new byte[0];
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, byte[] bArr, int i) {
        byte[] content = bArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.q(this.b, i2, content[i2]);
        }
    }
}
