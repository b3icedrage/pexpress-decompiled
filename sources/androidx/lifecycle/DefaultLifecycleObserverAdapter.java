package androidx.lifecycle;

import defpackage.FP0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/k;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultLifecycleObserverAdapter implements k {

    @NotNull
    public final DefaultLifecycleObserver d;

    @Nullable
    public final k e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.a.values().length];
            try {
                iArr[g.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @Nullable k kVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.d = defaultLifecycleObserver;
        this.e = kVar;
    }

    @Override // androidx.lifecycle.k
    public final void b(@NotNull FP0 source, @NotNull g.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = a.a[event.ordinal()];
        DefaultLifecycleObserver defaultLifecycleObserver = this.d;
        switch (i) {
            case 1:
                defaultLifecycleObserver.onCreate(source);
                break;
            case 2:
                defaultLifecycleObserver.onStart(source);
                break;
            case 3:
                defaultLifecycleObserver.onResume(source);
                break;
            case 4:
                defaultLifecycleObserver.onPause(source);
                break;
            case 5:
                defaultLifecycleObserver.onStop(source);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        k kVar = this.e;
        if (kVar != null) {
            kVar.b(source, event);
        }
    }
}
