package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: nH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5481nH1 implements MD1, JW1.a {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C5481nH1(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    @Override // JW1.a
    public Object c() {
        ((C7639xa2) this.d).c.z((Iterable) this.e);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Object objA;
        Object objA2;
        String str;
        Intrinsics.checkNotNullParameter(scope, "scope");
        FI1.h hVar = (FI1.h) this.d;
        scope.m(WE.f("robot-stopped-unexpectedly", hVar.a));
        C6530sH1 c6530sH1 = (C6530sH1) this.e;
        c6530sH1.getClass();
        C4923kf c4923kf = c6530sH1.a;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = ((Boolean) c4923kf.e.getValue()).booleanValue() ? "real" : "demo";
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (objA instanceof C1717Ot1.b) {
            objA = "unknown";
        }
        scope.b("account_type", (String) objA);
        try {
            C6945uG c6945uG = (C6945uG) c4923kf.k.getValue();
            if (((Boolean) c4923kf.e.getValue()).booleanValue()) {
                if (c6945uG != null) {
                    str = c6945uG.g;
                } else {
                    str = null;
                }
            } else if (c6945uG != null) {
                str = c6945uG.h;
            } else {
                str = null;
            }
            if (str != null) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (upperCase != null) {
                    boolean zI = StringsKt.I(upperCase);
                    objA2 = upperCase;
                    if (zI) {
                        objA2 = null;
                    }
                } else {
                    objA2 = null;
                }
            } else {
                objA2 = null;
            }
        } catch (Throwable th2) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            objA2 = C1795Pt1.a(th2);
        }
        boolean z = objA2 instanceof C1717Ot1.b;
        Object obj = objA2;
        if (z) {
            obj = null;
        }
        String str2 = (String) obj;
        scope.b("currency", str2 != null ? str2 : "unknown");
        scope.b("network_available", c6530sH1.t());
        String str3 = hVar.d;
        if (str3 != null) {
            String str4 = str3.length() > 0 ? str3 : null;
            if (str4 != null) {
                scope.b("server_code", str4);
            }
        }
        scope.h(NG1.ERROR);
    }
}
