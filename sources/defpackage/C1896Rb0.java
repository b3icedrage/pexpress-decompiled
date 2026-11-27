package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Rb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1896Rb0 implements Continuation, JW1.a {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Cloneable e;

    public /* synthetic */ C1896Rb0(Object obj, Cloneable cloneable) {
        this.d = obj;
        this.e = cloneable;
    }

    @Override // JW1.a
    public Object c() {
        C7639xa2 c7639xa2 = (C7639xa2) this.d;
        c7639xa2.getClass();
        for (Map.Entry entry : ((HashMap) this.e).entrySet()) {
            c7639xa2.i.k(((Integer) entry.getValue()).intValue(), C5090lS0.a.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? C1974Sb0.a((Context) this.d, (Intent) this.e).continueWith(new ExecutorC4468ii1(), new C4564j(4)) : task;
    }
}
