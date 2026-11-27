package defpackage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1748Pe implements MD1, Continuation {
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1748Pe(Object obj, String str) {
        this.e = obj;
        this.d = str;
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        C4245hf c4245hf = (C4245hf) this.e;
        EnumC3495e41 enumC3495e41 = (EnumC3495e41) c4245hf.a.r.getValue();
        String str = this.d;
        c4245hf.c(scope, enumC3495e41, str);
        scope.b("never_arrived", "true");
        scope.m(WE.f("app-data-field-never-arrived", str));
        scope.h(NG1.WARNING);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C7495ws1 c7495ws1 = (C7495ws1) this.e;
        String str = this.d;
        synchronized (c7495ws1) {
            c7495ws1.b.remove(str);
        }
        return task;
    }
}
