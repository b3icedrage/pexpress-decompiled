package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NK1 extends AbstractC5143lh1<Short, short[], MK1> {

    @NotNull
    public static final NK1 c;

    static {
        Intrinsics.checkNotNullParameter(OK1.a, "<this>");
        c = new NK1(PK1.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        MK1 builder = (MK1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short sP = decoder.p(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        sArr[i2] = sP;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        short[] bufferWithData = (short[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        MK1 mk1 = new MK1();
        mk1.a = bufferWithData;
        mk1.b = bufferWithData.length;
        mk1.b(10);
        return mk1;
    }

    @Override // defpackage.AbstractC5143lh1
    public final short[] n() {
        return new short[0];
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, short[] sArr, int i) {
        short[] content = sArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.u(this.b, i2, content[i2]);
        }
    }
}
