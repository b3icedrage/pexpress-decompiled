package defpackage;

import com.pexpress.tool.AppImpl;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4721jh implements Function2 {
    public final /* synthetic */ InterfaceC3706f42 d;

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        EnumC5633o10 enumC5633o10;
        String title = (String) obj;
        String severity = (String) obj2;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(severity, "severity");
        String lowerCase = severity.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 3237038) {
            if (iHashCode != 96784904) {
                if (iHashCode == 1124446108 && lowerCase.equals("warning")) {
                    enumC5633o10 = EnumC5633o10.e;
                } else {
                    enumC5633o10 = EnumC5633o10.d;
                }
            } else if (lowerCase.equals("error")) {
                enumC5633o10 = EnumC5633o10.g;
            } else {
                enumC5633o10 = EnumC5633o10.d;
            }
        } else if (lowerCase.equals("info")) {
            enumC5633o10 = EnumC5633o10.d;
        } else {
            enumC5633o10 = EnumC5633o10.d;
        }
        this.d.r(title, enumC5633o10);
        return Unit.a;
    }
}
