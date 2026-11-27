package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ns1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5605ns1 extends AbstractC5395ms1 {
    public final /* synthetic */ CY0 a;
    public final /* synthetic */ InputStream b;

    public C5605ns1(CY0 cy0, InputStream inputStream) {
        this.a = cy0;
        this.b = inputStream;
    }

    @Override // defpackage.AbstractC5395ms1
    @Nullable
    public final CY0 b() {
        return this.a;
    }

    @Override // defpackage.AbstractC5395ms1
    public final void c(@NotNull InterfaceC2606Zu sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        IA0 ia0Q = Cm2.q(this.b);
        try {
            sink.l0(ia0Q);
            ia0Q.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(ia0Q, th);
                throw th2;
            }
        }
    }
}
