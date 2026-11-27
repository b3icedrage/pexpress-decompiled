package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BT0 extends AbstractC5143lh1<Long, long[], C7826yT0> {

    @NotNull
    public static final BT0 c;

    static {
        Intrinsics.checkNotNullParameter(CT0.a, "<this>");
        c = new BT0(GT0.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        C7826yT0 builder = (C7826yT0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long jD = decoder.D(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        jArr[i2] = jD;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        long[] bufferWithData = (long[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C7826yT0 c7826yT0 = new C7826yT0();
        c7826yT0.a = bufferWithData;
        c7826yT0.b = bufferWithData.length;
        c7826yT0.b(10);
        return c7826yT0;
    }

    @Override // defpackage.AbstractC5143lh1
    public final long[] n() {
        return new long[0];
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, long[] jArr, int i) {
        long[] content = jArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.j(this.b, i2, content[i2]);
        }
    }
}
