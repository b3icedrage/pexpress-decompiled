package defpackage;

import com.pexpress.tool.AppImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1988Sg implements InterfaceC1138Hj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1138Hj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        String category = (String) obj;
        String message = (String) obj2;
        EnumC0936Eu level = (EnumC0936Eu) obj3;
        Map<String, ? extends Object> data = (Map) obj4;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(data, "data");
        this.d.M(category, message, level, data);
        return Unit.a;
    }
}
