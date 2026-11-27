package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6419rl implements MD1, InterfaceC1608Nj0 {
    public final /* synthetic */ int d;

    public /* synthetic */ C6419rl(int i) {
        this.d = i;
    }

    public static String a(String str, long j) {
        return str + j;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        switch (this.d) {
            case 2:
                C3730fB c3730fB = (C3730fB) obj;
                return Boolean.valueOf(c3730fB.b || c3730fB.c);
            default:
                AbstractC3926g70 abstractC3926g70C = ((AbstractC7844yZ0) obj).c();
                return Boolean.valueOf(abstractC3926g70C instanceof AbstractC3926g70.a ? true : Intrinsics.a(abstractC3926g70C, AbstractC3926g70.d.a));
        }
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.h(NG1.ERROR);
        scope.b("phase", "safe_request");
    }
}
