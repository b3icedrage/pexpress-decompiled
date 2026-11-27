package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.C5653o60;
import defpackage.C7454wh;
import defpackage.FP0;
import defpackage.InterfaceC5879pA0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LpA0;", "LFP0;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements InterfaceC5879pA0<FP0> {
    @Override // defpackage.InterfaceC5879pA0
    @NotNull
    public final List<Class<? extends InterfaceC5879pA0<?>>> a() {
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC5879pA0
    public final FP0 b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C7454wh c7454whC = C7454wh.c(context);
        Intrinsics.checkNotNullExpressionValue(c7454whC, "getInstance(context)");
        if (!c7454whC.b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = j.a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!j.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new j.a());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.m;
        Intrinsics.checkNotNullParameter(context, "context");
        ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.m;
        processLifecycleOwner2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        processLifecycleOwner2.i = new Handler();
        processLifecycleOwner2.j.f(g.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new p(processLifecycleOwner2));
        return processLifecycleOwner2;
    }
}
