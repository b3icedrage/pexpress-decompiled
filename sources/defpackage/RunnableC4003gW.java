package defpackage;

import android.os.Handler;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import androidx.fragment.app.s;
import io.sentry.android.core.internal.util.t;
import io.sentry.android.core.internal.util.u;
import io.sentry.android.core.internal.util.v;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4003gW implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC4003gW(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                d.c transitionInfo = (d.c) this.e;
                Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
                s.b operation = (s.b) this.g;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                transitionInfo.a();
                if (FragmentManager.G(2)) {
                    Objects.toString(operation);
                }
                break;
            default:
                v vVar = (v) this.e;
                CopyOnWriteArraySet copyOnWriteArraySet = vVar.e;
                Window window = (Window) this.g;
                if (copyOnWriteArraySet.add(window)) {
                    try {
                        u uVar = vVar.l;
                        t tVar = vVar.m;
                        Handler handler = vVar.h;
                        uVar.getClass();
                        if (tVar != null) {
                            window.addOnFrameMetricsAvailableListener(tVar, handler);
                        }
                    } catch (Throwable th) {
                        vVar.g.d(NG1.ERROR, "Failed to add frameMetricsAvailableListener", th);
                    }
                }
                break;
        }
    }
}
