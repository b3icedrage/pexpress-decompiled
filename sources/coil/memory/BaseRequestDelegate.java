package coil.memory;

import androidx.lifecycle.g;
import defpackage.XF0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/BaseRequestDelegate;", "Lcoil/memory/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 4, 1})
public final class BaseRequestDelegate extends RequestDelegate {
    public final g d;
    public final XF0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRequestDelegate(@NotNull g lifecycle, @NotNull XF0 job) {
        super(0);
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(job, "job");
        this.d = lifecycle;
        this.e = job;
    }

    @Override // coil.memory.RequestDelegate
    public final void a() {
        this.d.c(this);
    }

    @Override // coil.memory.RequestDelegate
    public final void c() {
        this.e.l(null);
    }
}
