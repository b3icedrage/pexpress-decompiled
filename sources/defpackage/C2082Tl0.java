package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: Tl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2082Tl0 extends ContextWrapper {
    public static final C1141Hk0 k = new C1141Hk0();
    public final OU0 a;
    public final C4483im0 b;
    public final QO c;
    public final C3686f d;
    public final List<InterfaceC1088Gs1<Object>> e;
    public final C8092zj f;
    public final Q60 g;
    public final C2320Wl0 h;
    public final int i;
    public C1400Ks1 j;

    public C2082Tl0(@NonNull Context context, @NonNull OU0 ou0, @NonNull C2823ar1 c2823ar1, @NonNull QO qo, @NonNull C3686f c3686f, @NonNull C8092zj c8092zj, @NonNull List list, @NonNull Q60 q60, @NonNull C2320Wl0 c2320Wl0, int i) {
        super(context.getApplicationContext());
        this.a = ou0;
        this.c = qo;
        this.d = c3686f;
        this.e = list;
        this.f = c8092zj;
        this.g = q60;
        this.h = c2320Wl0;
        this.i = i;
        this.b = new C4483im0(c2823ar1);
    }

    @NonNull
    public final C2596Zq1 a() {
        return (C2596Zq1) this.b.get();
    }
}
