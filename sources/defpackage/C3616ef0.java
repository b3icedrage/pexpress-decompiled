package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ef0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3616ef0 extends AbstractC5143lh1<Float, float[], C3197cf0> {

    @NotNull
    public static final C3616ef0 c;

    static {
        Intrinsics.checkNotNullParameter(C3826ff0.a, "<this>");
        c = new C3616ef0(C4714jf0.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        C3197cf0 builder = (C3197cf0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        float fK = decoder.k(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        float[] fArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        fArr[i2] = fK;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        float[] bufferWithData = (float[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C3197cf0 c3197cf0 = new C3197cf0();
        c3197cf0.a = bufferWithData;
        c3197cf0.b = bufferWithData.length;
        c3197cf0.b(10);
        return c3197cf0;
    }

    @Override // defpackage.AbstractC5143lh1
    public final float[] n() {
        return new float[0];
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, float[] fArr, int i) {
        float[] content = fArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.s(this.b, i2, content[i2]);
        }
    }
}
