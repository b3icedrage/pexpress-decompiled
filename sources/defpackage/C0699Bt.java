package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0699Bt extends AbstractC5143lh1<Boolean, boolean[], C8126zt> {

    @NotNull
    public static final C0699Bt c;

    static {
        Intrinsics.checkNotNullParameter(C0777Ct.a, "<this>");
        c = new C0699Bt(C0933Et.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        C8126zt builder = (C8126zt) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zY = decoder.y(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        zArr[i2] = zY;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        boolean[] bufferWithData = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C8126zt c8126zt = new C8126zt();
        c8126zt.a = bufferWithData;
        c8126zt.b = bufferWithData.length;
        c8126zt.b(10);
        return c8126zt;
    }

    @Override // defpackage.AbstractC5143lh1
    public final boolean[] n() {
        return new boolean[0];
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, boolean[] zArr, int i) {
        boolean[] content = zArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.v(this.b, i2, content[i2]);
        }
    }
}
