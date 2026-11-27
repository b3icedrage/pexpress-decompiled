package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class P72 extends AbstractC5143lh1<M72, N72, O72> {

    @NotNull
    public static final P72 c;

    static {
        Intrinsics.checkNotNullParameter(M72.e, "<this>");
        c = new P72(Q72.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        int[] collectionSize = ((N72) obj).d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        O72 builder = (O72) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int iO = decoder.e(this.b, i).o();
        M72.a aVar = M72.e;
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        iArr[i2] = iO;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        int[] bufferWithData = ((N72) obj).d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        O72 o72 = new O72();
        o72.a = bufferWithData;
        o72.b = bufferWithData.length;
        o72.b(10);
        return o72;
    }

    @Override // defpackage.AbstractC5143lh1
    public final N72 n() {
        int[] storage = new int[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new N72(storage);
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, N72 n72, int i) {
        int[] content = n72.d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            D60 d60A = encoder.A(this.b, i2);
            int i3 = content[i2];
            M72.a aVar = M72.e;
            d60A.y(i3);
        }
    }
}
