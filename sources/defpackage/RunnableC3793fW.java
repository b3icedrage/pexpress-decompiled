package defpackage;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3793fW implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ RunnableC3793fW(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AbstractC1605Ni0 impl = (AbstractC1605Ni0) this.e;
                Intrinsics.checkNotNullParameter(impl, "$impl");
                Rect lastInEpicenterRect = (Rect) this.h;
                Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                AbstractC1605Ni0.g((View) this.g, lastInEpicenterRect);
                break;
            default:
                C2872b52 c2872b52 = (C2872b52) this.e;
                c2872b52.getClass();
                C5127ld1.a aVarC = C5127ld1.C();
                aVarC.p();
                C5127ld1.y((C5127ld1) aVarC.e, (I02) this.g);
                c2872b52.d(aVarC, (EnumC1134Hi) this.h);
                break;
        }
    }
}
