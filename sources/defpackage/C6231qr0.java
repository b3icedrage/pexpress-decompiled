package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6231qr0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object a(@NotNull AbstractC5391mr0 abstractC5391mr0, @NotNull Charset charset, @NotNull LM lm) {
        C6021pr0 c6021pr0;
        CharsetDecoder decoder;
        if (lm instanceof C6021pr0) {
            c6021pr0 = (C6021pr0) lm;
            int i = c6021pr0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6021pr0.g = i - Integer.MIN_VALUE;
            } else {
                c6021pr0 = new C6021pr0(lm);
            }
        } else {
            c6021pr0 = new C6021pr0(lm);
        }
        Object objA = c6021pr0.e;
        MN mn = MN.d;
        int i2 = c6021pr0.g;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            Intrinsics.checkNotNullParameter(abstractC5391mr0, "<this>");
            C4651jM c4651jMA = C1548Mq0.a(abstractC5391mr0);
            Charset charsetD = c4651jMA != null ? C5207m.d(c4651jMA) : null;
            if (charsetD != null) {
                charset = charsetD;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            C2250Vp0 c2250Vp0B = abstractC5391mr0.b();
            SJ0 sj0A = C2017Sp1.a(C1098Gw.class);
            A62 a62U = UE.u(C2017Sp1.a.b(C1098Gw.class), sj0A, C7128v72.d(sj0A));
            c6021pr0.d = charsetDecoderNewDecoder;
            c6021pr0.g = 1;
            objA = c2250Vp0B.a(a62U, c6021pr0);
            if (objA == mn) {
                return mn;
            }
            decoder = charsetDecoderNewDecoder;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            decoder = c6021pr0.d;
            C1795Pt1.b(objA);
        }
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket");
        }
        Intrinsics.checkNotNullExpressionValue(decoder, "decoder");
        return C7279vr.b(decoder, (C1098Gw) objA);
    }

    public static final void b(@NotNull AbstractC5391mr0 abstractC5391mr0) {
        Intrinsics.checkNotNullParameter(abstractC5391mr0, "<this>");
        CoroutineContext.Element elementP = abstractC5391mr0.getE().p(XF0.a.d);
        Intrinsics.checkNotNull(elementP);
        ((FG) elementP).X();
    }
}
