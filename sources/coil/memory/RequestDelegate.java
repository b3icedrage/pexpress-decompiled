package coil.memory;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.FP0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcoil/memory/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Lcoil/memory/BaseRequestDelegate;", "Lcoil/memory/ViewTargetRequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 4, 1})
public abstract class RequestDelegate implements DefaultLifecycleObserver {
    private RequestDelegate() {
    }

    public void a() {
    }

    public void c() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull FP0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        c();
    }

    public /* synthetic */ RequestDelegate(int i) {
        this();
    }
}
