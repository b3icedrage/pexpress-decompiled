package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7724xz implements OnCompleteListener, MD1 {
    public final /* synthetic */ Object d;

    /* JADX WARN: Type inference failed for: r2v1, types: [T, hv0] */
    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((C3027bp1) this.d).d = it.r();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Rj2.a) this.d).b.trySetResult(null);
    }
}
