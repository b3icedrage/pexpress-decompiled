package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class K0 extends AbstractC7216va0 implements InterfaceC7071ur1 {

    @NotNull
    public final Context c;

    @NotNull
    public final ZT1 d;

    @NotNull
    public final InterfaceC0565Aa0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(@NotNull Context context, @NotNull ZT1 subIdProvider, @NotNull InterfaceC0565Aa0 experimentsProvider, @NotNull InterfaceC0799Da0 experimentsRepository, @NotNull ReporterApi reporter) {
        super(experimentsRepository, reporter);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(experimentsRepository, "experimentsRepository");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.c = context;
        this.d = subIdProvider;
        this.e = experimentsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:56:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r10.b() == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(defpackage.K0 r10, defpackage.LM r11) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K0.f(K0, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7071ur1
    @Nullable
    public final Object a(@NotNull C5918pN0.a.C0472a c0472a) {
        return f(this, c0472a);
    }

    @Override // defpackage.InterfaceC7071ur1
    @Nullable
    public final Unit b() {
        this.e.b(e().a, AbstractC7427wa0.b.a);
        return Unit.a;
    }

    @NotNull
    public abstract C5718oQ1 e();
}
