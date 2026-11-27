package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.AS0;
import defpackage.C4736jk2;
import defpackage.EnumC5957pa0;
import defpackage.K91;
import defpackage.Vj2;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = AS0.d("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AS0.c().getClass();
        try {
            C4736jk2 c4736jk2B = C4736jk2.b(context);
            Intrinsics.checkNotNullParameter(DiagnosticsWorker.class, "workerClass");
            K91 k91A = new K91.a(DiagnosticsWorker.class).a();
            c4736jk2B.getClass();
            List listSingletonList = Collections.singletonList(k91A);
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new Vj2(c4736jk2B, null, EnumC5957pa0.e, listSingletonList).w();
        } catch (IllegalStateException e) {
            AS0.c().b(a, "WorkManager is not initialized", e);
        }
    }
}
