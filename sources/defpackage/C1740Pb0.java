package defpackage;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Pb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1740Pb0 extends AbstractC1444Lh0 {

    @NotNull
    public final ML0 e;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1740Pb0(@NotNull KM1 delegate, @NotNull Function1<? super IOException, Unit> onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.e = (ML0) onException;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC1444Lh0, defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.g = true;
            this.e.invoke(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC1444Lh0, defpackage.KM1, java.io.Flushable
    public final void flush() {
        if (this.g) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.g = true;
            this.e.invoke(e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC1444Lh0, defpackage.KM1
    public final void i1(@NotNull C1481Lu source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.g) {
            source.r(j);
            return;
        }
        try {
            super.i1(source, j);
        } catch (IOException e) {
            this.g = true;
            this.e.invoke(e);
        }
    }
}
