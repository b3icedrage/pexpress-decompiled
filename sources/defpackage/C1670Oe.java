package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: Oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1670Oe implements MD1 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C1670Oe(C4245hf c4245hf, EnumC3495e41 enumC3495e41, String str, boolean z) {
        this.h = c4245hf;
        this.i = enumC3495e41;
        this.g = str;
        this.e = z;
    }

    @Override // defpackage.MD1
    public final void e(InterfaceC1015Fu0 scope) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Object obj = this.i;
        String str = this.g;
        Object obj2 = this.h;
        boolean z = this.e;
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter(scope, "scope");
                ((C4245hf) obj2).c(scope, (EnumC3495e41) obj, str);
                if (!z) {
                    scope.m(WE.f("app-data-field-pending-ws-down", str));
                    scope.h(NG1.INFO);
                } else {
                    scope.m(WE.f("app-data-field-still-missing", str));
                    scope.h(NG1.WARNING);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.m(VE.c("ws-closed-by-other"));
                scope.b("ws.closed_by_other", "true");
                scope.b("ws.is_real", String.valueOf(z));
                Bl2 bl2 = (Bl2) obj2;
                Integer num = bl2.a;
                String str2 = "unknown";
                if (num == null || (string = num.toString()) == null) {
                    string = "unknown";
                }
                scope.b("ws.close_code", string);
                scope.b("ws.close_loop", String.valueOf(bl2.k));
                Regex regex = Al2.a;
                Long l = bl2.c;
                if (l != null) {
                    if (l.longValue() < 1000) {
                        str2 = "<1s";
                    } else if (l.longValue() < 5000) {
                        str2 = "<5s";
                    } else if (l.longValue() < 30000) {
                        str2 = "<30s";
                    } else {
                        str2 = l.longValue() < 300000 ? "<5m" : ">=5m";
                    }
                }
                scope.b("ws.lifetime_bucket", str2);
                scope.b("ws.summary_trigger", bl2.l);
                C6772tS0.f(scope, str);
                scope.b("network_available", ((C6530sH1) obj).t());
                String str3 = "null";
                String str4 = bl2.b;
                if (str4 == null) {
                    str4 = "null";
                }
                scope.n("ws.close_reason", str4);
                if (l == null || (string2 = l.toString()) == null) {
                    string2 = "null";
                }
                scope.n("ws.lifetime_ms", string2);
                scope.n("ws.closes", String.valueOf(bl2.d));
                scope.n("ws.short_lived", String.valueOf(bl2.e));
                scope.n("ws.close_codes", bl2.f);
                Long l2 = bl2.g;
                if (l2 == null || (string3 = l2.toString()) == null) {
                    string3 = "null";
                }
                scope.n("ws.lifetime_p50_ms", string3);
                Long l3 = bl2.h;
                if (l3 == null || (string4 = l3.toString()) == null) {
                    string4 = "null";
                }
                scope.n("ws.lifetime_p90_ms", string4);
                Long l4 = bl2.i;
                if (l4 != null && (string5 = l4.toString()) != null) {
                    str3 = string5;
                }
                scope.n("ws.lifetime_max_ms", str3);
                scope.n("ws.window_ms", String.valueOf(bl2.j));
                scope.h(NG1.WARNING);
                break;
        }
    }

    public /* synthetic */ C1670Oe(boolean z, Bl2 bl2, String str, C6530sH1 c6530sH1) {
        this.e = z;
        this.h = bl2;
        this.g = str;
        this.i = c6530sH1;
    }
}
