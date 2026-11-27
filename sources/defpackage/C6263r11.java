package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: r11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6263r11 {
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, q11] */
    @Nullable
    public static final Object a(@NotNull MotionLayout motionLayout, @NotNull AW1 frame) {
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        C3027bp1 c3027bp1 = new C3027bp1();
        ?? c6054q11 = new C6054q11(motionLayout, c3027bp1, c6251qy);
        if (motionLayout.j0 == null) {
            motionLayout.j0 = new CopyOnWriteArrayList<>();
        }
        motionLayout.j0.add((MotionLayout.h) c6054q11);
        c3027bp1.d = c6054q11;
        c6251qy.u(new C5844p11(motionLayout, c3027bp1));
        motionLayout.F();
        Object objQ = c6251qy.q();
        MN mn = MN.d;
        if (objQ == mn) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objQ == mn ? objQ : Unit.a;
    }
}
