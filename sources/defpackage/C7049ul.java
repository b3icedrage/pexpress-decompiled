package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7049ul implements MD1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C7049ul(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // defpackage.MD1
    public final void e(InterfaceC1015Fu0 scope) {
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter(scope, "scope");
                C3849fl c3849fl = (C3849fl) this.e;
                scope.h(c3849fl.a);
                JX1 jx1 = (JX1) this.g;
                scope.b("po.error_code", String.valueOf(jx1.a));
                scope.b("po.error_kind", jx1.c);
                scope.b("po.error_class", jx1.b);
                scope.n("error_text", jx1.d);
                scope.n("platform_code", jx1.e);
                scope.m(c3849fl.b);
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                AbstractC5082lP1 abstractC5082lP1 = (AbstractC5082lP1) this.e;
                scope.m(WE.f("robot-start-blocked", abstractC5082lP1.a));
                scope.b("start.block_reason", abstractC5082lP1.a);
                if (abstractC5082lP1 instanceof AbstractC5082lP1.b) {
                    scope.b("start.block_site", ((AbstractC5082lP1.b) abstractC5082lP1).b);
                }
                scope.h(((EnumC1712Os) this.g).d);
                break;
        }
    }
}
