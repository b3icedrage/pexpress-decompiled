package defpackage;

import androidx.lifecycle.LiveData;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VQ0 extends LiveData<C4705jd<Object>> {

    @NotNull
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final /* synthetic */ WQ0<Object> m;
    public final /* synthetic */ C6291r81 n;

    public VQ0(WQ0 wq0, C6291r81 c6291r81) {
        this.m = wq0;
        this.n = c6291r81;
    }

    @Override // androidx.lifecycle.LiveData
    public final void g() {
        if (this.l.compareAndSet(false, true)) {
            final WQ0<Object> wq0 = this.m;
            ExecutorService executorServiceA = wq0.b.a();
            final C6291r81 c6291r81 = this.n;
            executorServiceA.execute(new Runnable() { // from class: UQ0
                @Override // java.lang.Runnable
                public final void run() {
                    VQ0 this$0 = this.d;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    WQ0 this$1 = wq0;
                    Intrinsics.checkNotNullParameter(this$1, "this$1");
                    C6291r81 call = c6291r81;
                    Intrinsics.checkNotNullParameter(call, "$call");
                    try {
                        C4705jd.a aVar = this$1.c;
                        C0935Et1 c0935Et1B = call.b();
                        Intrinsics.checkNotNullExpressionValue(c0935Et1B, "call.execute()");
                        this$0.i(aVar.a(c0935Et1B));
                    } catch (Throwable th) {
                        this$0.i(this$1.c.b(th));
                    }
                }
            });
        }
    }
}
