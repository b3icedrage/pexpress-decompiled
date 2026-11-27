package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3140cO extends AbstractC5395ms1 {

    @NotNull
    public final C5605ns1 a;

    @NotNull
    public final C3327dG0 b;

    /* JADX INFO: renamed from: cO$a */
    public final class a extends AbstractC1444Lh0 {

        @NotNull
        public final C3327dG0 e;
        public long g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InterfaceC2606Zu delegate, @NotNull C3327dG0 onProgressUpdate) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(onProgressUpdate, "onProgressUpdate");
            this.e = onProgressUpdate;
        }

        @Override // defpackage.AbstractC1444Lh0, defpackage.KM1
        public final void i1(@NotNull C1481Lu source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            super.i1(source, j);
            long j2 = this.g + j;
            this.g = j2;
            this.e.invoke(Long.valueOf(j2));
        }
    }

    public C3140cO(@NotNull C5605ns1 delegate, @NotNull C3327dG0 onProgressUpdate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onProgressUpdate, "onProgressUpdate");
        this.a = delegate;
        this.b = onProgressUpdate;
    }

    @Override // defpackage.AbstractC5395ms1
    public final long a() {
        this.a.getClass();
        return -1L;
    }

    @Override // defpackage.AbstractC5395ms1
    @Nullable
    public final CY0 b() {
        return this.a.a;
    }

    @Override // defpackage.AbstractC5395ms1
    public final void c(@NotNull InterfaceC2606Zu sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C2814ao1 c2814ao1C = Cm2.c(new a(sink, this.b));
        this.a.c(c2814ao1C);
        c2814ao1C.flush();
    }
}
