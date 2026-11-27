package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1248Iu extends BroadcastReceiver {
    public final /* synthetic */ AbstractC1326Ju<Object> a;

    public C1248Iu(AbstractC1326Ju<Object> abstractC1326Ju) {
        this.a = abstractC1326Ju;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.a.g(intent);
    }
}
