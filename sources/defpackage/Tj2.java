package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Tj2 {

    @Nullable
    public final Sj2 a;

    @NotNull
    public final JK<?>[] b;

    @NotNull
    public final Object c;

    public Tj2(@NotNull Q02 trackers, @Nullable Sj2 sj2) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        C5600nr tracker = trackers.a;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        C5390mr c5390mr = new C5390mr(tracker);
        C6230qr tracker2 = trackers.b;
        Intrinsics.checkNotNullParameter(tracker2, "tracker");
        C6020pr c6020pr = new C6020pr(tracker2);
        RQ1 tracker3 = trackers.d;
        Intrinsics.checkNotNullParameter(tracker3, "tracker");
        QQ1 qq1 = new QQ1(tracker3);
        C4125h41 tracker4 = trackers.c;
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        C5222m31 c5222m31 = new C5222m31(tracker4);
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        C4803k41 c4803k41 = new C4803k41(tracker4);
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        R31 r31 = new R31(tracker4);
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        JK<?>[] constraintControllers = {c5390mr, c6020pr, qq1, c5222m31, c4803k41, r31, new K31(tracker4)};
        Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.a = sj2;
        this.b = constraintControllers;
        this.c = new Object();
    }

    public final boolean a(@NotNull String workSpecId) {
        JK<?> jk;
        boolean z;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.c) {
            try {
                JK<?>[] jkArr = this.b;
                int length = jkArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        jk = null;
                        break;
                    }
                    jk = jkArr[i];
                    jk.getClass();
                    Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                    Object obj = jk.d;
                    if (obj != null && jk.c(obj) && jk.c.contains(workSpecId)) {
                        break;
                    }
                    i++;
                }
                if (jk != null) {
                    AS0 as0C = AS0.c();
                    int i2 = Uj2.a;
                    as0C.getClass();
                }
                z = jk == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void b(@NotNull Collection workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.c) {
            try {
                for (JK<?> jk : this.b) {
                    if (jk.e != null) {
                        jk.e = null;
                        jk.e(null, jk.d);
                    }
                }
                for (JK<?> jk2 : this.b) {
                    jk2.d(workSpecs);
                }
                for (JK<?> jk3 : this.b) {
                    if (jk3.e != this) {
                        jk3.e = this;
                        jk3.e(this, jk3.d);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            try {
                for (JK<?> jk : this.b) {
                    ArrayList arrayList = jk.b;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        jk.a.b(jk);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
