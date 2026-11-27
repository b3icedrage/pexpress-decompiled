package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3296d7 {

    @Nullable
    public Function0<Unit> a;
    public Q2 b;

    public final void a() {
        Function0<Unit> function0 = this.a;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        Q2 q2 = this.b;
        if (q2 != null) {
            q2.invoke();
        } else {
            Intrinsics.l("defaultOnBackPressed");
            throw null;
        }
    }
}
