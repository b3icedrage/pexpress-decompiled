package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class J72 extends AbstractC5143lh1<G72, H72, I72> {

    @NotNull
    public static final J72 c;

    static {
        Intrinsics.checkNotNullParameter(G72.e, "<this>");
        c = new J72(K72.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        byte[] collectionSize = ((H72) obj).d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        I72 builder = (I72) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte bZ = decoder.e(this.b, i).z();
        G72.a aVar = G72.e;
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        bArr[i2] = bZ;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        byte[] bufferWithData = ((H72) obj).d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        I72 i72 = new I72();
        i72.a = bufferWithData;
        i72.b = bufferWithData.length;
        i72.b(10);
        return i72;
    }

    @Override // defpackage.AbstractC5143lh1
    public final H72 n() {
        byte[] storage = new byte[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new H72(storage);
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, H72 h72, int i) {
        byte[] content = h72.d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            D60 d60A = encoder.A(this.b, i2);
            byte b = content[i2];
            G72.a aVar = G72.e;
            d60A.k(b);
        }
    }
}
