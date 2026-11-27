package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AB0 extends AbstractC5143lh1<Integer, int[], C7562xB0> {

    @NotNull
    public static final AB0 c;

    static {
        Intrinsics.checkNotNullParameter(BB0.a, "<this>");
        c = new AB0(EB0.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        C7562xB0 builder = (C7562xB0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int iS = decoder.s(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        iArr[i2] = iS;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        int[] bufferWithData = (int[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C7562xB0 c7562xB0 = new C7562xB0();
        c7562xB0.a = bufferWithData;
        c7562xB0.b = bufferWithData.length;
        c7562xB0.b(10);
        return c7562xB0;
    }

    @Override // defpackage.AbstractC5143lh1
    public final int[] n() {
        return new int[0];
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, int[] iArr, int i) {
        int[] content = iArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.i(this.b, i2, content[i2]);
        }
    }
}
