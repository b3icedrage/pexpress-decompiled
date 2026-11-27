package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5035lA extends AbstractC5143lh1<Character, char[], C4357iA> {

    @NotNull
    public static final C5035lA c;

    static {
        Intrinsics.checkNotNullParameter(C5248mA.a, "<this>");
        c = new C5035lA(C6507sA.a);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // defpackage.RE, defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        C4357iA builder = (C4357iA) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        char cJ = decoder.j(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        char[] cArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        cArr[i2] = cJ;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        char[] bufferWithData = (char[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C4357iA c4357iA = new C4357iA();
        c4357iA.a = bufferWithData;
        c4357iA.b = bufferWithData.length;
        c4357iA.b(10);
        return c4357iA;
    }

    @Override // defpackage.AbstractC5143lh1
    public final char[] n() {
        return new char[0];
    }

    @Override // defpackage.AbstractC5143lh1
    public final void o(GH encoder, char[] cArr, int i) {
        char[] content = cArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.x(this.b, i2, content[i2]);
        }
    }
}
