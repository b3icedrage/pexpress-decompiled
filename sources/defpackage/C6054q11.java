package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: q11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6054q11 implements MotionLayout.h {
    public final /* synthetic */ MotionLayout d;
    public final /* synthetic */ C3027bp1 e;
    public final /* synthetic */ C6251qy g;

    public C6054q11(MotionLayout motionLayout, C3027bp1 c3027bp1, C6251qy c6251qy) {
        this.d = motionLayout;
        this.e = c3027bp1;
        this.g = c6251qy;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void a() {
        MotionLayout.h hVar = (MotionLayout.h) this.e.d;
        CopyOnWriteArrayList<MotionLayout.h> copyOnWriteArrayList = this.d.j0;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(hVar);
        }
        C1717Ot1.a aVar = C1717Ot1.e;
        this.g.resumeWith(Unit.a);
    }
}
