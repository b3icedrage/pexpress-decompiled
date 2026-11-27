package defpackage;

import android.content.Context;
import io.sentry.android.core.b0;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BB1 {

    @NotNull
    public final Context a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final Set<InterfaceC7773yB1> c;

    @NotNull
    public final O3 d;

    public BB1(@NotNull Context context, @NotNull C4923kf appData, @NotNull Set<InterfaceC7773yB1> contributors, @NotNull O3 accountModeSelection) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(contributors, "contributors");
        Intrinsics.checkNotNullParameter(accountModeSelection, "accountModeSelection");
        this.a = context;
        this.b = appData;
        this.c = contributors;
        this.d = accountModeSelection;
    }

    @NotNull
    public final LinkedHashMap a() {
        Object objA;
        String str;
        C4923kf c4923kf = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        String str2 = null;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            EnumC3495e41 enumC3495e41 = (EnumC3495e41) c4923kf.r.getValue();
            linkedHashMap.put("ws_state", enumC3495e41 != null ? enumC3495e41.name() : null);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            C1795Pt1.a(th);
        }
        B5 b5 = new B5(this, 3);
        try {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            linkedHashMap.put("network_type", b5.invoke());
            Unit unit2 = Unit.a;
        } catch (Throwable th2) {
            C1717Ot1.a aVar4 = C1717Ot1.e;
            C1795Pt1.a(th2);
        }
        try {
            C1717Ot1.a aVar5 = C1717Ot1.e;
            C6945uG c6945uG = (C6945uG) c4923kf.k.getValue();
            if (c6945uG != null && (str = c6945uG.d) != null && !StringsKt.I(str)) {
                str2 = str;
            }
            linkedHashMap.put("country", str2);
            Unit unit3 = Unit.a;
        } catch (Throwable th3) {
            C1717Ot1.a aVar6 = C1717Ot1.e;
            C1795Pt1.a(th3);
        }
        try {
            C1717Ot1.a aVar7 = C1717Ot1.e;
            linkedHashMap.put("has_user", Boolean.valueOf(c4923kf.k.getValue() != null));
            Unit unit4 = Unit.a;
        } catch (Throwable th4) {
            C1717Ot1.a aVar8 = C1717Ot1.e;
            C1795Pt1.a(th4);
        }
        try {
            C1717Ot1.a aVar9 = C1717Ot1.e;
            linkedHashMap.put("has_token", Boolean.valueOf(c4923kf.f.getValue() != null));
            Unit unit5 = Unit.a;
        } catch (Throwable th5) {
            C1717Ot1.a aVar10 = C1717Ot1.e;
            C1795Pt1.a(th5);
        }
        try {
            C1717Ot1.a aVar11 = C1717Ot1.e;
            linkedHashMap.put("account_mode", C6772tS0.a(this.d));
            Unit unit6 = Unit.a;
        } catch (Throwable th6) {
            C1717Ot1.a aVar12 = C1717Ot1.e;
            C1795Pt1.a(th6);
        }
        try {
            C1717Ot1.a aVar13 = C1717Ot1.e;
            linkedHashMap.put("activated", c4923kf.e.getValue());
            Unit unit7 = Unit.a;
        } catch (Throwable th7) {
            C1717Ot1.a aVar14 = C1717Ot1.e;
            C1795Pt1.a(th7);
        }
        try {
            C1717Ot1.a aVar15 = C1717Ot1.e;
            linkedHashMap.put("active_assets_loaded", Boolean.valueOf(c4923kf.p.getValue() != null));
            Unit unit8 = Unit.a;
        } catch (Throwable th8) {
            C1717Ot1.a aVar16 = C1717Ot1.e;
            C1795Pt1.a(th8);
        }
        for (InterfaceC7773yB1 interfaceC7773yB1 : this.c) {
            try {
                C1717Ot1.a aVar17 = C1717Ot1.e;
                interfaceC7773yB1.a(linkedHashMap);
                objA = Unit.a;
            } catch (Throwable th9) {
                C1717Ot1.a aVar18 = C1717Ot1.e;
                objA = C1795Pt1.a(th9);
            }
            Throwable thA = C1717Ot1.a(objA);
            if (thA != null) {
                b0.f("TelemetrySnapshot", "contributor failed: " + interfaceC7773yB1, thA);
            }
        }
        return linkedHashMap;
    }
}
