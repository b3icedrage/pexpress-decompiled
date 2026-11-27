package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2721aS1 extends AbstractC5395ms1 {

    @Nullable
    public final Long a;

    @NotNull
    public final ML0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2721aS1(@Nullable Long l, @NotNull Function0<? extends InterfaceC0942Ew> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.a = l;
        this.b = (ML0) block;
    }

    @Override // defpackage.AbstractC5395ms1
    public final long a() {
        Long l = this.a;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // defpackage.AbstractC5395ms1
    @Nullable
    public final CY0 b() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ML0, kotlin.jvm.functions.Function0] */
    @Override // defpackage.AbstractC5395ms1
    public final void c(@NotNull InterfaceC2606Zu sink) throws IOException {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            InterfaceC0942Ew interfaceC0942Ew = (InterfaceC0942Ew) this.b.invoke();
            KW1 kw1 = C4295ht.a;
            Intrinsics.checkNotNullParameter(interfaceC0942Ew, "<this>");
            Throwable th = null;
            IA0 ia0Q = Cm2.q(new AA0(null, interfaceC0942Ew));
            try {
                lValueOf = Long.valueOf(sink.l0(ia0Q));
                try {
                    ia0Q.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    ia0Q.close();
                } catch (Throwable th4) {
                    J90.a(th3, th4);
                }
                th = th3;
                lValueOf = null;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.checkNotNull(lValueOf);
        } catch (IOException e) {
            throw e;
        } catch (Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new VR1(cause);
        }
    }
}
