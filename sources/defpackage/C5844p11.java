package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5844p11 implements Function1<Throwable, Unit> {
    public final /* synthetic */ MotionLayout d;
    public final /* synthetic */ C3027bp1<MotionLayout.h> e;

    public C5844p11(MotionLayout motionLayout, C3027bp1<MotionLayout.h> c3027bp1) {
        this.d = motionLayout;
        this.e = c3027bp1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        MotionLayout.h hVar = this.e.d;
        CopyOnWriteArrayList<MotionLayout.h> copyOnWriteArrayList = this.d.j0;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(hVar);
        }
        return Unit.a;
    }
}
