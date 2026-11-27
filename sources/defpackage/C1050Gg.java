package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1050Gg implements Function2 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Long) obj2).longValue();
        int i = AppImpl.G;
        this.d.m((String) obj, jLongValue);
        return Unit.a;
    }
}
