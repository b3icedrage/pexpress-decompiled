package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class NK<T> {

    @NotNull
    public final C4946kk2 a;

    @NotNull
    public final Context b;

    @NotNull
    public final Object c;

    @NotNull
    public final LinkedHashSet<LK<T>> d;

    @Nullable
    public T e;

    public NK(@NotNull Context context, @NotNull C4946kk2 taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(@NotNull JK listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.c) {
            try {
                if (this.d.remove(listener) && this.d.isEmpty()) {
                    e();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 == null || !t2.equals(t)) {
                this.e = t;
                this.a.c.execute(new MK(0, CollectionsKt.e0(this.d), this));
                Unit unit = Unit.a;
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
