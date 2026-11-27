package defpackage;

import android.content.Context;
import android.os.Build;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5265mF1 implements K61 {

    @NotNull
    public final Context a;

    @NotNull
    public final L61 b;

    public C5265mF1(@NotNull ReporterApi reporter, @NotNull X61 pushesWerePermitted, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(pushesWerePermitted, "pushesWerePermitted");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        KW1 kw1B = XO0.b(new N4(this, 8));
        this.b = Build.VERSION.SDK_INT >= 33 ? new H61((B61) kw1B.getValue(), pushesWerePermitted, reporter) : new L61((B61) kw1B.getValue(), pushesWerePermitted, reporter);
    }

    @Override // defpackage.K61
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.K61
    public final void b(boolean z) {
        this.b.b(z);
    }

    @Override // defpackage.K61
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.K61
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.K61
    public final void e() {
        this.b.e();
    }
}
