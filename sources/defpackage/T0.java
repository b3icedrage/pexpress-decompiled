package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T0<T> implements RJ0<T> {
    @Override // defpackage.RJ0
    public final void a(@NotNull C3783fS1 encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        RJ0 rj0F = C3057c.f(this, encoder, value);
        C8078zf1 c8078zf1 = (C8078zf1) this;
        MH1 mh1C = c8078zf1.c();
        GH ghC = encoder.c(mh1C);
        ghC.w(c8078zf1.c(), 0, rj0F.c().a());
        ghC.n(c8078zf1.c(), 1, rj0F, value);
        ghC.b(mh1C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.RJ0
    @NotNull
    public final T d(@NotNull InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        C8078zf1 c8078zf1 = (C8078zf1) this;
        MH1 mh1C = c8078zf1.c();
        EH ehC = decoder.c(mh1C);
        C3027bp1 c3027bp1 = new C3027bp1();
        T t = null;
        while (true) {
            int iH = ehC.h(c8078zf1.c());
            if (iH == -1) {
                if (t != null) {
                    ehC.b(mh1C);
                    return t;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) c3027bp1.d)).toString());
            }
            if (iH == 0) {
                c3027bp1.d = (T) ehC.n(c8078zf1.c(), iH);
            } else {
                if (iH != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) c3027bp1.d;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iH);
                    throw new ZH1(sb.toString());
                }
                T t2 = c3027bp1.d;
                if (t2 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                c3027bp1.d = t2;
                t = (T) ehC.r(c8078zf1.c(), iH, C3057c.d(this, ehC, (String) t2), null);
            }
        }
    }

    @NotNull
    public abstract RI0<T> e();
}
