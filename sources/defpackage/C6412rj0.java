package defpackage;

import androidx.activity.ComponentActivity;
import androidx.activity.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6412rj0 {

    @NotNull
    public final Object a;
    public boolean b;

    @NotNull
    public final ArrayList c;

    public C6412rj0(@NotNull ComponentActivity.d executor, @NotNull a reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.a = new Object();
        this.c = new ArrayList();
    }

    public final void a() {
        synchronized (this.a) {
            try {
                this.b = true;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.c.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
