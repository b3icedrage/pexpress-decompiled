package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5030l82 extends AbstractC5143lh1<C4352i82, C4610j82, C4820k82> {

    @NotNull
    public static final C5030l82 c;

    static {
        Intrinsics.checkNotNullParameter(C4352i82.e, "<this>");
        c = new C5030l82(C5243m82.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        short[] collectionSize = ((C4610j82) obj).d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        C4820k82 builder = (C4820k82) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short sA = decoder.e(this.b, i).A();
        C4352i82.a aVar = C4352i82.e;
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        sArr[i2] = sA;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        short[] bufferWithData = ((C4610j82) obj).d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C4820k82 c4820k82 = new C4820k82();
        c4820k82.a = bufferWithData;
        c4820k82.b = bufferWithData.length;
        c4820k82.b(10);
        return c4820k82;
    }

    @Override // defpackage.AbstractC5143lh1
    public final C4610j82 n() {
        short[] storage = new short[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C4610j82(storage);
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, C4610j82 c4610j82, int i) {
        short[] content = c4610j82.d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            D60 d60A = encoder.A(this.b, i2);
            short s = content[i2];
            C4352i82.a aVar = C4352i82.e;
            d60A.h(s);
        }
    }
}
