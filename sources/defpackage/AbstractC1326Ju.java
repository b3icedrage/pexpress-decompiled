package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1326Ju<T> extends NK<T> {

    @NotNull
    public final C1248Iu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1326Ju(@NotNull Context context, @NotNull C4946kk2 taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f = new C1248Iu(this);
    }

    @Override // defpackage.NK
    public final void d() {
        AS0 as0C = AS0.c();
        int i = C1404Ku.a;
        as0C.getClass();
        this.b.registerReceiver(this.f, f());
    }

    @Override // defpackage.NK
    public final void e() {
        AS0 as0C = AS0.c();
        int i = C1404Ku.a;
        as0C.getClass();
        this.b.unregisterReceiver(this.f);
    }

    @NotNull
    public abstract IntentFilter f();

    public abstract void g(@NotNull Intent intent);
}
