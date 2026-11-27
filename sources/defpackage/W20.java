package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class W20 extends AbstractC5143lh1<Double, double[], U20> {

    @NotNull
    public static final W20 c;

    static {
        Intrinsics.checkNotNullParameter(C2638a30.a, "<this>");
        c = new W20(C3071c30.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        U20 builder = (U20) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        double dI = decoder.i(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        double[] dArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        dArr[i2] = dI;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        double[] bufferWithData = (double[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        U20 u20 = new U20();
        u20.a = bufferWithData;
        u20.b = bufferWithData.length;
        u20.b(10);
        return u20;
    }

    @Override // defpackage.AbstractC5143lh1
    public final double[] n() {
        return new double[0];
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, double[] dArr, int i) {
        double[] content = dArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.d(this.b, i2, content[i2]);
        }
    }
}
