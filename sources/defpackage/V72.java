package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class V72 extends AbstractC5143lh1<S72, T72, U72> {

    @NotNull
    public static final V72 c;

    static {
        Intrinsics.checkNotNullParameter(S72.e, "<this>");
        c = new V72(W72.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        long[] collectionSize = ((T72) obj).d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        U72 builder = (U72) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long jV = decoder.e(this.b, i).v();
        S72.a aVar = S72.e;
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        jArr[i2] = jV;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        long[] bufferWithData = ((T72) obj).d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        U72 u72 = new U72();
        u72.a = bufferWithData;
        u72.b = bufferWithData.length;
        u72.b(10);
        return u72;
    }

    @Override // defpackage.AbstractC5143lh1
    public final T72 n() {
        long[] storage = new long[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new T72(storage);
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, T72 t72, int i) {
        long[] content = t72.d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            D60 d60A = encoder.A(this.b, i2);
            long j = content[i2];
            S72.a aVar = S72.e;
            d60A.z(j);
        }
    }
}
